export abstract class Motor {
    brand: string;
    speed: number;
    codename: number;

    constructor(brand: string, speed: number, codename: number) {
        this.brand = brand;
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
    
    abstract getName(): string;
    
    abstract move(): void;
}