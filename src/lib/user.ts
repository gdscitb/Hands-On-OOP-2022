import { stdin, inputData } from "./readline";
import { sleep } from "./time_sleep";
import { toCapitallize } from "./string_modifier";
import {
    account,
    customer,
    paymentObject,
    authentication,
    credential,
} from "../typings";


// solved TS2420:
// @ts-ignore
abstract class baseUser implements account{
    // Class props
    protected _username: string = undefined;
    protected _password: string | number = undefined;
    protected _id: number = undefined;
    protected balance: number = 0;
    // Status set to paid
    protected isMerchant: boolean = false;
    protected status: string = "paid";

    /**
     * @param user_data changed user field
     * @returns error message for set / unset value
     * */
    protected _errChangesMsg (
        user_data: string,
    ) {
        return `${toCapitallize(user_data)} cannot be same as previous!`;
    }
    /**
     * @param user_data changed user field
     * @returns success message for changes on value
     * */
    protected _succChangesMsg (
        user_data: string
    ) {
        return `Successfully changes ${user_data.toLowerCase()}!`;
    }

    // Getters
    public getUsername () {
        return this._username;
    }

    public changeUsername (newUsername: string) {
        if (this._username === newUsername) {
            console.log(this._errChangesMsg("username"));
        }
        else {
            this._username = newUsername;
            console.log(this._succChangesMsg("username"));
        }
    }

    protected getPassword () {
        return this._password;
    }

    public changePassword (newPassword: number | string) {
        if (this.getPassword() === newPassword) {
            console.log(this._errChangesMsg("new password"));
        } else {
            stdin.question(
                "Confirm Password: ",
                async (input: string | number) => {
                    // TODO : Refactor this code using the new input function
                    console.log("Processing");
                    await sleep(1000);
                    if (newPassword === input) {
                        this._password = newPassword;
                        console.log(this._succChangesMsg("password"))
                    } else {
                        console.log("Confirmed password is not same!");
                    }
                }
            )
        }
    }

    /**
     * Increase the current user balance
     * @param topUpValue top up amount, defaults to 50000
     * */
    public topUpBalance (topUpValue: number = 50000) {
        this.balance = this.balance + topUpValue;
        console.log(`Top up ${topUpValue}. Current balance: ${this.balance}`);
    }


}

export class User extends baseUser{
    private paymentBasket: paymentObject[] = [];
    // Constructor
    constructor(username: string, password: number | string, id: number) {
        super();
        this._username = username;
        this._password = password;
        this._id = id;
    }

    // Getters
    public getBalance () {
        return this.balance;
    }

    public getBasket () {
        return this.paymentBasket;
    }

    /**
     * Show all list of item inside current user basket
     * */
    public getBasketItem () {
        console.log(`${toCapitallize(this._username)}'s basket:`);
        console.log("No.----Item Id----Cost");
        for (let i = 0; i < this.paymentBasket.length; i++) {
            console.log(`|${i + 1}|\t|${this.paymentBasket[i].item_id}|\t|${this.paymentBasket[i].cost}|`);
        }
        if (this.paymentBasket.length === 0) {
            console.log("Empty here..");
        }
    }

    /**
     * Takes in item cost & id and push it to basket
     * @param cost item cost
     * @param id item id
     * */
    public makePayment (cost: number, id: number) {
        // per unique item have different object
        let item: paymentObject = {
            username: this._username,
            // unique item id to mark transaction
            item_id: id,
            cost: cost,
            // false status === uncheckPayment, status set to true when the item is checked out
            status: "unpaid",
        };
        this.paymentBasket.push(item);
        console.log("Item is stored on your basket. Please check it!");
    }

