package cy.ac.ucy.cs.epl425.OpenWeatherMap;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import cy.ac.ucy.cs.epl425.OpenWeatherMap.ForecastToolkit.*;

/**
 * This class is used for option 2 and contains the JSON tags returned from the
 * API call.
 * 
 * @author Michail Panagiotis Bofos
 *
 */
@SuppressWarnings("deprecation")
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Forecast {

	private String cod;
	private int message;
	private int cnt;
	private List<SmallForecast> list;
	private City city;

	/**
	 * @return the cod
	 */
	public String getCod() {
		return cod;
	}

	/**
	 * @param cod the cod to set
	 */
	public void setCod(String cod) {
		this.cod = cod;
	}

	/**
	 * @return the message
	 */
	public int getMessage() {
		return message;
	}

	/**
	 * @param message the message to set
	 */
	public void setMessage(int message) {
		this.message = message;
	}

	/**
	 * @return the cnt
	 */
	public int getCnt() {
		return cnt;
	}

	/**
	 * @param cnt the cnt to set
	 */
	public void setCnt(int cnt) {
		this.cnt = cnt;
	}

	/**
	 * @return the list
	 */
	public List<SmallForecast> getList() {
		return list;
	}

	/**
	 * @param list the list to set
	 */
	public void setList(List<SmallForecast> list) {
		this.list = list;
	}

	/**
	 * @return the city
	 */
	public City getCity() {
		return city;
	}

	/**
	 * @param city the city to set
	 */
	public void setCity(City city) {
		this.city = city;
	}

}
