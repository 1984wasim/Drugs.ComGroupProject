package DrStrange.Drugs.pageAction;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;

import DrStrange.Drugs.pageElements.DrugsHomePageLocators;
import DrStrange.utilities.SetupDrivers;

public class DrugsHomePageActions {
	
	DrugsHomePageLocators DrugsHomePageLocatorsObj;
	
	public DrugsHomePageActions(){
		DrugsHomePageLocatorsObj = new DrugsHomePageLocators();
		PageFactory.initElements(SetupDrivers.driver,DrugsHomePageLocatorsObj);
	}
	
	public void clickMobileApps(){
		DrugsHomePageLocatorsObj.linkMobileApps.click();
	}
	
	public void clickCommunitySupport(){
		DrugsHomePageLocatorsObj.linkCommunitySupport.click();
	}
	
	public void LinkRegister(){
		DrugsHomePageLocatorsObj.linkRegister.click();
	}

}
