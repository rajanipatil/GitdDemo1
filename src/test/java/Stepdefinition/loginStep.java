package Stepdefinition;


import java.util.Properties;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pagesimplementation.loginpage;
//import pagesimplementation.Urlname;
import qafactory.Driverfactory;

public class loginStep {
	
	private  String title;
	private static Properties properties;
	private loginpage loginPage = new loginpage(Driverfactory.getDriver());
	
	
	@Given("user is on login page")
	public void user_is_on_login_page() {
		Driverfactory.getDriver();
		
		Driverfactory.getDriver().get(Driverfactory.set_target_URL("url"));
}
	

	@When("user gets the title of the page")
	public void user_gets_the_title_of_the_page() {
		title = loginPage.getTitle();
		System.out.println("Page title is: " + title);
		System.out.println("just to check new details ");
	}

	@Then("page title should be {string}")
	public void page_title_should_be(String string) {
	  
	}
}



