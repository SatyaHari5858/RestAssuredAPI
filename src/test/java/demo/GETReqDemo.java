package demo;

import static org.hamcrest.Matchers.*;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Title;

@RunWith(SerenityRunner.class)
public class GETReqDemo {

	@BeforeClass
	public static void init() {
		RestAssured.baseURI = "http://localhost:8080";
		RestAssured.basePath = "/api/users/";

	}

	@Title("Sending GET Request")
	@Test
	public void GetRequest() {

		Response response = SerenityRest.given().when().get("4");
		response.prettyPrint();
		response.then().statusCode(200);
		response.then().body("email", equalTo("Christ@way2automation.com"));

	}
}