    /**
     * Prompt input to removed selected items inside basket if sufficient
     * */
    public async checkoutPayment() {
        console.log(`Balance: ${this.balance}`);
        let choosenItem: number;
        let success: boolean = false;
        if (this.paymentBasket.length !== 0) {
            const maxChoice: number = this.paymentBasket.length;
            let userChoice: number =  parseInt(await inputData("choice"), 10);
            let endChoice: boolean = false;
            while (!endChoice) {
                if (userChoice > maxChoice) {
                    console.log("Invalid input!");
                    userChoice = parseInt(await inputData("choice"), 10);
                } else {
                    endChoice = true;
                    // Filter out the chosen index
                    this.paymentBasket = this.paymentBasket.filter((ele, index) => {
                        if (index === userChoice - 1) {
                            if (ele.cost > this.balance) {
                                console.log("Not enough balance!");
                                choosenItem = -1;
                            }
                            else {
                                success = true;
                                choosenItem === ele.item_id;
                                this.balance = this.balance - ele.cost;
                                return index !== userChoice - 1;

                            }
                        } else {
                            return index !== userChoice - 1;
                        }
                    })
                    if (success) {
                        console.log("Successfully checked out an item! Current Basket: ");
                        this.getBasketItem();
                    }
                }
            }
        }
        else {
            console.log("Nothing in basket");
            choosenItem = -1;
        }
        return choosenItem;
    }
}

export class Merchant extends baseUser {

    // List of this merchant customer
    customers: customer[] = [];
    constructor(username: string, password: string | number) {
        super();
        this._username = username;
        this._password = password;
    }

    /**
     * @param customerData customer data
     * */
    public addCustomer(customerData: customer) {
        this.customers.push(customerData);
    }

    /**
     * @param username customer username
     * @param item_id item id
     * @returns removed given customer username from merchant basket
     * */
    private removeCustomer(username: string, item_id: string) {
        this.customers = this.customers.filter(
            (ele) => {
                return ele.item_id !== item_id && ele.username !== username;
            }
        )
    }

    /**
     * Mark item status on customers list based on users checked out items
     * @param username customer username
     * @param item_id item id
     * */
    public markPayment (username: string, item_id: string | number) {
        // console.log("----------->" + this.customers.length);
        this.customers.forEach((customer) => {
            if (customer.username === username && customer.item_id === item_id) {
                customer.status = "paid";
            }
        })
    }

    /**
     * Prompt input for username & item id to match the customers data
     * @returns confirmed boolean value
     * */
    public async confirmPayment() {
        const username: string = await inputData("username");
        const item_id: string = await inputData("item id")
        const length: number = this.customers.length;
        let confirmed: boolean = false;
        this.removeCustomer(username, item_id);
        if (this.customers.length === length) {
            console.log(`Unable to find ${username} (does not exist).`);
        }
        else {
            confirmed = true;
            console.log(`Successfully confirmed ${username}!`);
        }
        return confirmed;
    }

    /**
     * Shows the content of customers list
     * */
    public getCustomerList () {
        console.log(`${toCapitallize(this._username)}'s customers:`);
        if (this.customers.length > 0){
            this.customers.forEach((ele) => {
                console.log(`Username: ${ele.username}`);
                console.log(`\tTotal: ${ele.total_cost}`);
                console.log(`\tStatus: ${ele.status}`);
            })
        }
        else {
            console.log("No customer.");
        }
    }

}

// solved TS2420:
// @ts-ignore
export class Auth implements authentication {
    private database: credential[] = [
        {
            username: "admin",
            password: "test12345",
            balance: 0,
            loggedIn: true,
            isMerchant: true,
        }
    ];
    public currentUserIndex: number = -1;
    private username: string;
    private password: number | string;

    // Getters
    public getData () {
        return this.database;
    }

    /**
     * Prompt an login form
     * @param asMerchant (not available)
     * */
    public async login (asMerchant: boolean = false) {
        const username = await inputData("username");
        const password = await inputData("password");
        console.log("Authenticating...");
        let foundCredential = false;
        let isMerchant = asMerchant;
        this.database.forEach((credential, index) => {
            if (credential.username === username && credential.password === password) {
                foundCredential = true;
                this.currentUserIndex = index;
            }
        })
        if (foundCredential) {
            this.database[this.currentUserIndex].loggedIn = true;
        }
    }

    /**
     * Prompt a sign-up  form
     * */
    public async signUp () {
        let currentUser: credential = {
            username: await inputData("username"),
            password: await inputData("password"),
            balance: 0,
            loggedIn: false,
            isMerchant: false
        }
        this.database.push(currentUser);
        console.log(`Account created! Please login!`);
    }
}
