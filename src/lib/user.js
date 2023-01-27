"use strict";
var __extends = (this && this.__extends) || (function () {
    var extendStatics = function (d, b) {
        extendStatics = Object.setPrototypeOf ||
            ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
            function (d, b) { for (var p in b) if (Object.prototype.hasOwnProperty.call(b, p)) d[p] = b[p]; };
        return extendStatics(d, b);
    };
    return function (d, b) {
        if (typeof b !== "function" && b !== null)
            throw new TypeError("Class extends value " + String(b) + " is not a constructor or null");
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
var __awaiter = (this && this.__awaiter) || function (thisArg, _arguments, P, generator) {
    function adopt(value) { return value instanceof P ? value : new P(function (resolve) { resolve(value); }); }
    return new (P || (P = Promise))(function (resolve, reject) {
        function fulfilled(value) { try { step(generator.next(value)); } catch (e) { reject(e); } }
        function rejected(value) { try { step(generator["throw"](value)); } catch (e) { reject(e); } }
        function step(result) { result.done ? resolve(result.value) : adopt(result.value).then(fulfilled, rejected); }
        step((generator = generator.apply(thisArg, _arguments || [])).next());
    });
};
var __generator = (this && this.__generator) || function (thisArg, body) {
    var _ = { label: 0, sent: function() { if (t[0] & 1) throw t[1]; return t[1]; }, trys: [], ops: [] }, f, y, t, g;
    return g = { next: verb(0), "throw": verb(1), "return": verb(2) }, typeof Symbol === "function" && (g[Symbol.iterator] = function() { return this; }), g;
    function verb(n) { return function (v) { return step([n, v]); }; }
    function step(op) {
        if (f) throw new TypeError("Generator is already executing.");
        while (_) try {
            if (f = 1, y && (t = op[0] & 2 ? y["return"] : op[0] ? y["throw"] || ((t = y["return"]) && t.call(y), 0) : y.next) && !(t = t.call(y, op[1])).done) return t;
            if (y = 0, t) op = [op[0] & 2, t.value];
            switch (op[0]) {
                case 0: case 1: t = op; break;
                case 4: _.label++; return { value: op[1], done: false };
                case 5: _.label++; y = op[1]; op = [0]; continue;
                case 7: op = _.ops.pop(); _.trys.pop(); continue;
                default:
                    if (!(t = _.trys, t = t.length > 0 && t[t.length - 1]) && (op[0] === 6 || op[0] === 2)) { _ = 0; continue; }
                    if (op[0] === 3 && (!t || (op[1] > t[0] && op[1] < t[3]))) { _.label = op[1]; break; }
                    if (op[0] === 6 && _.label < t[1]) { _.label = t[1]; t = op; break; }
                    if (t && _.label < t[2]) { _.label = t[2]; _.ops.push(op); break; }
                    if (t[2]) _.ops.pop();
                    _.trys.pop(); continue;
            }
            op = body.call(thisArg, _);
        } catch (e) { op = [6, e]; y = 0; } finally { f = t = 0; }
        if (op[0] & 5) throw op[1]; return { value: op[0] ? op[1] : void 0, done: true };
    }
};
exports.__esModule = true;
exports.Auth = exports.Merchant = exports.User = void 0;
var readline_1 = require("./readline");
var time_sleep_1 = require("./time_sleep");
var string_modifier_1 = require("./string_modifier");
// solved TS2420:
// @ts-ignore
var baseUser = /** @class */ (function () {
    function baseUser() {
        // Class props
        this._username = undefined;
        this._password = undefined;
        this._id = undefined;
        this.balance = 0;
        // New user merchant role defaults to false
        // Status set to paid
        this.isMerchant = false;
        this.status = "paid";
    }
    // Class messages
    /**
     * @param user_data changed user field
     * @returns error message for set / unset value
     * */
    baseUser.prototype._errChangesMsg = function (user_data) {
        return "".concat((0, string_modifier_1.toCapitallize)(user_data), " cannot be same as previous!");
    };
    /**
     * @param user_data changed user field
     * @returns success message for changes on value
     * */
    baseUser.prototype._succChangesMsg = function (user_data) {
        return "Successfully changes ".concat(user_data.toLowerCase(), "!");
    };
    // Getters and Setters
    // Username
    baseUser.prototype.getUsername = function () {
        return this._username;
    };
    baseUser.prototype.setUsername = function (username) {
        this._username = username;
    };
    baseUser.prototype.changeUsername = function (newUsername) {
        if (this._username === newUsername) {
            console.log(this._errChangesMsg("username"));
        }
        else {
            this._username = newUsername;
            console.log(this._succChangesMsg("username"));
        }
    };
    // Password
    baseUser.prototype.getPassword = function () {
        return this._password;
    };
    baseUser.prototype.setPassword = function (password) {
        this._password = password;
    };
    baseUser.prototype.changePassword = function (newPassword) {
        var _this = this;
        if (this.getPassword() === newPassword) {
            console.log(this._errChangesMsg("new password"));
        }
        else {
            readline_1.stdin.question("Confirm Password: ", function (input) { return __awaiter(_this, void 0, void 0, function () {
                return __generator(this, function (_a) {
                    switch (_a.label) {
                        case 0:
                            // TODO : Refactor this code using the new input function
                            console.log("Processing");
                            return [4 /*yield*/, (0, time_sleep_1.sleep)(1000)];
                        case 1:
                            _a.sent();
                            if (newPassword === input) {
                                this._password = newPassword;
                                console.log(this._succChangesMsg("password"));
                            }
                            else {
                                console.log("Confirmed password is not same!");
                            }
                            return [2 /*return*/];
                    }
                });
            }); });
        }
    };
    baseUser.prototype.topUpBalance = function (topUpValue) {
        if (topUpValue === void 0) { topUpValue = 50000; }
        this.balance = this.balance + topUpValue;
        console.log("Top up ".concat(topUpValue, ". Current balance: ").concat(this.balance));
    };
    return baseUser;
}());
var User = /** @class */ (function (_super) {
    __extends(User, _super);
    // Constructor
    function User(username, password, id) {
        var _this = _super.call(this) || this;
        _this.paymentBasket = [];
        _this._username = username;
        _this._password = password;
        _this._id = id;
        return _this;
    }
    User.prototype.getBalance = function () {
        return this.balance;
    };
    User.prototype.getBasket = function () {
        return this.paymentBasket;
    };
    User.prototype.getBasketItem = function () {
        console.log("".concat((0, string_modifier_1.toCapitallize)(this._username), "'s basket:"));
        console.log("No.----Item Id----Cost");
        for (var i = 0; i < this.paymentBasket.length; i++) {
            console.log("|".concat(i + 1, "|\t|").concat(this.paymentBasket[i].item_id, "|\t|").concat(this.paymentBasket[i].cost, "|"));
        }
        if (this.paymentBasket.length === 0) {
            console.log("Empty here..");
        }
    };
    User.prototype.makePayment = function (cost, id) {
        // per unique item have different object
        var item = {
            username: this._username,
            // unique item id to mark transaction
            item_id: id,
            cost: cost,
            // false status === uncheckPayment, status set to true when the item is checked out
            status: "unpaid"
        };
        this.paymentBasket.push(item);
        console.log("Item is stored on your basket. Please check it!");
    };
    User.prototype.checkoutPayment = function () {
        return __awaiter(this, void 0, void 0, function () {
            var choosenItem, success, maxChoice, userChoice_1, _a, endChoice, _b;
            var _this = this;
            return __generator(this, function (_c) {
                switch (_c.label) {
                    case 0:
                        console.log("Balance: ".concat(this.balance));
                        success = false;
                        if (!(this.paymentBasket.length !== 0)) return [3 /*break*/, 7];
                        maxChoice = this.paymentBasket.length;
                        _a = parseInt;
                        return [4 /*yield*/, (0, readline_1.inputData)("choice")];
                    case 1:
                        userChoice_1 = _a.apply(void 0, [_c.sent(), 10]);
                        endChoice = false;
                        _c.label = 2;
                    case 2:
                        if (!!endChoice) return [3 /*break*/, 6];
                        if (!(userChoice_1 > maxChoice)) return [3 /*break*/, 4];
                        console.log("Invalid input!");
                        _b = parseInt;
                        return [4 /*yield*/, (0, readline_1.inputData)("choice")];
                    case 3:
                        userChoice_1 = _b.apply(void 0, [_c.sent(), 10]);
                        return [3 /*break*/, 5];
                    case 4:
                        endChoice = true;
                        // Filter out the chosen index
                        this.paymentBasket = this.paymentBasket.filter(function (ele, index) {
                            if (index === userChoice_1 - 1) {
                                if (ele.cost > _this.balance) {
                                    console.log("Not enough balance!");
                                    choosenItem = -1;
                                }
                                else {
                                    success = true;
                                    choosenItem === ele.item_id;
                                    _this.balance = _this.balance - ele.cost;
                                    return index !== userChoice_1 - 1;
                                }
                            }
                            else {
                                return index !== userChoice_1 - 1;
                            }
                        });
                        if (success) {
                            console.log("Successfully checked out an item! Current Basket: ");
                            this.getBasketItem();
                        }
                        _c.label = 5;
                    case 5: return [3 /*break*/, 2];
                    case 6: return [3 /*break*/, 8];
                    case 7:
                        console.log("Nothing in basket");
                        choosenItem = -1;
                        _c.label = 8;
                    case 8: return [2 /*return*/, choosenItem];
                }
            });
        });
    };
    User.prototype.enableMerchantMode = function () {
        this.isMerchant = true;
    };
    return User;
}(baseUser));
exports.User = User;
var Merchant = /** @class */ (function (_super) {
    __extends(Merchant, _super);
    function Merchant(username, password) {
        var _this = _super.call(this) || this;
        // List of this merchant customer
        _this.customers = [];
        _this._username = username;
        _this._password = password;
        return _this;
    }
    // Getters and setters
    Merchant.prototype.addCustomer = function (customerData) {
        this.customers.push(customerData);
    };
    /**
     * @param username customer username
     * @param item_id item id
     * @returns removed given customer username from merchant basket
     * */
    Merchant.prototype.removeCustomer = function (username, item_id) {
        this.customers = this.customers.filter(function (ele) {
            return ele.item_id !== item_id && ele.username !== username;
        });
    };
    Merchant.prototype.markPayment = function (username, item_id) {
        // console.log("----------->" + this.customers.length);
        this.customers.forEach(function (customer) {
            if (customer.username === username && customer.item_id === item_id) {
                customer.status = "paid";
            }
        });
    };
    /**
     * Shows list of customer, then throws input stream to confirm selected customer payment
     * */
    Merchant.prototype.confirmPayment = function () {
        return __awaiter(this, void 0, void 0, function () {
            var username, item_id, length, confirmed;
            return __generator(this, function (_a) {
                switch (_a.label) {
                    case 0: return [4 /*yield*/, (0, readline_1.inputData)("username")];
                    case 1:
                        username = _a.sent();
                        return [4 /*yield*/, (0, readline_1.inputData)("item id")];
                    case 2:
                        item_id = _a.sent();
                        length = this.customers.length;
                        confirmed = false;
                        this.removeCustomer(username, item_id);
                        if (this.customers.length === length) {
                            console.log("Unable to find ".concat(username, " (does not exist)."));
                        }
                        else {
                            confirmed = true;
                            console.log("Successfully confirmed ".concat(username, "!"));
                        }
                        return [2 /*return*/, confirmed];
                }
            });
        });
    };
    Merchant.prototype.getCustomerList = function () {
        console.log("".concat((0, string_modifier_1.toCapitallize)(this._username), "'s customers:"));
        if (this.customers.length > 0) {
            this.customers.forEach(function (ele) {
                console.log("Username: ".concat(ele.username));
                console.log("\tTotal: ".concat(ele.total_cost));
                console.log("\tStatus: ".concat(ele.status));
            });
        }
        else {
            console.log("No customers.");
        }
    };
    return Merchant;
}(baseUser));
exports.Merchant = Merchant;
// solved TS2420:
// @ts-ignore
var Auth = /** @class */ (function () {
    function Auth() {
        this.database = [
            {
                username: "admin",
                password: "test12345",
                balance: 0,
                loggedIn: true,
                isMerchant: true
            }
        ];
        this.currentUserIndex = -1;
    }
    Auth.prototype.getData = function () {
        return this.database;
    };
    /**
     *
     * */
    Auth.prototype.login = function (asMerchant) {
        if (asMerchant === void 0) { asMerchant = false; }
        return __awaiter(this, void 0, void 0, function () {
            var username, password, foundCredential, isMerchant;
            var _this = this;
            return __generator(this, function (_a) {
                switch (_a.label) {
                    case 0: return [4 /*yield*/, (0, readline_1.inputData)("username")];
                    case 1:
                        username = _a.sent();
                        return [4 /*yield*/, (0, readline_1.inputData)("password")];
                    case 2:
                        password = _a.sent();
                        console.log("Authenticating...");
                        foundCredential = false;
                        isMerchant = asMerchant;
                        this.database.forEach(function (credential, index) {
                            if (credential.username === username && credential.password === password) {
                                foundCredential = true;
                                _this.currentUserIndex = index;
                            }
                        });
                        if (foundCredential) {
                            this.database[this.currentUserIndex].loggedIn = true;
                        }
                        return [2 /*return*/];
                }
            });
        });
    };
    Auth.prototype.signUp = function () {
        return __awaiter(this, void 0, void 0, function () {
            var currentUser;
            var _a;
            return __generator(this, function (_b) {
                switch (_b.label) {
                    case 0:
                        _a = {};
                        return [4 /*yield*/, (0, readline_1.inputData)("username")];
                    case 1:
                        _a.username = _b.sent();
                        return [4 /*yield*/, (0, readline_1.inputData)("password")];
                    case 2:
                        currentUser = (_a.password = _b.sent(),
                            _a.balance = 0,
                            _a.loggedIn = false,
                            _a.isMerchant = false,
                            _a);
                        this.database.push(currentUser);
                        console.log("Account created! Please login!");
                        return [2 /*return*/];
                }
            });
        });
    };
    return Auth;
}());
exports.Auth = Auth;
