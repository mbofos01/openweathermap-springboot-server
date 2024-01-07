package cy.ac.ucy.cs.epl425.OpenWeatherMap.CurrentWeatherToolkit;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Simple cloud JSON tag object.
 * 
 * @author Michail Panagiotis Bofos
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Clouds {

	private int all;

	public int getAll() {
		return all;
	}

	public void setAll(int all) {
		this.all = all;
	}
}
