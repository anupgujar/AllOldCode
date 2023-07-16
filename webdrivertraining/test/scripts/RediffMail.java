package scripts;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;

public class RediffMail {
	WebDriver driver;
  @Test
  public void rediffMail() throws InterruptedException {
	  driver.findElement(By.xpath("//a[@class='mailicon']")).click();
	  driver.findElement(By.cssSelector("input[id='login1']")).sendKeys("anup.gujar");
	  WebElement password = driver.findElement(By.id("password"));
	  password.sendKeys("Vaishnavi@123");
	  password.submit();
	  Thread.sleep(5000);
	  driver.findElement(By.xpath("//ul[@id='boxscroll']/li[1]/a/b")).click();
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver,firefox,driver", "/test/resources/geckodriver.exe");
	  driver = new FirefoxDriver();
	  driver.get("http://rediffmail.com");
  }

  @AfterMethod
  public void afterMethod() {
  }

}
