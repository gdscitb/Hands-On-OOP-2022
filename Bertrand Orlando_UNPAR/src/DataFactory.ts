import { WeatherDataProvider } from "./interface/WeatherDataProvider";
import { WeatherApiDataProvider } from "./DataProvider";

export class WeatherDataFactory {
  public static providerFactory(provider: string): WeatherDataProvider {
    if (provider == "WeatherApi") {
      return new WeatherApiDataProvider();
    } else {
      throw new Error("Invalid provider name");
    }
  }
}
