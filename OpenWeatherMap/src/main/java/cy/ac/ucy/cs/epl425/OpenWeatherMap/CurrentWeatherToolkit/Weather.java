package cy.ac.ucy.cs.epl425.OpenWeatherMap.CurrentWeatherToolkit;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Simple weather JSON tag object.
 * 
 * @author Michail Panagiotis Bofos
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Weather {

	private int id;
	private String main;
	private String description;
	private String icon;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMain() {
		return main;
	}

	public void setMain(String main) {
		this.main = main;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}
}
