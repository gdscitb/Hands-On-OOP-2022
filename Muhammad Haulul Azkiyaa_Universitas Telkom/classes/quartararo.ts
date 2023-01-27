import { Yamaha } from './yamaha';

export class Quartararo implements Yamaha {
    brand: string = 'Monster Energy Yamaha MotoGP';
    rider: string;
    speed: number;
    codename: number;

    constructor(rider: string, speed: number, codename: number) {
        this.rider = rider;
        this.speed = speed;
        this.codename = codename;
    }

    setBrand(brand: string): void {
        this.brand = brand;
    };

    getBrand(brand: string): string {
        return this.brand;
    };

    setSpeed(speed: number): void {
        this.speed = speed;
    };

    getSpeed(): number {
        return this.speed;
    }

    setCodeName(codename: number): void {
        this.codename = codename;
    };

    getCodeName(): string {
        return `$${ this.codename }`;
    }

    move(): void {
        console.log(`${ this.getName() } berjalan dengan kecepatan ${ this.getSpeed() } mph`);
    }

    getName(): string {
        return `${ this.rider }  [${ this.brand }]`;
    }
}