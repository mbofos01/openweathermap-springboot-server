package cy.ac.ucy.cs.epl425.OpenWeatherMap;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import cy.ac.ucy.cs.epl425.OpenWeatherMap.CurrentWeatherToolkit.Clouds;
import cy.ac.ucy.cs.epl425.OpenWeatherMap.CurrentWeatherToolkit.Coordinations;
import cy.ac.ucy.cs.epl425.OpenWeatherMap.CurrentWeatherToolkit.Main;
import cy.ac.ucy.cs.epl425.OpenWeatherMap.CurrentWeatherToolkit.Sys;
import cy.ac.ucy.cs.epl425.OpenWeatherMap.CurrentWeatherToolkit.Weather;
import cy.ac.ucy.cs.epl425.OpenWeatherMap.CurrentWeatherToolkit.Wind;

/**
 * This class is used for option 1 and contains the JSON tags returned from the
 * API call.
 * 
 * @author Michail Panagiotis Bofos
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class CurrentWeather {

	private Coordinations coord;
	private List<Weather> weather;
	private String base;
	private Main main;
	private int visibility;
	private Wind wind;
	private Clouds clouds;
	private long dt;
	private Sys sys;
	private int id;
	private String name;
	private int cod;

	public Coordinations getCoord() {
		return coord;
	}

	public void setCoord(Coordinations coord) {
		this.coord = coord;
	}

	public List<Weather> getWeather() {
		return weather;
	}

	public void setWeather(List<Weather> weather) {
		this.weather = weather;
	}

	public String getBase() {
		return base;
	}

	public void setBase(String base) {
		this.base = base;
	}

	public Main getMain() {
		return main;
	}

	public void setMain(Main main) {
		this.main = main;
	}

	public int getVisibility() {
		return visibility;
	}

	public void setVisibility(int visibility) {
		this.visibility = visibility;
	}

	public Wind getWind() {
		return wind;
	}

	public void setWind(Wind wind) {
		this.wind = wind;
	}

	public Clouds getClouds() {
		return clouds;
	}

	public void setClouds(Clouds clouds) {
		this.clouds = clouds;
	}

	public Long getDt() {
		return dt;
	}

	public void setDt(long dt) {
		this.dt = dt;
	}

	public Sys getSys() {
		return sys;
	}

	public void setSys(Sys sys) {
		this.sys = sys;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCod() {
		return cod;
	}

	public void setCod(int cod) {
		this.cod = cod;
	}
}
