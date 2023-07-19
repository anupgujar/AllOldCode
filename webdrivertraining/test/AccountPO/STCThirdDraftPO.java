package AccountPO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class STCThirdDraftPO {
	@FindBy(name = "username")
	WebElement username;
	@FindBy(name = "password")
	WebElement password;
	@FindBy(xpath = "//form[@name ='loginform']/button")
	WebElement submit;
	String uRL = "https://nichethyself.com/tourism/home.html";
	WebDriver driver;
	
	public STCThirdDraftPO() {
		driver = new FirefoxDriver();
		driver.get(uRL);
		PageFactory.initElements(driver, this);
	}
	public AccountPO login(String user, String pass) {
		username.sendKeys(user);
		password.sendKeys(pass);
		submit.click(); //after this action , My account page is launched.
		AccountPO myAcc = new AccountPO(driver);
		return myAcc;
	}
	public void quitBriwser() {
		driver.quit();
		
	}
	public String getPageTitleAfterLogin() {
		return driver.getTitle();
	}
	
	
	
	

}
