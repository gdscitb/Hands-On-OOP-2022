import { WeatherDataAdapter } from "./DataAdapter";
import { WeatherDataFactory } from "./DataFactory";
import { WeatherDataProvider } from "./interface/WeatherDataProvider";

export class getProvider {
  public provider: WeatherDataProvider;
  public adapter: WeatherDataAdapter;

  constructor(provider: string) {
    this.provider = WeatherDataFactory.providerFactory(provider);
    this.adapter = new WeatherDataAdapter(this.provider);
  }
}
