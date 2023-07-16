package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyFirstSelenium {
	public void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "test//resources//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
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
		
//		assertEquals(expectedTitle, actualTitale);
		
		  if(expectedTitle.equals(actualTitale)) {
		  System.out.println("Test Case passed"); }else {
		  System.out.println("Test case Failled"); }
		 
	}
}
