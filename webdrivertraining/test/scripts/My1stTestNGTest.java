package scripts;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;

public class My1stTestNGTest {
	WebDriver driver;
	WebDriverWait wait;
  @Test (groups = "regression")
  public void testTourismLogin() throws InterruptedException {
		
		WebElement username = driver.findElement(By.name("username"));
		username.sendKeys("stc123");
		driver.findElement(By.name("password")).sendKeys("12345");
		username.submit();
		//wait.until(ExpectedConditions.visibilityOfElementLocated(null));
		//Thread.sleep(5000);
		String expectedResult = "My account";
		String actualResult = driver.getTitle();
		if(expectedResult.equals(actualResult)) {
			System.out.println("Test Case passed");
		}else {
			System.out.println("Test case Failled");
		}
	
  }
  @BeforeMethod
  public void beforeMethod() {
	  driver = new FirefoxDriver();
	  driver.get("https://nichethyself.com/tourism/home.html");
	  wait = new WebDriverWait(driver, Duration.ofSeconds(7));
  }
  @Test
  public void googleTest() 
  {
	driver.get("http://google.com");
	driver.findElement(By.name("q")).sendKeys("Selenium");
  }

  @AfterMethod
  public void afterMethod() {
	 driver.quit();
  }
}
