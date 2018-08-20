package stepDefinitions;

import org.junit.Assert;

import common.BasePage;
import pageObjects.HomePage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefs_HomePage extends BasePage {
	
	HomePage methods = new HomePage();
	
	@Given("^I am logged into the system$")
	public void i_am_logged_into_the_system() {
	    methods.checkIfLogged();
	}

	@Then("^I should see the My Tasks link on the NavBar$")
	public void i_should_see_the_My_Tasks_link_on_the_NavBar() {
		methods.checkIfMyTasksLinkIsDisplayed();
	}

	@When("^I click the My Tasks link$")
	public void i_click_the_My_Tasks_link() {
	    methods.clickMyTasksLink();
	}

	@Then("^I should be redirected to \"([^\"]*)\"$")
	public void i_should_be_redirected_to_My_Tasks_page(String url) {
		Assert.assertEquals("https://qa-test.avenuecode.com/tasks", url);
	}
}
