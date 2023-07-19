package AccountPO;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class STCThirdTest {
	STCThirdDraftPO login;
	AccountPO myAcc1;

	@Test
	public void Login() throws InterruptedException {
		myAcc1 = login.login("stc123", "12345");
		
		String expectedPageTitle = "My account";
		String actualPageTitle = login.getPageTitleAfterLogin();
		assertEquals(actualPageTitle, expectedPageTitle);
		myAcc1.goToConatactUs();
		Thread.sleep(5000);
		myAcc1.signOut();
		Thread.sleep(5000);
	}

	@BeforeMethod
	public void beforeMethod() {
		login = new STCThirdDraftPO();
		
	}

	@AfterMethod
	public void afterMethod() {
		login.quitBriwser();
	}
	
	


}
