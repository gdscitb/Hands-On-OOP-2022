import { Transport, Motorcycle, Car, Truck, Ship } from './Transport';

export interface Logistic {
  createTransport(
    weightKG: number,
    distanceKM: number,
    inputDate: Date
  ): Transport;
}

export class LandLogistic implements Logistic {
  createTransport(
    weightKG: number,
    distanceKM: number,
    inputDate: Date
  ): Transport {
    if (weightKG <= 10 && distanceKM <= 30) {
      return new Motorcycle(weightKG, distanceKM, inputDate);
    } else if (weightKG <= 50 && distanceKM <= 100) {
      return new Car(weightKG, distanceKM, inputDate);
    } else {
      return new Truck(weightKG, distanceKM, inputDate);
    }
  }
}

export class SeaLogistic implements Logistic {
  createTransport(
    weightKG: number,
    distanceKM: number,
    inputDate: Date
  ): Transport {
    return new Ship(weightKG, distanceKM, inputDate);
  }
}
