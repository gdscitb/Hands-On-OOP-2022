import { Motor } from './motor';

export class Prima extends Motor {
    private rider: string;

    constructor(speed: number, codename: number, rider: string) {
        super('Prima Pramac Racing', speed, codename);
        this.rider = rider;
    }

    move(): void {
        console.log(`${ this.getName() } berjalan dengan kecepatan ${ this.getSpeed() } mph`);
    }

    getName(): string {
        return `${ this.rider }  [${ this.brand }]`;
    }
}