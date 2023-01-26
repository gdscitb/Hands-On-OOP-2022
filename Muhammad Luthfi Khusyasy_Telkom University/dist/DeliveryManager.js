"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.DeliveryManager = void 0;
class DeliveryManager {
    constructor(logistic) {
        this.deliveryList = [];
        this.logistic = logistic;
    }
    setLogistic(logistic) {
        this.logistic = logistic;
    }
    deliver(weightKG, distanceKM, inputDate) {
        const transport = this.logistic.createTransport(weightKG, distanceKM, inputDate);
        transport.deliver();
        console.log(`ETA: ${transport.ETA().toLocaleString('id-ID')}`);
        console.log(`Cost: ${transport.cost().toLocaleString('id-ID', {
            style: 'currency',
            currency: 'IDR',
        })}`);
        this.deliveryList.push(transport);
    }
    printDeliveryList() {
        console.log('Delivery List:');
        this.deliveryList.forEach((transport) => {
            console.log(` - ${transport.toString()}`);
        });
    }
    totalCost() {
        return this.deliveryList.reduce((total, transport) => {
            return total + transport.cost();
        }, 0);
    }
}
exports.DeliveryManager = DeliveryManager;
