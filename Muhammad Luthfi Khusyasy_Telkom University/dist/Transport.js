"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.Ship = exports.Truck = exports.Car = exports.Motorcycle = exports.BaseTransport = void 0;
class BaseTransport {
    constructor(weightKG, distanceKM, inputDate, speed, costMultiplier = 1) {
        this.weightKG = weightKG;
        this.distanceKM = distanceKM;
        this.inputDate = inputDate;
        this.speed = speed;
        this.costMultiplier = costMultiplier;
    }
    deliver() {
        console.log('Deliver');
    }
    ETA() {
        const time = this.distanceKM / this.speed + 0.25;
        const estimatedTime = new Date(this.inputDate.getTime() + time * 60 * 60 * 1000);
        return estimatedTime;
    }
    cost() {
        return this.distanceKM * this.weightKG * this.costMultiplier * 1000;
    }
    toString() {
        return `${this.constructor.name} with weight ${this.weightKG} kg and distance ${this.distanceKM} km`;
    }
}
exports.BaseTransport = BaseTransport;
class Motorcycle extends BaseTransport {
    constructor(weightKG, distanceKM, inputDate) {
        super(weightKG, distanceKM, inputDate, 60, 2);
    }
    deliver() {
        console.log('Deliver by Motorcycle');
    }
}
exports.Motorcycle = Motorcycle;
class Car extends BaseTransport {
    constructor(weightKG, distanceKM, inputDate) {
        super(weightKG, distanceKM, inputDate, 40, 1.5);
    }
    deliver() {
        console.log('Deliver by Car');
    }
}
exports.Car = Car;
class Truck extends BaseTransport {
    constructor(weightKG, distanceKM, inputDate) {
        super(weightKG, distanceKM, inputDate, 30, 1);
    }
    deliver() {
        console.log('Deliver by Truck');
    }
}
exports.Truck = Truck;
class Ship extends BaseTransport {
    constructor(weightKG, distanceKM, inputDate) {
        super(weightKG, distanceKM, inputDate, 15, 0.5);
    }
    deliver() {
        console.log('Deliver by Ship');
    }
}
exports.Ship = Ship;
