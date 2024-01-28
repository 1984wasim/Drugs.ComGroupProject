package DrStrange.Drugs.pageAction;

import org.openqa.selenium.support.PageFactory;

import DrStrange.Drugs.pageElements.DrugsMobileAppsPageLocators;
import DrStrange.utilities.SetupDrivers;

public class DrugsMobileAppsPageActions {
	
	DrugsMobileAppsPageLocators DrugsMobileAppsPageLocatorsObj;
	
	public DrugsMobileAppsPageActions(){
		DrugsMobileAppsPageLocatorsObj = new DrugsMobileAppsPageLocators();
		PageFactory.initElements(SetupDrivers.driver,DrugsMobileAppsPageLocatorsObj);
	}
	
	public void clickGooglePlay() throws Exception{
		DrugsMobileAppsPageLocatorsObj.btnGooglePlay.click();
		Thread.sleep(2000);
	}
	
	public void clickInstall() throws Exception{
		DrugsMobileAppsPageLocatorsObj.btnInstall.click();
		Thread.sleep(2000);
	}

}
