package scripts;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

public class MyFirstTestNGTest {
	WebDriver driver;
  @Test
  public void login() throws InterruptedException {
	  WebElement username = driver.findElement(By.name("username"));
		username.sendKeys("stc123");
		driver.findElement(By.name("password")).sendKeys("12345");
		username.submit();
		Thread.sleep(5000);
		String expectedResult = "My account";
		String actualResult = driver.getTitle();
		
		assertEquals(expectedResult, actualResult);
		/*
		 * if(expectedResult.equals(actualResult)) {
		 * System.out.println("Test Case passed"); }else {
		 * System.out.println("Test case Failled"); }
		 */
	}
  
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.firefox.driver", "test/resources/geckodriver.exe");
		driver = new FirefoxDriver();
		
		driver.get("https://nichethyself.com/tourism/home.html");
  }

  @AfterMethod
  public void afterMethod() {
	  driver.quit();
  }

  @BeforeClass
  public void beforeClass() {
  }

  @AfterClass
  public void afterClass() {
  }

}
