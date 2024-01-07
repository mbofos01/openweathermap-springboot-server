package cy.ac.ucy.cs.epl425.OpenWeatherMap.RoutingTookit;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

/**
 * Simple path JSON tag object.
 * 
 * @author Michail Panagiotis Bofos
 *
 */
@SuppressWarnings("deprecation")
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Path {

	private long distance;
	private long weight;
	private long time;
	private int transfers;
	private boolean point_encoded;
	private List<Long> bbox;
	private String points;
	private List<Instructions> instructions;
	private List<String> legs;
	private Details details;
	private long ascend;
	private long descend;
	private String snapped_waypoints;

	/**
	 * @return the distance
	 */
	public long getDistance() {
		return distance;
	}

	/**
	 * @param distance the distance to set
	 */
	public void setDistance(long distance) {
		this.distance = distance;
	}

	/**
	 * @return the weight
	 */
	public long getWeight() {
		return weight;
	}

	/**
	 * @param weight the weight to set
	 */
	public void setWeight(long weight) {
		this.weight = weight;
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
	 * @return the transfers
	 */
	public int getTransfers() {
		return transfers;
	}

	/**
	 * @param transfers the transfers to set
	 */
	public void setTransfers(int transfers) {
		this.transfers = transfers;
	}

	/**
	 * @return the point_encoded
	 */
	public boolean isPoint_encoded() {
		return point_encoded;
	}

	/**
	 * @param point_encoded the point_encoded to set
	 */
	public void setPoint_encoded(boolean point_encoded) {
		this.point_encoded = point_encoded;
	}

	/**
	 * @return the bbox
	 */
	public List<Long> getBbox() {
		return bbox;
	}

	/**
	 * @param bbox the bbox to set
	 */
	public void setBbox(List<Long> bbox) {
		this.bbox = bbox;
	}

	/**
	 * @return the points
	 */
	public String getPoints() {
		return points;
	}

	/**
	 * @param points the points to set
	 */
	public void setPoints(String points) {
		this.points = points;
	}

	/**
	 * @return the instructions
	 */
	public List<Instructions> getInstructions() {
		return instructions;
	}

	/**
	 * @param instructions the instructions to set
	 */
	public void setInstructions(List<Instructions> instructions) {
		this.instructions = instructions;
	}

	/**
	 * @return the legs
	 */
	public List<String> getLegs() {
		return legs;
	}

	/**
	 * @param legs the legs to set
	 */
	public void setLegs(List<String> legs) {
		this.legs = legs;
	}

	/**
	 * @return the details
	 */
	public Details getDetails() {
		return details;
	}

	/**
	 * @param details the details to set
	 */
	public void setDetails(Details details) {
		this.details = details;
	}

	/**
	 * @return the ascend
	 */
	public long getAscend() {
		return ascend;
	}

	/**
	 * @param ascend the ascend to set
	 */
	public void setAscend(long ascend) {
		this.ascend = ascend;
	}

	/**
	 * @return the descend
	 */
	public long getDescend() {
		return descend;
	}

	/**
	 * @param descend the descend to set
	 */
	public void setDescend(long descend) {
		this.descend = descend;
	}

	/**
	 * @return the snapped_waypoints
	 */
	public String getSnapped_waypoints() {
		return snapped_waypoints;
	}

	/**
	 * @param snapped_waypoints the snapped_waypoints to set
	 */
	public void setSnapped_waypoints(String snapped_waypoints) {
		this.snapped_waypoints = snapped_waypoints;
	}

}
