package scripts.ActionClass;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.chrome.ChromeOptions;
 
public class ActionClassIcefaces {
	WebDriver driver;
	WebDriverWait wait;
  @Test
  public void actionClassIcefaces() {
	 driver.navigate().refresh();
	 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='form:selectionTable_body']/tr")));
	 List<WebElement> getRows = driver.findElements(By.xpath("//*[@id='form:selectionTable_body']/tr"));
//	 List<WebElement> getRows = driver.findElement(By.id("form:selectionTable_body")).findElements(By.tagName("tr"));
	 Actions builder = new Actions(driver);
	 builder.click(getRows.get(1))
	 		.click(getRows.get(4))
	 		.click(getRows.get(6)).perform(); 
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  
	  ChromeOptions options = new ChromeOptions();
      options.addArguments("--remote-allow-origins=*"); 
      driver = new ChromeDriver(options);
      
      driver = new ChromeDriver();
	  wait = new WebDriverWait(driver,Duration.ofSeconds(17));
	  driver.get("http://icefaces-showcase.icesoft.org/showcase.jsf");
	  driver.findElement(By.xpath("//a[contains(text(),'Datatable')]")).click();
	  
	  wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//a[contains(text(),'ace:dataTable')]")));
	  driver.findElement(By.xpath("//a[contains(text(),'ace:dataTable')]")).click();
	  
	  wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//li/a[contains(text(),'Selection')]")));	  
	  driver.findElement(By.xpath("//li/a[contains(text(),'Selection')]")).click();

	  wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//label[@id='label_form:modeIn:1']")));	  
	  driver.findElement(By.xpath("//label[@id='label_form:modeIn:1']")).click();
  }
  
  @AfterMethod
  public void afterMethod() {
	  
  }
}