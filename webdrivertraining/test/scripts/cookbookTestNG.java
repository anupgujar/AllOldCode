package scripts;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;

public class cookbookTestNG {
	WebDriver driver;
	//WebDriverWait wait;
  @Test (groups = "Regression")
  public void cookbook() throws InterruptedException {
	  driver.findElement(By.name("fuel_type")).click();
	  //wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("abs")));
	  WebElement ABS = driver.findElement(By.name("abs"));
	  //Thread.sleep(3000);
	  if(!ABS.isSelected()) {
		  ABS.click();
	  }
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver,driver,firefox", "test/resources/geckodriver.exe");
	  driver = new FirefoxDriver();
	  driver.get("http://www.cookbook.seleniumacademy.com/Config.html");
	  //wait = new WebDriverWait(driver, Duration.ofSeconds(7));
	  
  }

  @AfterMethod
  public void afterMethod() {
	  driver.quit();
  }

}
