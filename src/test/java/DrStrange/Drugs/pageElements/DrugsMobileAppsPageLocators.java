package DrStrange.Drugs.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DrugsMobileAppsPageLocators {
	
		//click Google Play
		@FindBy(xpath="//img[@alt='View Medication Guide App on Google Play store']")
		public WebElement btnGooglePlay;
		
		//click Install
		@FindBy(xpath="//button[@aria-label='Install']")
		public WebElement btnInstall;
		
		
		}

