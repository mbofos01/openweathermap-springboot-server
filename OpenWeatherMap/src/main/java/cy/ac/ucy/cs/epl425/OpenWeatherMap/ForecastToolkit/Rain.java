package cy.ac.ucy.cs.epl425.OpenWeatherMap.ForecastToolkit;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;

/**
 * Simple rain JSON tag object.
 * 
 * @author Michail Panagiotis Bofos
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Rain {
	@JsonProperty("3h")
	@SerializedName(value = "3h")
	private float threeHours;

	/**
	 * @return the threehours
	 */
	public float getThreehours() {
		return threeHours;
	}

	/**
	 * @param threehours the threehours to set
	 */
	public void setThreehours(float threehours) {
		this.threeHours = threehours;
	}

}
