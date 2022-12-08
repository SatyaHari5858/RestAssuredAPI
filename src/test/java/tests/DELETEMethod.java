package tests;

import org.junit.Test;
import org.junit.runner.RunWith;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Title;
import steps.APISteps;

@RunWith(SerenityRunner.class)
public class DELETEMethod extends APISteps{
	
	@Steps
	APISteps api;
	
	@Title("Sending DELETE Request")
	@Test
	public void DELETERequest() {
		api.SendDELETERequest("11");
		api.validationStatusCode(200);
		//satya
	}

}
