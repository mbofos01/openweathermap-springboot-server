package cy.ac.ucy.cs.epl425.OpenWeatherMap;

/**
 * This class is used to check the inputs for the main program. Depending on the
 * arguments and the flags of each option. If we decide to add option this file
 * should be revisited.
 * 
 * @author Michail Panagiotis Bofos
 *
 */

public class ArgumentChecker {
	/**
	 * The main flag usage for each option
	 */
	private String[] flags = { "-currentWeather", "-weatherForecast", "-routing", "-excursion" };
	/**
	 * The number of parameters for each option
	 */
	private int[] argument_numbers = { 2, 2, 5, 5 };
	/**
	 * Special usage flags used for option 4
	 */
	private String[] excursion_flags = { "-from", "-to" };
	/**
	 * Limits for latitude
	 */
	private float lat_min = -90, lat_max = +90;
	/**
	 * Limits for longitude
	 */
	private float lon_min = -180, lon_max = +180;
	/**
	 * Variables used for checking flag usage
	 */
	private int chech_sum_from = 0, check_sum_to = 0;
	/**
	 * String used to pass arguments for option 4
	 */
	private String from, to;

	/**
	 * This method presents the proper usage of each option.
	 * 
	 * @param option Integer number of each option
	 */

	public void properUsage(int option) {
		if (option == 1) {
			System.out.println("\n Wrong arguments, you could try: -currentWeather Nicosia,cy");

		} else if (option == 2) {
			System.out.println("\n Wrong arguments, you could try: -weatherForecast Nicosia,cy");

		} else if (option == 3) {
			System.out.println("\n Wrong arguments, you could try: -routing 35.1667 33.3667 34.7667 32.4167");

		} else if (option == 4) {
			System.out.println("\n Wrong arguments, you could try: -excursion -from Nicosia,cy -to Paphos,cy");

		} else {
			System.out.println("\n Wrong input.");
		}

	}

	/**
	 * This method checks if the structure of the given option is correct. OPTION 1
	 * 
	 * @param args String array containing the arguments
	 * @param msgs Boolean for message showing
	 * @return True if usage is proper
	 */
	public boolean isFirstOption(String[] args, boolean msgs) {
		if (args.length != argument_numbers[0]) {
			if (msgs)
				System.out.println("\n Wrong number of arguments for option 1.");
			return false;
		}
		if (!args[0].equals(flags[0]))
			return false;

		return true;

	}

	/**
	 * This method checks if the structure of the given option is correct. OPTION 2
	 * 
	 * @param args String array containing the arguments
	 * @param msgs Boolean for message showing
	 * @return True if usage is proper
	 */
	public boolean isSecondOption(String[] args, boolean msgs) {
		if (args.length != argument_numbers[1]) {
			if (msgs)
				System.out.println("\n Wrong number of arguments for option 2.");
			return false;
		}
		if (!args[0].equals(flags[1]))
			return false;

		return true;
	}

	/**
	 * This method checks if the structure of the given option is correct. OPTION 3
	 * 
	 * @param args String array containing the arguments
	 * @param msgs Boolean for message showing
	 * @return True if usage is proper
	 */
	public boolean isThirdOption(String[] args, boolean msgs) {
		if (args.length != argument_numbers[2]) {
			if (msgs)
				System.out.println("\n Wrong number of arguments for option 3.");
			return false;
		}
		if (!args[0].equals(flags[2]))
			return false;
		for (int i = 1; i < argument_numbers[2]; i++) {
			try {
				float lat = Float.parseFloat(args[i]);
				if (lat > lat_max || lat < lat_min)
					throw new NumberFormatException();
			} catch (NumberFormatException e) {
				if (msgs) {
					System.out.println("\n Wrong format of latitude!");
					System.out.println("\n Latitude should be between " + lat_min + " and +" + lat_max);
				}
				return false;

			}
			i++;
			try {
				float lon = Float.parseFloat(args[i]);
				if (lon > lon_max || lon < lon_min)
					throw new NumberFormatException();
			} catch (NumberFormatException e) {
				if (msgs) {
					System.out.println("\n Wrong format of longitude!");
					System.out.println("\n Longitude should be between " + lon_min + " and +" + lon_max);
				}
				return false;
			}
		}
		return true;
	}

	/**
	 * This method checks if the structure of the given option is correct. OPTION 4
	 * 
	 * @param args String array containing the arguments
	 * @param msgs Boolean for message showing
	 * @return True if usage is proper
	 */
	public boolean isFourthOption(String[] args, boolean msgs) {
		if (args.length != argument_numbers[3]) {
			if (msgs)
				System.out.println("\n Wrong number of arguments for option 4.");
			return false;
		}
		if (!args[0].equals(flags[3]))
			return false;

		for (int i = 1; i < argument_numbers[3]; i++) {
			if (args[i].equals(excursion_flags[0])) {
				i++;
				from = args[i];
				chech_sum_from++;

			} else if (args[i].equals(excursion_flags[1])) {
				i++;
				to = args[i];
				check_sum_to++;

			} else {
				if (msgs)
					System.out.println("\n Wrong usage of flags!");
				return false;

			}

		}
		if (check_sum_to == 0) {
			if (msgs)
				System.out.println("\n Destination city is not defined!");

			return false;
		}
		if (chech_sum_from == 0) {
			if (msgs)
				System.out.println("\n Source city is not defined!");
			return false;
		}

		return true;

	}

	/**
	 * This method returns the from city in option 4.
	 * 
	 * @return String source city
	 */
	public String getFrom() {
		return from;
	}

	/**
	 * This method returns the to city in option 4.
	 * 
	 * @return String destination city
	 */
	public String getTo() {
		return to;
	}

}
