package DrStrange.Drugs.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DrugsIneractionCheckerPageLocator {
	
		//Enter drugs name
		@FindBy(xpath="//input[@placeholder='Enter a drug name']")
		public WebElement txtbxEnterDrugsName;
		
		//click Add button
		@FindBy(xpath="//input[@value='Add']")
		public WebElement btnAdd;
		
		//click Check Interactions button
		@FindBy(xpath="//a[contains(text(),'Check Interactions')]")
		public WebElement btnCheckInteractions;
		
		//verify drugs name
		@FindBy(xpath="//h1[contains(text(),'Advil Interactions')]")
		public WebElement txtDrugsName;

		
}
