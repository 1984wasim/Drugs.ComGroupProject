package DrStrange.Drugs.stepDef;

import DrStrange.Drugs.pageAction.DrugsRegisterActions;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DrugsRegisterLinkSteps {
	
	DrugsRegisterActions DrugsRegisterActionsObj = new DrugsRegisterActions();
	
	@When("^the user enters invalid email$")
	public void the_user_enters_invalid_email() throws Throwable {
		DrugsRegisterActionsObj.EnterEmail();
	}

	@When("^the user clicks to the Continue with email button$")
	public void the_user_clicks_to_the_Continue_with_email_button() throws Throwable {
		DrugsRegisterActionsObj.ClickEmail();
	}

	@Then("^the user should see an error message$")
	public void the_user_should_see_an_error_message() throws Throwable {
		DrugsRegisterActionsObj.VerifyErrorMessage();
	}

}
