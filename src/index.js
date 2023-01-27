"use strict";
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
var time_sleep_1 = require("./lib/time_sleep");
var readline_1 = require("./lib/readline");
var store_1 = require("./lib/constant/store");
var user_1 = require("./lib/user");
var console = require("console");
var main = function () { return __awaiter(void 0, void 0, void 0, function () {
    var running, auth, merchant, userChoice, validInput, _a, data, currentUserIndex, currentUser, quitMenu, _b, _c, chosenItem, _d;
    return __generator(this, function (_e) {
        switch (_e.label) {
            case 0:
                running = true;
                console.log("Welcome~!");
                auth = new user_1.Auth();
                merchant = new user_1.Merchant(store_1.adminCredentials.username, store_1.adminCredentials.password);
                _e.label = 1;
            case 1:
                if (!running) return [3 /*break*/, 26];
                console.log("1. Login");
                console.log("2. Sign up");
                console.log("3. Exit");
                return [4 /*yield*/, (0, readline_1.inputData)("choice")];
            case 2:
                userChoice = _e.sent();
                validInput = false;
                _a = userChoice;
                switch (_a) {
                    case "1": return [3 /*break*/, 3];
                    case "2": return [3 /*break*/, 22];
                    case "3": return [3 /*break*/, 24];
                }
                return [3 /*break*/, 25];
            case 3: 
            // login
            return [4 /*yield*/, auth.login()];
            case 4:
                // login
                _e.sent();
                if (!(auth.currentUserIndex !== -1)) return [3 /*break*/, 20];
                data = auth.getData();
                currentUserIndex = auth.currentUserIndex;
                // found login credentials
                console.log("\nHi ".concat(data[auth.currentUserIndex].username, "!"));
                currentUser = new user_1.User(data[currentUserIndex].username, data[currentUserIndex].password, data.length + 1);
                quitMenu = false;
                _e.label = 5;
            case 5:
                console.log("\nMenu");
                console.log("1. Check Basket");
                console.log("2. Check Store");
                console.log("3. Top Up Balance");
                console.log("4. Exit");
                return [4 /*yield*/, (0, readline_1.inputData)("choice")];
            case 6:
                userChoice = _e.sent();
                if (userChoice === "1" || userChoice === "2" || userChoice === "3" || userChoice === "4") {
                    validInput = true;
                }
                _e.label = 7;
            case 7:
                if (!validInput) return [3 /*break*/, 5];
                _e.label = 8;
            case 8:
                validInput = false;
                _b = userChoice;
                switch (_b) {
                    case "1": return [3 /*break*/, 9];
                    case "2": return [3 /*break*/, 14];
                    case "3": return [3 /*break*/, 16];
                    case "4": return [3 /*break*/, 17];
                }
                return [3 /*break*/, 18];
            case 9:
                currentUser.getBasketItem();
                console.log("\nWant to checkout things?");
                console.log("1. Yes");
                console.log("2. No");
                return [4 /*yield*/, (0, readline_1.inputData)("choice")];
            case 10:
                userChoice = _e.sent();
                _c = userChoice;
                switch (_c) {
                    case "1": return [3 /*break*/, 11];
                }
                return [3 /*break*/, 13];
            case 11: return [4 /*yield*/, currentUser.checkoutPayment()];
            case 12:
                chosenItem = _e.sent();
                if (chosenItem !== -1) {
                    merchant.markPayment(currentUser.getUsername(), chosenItem);
                }
                return [3 /*break*/, 13];
            case 13: return [3 /*break*/, 18];
            case 14:
                console.log("\nSelect item to buy:");
                store_1.storeItem.forEach(function (item) {
                    console.log("\t".concat(item.item_id, ". cost: ").concat(item.cost));
                });
                _d = parseInt;
                return [4 /*yield*/, (0, readline_1.inputData)("choice")];
            case 15:
                userChoice = _d.apply(void 0, [_e.sent()]) - 1;
                if (userChoice > 5) {
                    console.log("Invalid input!");
                }
                else {
                    currentUser.makePayment(store_1.storeItem[userChoice].cost, store_1.storeItem[userChoice].item_id);
                    merchant.addCustomer({
                        username: currentUser.getUsername(),
                        item_id: store_1.storeItem[userChoice].item_id,
                        total_cost: store_1.storeItem[userChoice].cost,
                        status: "unpaid"
                    });
                    console.log("Successfully bought item with id ".concat(store_1.storeItem[userChoice].item_id, "\n"));
                }
                return [3 /*break*/, 18];
            case 16:
                currentUser.topUpBalance();
                return [3 /*break*/, 18];
            case 17:
                quitMenu = true;
                running = false;
                return [3 /*break*/, 18];
            case 18:
                if (!quitMenu) return [3 /*break*/, 5];
                _e.label = 19;
            case 19: return [3 /*break*/, 21];
            case 20:
                console.log("Account not found!");
                _e.label = 21;
            case 21: return [3 /*break*/, 25];
            case 22: return [4 /*yield*/, auth.signUp()];
            case 23:
                _e.sent();
                return [3 /*break*/, 25];
            case 24:
                running = false;
                return [3 /*break*/, 25];
            case 25: return [3 /*break*/, 1];
            case 26: return [2 /*return*/];
        }
    });
}); };
main().then(function () {
    (0, time_sleep_1.sleep)(1000).then(function () {
        console.log("See you next time!");
    });
});
