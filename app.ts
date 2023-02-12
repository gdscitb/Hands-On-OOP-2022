interface IVehicle {
    startEngine(): void;
    stopEngine(): void;
}

abstract class Vehicle implements IVehicle {
    private engineStarted: boolean;

    constructor() {
        this.engineStarted = false;
    }

    startEngine(): void {
        this.engineStarted = true;
        console.log("Mesin dinyalakan");
    }

    stopEngine(): void {
        this.engineStarted = false;
        console.log("Mesin berhenti");
    }
}

class Car extends Vehicle {
    private model: string;
    private year: number;

    constructor(model: string, year: number) {
        super();
        this.model = model;
        this.year = year;
    }

    displayDetails(): void {
        console.log(`Model: ${this.model}`);
        console.log(`Year: ${this.year}`);
    }
}

class SportsCar extends Car {
    private topSpeed: number;

    constructor(model: string, year: number, topSpeed: number) {
        super(model, year);
        this.topSpeed = topSpeed;
    }

    displayDetails(): void {
        super.displayDetails();
        console.log(`Top speed: ${this.topSpeed} mph`);
    }
}

const sportsCar = new SportsCar("Lamborghini Aventador", 2020, 220);

sportsCar.startEngine();
sportsCar.displayDetails();
sportsCar.stopEngine();
