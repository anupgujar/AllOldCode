package scripts.AlertNSwitch;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;

public class Goibibo {
	WebDriver driver;
  @Test
  public void goibibo() throws InterruptedException {
	  driver.findElement(By.className("logSprite")).click();
	  Thread.sleep(3000);
	  WebElement from = driver.findElement(By.className("sc-12foipm-36"));
	  from.click();
	  Thread.sleep(3000);
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver,driver,firefox", "/webdrivertraining/test/resources/geckodriver.exe");
	  driver = new FirefoxDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	  driver.get("https://www.goibibo.com/");
	  
  }

  @AfterMethod
  public void afterMethod() {
  }

}
