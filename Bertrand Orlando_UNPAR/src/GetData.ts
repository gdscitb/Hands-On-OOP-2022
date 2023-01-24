import { WeatherData } from "./interface/WeatherData";
import { WeatherDataProvider } from "./interface/WeatherDataProvider";
import { WeatherDataAdapter } from "./DataAdapter";
import { getProvider } from "./GetProvider";

export class getData extends getProvider {
  public provider: WeatherDataProvider;
  public adapter: WeatherDataAdapter;

  constructor(provider: string) {
    super(provider);
  }

  async getCurrentWeather(location: string): Promise<WeatherData> {
    return this.adapter.getWeatherData(location);
  }
}
