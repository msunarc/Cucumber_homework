package exam_BDD_Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
//Scenario 1: Sky Blue Background; Given: "Set SkyBlue Background" button exists; When: I click on the button; Then: the background color will change to sky blue
public class Sky_BLUE {
WebDriver driver;
	
	public Sky_BLUE(WebDriver driver) {
		this.driver=driver;
	}
	@FindBy(how =How.CSS,using="button[onclick='myFunctionSky()']")
	WebElement Blue_Element;
	
	public void colorpage_varification() {
		Blue_Element.click();;
	}

}

