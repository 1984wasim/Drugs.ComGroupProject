package DrStrange.Drugs.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DrugsRegisterLinkLocator {
	
	//Enter Invalid email
	@FindBy(xpath="//input[@type='email']")
	public WebElement txtbxEnterEmail;
	
	//Click to Continue with email
	@FindBy(xpath="//input[@type='submit']")
	public WebElement btnEmail;
	
	//Verify Error message
	@FindBy(xpath="//b[contains(text(),'Registration failed.')]")
	public WebElement txtErrorMessage;

}
