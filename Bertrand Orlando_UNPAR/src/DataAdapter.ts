import { WeatherData } from "./interface/WeatherData";
import { WeatherDataProvider } from "./interface/WeatherDataProvider";

export class WeatherDataAdapter {
  constructor(private provider: WeatherDataProvider) {}

  async getWeatherData(location: string): Promise<WeatherData> {
    const data = await this.provider.getWeatherData(location);
    return {
      name: data.name,
      country: data.country,
      coord_lat: data.coord_lat,
      coord_lon: data.coord_lon,
      temperature: data.temperature,
      weather_main: data.weather_main,
      weather_desc: data.weather_desc,
      humidity: data.humidity,
    };
  }
}
