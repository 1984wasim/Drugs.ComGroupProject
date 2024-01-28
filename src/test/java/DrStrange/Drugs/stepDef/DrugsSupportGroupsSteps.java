package DrStrange.Drugs.stepDef;

import DrStrange.Drugs.pageAction.DrugsSupportGroupsActions;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DrugsSupportGroupsSteps {
	
	DrugsSupportGroupsActions DrugsSupportGroupsActionsObj = new DrugsSupportGroupsActions();
	
	@When("^Click on COVID-(\\d+)$")
	public void click_on_COVID(int arg1) throws Throwable {
		DrugsSupportGroupsActionsObj.clickCOVID();
	}

	@Then("^User should see COVID-(\\d+) Support Group$")
	public void user_should_see_COVID_Support_Group(int arg1) throws Throwable {
		DrugsSupportGroupsActionsObj.validateCOVIDSupportGroup();
	}

}
