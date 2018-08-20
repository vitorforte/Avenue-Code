package pageObjects;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import common.BasePage;

public class CreateTaskPage extends BasePage {
	
	public void checkLoggedUserMessage (String message) {
		driver.getPageSource().contains(message);
	}
	
	public void addTaskDescription (String description) {
		BasePage.CreateTaskElements.newTaskField(driver).sendKeys(description);
	}
	
	public void hitEnter() {
		BasePage.CreateTaskElements.newTaskField(driver).sendKeys(Keys.ENTER);
	}
	
	public void clickAddTaskButton() {
		BasePage.CreateTaskElements.addTaskButton(driver).click();
	}
	
	public void checkIfTaskIsAppended (String description) {
		BasePage.CreateTaskElements.appendedTask(driver, description).isDisplayed();
	}
	
	public void checkCharacterLimit (String description) {
			int characters = description.length();
			Assert.assertTrue(characters >= 3 && characters <= 250);
			System.out.println("The task " + description + " has " + characters + " characters.");
	}
	
	public void checkManageTasksButtonIsDisplayed() {
		BasePage.CreateSubTaskElements.manageTasksButton(driver).isDisplayed();
	}
	
	public void checkNumberOfSubTasks(int number) {
		BasePage.CreateSubTaskElements.manageTasksButton(driver).getText().contains("("+number+")");
	}
}
