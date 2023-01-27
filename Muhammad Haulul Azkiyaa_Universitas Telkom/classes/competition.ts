import { Motor } from './motor';

export class Competition {
    private motors: Motor[];
    private distance: number;
    private ranks: any;

    constructor(motors: Motor[], distance: number) {
        this.motors = motors;
        this.distance = distance;
        this.ranks = this.motors;
    }

    setMotors(motors: Motor[]): void {
        this.motors = motors;
    }

    getMotors(): void {
        console.log(`Mobil yang terdaftar: `);
        for (let i in this.motors) {
            console.log(`${ Number(i) + 1 }. ${ this.motors[i].getName() }: ${ this.motors[i].getSpeed() } MPH`);
        }
    }

    setDistance(distance: number): void {
        this.distance = distance;
    }

    getDistance(): number {
        return this.distance;
    }

    race(): void {
        console.log('Lomba balap mobil dimulai!!');
        
        for (let motor of this.motors) {
            motor.move()
        }

        this.setRaceTime();

        this.ranks.sort((obj1, obj2) => {
            if(obj1.times > obj2.times) {
                return 1;
            } else if(obj1.times < obj2.times) {
                return -1;
            } else {
                return 0;
            }
        });

        console.log('Lomba balap mobil telah berakhir');
    }

    setRaceTime(): void {
        for (let motor of this.ranks) {
            motor.times = this.distance / motor.getSpeed();
        }
    }

    winner(): void {
        console.log('\n================ Pemenang Kompetisi : ===============');
        this.ranks.forEach((motor, index) => {
            console.log(`${ index + 1 }. ${ motor.getName() } : ${ motor.times.toFixed(2) } jam`);
        });
    }
}