package cy.ac.ucy.cs.epl425.OpenWeatherMap;

import java.util.Collections;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import cy.ac.ucy.cs.epl425.OpenWeatherMap.ForecastToolkit.SmallForecast;

/**
 * This class is used for option 4 and contains the JSON tags returned from the
 * API calls.
 * 
 * @author Michail Panagiotis Bofos
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Excursion {
	private Forecast forecast;
	private CurrentWeather currWeather;
	private Route route;

	public Excursion(Forecast forecast, CurrentWeather currWeather, Route route) {
		this.forecast = forecast;
		this.currWeather = currWeather;
		this.route = route;

	}

	public void printDetails() {
		System.out.println(
				"\tDetails for trip from " + currWeather.getName() + " to " + forecast.getCity().getName() + ".\n");
	}

	public String highestTemp() {
		List<SmallForecast> weather = forecast.getList();
		Collections.sort(weather);

		return "Highest temperature at destination is " + weather.get(weather.size() - 1).getMain().getTemp_max()
				+ " on " + weather.get(weather.size() - 1).getDt_txt();

	}

	public String totalTripDistance() {
		float kilometers = (float) (route.getPaths().get(0).getDistance() / 1000.0);
		return "Trip distance: " + kilometers + " km";

	}

	public String totalTripTime() {
		float minutes = (float) (route.getPaths().get(0).getTime() * 1.66666667E-5);
		return "Time to reach destination: " + minutes + " minutes";
	}

}
