import { Motor } from './motor';

export class Mooney extends Motor {
    private rider: string;

    constructor(speed: number, codename: number, rider: string) {
        super('Mooney VR46 Racing Team', speed, codename);
        this.rider = rider;
    }

    move(): void {
        console.log(`${ this.getName() } berjalan dengan kecepatan ${ this.getSpeed() } mph`);
    }

    getName(): string {
        return `${ this.rider }  [${ this.brand }]`;
    }
}