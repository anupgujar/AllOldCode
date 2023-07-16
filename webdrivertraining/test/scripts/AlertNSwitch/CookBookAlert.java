package scripts.AlertNSwitch;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;

public class CookBookAlert {
	WebDriver driver;

	@Test
	public void alerts() throws InterruptedException {
		Thread.sleep(7000);
		driver.findElement(By.cssSelector("input[onclick='showAlert()']")).click();
		Thread.sleep(4000);
		Alert myAlert;
		myAlert = driver.switchTo().alert();
		String expected1stAlert = "Hello! I am an alert box!";
		String actual1stAlert = myAlert.getText();
		assertEquals(actual1stAlert,expected1stAlert);
		myAlert.accept();
		
		driver.findElement(By.id("confirm")).click();
		myAlert = driver.switchTo().alert();
		myAlert.accept();
		String expected2ndAlertText = "You Accepted Alert!";
		String actual2ndAlertText = driver.findElement(By.id("demo")).getText();
		assertEquals(actual2ndAlertText,expected2ndAlertText);
		 
		driver.findElement(By.id("confirm")).click();
		myAlert.dismiss();
		String expected3rdAlertText = "You Dismissed Alert!";
		String actual3rdAlertText = driver.findElement(By.id("demo")).getText();
		assertEquals(actual3rdAlertText,expected3rdAlertText);
		
		driver.findElement(By.id("prompt")).click();
		myAlert.sendKeys("Harry Potter");
		myAlert.accept();
		String expected4thAlertText = "Hello Harry Potter! How are you today?";
		String actual4thAlertText = driver.findElement(By.id("prompt_demo")).getText();
		assertEquals(actual4thAlertText,expected4thAlertText);
		
	}

	@BeforeMethod
	public void beforeMethod() {
		System.setProperty("webdriver,driver,firefox", "/webdrivertraining/test/resources/geckodriver.exe");
		driver = new FirefoxDriver();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(9));
		driver.get("http://www.cookbook.seleniumacademy.com/Alerts.html");
	}

	@AfterMethod
	public void afterMethod() {
		driver.quit();
	}

}
