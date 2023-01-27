import { Lap } from "./lap";

export class Decorator implements Lap {
    protected laps: number = <number>{};
    protected lap: Lap;

    constructor(lap: Lap) {
        this.lap = lap;
    }

    setLaps(laps: number): void {
        const currLaps = this.lap.getLaps();
        this.laps = laps * currLaps;
    }

    getLaps(): number {
        return this.laps;
    }
}