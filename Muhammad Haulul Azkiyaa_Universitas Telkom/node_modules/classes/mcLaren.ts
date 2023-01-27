import { Car } from './car';

export class McLaren extends Car {
    private model: string;
    
    constructor(speed: number, price: number, model: string) {
        super('McLaren', speed, price);
        this.model = model;
    }

    move(): void {
        console.log(`${ this.getName() } berjalan dengan kecepatan ${ this.getSpeed() } mph`);
    }

    getName(): string {
        return `${ this.brand } ${ this.model }`;
    }
}