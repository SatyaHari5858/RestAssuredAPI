package tests;

import org.junit.Test;
import org.junit.runner.RunWith;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Title;
import steps.APISteps;

@RunWith(SerenityRunner.class)
public class POSTMethod extends BaseTest {

//	private String email;
//	private String firstname;
//	private String lastname;
//
//	public void setEmail(String email) {
//		this.email = email;
//	}
//
//	public void setFirstname(String firstname) {
//		this.firstname = firstname;
//	}
//
//	public void setLastname(String lastname) {
//		this.lastname = lastname;
//	}

	@Steps
	APISteps api;

	@Title("Sennding POST Request for creating new user")
	@Test
	public void POSTRequest() {

		api.SendPOSTRequest("Satyahari@gmail.com","Satya","hari");
		api.validationStatusCode(201);
		api.verifyingResponseBoday("firstname", "Satya");
	}

}
