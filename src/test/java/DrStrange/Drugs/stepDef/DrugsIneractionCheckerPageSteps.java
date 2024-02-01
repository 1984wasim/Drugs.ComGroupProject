package DrStrange.Drugs.stepDef;

import DrStrange.Drugs.pageAction.DrugsIneractionCheckerPageAction;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DrugsIneractionCheckerPageSteps {
	
	DrugsIneractionCheckerPageAction DrugsIneractionCheckerPageActionObj = new DrugsIneractionCheckerPageAction();
	
	@When("^the user enters Drugs name$")
	public void the_user_enters_Drugs_name() throws Throwable {
		DrugsIneractionCheckerPageActionObj.enterDrugsName();
	}

	@When("^the user clicks to the Add button$")
	public void the_user_clicks_to_the_Add_button() throws Throwable {
		DrugsIneractionCheckerPageActionObj.clickAddButton();
	}

	@When("^the user clicks to the Check Ineraction button$")
	public void the_user_clicks_to_the_Check_Ineraction_button() throws Throwable {
		DrugsIneractionCheckerPageActionObj.clickCheckInteractions();
	}

	@Then("^the user should see related drugs information$")
	public void the_user_should_see_related_drugs_information() throws Throwable {
		DrugsIneractionCheckerPageActionObj.verifyVisibleText();
	}

}
