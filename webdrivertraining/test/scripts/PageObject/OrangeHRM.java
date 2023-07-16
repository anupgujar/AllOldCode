package scripts.PageObject;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class OrangeHRM {
	OrangeHRMPO homeLogin;

	@Test
	public void OrangeHRM() {
		homeLogin.login("Admin", "admin123");

	}

	@BeforeMethod
	public void beforeMethod() {
		
		homeLogin = new OrangeHRMPO();
	}

	@AfterMethod
	public void afterMethod() {
	homeLogin.quitBrowser();
	}

}
