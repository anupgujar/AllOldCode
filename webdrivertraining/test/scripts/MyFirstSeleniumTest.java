package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class MyFirstSeleniumTest {

	public static void main(String[] args) throws InterruptedException {
		//WebDriverManager.chromedriver().setup();
//Steps //1.Open browser
		System.setProperty("webdriver.chrome.driver", "test//resources//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//2.Go to URL
		driver.get("https://nichethyself.com/tourism/home.html");
		WebElement username = driver.findElement(By.name("username"));
		username.sendKeys("stc123");
		driver.findElement(By.name("password")).sendKeys("12345");
		username.submit();
		Thread.sleep(5000);
		String expectedResult = "My account";
		String actualResult = driver.getTitle();
		if(expectedResult.equals(actualResult)) {
			System.out.println("Test Case passed");
		}else {
			System.out.println("Test case Failled");
		}
	}

}
