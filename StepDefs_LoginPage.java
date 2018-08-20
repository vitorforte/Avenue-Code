package stepDefinitions;

import common.BasePage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.LoginPage;

public class StepDefs_LoginPage extends BasePage {
	
	LoginPage methods = new LoginPage();
	
	@Given("^I launch browser and navigate to login page$")
	public void i_launch_browser_and_Navigate_to_login_page() {
		BasePage.launchBrowser();
		BasePage.navigateToLoginPage();
	}
	
	@When("^I enter credentials \"([^\"]*)\" and \"([^\"]*)\"$")
	public void i_enter_credentials_and(String email, String password) {
	    methods.loginCredentials(email, password);
	}

	@When("^Click Sign In button$")
	public void click_Sign_In_button() {
		methods.clickSignInButton();
	}

	@Then("^I should log into the system$")
	public void i_should_log_into_the_system() {
	    methods.checkIfLoginIsSuccessful();
	}
}
