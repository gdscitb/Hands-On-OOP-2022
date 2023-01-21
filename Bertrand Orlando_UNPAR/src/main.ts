import "./style.css";
import { getData } from "./GetData";

const forecast = new getData("WeatherApi");
// .getCurrentWeather("Bandung")
// .then((data) => console.log(data));

// onClick Handler
const searchButton = document.getElementById("search-btn") as HTMLButtonElement;
const inputKeyword = document.querySelector(
  ".input-keyword"
) as HTMLInputElement;
searchButton.addEventListener("click", async () => {
  try {
    const data = await forecast.getCurrentWeather(inputKeyword.value);
    const weatherInfo = infoHandler(data);
    updateUI(weatherInfo);
    inputKeyword.value = "";
    inputKeyword.focus();
  } catch (error) {
    alert(error);
  }
});

// onEnter Handler
const enterBtn = document.querySelector(".search-bar") as HTMLInputElement;
enterBtn.addEventListener("keypress", (e) => {
  if (e.key === "Enter" && inputKeyword.value != "") {
    e.preventDefault();
    searchButton.click();
  }
});

// Update UI
function updateUI(data: string) {
  const infoContainer = document.querySelector(
    ".info-container"
  ) as HTMLDivElement;
  infoContainer.innerHTML = data;
}

const infoHandler = ({
  name,
  country,
  coord_lat,
  coord_lon,
  temperature,
  weather_main,
  weather_desc,
  humidity,
}) => {
  return `<img
          src="./WeatherIcons/${weather_main}.svg"
          alt=""
        />
        <div class="condition-text">
          <p>${name} (${Math.round(coord_lat)}°, ${Math.round(
    coord_lon
  )}°), ${country}</p>
          <p>Temperatur : ${temperature}°C</p>
          <p>Humidity : ${humidity} %</p>
          <p>${weather_main}, ${weather_desc}</p>
        </div>`;
};
