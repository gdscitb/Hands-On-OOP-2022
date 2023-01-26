"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.SeaLogistic = exports.LandLogistic = void 0;
const Transport_1 = require("./Transport");
class LandLogistic {
    createTransport(weightKG, distanceKM, inputDate) {
        if (weightKG <= 10 && distanceKM <= 30) {
            return new Transport_1.Motorcycle(weightKG, distanceKM, inputDate);
        }
        else if (weightKG <= 50 && distanceKM <= 100) {
            return new Transport_1.Car(weightKG, distanceKM, inputDate);
        }
        else {
            return new Transport_1.Truck(weightKG, distanceKM, inputDate);
        }
    }
}
exports.LandLogistic = LandLogistic;
class SeaLogistic {
    createTransport(weightKG, distanceKM, inputDate) {
        return new Transport_1.Ship(weightKG, distanceKM, inputDate);
    }
}
exports.SeaLogistic = SeaLogistic;
