package DrStrange.Drugs.stepDef;

import DrStrange.Drugs.pageAction.DrugsHomePageActions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class DrugsHomePageSteps {
	
	DrugsHomePageActions DrugsHomePageActionsObj = new DrugsHomePageActions();
	
	@Given("^Open Drugs Homepage$")
	public void open_Drugs_Homepage() throws Throwable {
	    
	}

	@When("^Click on Mobile Apps$")
	public void click_on_Mobile_Apps() throws Throwable {
		DrugsHomePageActionsObj.clickMobileApps();
	}
	
	@When("^Click on Community Support$")
	public void click_on_Community_Support() throws Throwable {
		DrugsHomePageActionsObj.clickCommunitySupport();
	}
	
	@When("^the user clicks on the Register link$")
	public void the_user_clicks_on_the_Register_link() throws Throwable {
		DrugsHomePageActionsObj.LinkRegister();
	}
	
	@When("^the user clicks on the Interaction Checker link$")
	public void the_user_clicks_on_the_Interaction_Checker_link() throws Throwable {
		DrugsHomePageActionsObj.LinkInteractionChecker();
	}
	
	@When("^the user clicks on the Side Effects link$")
	public void the_user_clicks_on_the_Side_Effects_link() throws Throwable {
		DrugsHomePageActionsObj.linkSideEffects();
	}
	
}
