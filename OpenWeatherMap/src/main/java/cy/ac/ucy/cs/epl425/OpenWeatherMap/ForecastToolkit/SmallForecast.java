package cy.ac.ucy.cs.epl425.OpenWeatherMap.ForecastToolkit;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import cy.ac.ucy.cs.epl425.OpenWeatherMap.CurrentWeatherToolkit.Clouds;
import cy.ac.ucy.cs.epl425.OpenWeatherMap.CurrentWeatherToolkit.Weather;
import cy.ac.ucy.cs.epl425.OpenWeatherMap.CurrentWeatherToolkit.Wind;

/**
 * Simple forecast/list JSON tag object.
 * 
 * @author Michail Panagiotis Bofos
 *
 */
@SuppressWarnings("deprecation")
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class SmallForecast implements Comparable<SmallForecast> {
	private long dt;
	private Main main;
	private List<Weather> weather;
	private Clouds clouds;
	private Wind wind;
	private long visibility;
	private float pop;
	private Rain rain;

	/**
	 * @return the rain
	 */
	public Rain getRain() {
		return rain;
	}

	/**
	 * @param rain the rain to set
	 */
	public void setRain(Rain rain) {
		this.rain = rain;
	}

	private Sys sys;
	private String dt_txt;

	/**
	 * @return the dt
	 */
	public long getDt() {
		return dt;
	}

	/**
	 * @param dt the dt to set
	 */
	public void setDt(long dt) {
		this.dt = dt;
	}

	/**
	 * @return the main
	 */
	public Main getMain() {
		return main;
	}

	/**
	 * @param main the main to set
	 */
	public void setMain(Main main) {
		this.main = main;
	}

	/**
	 * @return the weather
	 */
	public List<Weather> getWeather() {
		return weather;
	}

	/**
	 * @param weather the weather to set
	 */
	public void setWeather(List<Weather> weather) {
		this.weather = weather;
	}

	/**
	 * @return the clouds
	 */
	public Clouds getClouds() {
		return clouds;
	}

	/**
	 * @param clouds the clouds to set
	 */
	public void setClouds(Clouds clouds) {
		this.clouds = clouds;
	}

	/**
	 * @return the wind
	 */
	public Wind getWind() {
		return wind;
	}

	/**
	 * @param wind the wind to set
	 */
	public void setWind(Wind wind) {
		this.wind = wind;
	}

	/**
	 * @return the visibility
	 */
	public long getVisibility() {
		return visibility;
	}

	/**
	 * @param visibility the visibility to set
	 */
	public void setVisibility(long visibility) {
		this.visibility = visibility;
	}

	/**
	 * @return the pop
	 */
	public float getPop() {
		return pop;
	}

	/**
	 * @param pop the pop to set
	 */
	public void setPop(float pop) {
		this.pop = pop;
	}

	/**
	 * @return the sys
	 */
	public Sys getSys() {
		return sys;
	}

	/**
	 * @param sys the sys to set
	 */
	public void setSys(Sys sys) {
		this.sys = sys;
	}

	/**
	 * @return the dt_txt
	 */
	public String getDt_txt() {
		return dt_txt;
	}

	/**
	 * @param dt_txt the dt_txt to set
	 */
	public void setDt_txt(String dt_txt) {
		this.dt_txt = dt_txt;
	}

	@Override
	public int compareTo(SmallForecast e) {
		Float A = this.getMain().getTemp_max();
		Float B = e.getMain().getTemp_max();
		return A.compareTo(B);
	}

}
