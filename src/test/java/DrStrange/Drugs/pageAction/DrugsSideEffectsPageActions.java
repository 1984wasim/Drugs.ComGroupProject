package DrStrange.Drugs.pageAction;

import org.openqa.selenium.support.PageFactory;

import DrStrange.Drugs.pageElements.DrugsSideEffectsPageLocators;
import DrStrange.utilities.SetupDrivers;

public class DrugsSideEffectsPageActions {
	
	DrugsSideEffectsPageLocators DrugsSideEffectsPageLocatorsObj;
	
	public DrugsSideEffectsPageActions(){
		DrugsSideEffectsPageLocatorsObj = new DrugsSideEffectsPageLocators();
		PageFactory.initElements(SetupDrivers.driver, DrugsSideEffectsPageLocatorsObj);
		
	}
	
	public void clickAdderall() throws Exception{
		DrugsSideEffectsPageLocatorsObj.linkAdderall.click();
		Thread.sleep(2000);
	}
	
	public void verifyAdderallSideEffects(){
		DrugsSideEffectsPageLocatorsObj.txtAdderall.isDisplayed();
	}

}
