package scripts.PageObject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OrangeHRMPO {
	WebElement username;
	WebElement password;
	WebElement submit;
	WebDriver driver;
	String url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	
	public OrangeHRMPO() {    //Constructor
		driver = new FirefoxDriver();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
		username = driver.findElement(By.name("username"));
		password = driver.findElement(By.name("password"));
		submit = driver.findElement(By.xpath("//div[@class = 'oxd-form-actions orangehrm-login-action']/button"));
		
	}
	public void login(String user, String pass){
		username.sendKeys(user);
		password.sendKeys(pass);
		submit.click();
			
	}
	public void quitBrowser() {
		driver.quit();
		
	}

}
