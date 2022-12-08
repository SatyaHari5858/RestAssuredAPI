package steps;

import java.util.HashMap;
import static org.hamcrest.Matchers.*;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

public class APISteps {

	private Response response;

	@Step("Sending GET Request for userID : {0}")
	public void SendGETRequest(String userID) {
		response = SerenityRest.given().when().get(userID);
		response.prettyPrint();
	}

	@Step("Sending POST Request for userID : {0}")
	public void SendPOSTRequest(String email, String firstname, String lastname) {

		HashMap<String, String> map = new HashMap<String, String>();
		map.put("email",email);
		map.put("firstname",firstname);
		map.put("lastname",lastname);
		response = SerenityRest.given().contentType(ContentType.JSON).body(map).log().all().post();
		response.prettyPrint();
	}

	@Step("Sending DELETE Request for userID : {0}")
	public void SendDELETERequest(String userID) {
		response = SerenityRest.given().when().delete();
		response.prettyPrint();
	}

	@Step("Validating Status code To be : {0}")
	public void validationStatusCode(int code) {

		response.then().statusCode(code);

	}

	@Step("Verifying Response Boday for key {0} and value {0}")
	public void verifyingResponseBoday(String key, String value) {
		response.then().body(key, equalTo(value));
	}

}
