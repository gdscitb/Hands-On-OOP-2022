import { WeatherData } from "./interface/WeatherData";
import { WeatherDataProvider } from "./interface/WeatherDataProvider";
import axios from "axios";

export class WeatherApiDataProvider implements WeatherDataProvider {
  async getWeatherData(location: string): Promise<WeatherData> {
    try {
      const apikey = "9b4a4d86d33418301cd2ce12149b0fd5";
      const url = `https://api.openweathermap.org/data/2.5/weather?q=${location}&appid=${apikey}&units=metric`;
      const response = await axios.get(url);
      const data = response.data;
      return {
        name: data.name,
        country: data.sys.country,
        coord_lat: data.coord.lat,
        coord_lon: data.coord.lon,
        temperature: data.main.temp,
        humidity: data.main.humidity,
        weather_main: data.weather[0].main,
        weather_desc: data.weather[0].description,
      };
    } catch (err) {
      console.error(err);
      throw new Error("The city or country was not found");
    }
  }
}
