import { Car } from './classes/car';
import { Hennessey } from './classes/hennessey';
import { Bugatti } from './classes/bugatti';
import { Koenigsegg } from './classes/koenigsegg';
import { McLaren } from './classes/mcLaren';
import { Competition } from './classes/competition';
import { Aventador } from './classes/aventador';

const venom = new Hennessey(270, 1200000, 'Venom GT');
const agera = new Koenigsegg(273, 2500000, 'Agera RS');
const chiron = new Bugatti(304, 3800000, 'Chiron Super Sport 300+');
const speedtail = new McLaren(250, 2200000,'Speedtail');

const aventador = new Aventador('Aventador SVJ Roadster', 218, 650000);

// venom.move();
// agera.move();
// chiron.move();
// speedtail.move();

let cars: Car[] = [venom, agera, chiron, speedtail, aventador]

const competition = new Competition(cars, 1200);
// competition.getCars();
competition.race();
competition.winner();
