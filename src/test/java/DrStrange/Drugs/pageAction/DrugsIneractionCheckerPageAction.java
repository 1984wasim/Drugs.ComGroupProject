package DrStrange.Drugs.pageAction;

import org.openqa.selenium.support.PageFactory;

import DrStrange.Drugs.pageElements.DrugsIneractionCheckerPageLocator;
import DrStrange.utilities.SetupDrivers;

public class DrugsIneractionCheckerPageAction {
	
	DrugsIneractionCheckerPageLocator DrugsIneractionCheckerPageLocatorObj;
	
	public DrugsIneractionCheckerPageAction(){
		DrugsIneractionCheckerPageLocatorObj = new DrugsIneractionCheckerPageLocator();
		PageFactory.initElements(SetupDrivers.driver, DrugsIneractionCheckerPageLocatorObj);
	}
	
	public void enterDrugsName() throws Exception{
		DrugsIneractionCheckerPageLocatorObj.txtbxEnterDrugsName.sendKeys("Advil");
		Thread.sleep(2000);
	}
	
    public void clickAddButton() throws Exception{
    	DrugsIneractionCheckerPageLocatorObj.btnAdd.click();
    	Thread.sleep(2000);
	}
    
    public void clickCheckInteractions() throws Exception{
    	DrugsIneractionCheckerPageLocatorObj.btnCheckInteractions.click();
    	Thread.sleep(2000);
	}
    
    public void verifyVisibleText(){
    	DrugsIneractionCheckerPageLocatorObj.txtDrugsName.isDisplayed();
	}

}
