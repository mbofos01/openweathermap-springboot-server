package cy.ac.ucy.cs.epl425.OpenWeatherMap;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import cy.ac.ucy.cs.epl425.OpenWeatherMap.RoutingTookit.Hints;
import cy.ac.ucy.cs.epl425.OpenWeatherMap.RoutingTookit.Info;
import cy.ac.ucy.cs.epl425.OpenWeatherMap.RoutingTookit.Path;

/**
 * This class is used for option 3 and contains the JSON tags returned from the
 * API call.
 * 
 * @author Michail Panagiotis Bofos
 *
 */
@SuppressWarnings("deprecation")
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Route {
	private Hints hints;
	private Info info;
	private List<Path> paths;

	/**
	 * @return the hints
	 */
	public Hints getHints() {
		return hints;
	}

	/**
	 * @param hints the hints to set
	 */
	public void setHints(Hints hints) {
		this.hints = hints;
	}

	/**
	 * @return the info
	 */
	public Info getInfo() {
		return info;
	}

	/**
	 * @param info the info to set
	 */
	public void setInfo(Info info) {
		this.info = info;
	}

	/**
	 * @return the paths
	 */
	public List<Path> getPaths() {
		return paths;
	}

	/**
	 * @param paths the paths to set
	 */
	public void setPaths(List<Path> paths) {
		this.paths = paths;
	}

}
