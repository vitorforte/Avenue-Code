package stepDefinitions;

import common.BasePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.CreateSubTaskPage;

public class StepDefs_CreateSubTask extends BasePage {
	
	CreateSubTaskPage subTaskMethods = new CreateSubTaskPage();
	
	@Then("^I click the Manage Tasks button of the 'Done' task$")
	public void i_click_the_Manage_Subtasks_button() {
	    subTaskMethods.clickManageSubTasksButton();
	}

	@Given("^A modal dialog should open up$")
	public void a_modal_diagol_should_open_up() {
	    subTaskMethods.checkModalDialogIsDisplayed();
	}

	@Then("^I should see the task id$")
	public void i_should_see_the_task_id() {
	    subTaskMethods.checkTaskIdIsDisplayed();
	}

	@And("^I should see the task description$")
	public void i_should_see_the_task_description() {
	    subTaskMethods.checkTaskDescriptionIsDisplayed();
	}
	
	@Given("^I enter the SubTask description \"([^\"]*)\"$")
	public void i_enter_the_SubTask_description(String description) {
	   subTaskMethods.enterSubTaskDescription(description);
	}

	@When("^I enter the SubTask due date \"([^\"]*)\"$")
	public void i_enter_the_SubTask_due_date(String date) {
	    subTaskMethods.enterSubTaskDueDate(date);
	}

	@And("^I click the add button$")
	public void i_click_the_add_button() {
	   subTaskMethods.clickAddSubTaskButton();
	}
	
	@Then("^The SubTask \"([^\"]*)\" should be appended on the bottom part of the modal dialog$")
	public void the_SubTask_should_be_appended_on_the_bottom_part_of_the_modal_dialog(String description) {
		subTaskMethods.checkIfSubTaskIsAppended(description);
	}
	
	@Then("^The subtask \"([^\"]*)\" should NOT be appended$")
	public void the_subtask_should_NOT_be_appended(String description) {
		if(!BasePage.CreateTaskElements.appendedTask(driver, description).isDisplayed()){
			System.out.println("Task " + description + " was not appended. Test PASS.");
		} else {
			System.out.println("Task " + description + " was appended. Test FAILED.");
		}
	}
}
