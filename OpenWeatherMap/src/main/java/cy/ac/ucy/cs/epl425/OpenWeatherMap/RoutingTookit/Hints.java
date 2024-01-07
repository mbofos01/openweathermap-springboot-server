package cy.ac.ucy.cs.epl425.OpenWeatherMap.RoutingTookit;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import com.google.gson.annotations.SerializedName;

/**
 * Simple hints JSON tag object.
 * 
 * @author Michail Panagiotis Bofos
 *
 */
@SuppressWarnings("deprecation")
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Hints {
	@JsonProperty("visited_nodes.average")
	@SerializedName(value = "visited_nodes.average")
	private String visited_nodes_average;
	@JsonProperty("visited_nodes.sum")
	@SerializedName(value = "visited_nodes.sum")
	private String visited_nodes_sum;

	/**
	 * @return the visited_nodes_average
	 */
	public String getVisited_nodes_average() {
		return visited_nodes_average;
	}

	/**
	 * @param visited_nodes_average the visited_nodes_average to set
	 */
	public void setVisited_nodes_average(String visited_nodes_average) {
		this.visited_nodes_average = visited_nodes_average;
	}

	/**
	 * @return the visited_nodes_sum
	 */
	public String getVisited_nodes_sum() {
		return visited_nodes_sum;
	}

	/**
	 * @param visited_nodes_sum the visited_nodes_sum to set
	 */
	public void setVisited_nodes_sum(String visited_nodes_sum) {
		this.visited_nodes_sum = visited_nodes_sum;
	}

}
