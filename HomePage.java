package pageObjects;

import org.junit.Assert;
import common.BasePage;

public class HomePage extends BasePage {
	
	public void checkIfMyTasksLinkIsDisplayed() {
		BasePage.HomePageElements.myTasksLink(driver).isDisplayed();
	}
	
	public void clickMyTasksLink() {
		BasePage.HomePageElements.myTasksLink(driver).click();
	}
		
	public void checkIfUserIsInTasksList() {
		String url = driver.getCurrentUrl();
		Assert.assertEquals("https://qa-test.avenuecode.com/tasks", url);
	}
	
	public void checkIfLogged() {
		BasePage.HomePageElements.welcomeLink(driver).isDisplayed();
	}
}
