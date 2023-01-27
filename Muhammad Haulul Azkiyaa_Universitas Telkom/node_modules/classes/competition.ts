import { Car } from './car';

export class Competition {
    private cars: Car[];
    private distance: number;
    private ranks: any;

    constructor(cars: Car[], distance: number) {
        this.cars = cars;
        this.distance = distance;
        this.ranks = this.cars;
    }

    setCars(cars: Car[]): void {
        this.cars = cars;
    }

    getCars(): void {
        console.log(`Mobil yang terdaftar: `);
        for (let i in this.cars) {
            console.log(`${ Number(i) + 1 }. ${ this.cars[i].getName() }: ${ this.cars[i].getSpeed() } MPH`);
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
        
        for (let car of this.cars) {
            car.move()
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
        for (let car of this.ranks) {
            car.times = this.distance / car.getSpeed();
        }
    }

    winner(): void {
        console.log('\nPemenang Kompetisi : ');
        this.ranks.forEach((car, index) => {
            console.log(`${ index + 1 }. ${ car.getName() } : ${ car.times.toFixed(2) } jam`);
        });
    }
}