package pageObjects;

import common.BasePage;

public class CreateSubTaskPage extends BasePage {

	public void clickManageSubTasksButton() {
		BasePage.CreateSubTaskElements.manageTasksButton(driver).click();
	}
	
	public void checkModalDialogIsDisplayed() {
		BasePage.CreateSubTaskElements.dialogModal(driver).isDisplayed();
	}
	
	public void checkTaskIdIsDisplayed() {
		BasePage.CreateSubTaskElements.taskId(driver).isDisplayed();
	}
	
	public void checkTaskDescriptionIsDisplayed() {
		BasePage.CreateSubTaskElements.editTaskField(driver);
	}
	
	public void enterSubTaskDescription(String description) {
		BasePage.CreateSubTaskElements.newSubTaskField(driver).sendKeys(description);
	}
	
	public void enterSubTaskDueDate(String date) {
		BasePage.CreateSubTaskElements.dueDateField(driver).sendKeys(date);
	}
	
	public void clickAddSubTaskButton() {
		BasePage.CreateSubTaskElements.addSubTaskButton(driver).click();
	}
	
	public void checkIfSubTaskIsAppended(String description) {
		BasePage.CreateTaskElements.appendedTask(driver, description).isDisplayed();
	}
}
