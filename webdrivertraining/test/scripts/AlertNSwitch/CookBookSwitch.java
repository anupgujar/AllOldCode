package scripts.AlertNSwitch;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import static org.testng.Assert.assertEquals;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;

public class CookBookSwitch{
	WebDriver driver;

	@Test
  public void cookBook() {
		String parentWindow = driver.getWindowHandle();
	  driver.findElement(By.id("helpbutton")).click();
	  driver.switchTo().window("HelpWindow");
	  WebElement visibleText = driver.findElement(By.xpath("//h3[contains(text(),'Build')]"));
	  String expectedText = "Build my Car - Configuration Help";
	  String actualText = visibleText.getText();
	  assertEquals(actualText,expectedText);
	  driver.close();
	  driver.switchTo().window(parentWindow);
	  driver.findElement(By.xpath("//button[contains(text(),\"Online\")]")).click();
	  driver.findElement(By.cssSelector("button[id*='visit']")).click();
	  
	  driver.switchTo().window("VisitUsWindow");
	  String visitUsExpectedText = "Having trouble with Online Configuration, visit one of our stores and configure your car with the help of our Service Agents";
	  String visitUsActualText = driver.findElement(By.cssSelector("div p")).getText();
	  assertEquals(visitUsActualText,visitUsExpectedText);
	  driver.close();
	  Set<String> handles = driver.getWindowHandles();
	  for(String oneHandle:handles) {
		  if(!oneHandle.equals(parentWindow)) {
			  driver.switchTo().window(oneHandle);
		  }
	  }
      String actual = driver.findElement(By.cssSelector("div p")).getText();
      String expected ="Wait while we connect you to Chat...";
      assertEquals(actual,expected);
      driver.close();


	 
  }

	@BeforeMethod
	public void beforeMethod() {
		System.setProperty("webdriver,driver,firefox", "/webdrivertraining/test/resources/geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("http://www.cookbook.seleniumacademy.com/Config.html");
	}

	@AfterMethod
  public void afterMethod() {
	  driver.quit();
  }

}
