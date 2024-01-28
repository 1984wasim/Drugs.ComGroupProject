package DrStrange.Drugs.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DrugsSupportGroupsLocators {
	
	//click COVID-19
	@FindBy(xpath="//a[contains (text(),'COVID-19')]")
	public WebElement linkCOVID;

	//validate COVID-19 Support Group
	@FindBy(xpath="//h1[contains (text(),'COVID-19 Support Group')]")
	public WebElement txtCOVIDSupportGroup;
	
}
