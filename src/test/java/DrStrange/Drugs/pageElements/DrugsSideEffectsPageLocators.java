package DrStrange.Drugs.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DrugsSideEffectsPageLocators {

	//Click on Adderall link
		@FindBy(xpath="//a[contains(text(),'Adderall')]")
		public WebElement linkAdderall;
		
		//verify visible text
		@FindBy(xpath="//h1[contains(text(),'Adderall Side Effects')]")
		public WebElement txtAdderall;
}
