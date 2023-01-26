export interface Transport {
  deliver(): void;
  ETA(): Date;
  cost(): number;
  toString(): string;
}

export abstract class BaseTransport implements Transport {
  private weightKG: number;
  private distanceKM: number;
  private inputDate: Date;
  private speed: number;
  private costMultiplier: number;

  constructor(
    weightKG: number,
    distanceKM: number,
    inputDate: Date,
    speed: number,
    costMultiplier: number = 1
  ) {
    this.weightKG = weightKG;
    this.distanceKM = distanceKM;
    this.inputDate = inputDate;
    this.speed = speed;
    this.costMultiplier = costMultiplier;
  }

  deliver(): void {
    console.log('Deliver');
  }

  ETA(): Date {
    const time = this.distanceKM / this.speed + 0.25;
    const estimatedTime = new Date(
      this.inputDate.getTime() + time * 60 * 60 * 1000
    );
    return estimatedTime;
  }

  cost(): number {
    return this.distanceKM * this.weightKG * this.costMultiplier * 1000;
  }

  toString(): string {
    return `${this.constructor.name} with weight ${this.weightKG} kg and distance ${this.distanceKM} km`;
  }
}

export class Motorcycle extends BaseTransport {
  constructor(weightKG: number, distanceKM: number, inputDate: Date) {
    super(weightKG, distanceKM, inputDate, 60, 2);
  }
  deliver(): void {
    console.log('Deliver by Motorcycle');
  }
}

export class Car extends BaseTransport {
  constructor(weightKG: number, distanceKM: number, inputDate: Date) {
    super(weightKG, distanceKM, inputDate, 40, 1.5);
  }
  deliver(): void {
    console.log('Deliver by Car');
  }
}

export class Truck extends BaseTransport {
  constructor(weightKG: number, distanceKM: number, inputDate: Date) {
    super(weightKG, distanceKM, inputDate, 30, 1);
  }
  deliver(): void {
    console.log('Deliver by Truck');
  }
}

export class Ship extends BaseTransport {
  constructor(weightKG: number, distanceKM: number, inputDate: Date) {
    super(weightKG, distanceKM, inputDate, 15, 0.5);
  }
  deliver(): void {
    console.log('Deliver by Ship');
  }
}
