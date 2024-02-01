package DrStrange.Drugs.stepDef;

import DrStrange.Drugs.pageAction.DrugsSideEffectsPageActions;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DrugsSideEffectsPageSteps {
	
	DrugsSideEffectsPageActions DrugsSideEffectsPageActionsObj = new DrugsSideEffectsPageActions();
	
	@When("^the user click on  Adderall link$")
	public void the_user_click_on_Adderall_link() throws Throwable {
		DrugsSideEffectsPageActionsObj.clickAdderall();
	}

	@Then("^the user should see related drugs side effects information$")
	public void the_user_should_see_related_drugs_side_effects_information() throws Throwable {
		DrugsSideEffectsPageActionsObj.verifyAdderallSideEffects();
	}
}
