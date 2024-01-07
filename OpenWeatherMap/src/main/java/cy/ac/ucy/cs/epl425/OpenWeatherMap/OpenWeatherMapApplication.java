package cy.ac.ucy.cs.epl425.OpenWeatherMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * This is the main part of our program.
 * 
 * @author Michail Panagiotis Bofos
 *
 */
@SuppressWarnings("deprecation")
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)

@SpringBootApplication
public class OpenWeatherMapApplication {

	private static final String REST_URI = "https://api.openweathermap.org";
	private static final String APPID = "3030488c6de74d04fd43e9054f2e385a";
	private static final String GRAPHHOPPER_API = "https://graphhopper.com";
	private static final String GRAPHHOPPER_APPID = "17b0b2c4-c9ec-4b0b-8a11-1f488ed844cc";

	// A logger, to send output to the log (the console, in this example)
	@SuppressWarnings("unused")
	private static final Logger log = LoggerFactory.getLogger(OpenWeatherMapApplication.class);

	@Autowired
	private static RestTemplateBuilder builder = new RestTemplateBuilder();

	public static void main(String[] args) {

		ConfigurableApplicationContext ctx = SpringApplication.run(OpenWeatherMapApplication.class, args);
		RestTemplate restTemplate = builder.errorHandler(new RestTemplateResponseErrorHandler(ctx)).build();

		ArgumentChecker check = new ArgumentChecker();
		System.out.println(
				"\n************************************************************************************************************************************************************************************************************************************************\n");

		if (args.length == 0) {
			System.out.println("\n No arguments were given");
			for (int i = 1; i <= 4; i++)
				check.properUsage(i);
		} else {

			if (args[0].equals("-currentWeather")) {
				boolean wright = check.isFirstOption(args, true);
				if (wright == false) {
					check.properUsage(1);
					System.out.println(
							"\n************************************************************************************************************************************************************************************************************************************************\n");
					ctx.close();
					System.exit(0);
				}
				// parse response and load it into CurrentWeather class
				CurrentWeather currWeather = null;

				currWeather = restTemplate.getForObject(
						REST_URI + "/data/2.5/weather?q=" + args[1] + "&units=metric&APPID=" + APPID,
						CurrentWeather.class);

				System.out.println("\t Printing current weather for " + currWeather.getName() + " city.\n");
				Gson gsonObj = new GsonBuilder().setPrettyPrinting().create();
				System.out.println(gsonObj.toJson(currWeather.getWeather().get(0)));
				System.out.println(gsonObj.toJson(currWeather.getMain()));

			} else if (args[0].equals("-weatherForecast")) {
				boolean wright = check.isSecondOption(args, true);
				if (wright == false) {
					check.properUsage(2);
					System.out.println(
							"\n************************************************************************************************************************************************************************************************************************************************\n");
					ctx.close();
					System.exit(0);
				}

				Forecast forecast = null;
				forecast = restTemplate.getForObject(
						REST_URI + "/data/2.5/forecast?q=" + args[1] + "&units=metric&APPID=" + APPID, Forecast.class);

				System.out.println("\t Printing weather forecast for " + forecast.getCity().getName() + " city.\n");
				Gson gsonObj = new GsonBuilder().setPrettyPrinting().create();
				System.out.println(gsonObj.toJson(forecast.getList().get(0)));

			} else if (args[0].equals("-routing")) {
				boolean wright = check.isThirdOption(args, true);
				if (wright == false) {
					check.properUsage(3);
					System.out.println(
							"\n************************************************************************************************************************************************************************************************************************************************\n");
					ctx.close();
					System.exit(0);
				}

				Route routing = restTemplate.getForObject(GRAPHHOPPER_API + "/api/1/route?point=" + args[1] + ","
						+ args[2] + "&point=" + args[3] + "," + args[4] + "&vehicle=car&key=" + GRAPHHOPPER_APPID,
						Route.class);

				System.out.println("\t Printing routing for " + args[1] + "," + args[2] + " to " + args[3] + ","
						+ args[4] + ".\n");
				Gson gsonObj = new GsonBuilder().setPrettyPrinting().create();
				System.out.println(gsonObj.toJson(routing.getPaths().get(0).getInstructions().get(0)));
				System.out.println(gsonObj.toJson(routing.getPaths().get(0).getInstructions().get(1)));

			} else if (args[0].equals("-excursion")) {
				boolean wright = check.isFourthOption(args, true);
				if (wright == false) {
					check.properUsage(4);
					System.out.println(
							"\n************************************************************************************************************************************************************************************************************************************************\n");
					ctx.close();
					System.exit(0);
				}

				String from = check.getFrom();
				String dest = check.getTo();

				CurrentWeather currWeather = restTemplate.getForObject(
						REST_URI + "/data/2.5/weather?q=" + from + "&units=metric&APPID=" + APPID,
						CurrentWeather.class);

				Forecast forecast = restTemplate.getForObject(
						REST_URI + "/data/2.5/forecast?q=" + dest + "&units=metric&APPID=" + APPID, Forecast.class);

				float SrcX = currWeather.getCoord().getLat();
				float SrcY = currWeather.getCoord().getLon();
				float DestX = forecast.getCity().getCoord().getLat();
				float DestY = forecast.getCity().getCoord().getLon();

				Route route = restTemplate.getForObject(GRAPHHOPPER_API + "/api/1/route?point=" + SrcX + "," + SrcY
						+ "&point=" + DestX + "," + DestY + "&vehicle=car&key=" + GRAPHHOPPER_APPID, Route.class);

				Excursion excursion = new Excursion(forecast, currWeather, route);
				excursion.printDetails();
				System.out.println(excursion.highestTemp());
				System.out.println(excursion.totalTripDistance());
				System.out.println(excursion.totalTripTime());

			} else {
				System.out.println("\t Wrong flags were used!");
				for (int i = 1; i <= 4; i++)
					check.properUsage(i);
			}
		}
		System.out.println(
				"\n************************************************************************************************************************************************************************************************************************************************\n");
		ctx.close();
	}
}
