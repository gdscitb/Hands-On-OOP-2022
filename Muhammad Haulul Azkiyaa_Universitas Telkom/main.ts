import { Motor } from './classes/motor';
import { Ducati } from './classes/ducati';
import { Mooney } from './classes/mooney';
import { Prima } from './classes/prima';
import { Aprilia } from './classes/aprilia';
import { Competition } from './classes/competition';
import { Quartararo } from './classes/quartararo';
import { Lap } from './classes/lap';
import { Laps } from './classes/laps';
import { Decorator } from './classes/decorator';

const fb1 = new Ducati(270, 1, 'Francesco Bagnaia');
const jz5 = new Prima(273, 5, 'Johann Zarco');
const lm10 = new Mooney(304, 10, 'Luca Marini');
const mv12 = new Aprilia(250, 12,'Maverick Viñales');

const fq20 = new Quartararo('Fabio Quartararo', 218, 20);

// fb1.move();
// jz5.move();
// lm10.move();
// mv12.move();

let jarak: Lap = new Laps();
jarak.setLaps(1000); // Set jarak/panjang lintasan

let totalJarak: Lap = new Decorator(jarak);
totalJarak.setLaps(12); // Set jumlah laps/putaran

let motors: Motor[] = [fb1, jz5, lm10, mv12, fq20] // Pembalap yang di ikutsertakan

const competition = new Competition(motors, totalJarak.getLaps());
// competition.getMotor();
competition.race();
competition.winner();
