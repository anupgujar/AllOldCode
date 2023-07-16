package scripts;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;

public class FlipkartLinkElement {
	WebDriver driver;
	WebDriverWait wait;
	@Test
  public void allLinkElements() throws InterruptedException {
	
		Thread.sleep(5000);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//button[@class='_2KpZ6l _2doB4z']")));
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		List<WebElement> allLink = driver.findElements(By.tagName("a"));
		for(WebElement getLink : allLink) {
			System.out.println(getLink.getText() +"-"+ getLink.getAttribute("href"));
		}System.out.println(allLink.size());
		
		
		
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webDriver,firefox,driver", "/webdrivertraining/test/resources/geckodriver.exe");
	  driver = new FirefoxDriver();
	  driver.get("https:\\www.flipkart.com");
	  wait = new WebDriverWait(driver, Duration.ofSeconds(7));
	  
  }

  @AfterMethod
  public void afterMethod() {
	  driver.quit();
  }

}
