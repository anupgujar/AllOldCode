package scripts;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class MyFirstHRTestNGTest {
		WebDriver driver;
		
  @Test
  public void login() throws InterruptedException {
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement username = driver.findElement(By.name("username"));
		username.sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		
		username.submit();
		Thread.sleep(2000);
		String expectedTitle = "OrangeHRM";
		String actualTitale = driver.getTitle();
		
		  if(expectedTitle.equals(actualTitale)) {
		  System.out.println("Test Case passed"); }else {
		  System.out.println("Test case Failled"); }
  }
  @BeforeMethod
  public void beforeMethod() {
		System.setProperty("webdriver.chrome.driver", "test//resources//chromedriver.exe");
		driver = new ChromeDriver();
  }

  @AfterMethod
  public void afterMethod() {
  }

  @AfterClass
  public void afterClass() {
  }

}
