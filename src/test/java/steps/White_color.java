package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import UTIL.WEB_Browser;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import exam_BDD_Page.COLOR_WHITE;

public class White_color {
	WebDriver driver;
	COLOR_WHITE white;
	
	@Before
	public void change() throws InterruptedException{
		driver=WEB_Browser.launch();
		white=PageFactory.initElements(driver, COLOR_WHITE.class);
	}
	
	@Given("^I am on the techfios site for the color change$")
	public void i_am_on_the_techfios_site_for_the_color_change() throws Throwable {
	   
	}

	@When("^I click White background$")
	public void i_click_White_background() throws Throwable {
		 white=PageFactory.initElements(driver, COLOR_WHITE.class);
		 white.white_colorpage_varification();
	}

	@Then("^Back ground color is blue$")
	public void back_ground_color_is_blue() throws Throwable {
		 System.out.println("Changed to white color");
	}

}
