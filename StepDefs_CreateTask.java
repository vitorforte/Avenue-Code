package stepDefinitions;

import org.junit.Assert;

import common.BasePage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pageObjects.CreateTaskPage;

public class StepDefs_CreateTask extends BasePage {
	
	CreateTaskPage taskMethods = new CreateTaskPage();
	
	@Given("^I am in My Tasks page$")
	public void i_am_in_My_Tasks_page() {
		Assert.assertEquals("https://qa-test.avenuecode.com/tasks", driver.getCurrentUrl());
	}
	
	@Then("^I should see \"([^\"]*)\"$")
	public void i_should_see(String message) {
	    taskMethods.checkLoggedUserMessage(message);
	}
	
	@Given("^I add the task \"([^\"]*)\" and hit enter$")
	public void i_add_the_task_and_hit_enter(String description) {
		taskMethods.addTaskDescription(description);
		taskMethods.hitEnter();
	}
	
	@Then("^The task \"([^\"]*)\" should be appended$")
	public void the_task_should_be_appended_if_it_has_more_than_three_and_less_than_characters(String description) throws Throwable {
	    taskMethods.checkIfTaskIsAppended(description);
	}

	@Given("^I add the task \"([^\"]*)\" and click on the add task button$")
	public void i_add_the_task_and_click_on_the_add_task_button(String description) throws Throwable {
	    taskMethods.addTaskDescription(description);
	    taskMethods.clickAddTaskButton();
	}
	
	@Then("^The task \"([^\"]*)\" should NOT be appended$")
	public void the_task_should_NOT_be_appended(String description) {
		if(!BasePage.CreateTaskElements.appendedTask(driver, description).isDisplayed()){
			System.out.println("Task " + description + " was not appended. Test PASS.");
		} else {
			System.out.println("Task " + description + " was appended. Test FAILED.");
		}
	}
	
	@Then("^I should see the Manage Subtasks button$")
	public void i_should_see_the_manage_subtasks_button() {
	    taskMethods.checkManageTasksButtonIsDisplayed();
	}
	
	@Then("^I should see the number (\\d+) in the Manage Subtasks button of the 'Done' task$")
	public void i_should_see_the_number_in_the_Manage_Subtasks_button_of_the_Done_task(int number) throws Throwable {
	    taskMethods.checkNumberOfSubTasks(number);
	}
}
