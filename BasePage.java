package common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
	
	public static WebDriver driver;
		
	public static void launchBrowser() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();		
	}
		
	public static void navigateToLoginPage() {
		driver.get("https://qa-test.avenuecode.com/users/sign_in");
	}
	
	private static WebElement element = null;
	
	public static class LoginPageElements {
		
		public static WebElement emailField(WebDriver driver) {
			element = driver.findElement(By.id("user_email"));
			return element;
		}
		
		public static WebElement passwordField(WebDriver driver) {
			element = driver.findElement(By.id("user_password"));
			return element;
		}
		
		public static WebElement signInButton(WebDriver driver) {
			element = driver.findElement(By.xpath("//*[@id=\"new_user\"]/input"));
			return element;
		}
	}
	
	public static class HomePageElements {
		
		public static WebElement myTasksLink(WebDriver driver) {
			element = driver.findElement(By.linkText("My Tasks"));
			return element;
		}
		
		public static WebElement welcomeLink(WebDriver driver) {
			element = driver.findElement(By.linkText("Welcome, VitorForte!"));
			return element;
		}
	}
	
	public static class CreateTaskElements {
		
		public static WebElement newTaskField(WebDriver driver) {
			element = driver.findElement(By.id("new_task"));
			return element;
		}
		
		public static WebElement addTaskButton(WebDriver driver) {
			element = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/form/div[2]/span"));
			return element;
		}
		
		public static WebElement appendedTask(WebDriver driver, String description) {
			element = driver.findElement(By.linkText(description));
			return element;
		}
	}
	
	public static class CreateSubTaskElements {
		
		public static WebElement manageTasksButton(WebDriver driver) { 
			WebElement manageTasksButton = (WebElement) (new WebDriverWait(driver,5))
					.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("body > div.container > div.task_container.ng-scope > div.bs-example > div > table > tbody > tr:nth-child(3) > td:nth-child(4) > button")));
			return manageTasksButton;
		}
		
		public static WebElement dialogModal(WebDriver driver) {
			element = driver.findElement(By.xpath("/html/body/div[4]/div/div"));
			return element;
		}
		
		public static WebElement taskId(WebDriver driver) {
			element = driver.findElement(By.xpath("/html/body/div[4]/div/div/div[1]/h3"));
			return element;
		}
		
		public static WebElement editTaskField(WebDriver driver) {
			element = driver.findElement(By.id("edit_task"));
			return element;
		}
		
		public static WebElement newSubTaskField(WebDriver driver) {
			element = driver.findElement(By.id("new_sub_task"));
			return element;
		}
		
		public static WebElement dueDateField(WebDriver driver) {
			element = driver.findElement(By.id("dueDate"));
			return element;
		}
		
		public static WebElement addSubTaskButton(WebDriver driver) {
			element = driver.findElement(By.id("add-subtask"));
			return element;
		}
		
		public static WebElement closeButton(WebDriver driver) {
			element = driver.findElement(By.xpath("/html/body/div[4]/div/div/div[3]/button"));
			return element;
		}
	}
}
