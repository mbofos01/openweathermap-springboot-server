package cy.ac.ucy.cs.epl425.OpenWeatherMap.RoutingTookit;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

/**
 * Simple instruction JSON tag object.
 * 
 * @author Michail Panagiotis Bofos
 *
 */
@SuppressWarnings("deprecation")
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Instructions {

	private double distance;
	private double heading;
	private int sign;
	private List<Integer> interval;
	private String text;
	private long time;
	private String street_name;

	/**
	 * @return the distance
	 */
	public double getDistance() {
		return distance;
	}

	/**
	 * @param distance the distance to set
	 */
	public void setDistance(double distance) {
		this.distance = distance;
	}

	/**
	 * @return the heading
	 */
	public double getHeading() {
		return heading;
	}

	/**
	 * @param heading the heading to set
	 */
	public void setHeading(double heading) {
		this.heading = heading;
	}

	/**
	 * @return the sign
	 */
	public int getSign() {
		return sign;
	}

	/**
	 * @param sign the sign to set
	 */
	public void setSign(int sign) {
		this.sign = sign;
	}

	/**
	 * @return the interval
	 */
	public List<Integer> getInterval() {
		return interval;
	}

	/**
	 * @param interval the interval to set
	 */
	public void setInterval(List<Integer> interval) {
		this.interval = interval;
	}

	/**
	 * @return the text
	 */
	public String getText() {
		return text;
	}

	/**
	 * @param text the text to set
	 */
	public void setText(String text) {
		this.text = text;
	}

	/**
	 * @return the time
	 */
	public long getTime() {
		return time;
	}

	/**
	 * @param time the time to set
	 */
	public void setTime(long time) {
		this.time = time;
	}

	/**
	 * @return the street_name
	 */
	public String getStreet_name() {
		return street_name;
	}

	/**
	 * @param street_name the street_name to set
	 */
	public void setStreet_name(String street_name) {
		this.street_name = street_name;
	}

}
