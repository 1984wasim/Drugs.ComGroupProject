package DrStrange.Drugs.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DrugsHomePageLocators {
	
	//click mobile apps
	@FindBy(xpath="//a[contains(text(),'Mobile Apps')]")
	public WebElement linkMobileApps;
	
	//click Community Support
	@FindBy(xpath="//a[contains (text(),'Community Support')]")
	public WebElement linkCommunitySupport;
	
	//Click on register link
	@FindBy(xpath="//a[contains(text(),'Register')]")
	public WebElement linkRegister;

}
