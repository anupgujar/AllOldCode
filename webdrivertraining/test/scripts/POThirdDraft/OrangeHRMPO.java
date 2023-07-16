package scripts.POThirdDraft;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangeHRMPO {
	@FindBy (name = "username")
	WebElement username;
	@FindBy (name = "password")
	WebElement password;
	@FindBy (xpath = "//div[@class = 'oxd-form-actions orangehrm-login-action']/button")
	WebElement submit;
	String url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	WebDriver driver;
	
	public OrangeHRMPO() {
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
		driver.get(url);
		PageFactory.initElements(driver, this);
	}
	
	public void login(String user, String pass) {
		username.sendKeys(user);
		password.sendKeys(pass);
		submit.click();
	}
	
	public void quitBrowser() {
		driver.quit();
	}

}
