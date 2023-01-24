import { WeatherData } from "./WeatherData";

export interface WeatherDataProvider {
  getWeatherData(location: string): Promise<WeatherData>;
}
