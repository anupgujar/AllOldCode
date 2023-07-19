package AccountPO;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.LoadableComponent;

public class AccountPO extends LoadableComponent<AccountPO>{
	@FindBy(xpath = "//a[@href='home.html']")
	WebElement signOut;

	@FindBy(xpath = "//button[text() = 'Contact us!']")
	WebElement contactUS;
	WebDriver driver;
	String pageTitle = "My Account";

	public AccountPO(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(this.driver, this);

	}

	public void signOut() {
		signOut.click();
	}

	public void goToConatactUs() {
		contactUS.click();
		//return this;
	}

	@Override
	protected void isLoaded() throws Error {
		assertEquals(driver.getTitle(),pageTitle);
		
	}

	@Override
	protected void load() {
		// TODO Auto-generated method stub
		
	}

}
