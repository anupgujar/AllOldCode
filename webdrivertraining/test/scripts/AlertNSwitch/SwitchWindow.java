package scripts.AlertNSwitch;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;

public class SwitchWindow {
	WebDriver driver;

	@Test
	public void switching() throws InterruptedException {
		driver.get("https://nichethyself.com/tourism/home.html");
		String parentWindow = driver.getWindowHandle();
		System.out.println(parentWindow);
		driver.findElement(By.xpath("//a[@href='customised.html']")).click();
		Set<String> handle = driver.getWindowHandles();
		for (String oneHandle : handle) {
			if (!oneHandle.equals(parentWindow)) {
				driver.switchTo().window(oneHandle);
				System.out.println(oneHandle);
			}
		}
		String customisedTour = driver.getWindowHandle();
		WebElement dropDown = driver.findElement(By.id("days"));
		Select stay = new Select(dropDown);
		stay.selectByIndex(2);
		driver.findElement(By.xpath("//label[contains(text(),'England')]")).click();
		driver.findElement(By.xpath("//button[contains(text(),'Contact us!')]")).click();
		Set<String> handle1 = driver.getWindowHandles();
		for (String oneHandle : handle1) {
			if (!oneHandle.equals(customisedTour) && !oneHandle.equals(parentWindow)) {
				driver.switchTo().window(oneHandle);
				System.out.println(oneHandle);
			}
		}
		//driver.switchTo().window("Contact");
		driver.findElement(By.className("glyphicon-search")).click();
		Alert myAlert;
		myAlert = driver.switchTo().alert();
		myAlert.sendKeys("London");
		myAlert.accept();
		driver.close();
		driver.switchTo().window(parentWindow);
		driver.findElement(By.className("btn")).click();
	}

	@BeforeMethod
	public void beforeMethod() {
		System.setProperty("webdriver,driver,firefox", "/webdrivertraining/test/resources/geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
	}

	@AfterMethod
	public void afterMethod() {
		//driver.quit();
	}
}
