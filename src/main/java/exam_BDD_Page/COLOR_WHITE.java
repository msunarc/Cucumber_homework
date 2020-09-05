package exam_BDD_Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
//Scenario 2: White Background Change; Given: "Set SkyWhite Background" button exists; When: I click on the button; Then: the background color will change to white

public class COLOR_WHITE {
WebDriver driver;
	
	public COLOR_WHITE(WebDriver driver) {
		this.driver=driver;
	}
	
	
	@FindBy(how = How.CSS,using="button[onclick='myFunctionWhite()']")
	WebElement White_Element;
	
	
	public void white_colorpage_varification() throws InterruptedException {
		Thread.sleep(2000);
		White_Element.click();
	}
}
	


