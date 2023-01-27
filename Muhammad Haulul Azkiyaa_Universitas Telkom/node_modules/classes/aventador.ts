import { Lamborghini } from './lamborghini';

export class Aventador implements Lamborghini {
    brand: string = 'Lamborghini';
    model: string;
    speed: number;
    price: number;

    constructor(model: string, speed: number, price: number) {
        this.model = model;
        this.speed = speed;
        this.price = price;
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

    setPrice(price: number): void {
        this.price = price;
    };

    getPrice(): string {
        return `$${ this.price }`;
    }

    move(): void {
        console.log(`${ this.getName() } berjalan dengan kecepatan ${ this.getSpeed() } mph`);
    }

    getName(): string {
        return `${ this.brand } ${ this.model }`;
    }
}