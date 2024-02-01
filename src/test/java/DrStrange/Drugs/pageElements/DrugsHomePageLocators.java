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
	
	//Click on Interaction Checker link
	@FindBy(xpath="//nav[@class='ddc-header-nav-home']//a[contains(text(),'Interaction Checker')]")
	public WebElement linkInteractionChecker;
	
	//Click on Side Effects link
	@FindBy(xpath="//ul[@id='featured-list-1']//a[contains(text(),'Side Effects')]")
	public WebElement linkSideEffects;
	
	
}
