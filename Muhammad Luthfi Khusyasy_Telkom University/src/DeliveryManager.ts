import { Logistic } from './Logistic';
import { Transport } from './Transport';

export class DeliveryManager {
  private logistic: Logistic;
  private deliveryList: Array<Transport> = [];
  constructor(logistic: Logistic) {
    this.logistic = logistic;
  }

  setLogistic(logistic: Logistic): void {
    this.logistic = logistic;
  }

  deliver(weightKG: number, distanceKM: number, inputDate: Date): void {
    const transport = this.logistic.createTransport(
      weightKG,
      distanceKM,
      inputDate
    );
    transport.deliver();
    console.log(`ETA: ${transport.ETA().toLocaleString('id-ID')}`);
    console.log(
      `Cost: ${transport.cost().toLocaleString('id-ID', {
        style: 'currency',
        currency: 'IDR',
      })}`
    );

    this.deliveryList.push(transport);
  }

  printDeliveryList(): void {
    console.log('Delivery List:');
    this.deliveryList.forEach((transport) => {
      console.log(` - ${transport.toString()}`);
    });
  }

  totalCost(): number {
    return this.deliveryList.reduce((total, transport) => {
      return total + transport.cost();
    }, 0);
  }
}
