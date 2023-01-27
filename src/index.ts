import { sleep } from "./lib/time_sleep";
import { inputData } from "./lib/readline";
import { storeItem, adminCredentials  } from "./lib/constant/store";
import {
    User,
    Merchant,
    Auth,
} from "./lib/user";
import * as console from "console";

const main = async () => {
    let running = true;
    console.log("Welcome~!");

    let auth = new Auth();
    let merchant = new Merchant(
        adminCredentials.username,
        adminCredentials.password,
    );

    while (running) {
        console.log("1. Login");
        console.log("2. Sign up");
        console.log("3. Exit")

        let userChoice: any = await inputData("choice");
        let validInput = false;

        switch (userChoice){
            case "1":
                // login
                await auth.login();
                if (auth.currentUserIndex !== -1) {
                    let data = auth.getData();
                    let currentUserIndex = auth.currentUserIndex;
                    // found login credentials
                    console.log(`\nHi ${data[auth.currentUserIndex].username}!`);

                    let currentUser = new User(
                        data[currentUserIndex].username,
                        data[currentUserIndex].password,
                        data.length + 1
                    );

                    let quitMenu = false;
                    do {
                        // Menu
                        do {
                            console.log("\nMenu")
                            console.log("1. Check Basket");
                            console.log("2. Check Store");
                            console.log("3. Top Up Balance");
                            console.log("4. Exit");
                            userChoice = await inputData("choice");

                            if (userChoice === "1" || userChoice === "2" || userChoice === "3" || userChoice === "4") {
                                validInput = true;
                            }

                        } while (!validInput)
                        validInput = false;

                        switch (userChoice) {
                            case "1":
                                currentUser.getBasketItem();
                                console.log("\nWant to checkout things?");
                                console.log("1. Yes");
                                console.log("2. No");
                                userChoice = await inputData("choice");

                                switch (userChoice){
                                    case "1":
                                        let chosenItem = await currentUser.checkoutPayment();
                                        if (chosenItem !== -1) {
                                            merchant.markPayment(currentUser.getUsername(), chosenItem);
                                        }
                                        break;
                                    default:
                                }

                                break;
                            case "2":
                                console.log("\nSelect item to buy:");
                                storeItem.forEach((item) => {
                                    console.log(`\t${item.item_id}. cost: ${item.cost}`);
                                })
                                userChoice = parseInt(await inputData("choice")) - 1;
                                if (userChoice > 5) {
                                    console.log("Invalid input!");
                                }
                                else {
                                    currentUser.makePayment(
                                        storeItem[userChoice].cost,
                                        storeItem[userChoice].item_id
                                    )
                                    merchant.addCustomer(
                                        {
                                            username: currentUser.getUsername(),
                                            item_id: storeItem[userChoice].item_id,
                                            total_cost: storeItem[userChoice].cost,
                                            status: "unpaid",
                                        }
                                    )
                                    console.log(`Successfully bought item with id ${storeItem[userChoice].item_id}\n`);
                                }
                                break;
                            case "3":
                                currentUser.topUpBalance();
                                break;
                            case "4":
                                quitMenu = true;
                                running = false;
                                break;
                            default:
                        }

                    } while (!quitMenu)

                }
                else {
                    console.log("Account not found!");
                }
                break;
            case "2":
                await auth.signUp();
                break;
            case "3":
                running = false;
                break;
            default:
        }

    }
}

main().then(() => {
    sleep(1000).then(() => {
        console.log("See you next time!");

    })
});

// solved TS2451
export {};