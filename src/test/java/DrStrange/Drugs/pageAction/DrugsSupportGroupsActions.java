package DrStrange.Drugs.pageAction;

import org.openqa.selenium.support.PageFactory;

import DrStrange.Drugs.pageElements.DrugsSupportGroupsLocators;
import DrStrange.utilities.SetupDrivers;

public class DrugsSupportGroupsActions {
	
	DrugsSupportGroupsLocators DrugsSupportGroupsLocatorsObj;
	
	public DrugsSupportGroupsActions(){
		DrugsSupportGroupsLocatorsObj = new DrugsSupportGroupsLocators();
		PageFactory.initElements(SetupDrivers.driver,DrugsSupportGroupsLocatorsObj);
		
	}
	
	public void clickCOVID() throws Exception{
		DrugsSupportGroupsLocatorsObj.linkCOVID.click();
		Thread.sleep(2000);
	}
	
	public void validateCOVIDSupportGroup() throws Exception{
		DrugsSupportGroupsLocatorsObj.txtCOVIDSupportGroup.isDisplayed();
		Thread.sleep(2000);
	}
}
