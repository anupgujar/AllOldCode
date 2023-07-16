package scripts;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;

public class wikipediaTestNG {
	WebDriver driver;
  @Test
  public void wikipedia() throws InterruptedException {
	  driver.get("https://www.wikipedia.org/");
	  WebElement search = driver.findElement(By.id("searchInput"));
	  search.sendKeys("Selenium");
	  search.submit();
	  Thread.sleep(4000);
	  String actualpageTitle = driver.getTitle();
	  System.out.println(actualpageTitle);
	  String expectedPageTitle = "Selenium - Wikipedia";
	  assertEquals(actualpageTitle,expectedPageTitle);
	  WebElement heading = driver.findElement(By.className("mw-page-title-main"));
	  String header = heading.getText();
	  System.out.println("Page Header is - "+header);
	  
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver,firefox,driver", "test/resources/geckodriver.exe");
	  driver = new FirefoxDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
  }

  @AfterMethod
  public void afterMethod() {
	  driver.quit();
  }

}
