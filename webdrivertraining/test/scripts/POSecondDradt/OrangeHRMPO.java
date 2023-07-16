package scripts.POSecondDradt;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

public class OrangeHRMPO {
	By userby = By.name("username");
	By passwordby = By.name("password");
	By submitby = By.xpath("//div[@class = 'oxd-form-actions orangehrm-login-action']/button");
	String url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	WebDriver driver;
	
	public OrangeHRMPO() {
	driver = new FirefoxDriver();
	driver.get(url);
	}
	
	public void login(String user, String pass) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
		driver.findElement(userby).sendKeys(user);
		driver.findElement(passwordby).sendKeys(pass);
		driver.findElement(submitby).click();
	}
	
	public void quitBrowser() {
		driver.quit();
	}
}