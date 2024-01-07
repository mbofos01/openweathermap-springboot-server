package cy.ac.ucy.cs.epl425.OpenWeatherMap.CurrentWeatherToolkit;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Simple wind JSON tag object.
 * 
 * @author Michail Panagiotis Bofos
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Wind {

	private float speed;
	private int deg;
	private float gust;

	/**
	 * @return the gust
	 */
	public float getGust() {
		return gust;
	}

	/**
	 * @param gust the gust to set
	 */
	public void setGust(float gust) {
		this.gust = gust;
	}

	public float getSpeed() {
		return speed;
	}

	public void setSpeed(float speed) {
		this.speed = speed;
	}

	public int getDeg() {
		return deg;
	}

	public void setDeg(int deg) {
		this.deg = deg;
	}
}
