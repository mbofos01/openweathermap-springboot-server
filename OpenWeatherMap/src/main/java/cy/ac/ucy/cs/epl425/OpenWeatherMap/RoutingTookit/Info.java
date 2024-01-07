package cy.ac.ucy.cs.epl425.OpenWeatherMap.RoutingTookit;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

/**
 * Simple info JSON tag object.
 * 
 * @author Michail Panagiotis Bofos
 *
 */
@SuppressWarnings("deprecation")
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Info {
	private List<String> copyrights;
	private int took;

	/**
	 * @return the copyrights
	 */
	public List<String> getCopyrights() {
		return copyrights;
	}

	/**
	 * @param copyrights the copyrights to set
	 */
	public void setCopyrights(List<String> copyrights) {
		this.copyrights = copyrights;
	}

	/**
	 * @return the took
	 */
	public int getTook() {
		return took;
	}

	/**
	 * @param took the took to set
	 */
	public void setTook(int took) {
		this.took = took;
	}

}
