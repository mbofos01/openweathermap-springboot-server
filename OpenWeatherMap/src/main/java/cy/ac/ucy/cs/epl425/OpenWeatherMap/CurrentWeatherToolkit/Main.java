package cy.ac.ucy.cs.epl425.OpenWeatherMap.CurrentWeatherToolkit;

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
	private int pressure;
	private int humidity;
	private float temp_min;
	private float temp_max;

	public float getTemp() {
		return temp;
	}

	public void setTemp(float temp) {
		this.temp = temp;
	}

	public int getPressure() {
		return pressure;
	}

	public void setPressure(int pressure) {
		this.pressure = pressure;
	}

	public int getHumidity() {
		return humidity;
	}

	public void setHumidity(int humidity) {
		this.humidity = humidity;
	}

	public float getTempMin() {
		return temp_min;
	}

	public void setTempMin(float temp_min) {
		this.temp_min = temp_min;
	}

	public float getTempMax() {
		return temp_max;
	}

	public void setTempMax(float temp_max) {
		this.temp_max = temp_max;
	}
}
