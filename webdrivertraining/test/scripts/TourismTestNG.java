package scripts;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;

public class TourismTestNG {
	WebDriver driver;
  @Test
  public void tourismTestNG() throws InterruptedException {
	  driver.get("https://nichethyself.com/tourism/customised.html");
	  driver.findElement(By.xpath("//input[@id='fullname']")).sendKeys("Anup Gujar");
	  driver.findElement(By.name("email")).sendKeys("anup.gf@gmail.com");
	  driver.findElement(By.name("optradio")).click();
	  Thread.sleep(3000);
	  
	  WebElement dropDrown = driver.findElement(By.id("days"));
	
	  Select forms = new Select(dropDrown); 
	  Thread.sleep(3000);
	  forms.selectByVisibleText("Home Stay");
	  Thread.sleep(3000);
	  forms.selectByVisibleText("3-star Hotel");
	  Thread.sleep(3000);
	  forms.selectByVisibleText("5-star Hotel");
	  Thread.sleep(3000);
		  List<String> expectedOptions = new ArrayList<String>();
		  expectedOptions.add("5-star Hotel");
		  expectedOptions.add("3-star Hotel");
		  expectedOptions.add("Home Stay");
		  List<String> actualOptions = new ArrayList<String>(); 
		  List<WebElement> allOptions = forms.getOptions();
		  for(WebElement oneOptions:allOptions) 
		  {
		  actualOptions.add(oneOptions.getText()); 
		  }
		  assertEquals(actualOptions,expectedOptions);
		 
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver,firefox,driver", "test/resources/geckodriver.exe");
	  driver = new FirefoxDriver();
  }

  @AfterMethod
  public void afterMethod() {
	  driver.quit();
  }

}
