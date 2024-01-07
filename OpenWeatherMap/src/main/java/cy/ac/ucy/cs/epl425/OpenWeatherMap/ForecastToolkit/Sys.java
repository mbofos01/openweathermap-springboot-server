package cy.ac.ucy.cs.epl425.OpenWeatherMap.ForecastToolkit;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Simple sys JSON tag object.
 * 
 * @author Michail Panagiotis Bofos
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Sys {
	private String pod;

	/**
	 * @return the pod
	 */
	public String getPod() {
		return pod;
	}

	/**
	 * @param pod the pod to set
	 */
	public void setPod(String pod) {
		this.pod = pod;
	}

}
