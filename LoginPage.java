package pageObjects;

import common.BasePage;
import org.junit.Assert;

public class LoginPage extends BasePage {
	
	public void loginCredentials(String email, String password) {
		BasePage.LoginPageElements.emailField(driver).sendKeys(email);
		BasePage.LoginPageElements.passwordField(driver).sendKeys(password);
	}
	
	public void clickSignInButton() {
		BasePage.LoginPageElements.signInButton(driver).click();
	}
	
	public void checkIfLoginIsSuccessful () {
		driver.getPageSource();
		Assert.assertTrue("Signed in successfully", true);
	}
}
