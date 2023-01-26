"use strict";
var __createBinding = (this && this.__createBinding) || (Object.create ? (function(o, m, k, k2) {
    if (k2 === undefined) k2 = k;
    var desc = Object.getOwnPropertyDescriptor(m, k);
    if (!desc || ("get" in desc ? !m.__esModule : desc.writable || desc.configurable)) {
      desc = { enumerable: true, get: function() { return m[k]; } };
    }
    Object.defineProperty(o, k2, desc);
}) : (function(o, m, k, k2) {
    if (k2 === undefined) k2 = k;
    o[k2] = m[k];
}));
var __setModuleDefault = (this && this.__setModuleDefault) || (Object.create ? (function(o, v) {
    Object.defineProperty(o, "default", { enumerable: true, value: v });
}) : function(o, v) {
    o["default"] = v;
});
var __importStar = (this && this.__importStar) || function (mod) {
    if (mod && mod.__esModule) return mod;
    var result = {};
    if (mod != null) for (var k in mod) if (k !== "default" && Object.prototype.hasOwnProperty.call(mod, k)) __createBinding(result, mod, k);
    __setModuleDefault(result, mod);
    return result;
};
Object.defineProperty(exports, "__esModule", { value: true });
const readline = __importStar(require("readline/promises"));
const DeliveryManager_1 = require("./DeliveryManager");
const Logistic_1 = require("./Logistic");
const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout,
});
async function main() {
    const landLogistic = new Logistic_1.LandLogistic();
    const seaLogistic = new Logistic_1.SeaLogistic();
    const deliveryManager = new DeliveryManager_1.DeliveryManager(landLogistic);
    console.log('Welcome to Simple Send!');
    console.log('A place where you can manage your package delivery easily!');
    console.log();
    while (true) {
        console.log('1. Send package');
        console.log('2. Change logistic');
        console.log('3. Print delivery list');
        console.log('4. Total cost');
        console.log('0. Exit');
        const answer = await rl.question('Choose: ');
        console.log();
        if (answer === '1') {
            console.log('Enter package details:');
            const weightKG = Number(await rl.question('Weight (kg): '));
            const distanceKM = Number(await rl.question('Distance (km): '));
            const inputDate = new Date();
            deliveryManager.deliver(weightKG, distanceKM, inputDate);
            console.log();
        }
        else if (answer === '2') {
            console.log('Choose logistic:');
            console.log('1. Land');
            console.log('2. Sea');
            const logisticAnswer = await rl.question('Choose: ');
            console.log();
            if (logisticAnswer === '1') {
                deliveryManager.setLogistic(landLogistic);
            }
            else if (logisticAnswer === '2') {
                deliveryManager.setLogistic(seaLogistic);
            }
        }
        else if (answer === '3') {
            deliveryManager.printDeliveryList();
            console.log();
        }
        else if (answer === '4') {
            console.log(`Total cost: ${deliveryManager.totalCost().toLocaleString('id-ID', {
                style: 'currency',
                currency: 'IDR',
            })}`);
            console.log();
        }
        else if (answer === '0') {
            break;
        }
        else {
            console.log('Invalid input!');
            console.log();
        }
    }
    console.log('Thank you for using Simple Send!');
    process.exit(0);
}
if (require.main === module) {
    main();
}
