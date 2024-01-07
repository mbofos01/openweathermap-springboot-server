package cy.ac.ucy.cs.epl425.OpenWeatherMap.ForecastToolkit;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import cy.ac.ucy.cs.epl425.OpenWeatherMap.CurrentWeatherToolkit.Coordinations;

/**
 * Simple city JSON tag object.
 * 
 * @author Michail Panagiotis Bofos
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class City {
	private long id;
	private String name;
	private Coordinations coord;
	private String country;
	private long population;
	private long timezone;
	private long sunrise;
	private long sunset;

	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the coord
	 */
	public Coordinations getCoord() {
		return coord;
	}

	/**
	 * @param coord the coord to set
	 */
	public void setCoord(Coordinations coord) {
		this.coord = coord;
	}

	/**
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}

	/**
	 * @param country the country to set
	 */
	public void setCountry(String country) {
		this.country = country;
	}

	/**
	 * @return the population
	 */
	public long getPopulation() {
		return population;
	}

	/**
	 * @param population the population to set
	 */
	public void setPopulation(long population) {
		this.population = population;
	}

	/**
	 * @return the timezone
	 */
	public long getTimezone() {
		return timezone;
	}

	/**
	 * @param timezone the timezone to set
	 */
	public void setTimezone(long timezone) {
		this.timezone = timezone;
	}

	/**
	 * @return the sunrise
	 */
	public long getSunrise() {
		return sunrise;
	}

	/**
	 * @param sunrise the sunrise to set
	 */
	public void setSunrise(long sunrise) {
		this.sunrise = sunrise;
	}

	/**
	 * @return the sunset
	 */
	public long getSunset() {
		return sunset;
	}

	/**
	 * @param sunset the sunset to set
	 */
	public void setSunset(long sunset) {
		this.sunset = sunset;
	}

}
