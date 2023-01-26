import * as readline from 'readline/promises';

import { DeliveryManager } from './DeliveryManager';
import { LandLogistic, SeaLogistic } from './Logistic';

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

async function main() {
  const landLogistic = new LandLogistic();
  const seaLogistic = new SeaLogistic();

  const deliveryManager = new DeliveryManager(landLogistic);

  console.log('Welcome to Simple Send!');
  console.log('A place where you can manage your package delivery easily!');
  console.log();

  while (true) {
    console.log('1. Send package');
    console.log('2. Change logistic');
    console.log('3. Print delivery list');
    console.log('4. Total cost');
    console.log('0. Exit');
    const answer = await rl.question('Choose: ');
    console.log();

    if (answer === '1') {
      console.log('Enter package details:');
      const weightKG = Number(await rl.question('Weight (kg): '));
      const distanceKM = Number(await rl.question('Distance (km): '));
      const inputDate = new Date();

      deliveryManager.deliver(weightKG, distanceKM, inputDate);
      console.log();
    } else if (answer === '2') {
      console.log('Choose logistic:');
      console.log('1. Land');
      console.log('2. Sea');

      const logisticAnswer = await rl.question('Choose: ');
      console.log();

      if (logisticAnswer === '1') {
        deliveryManager.setLogistic(landLogistic);
      } else if (logisticAnswer === '2') {
        deliveryManager.setLogistic(seaLogistic);
      }
    } else if (answer === '3') {
      deliveryManager.printDeliveryList();
      console.log();
    } else if (answer === '4') {
      console.log(
        `Total cost: ${deliveryManager.totalCost().toLocaleString('id-ID', {
          style: 'currency',
          currency: 'IDR',
        })}`
      );
      console.log();
    } else if (answer === '0') {
      break;
    } else {
      console.log('Invalid input!');
      console.log();
    }
  }
  console.log('Thank you for using Simple Send!');
  process.exit(0);
}

if (require.main === module) {
  main();
}
