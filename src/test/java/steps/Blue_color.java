package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import UTIL.WEB_Browser;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import exam_BDD_Page.Sky_BLUE;

public class Blue_color {
WebDriver driver;
Sky_BLUE blue;


@Before
public void change() throws InterruptedException{
	driver=WEB_Browser.launch();
	blue=PageFactory.initElements(driver, Sky_BLUE.class);
}
@Given("^I am on the techfios site$")
public void i_am_on_the_techfios_site() throws Throwable {
    
}

@When("^i click Sky blue background$")
public void i_click_Sky_blue_background() throws Throwable {
    blue=PageFactory.initElements(driver, Sky_BLUE.class);
blue.colorpage_varification();
}

@Then("^Back groung color is blue$")
public void back_groung_color_is_blue() throws Throwable {
    System.out.println("Changed to BLue color");
}

}
