package cy.ac.ucy.cs.epl425.OpenWeatherMap.ForecastToolkit;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

/**
 * Simple main JSON tag object.
 * 
 * @author Michail Panagiotis Bofos
 *
 */
@SuppressWarnings("deprecation")
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Main {
	private float temp;
	private float feels_like;
	private float temp_min;
	private float temp_max;
	private int pressure;
	private int sea_level;
	private int grnd_level;
	private int humidity;
	private float temp_kf;

	/**
	 * @return the temp
	 */
	public float getTemp() {
		return temp;
	}

	/**
	 * @param temp the temp to set
	 */
	public void setTemp(float temp) {
		this.temp = temp;
	}

	/**
	 * @return the feels_like
	 */
	public float getFeels_like() {
		return feels_like;
	}

	/**
	 * @param feels_like the feels_like to set
	 */
	public void setFeels_like(float feels_like) {
		this.feels_like = feels_like;
	}

	/**
	 * @return the temp_min
	 */
	public float getTemp_min() {
		return temp_min;
	}

	/**
	 * @param temp_min the temp_min to set
	 */
	public void setTemp_min(float temp_min) {
		this.temp_min = temp_min;
	}

	/**
	 * @return the temp_max
	 */
	public float getTemp_max() {
		return temp_max;
	}

	/**
	 * @param temp_max the temp_max to set
	 */
	public void setTemp_max(float temp_max) {
		this.temp_max = temp_max;
	}

	/**
	 * @return the pressure
	 */
	public int getPressure() {
		return pressure;
	}

	/**
	 * @param pressure the pressure to set
	 */
	public void setPressure(int pressure) {
		this.pressure = pressure;
	}

	/**
	 * @return the sea_level
	 */
	public int getSea_level() {
		return sea_level;
	}

	/**
	 * @param sea_level the sea_level to set
	 */
	public void setSea_level(int sea_level) {
		this.sea_level = sea_level;
	}

	/**
	 * @return the grnd_level
	 */
	public int getGrnd_level() {
		return grnd_level;
	}

	/**
	 * @param grnd_level the grnd_level to set
	 */
	public void setGrnd_level(int grnd_level) {
		this.grnd_level = grnd_level;
	}

	/**
	 * @return the humidity
	 */
	public int getHumidity() {
		return humidity;
	}

	/**
	 * @param humidity the humidity to set
	 */
	public void setHumidity(int humidity) {
		this.humidity = humidity;
	}

	/**
	 * @return the temp_kf
	 */
	public float getTemp_kf() {
		return temp_kf;
	}

	/**
	 * @param temp_kf the temp_kf to set
	 */
	public void setTemp_kf(float temp_kf) {
		this.temp_kf = temp_kf;
	}

}