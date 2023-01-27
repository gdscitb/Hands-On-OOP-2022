export abstract class Car {
    brand: string;
    speed: number;
    price: number;

    constructor(brand: string, speed: number, price: number) {
        this.brand = brand;
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
    
    abstract getName(): string;
    
    abstract move(): void;
}