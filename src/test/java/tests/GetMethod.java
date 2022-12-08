package tests;

import org.junit.Test;
import org.junit.runner.RunWith;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Title;
import steps.APISteps;

@RunWith(SerenityRunner.class)
public class GetMethod extends BaseTest {

	@Steps
	APISteps api;

	@Title("Sending GET Request for user 4")
	@Test
	public void GetRequest() {

		api.SendGETRequest("4");
		api.validationStatusCode(200);
		api.verifyingResponseBoday("email", "Christ@way2automation.com");

	}
}
