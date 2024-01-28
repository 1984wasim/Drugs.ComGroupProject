package DrStrange.Drugs.stepDef;

import DrStrange.api.restassured.PetRestAssuredActions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class PetApiSteps {
	
	PetRestAssuredActions PetRestAssuredActionsObj = new PetRestAssuredActions();
	
	@Given("^Create pet$")
	public void create_pet() throws Throwable {
		PetRestAssuredActionsObj.createPet();
	}

	@Given("^Get pet$")
	public void get_pet() throws Throwable {
		PetRestAssuredActionsObj.getPet();
	}

	@When("^Update pet$")
	public void update_pet() throws Throwable {
		PetRestAssuredActionsObj.updatePet();
	}

	@Then("^Delete pet$")
	public void delete_pet() throws Throwable {
		PetRestAssuredActionsObj.deletePet();
	}


}
