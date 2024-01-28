package DrStrange.Drugs.pageAction;

import org.openqa.selenium.support.PageFactory;

import DrStrange.Drugs.pageElements.DrugsRegisterLinkLocator;
import DrStrange.utilities.SetupDrivers;

public class DrugsRegisterActions {

	DrugsRegisterLinkLocator DrugsRegisterLinkLocatorObj;
	
	public DrugsRegisterActions(){
		DrugsRegisterLinkLocatorObj = new DrugsRegisterLinkLocator();
		PageFactory.initElements(SetupDrivers.driver, DrugsRegisterLinkLocatorObj);
	}
	
	
	
	public void EnterEmail() throws Exception{
		DrugsRegisterLinkLocatorObj.txtbxEnterEmail.sendKeys("abc@gmail.com");
		Thread.sleep(2000);
	}
	
	public void ClickEmail() throws Exception{
		DrugsRegisterLinkLocatorObj.btnEmail.click();
		Thread.sleep(2000);
	}
	
	public void VerifyErrorMessage(){
		DrugsRegisterLinkLocatorObj.txtErrorMessage.isDisplayed();
	}
}
