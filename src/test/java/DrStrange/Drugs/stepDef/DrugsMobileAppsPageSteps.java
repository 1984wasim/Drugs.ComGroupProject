package DrStrange.Drugs.stepDef;

import DrStrange.Drugs.pageAction.DrugsMobileAppsPageActions;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DrugsMobileAppsPageSteps {
	
	DrugsMobileAppsPageActions DrugsMobileAppsPageActionsObj = new DrugsMobileAppsPageActions();
	
	@When("^Click on \"([^\"]*)\" Button$")
	public void click_on_Button(String arg1) throws Throwable {
		DrugsMobileAppsPageActionsObj.clickGooglePlay();
	}

	@Then("^Click on Install$")
	public void click_on_Install() throws Throwable {
		DrugsMobileAppsPageActionsObj.clickInstall();
	}
	
}
