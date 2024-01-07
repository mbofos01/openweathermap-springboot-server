package cy.ac.ucy.cs.epl425.OpenWeatherMap;

import java.io.IOException;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.http.HttpStatus;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.web.client.ResponseErrorHandler;

/**
 * This object is used to handle the special exception of HTTP messaging.
 * 
 * @author Michail Panagiotis Bofos
 *
 */
public class RestTemplateResponseErrorHandler implements ResponseErrorHandler {
	ConfigurableApplicationContext ctx;

	public RestTemplateResponseErrorHandler(ConfigurableApplicationContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public boolean hasError(ClientHttpResponse httpResponse) throws IOException {

		return (httpResponse.getRawStatusCode() >= 400 || httpResponse.getRawStatusCode() >= 500);
	}

	@Override
	public void handleError(ClientHttpResponse httpResponse) throws IOException {

		if (httpResponse.getStatusCode().series() == HttpStatus.Series.SERVER_ERROR) {
			// handle SERVER_ERROR
			System.out.println("\tError: Server error, it seems there's a problem right now try again later!");
			System.out.println(
					"\n************************************************************************************************************************************************************************************************************************************************\n");
			ctx.close();
			System.exit(0);
		} else if (httpResponse.getStatusCode().series() == HttpStatus.Series.CLIENT_ERROR) {
			// handle CLIENT_ERROR
			if (httpResponse.getStatusCode() == HttpStatus.NOT_FOUND) {
				System.out.println("\tError: The city you chose does not exist. Try again!");
				System.out.println(
						"\n************************************************************************************************************************************************************************************************************************************************\n");
				ctx.close();
				System.exit(0);
			} else if (httpResponse.getRawStatusCode() == 401) {
				System.out.println("\tError: Check your API key it might have expire!");
				System.out.println(
						"\n************************************************************************************************************************************************************************************************************************************************\n");
				ctx.close();
				System.exit(0);
			}
		}
		System.out.println(
				"\n************************************************************************************************************************************************************************************************************************************************\n");
		System.out.println("\tError: An unexpected error occuried.");
		ctx.close();
		System.exit(0);
	}

}