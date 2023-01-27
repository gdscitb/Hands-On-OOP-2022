import { Lap } from "./lap";

export class Laps implements Lap {
    private laps: number = <number>{};

    setLaps(laps: number): void {
        this.laps = laps;
    }

    getLaps(): number {
        return this.laps;
    }
}