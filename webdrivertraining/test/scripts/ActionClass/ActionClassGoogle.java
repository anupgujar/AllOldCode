package scripts.ActionClass;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;

public class ActionClassGoogle {
	WebDriver driver;
	WebDriverWait wait;

	@Test
	public void actionClassGoogle() throws InterruptedException {
		Thread.sleep(7000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='QlyBfb']/button[1]")));
		driver.findElement(By.xpath("//div[@class='QlyBfb']/button[1]")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Gmail')]")));
		WebElement gmail = driver.findElement(By.xpath("//a[contains(text(),'Gmail')]"));
		Actions builder = new Actions(driver);
		builder.keyDown(Keys.CONTROL).click(gmail).keyUp(Keys.CONTROL);

		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[@class='header__aside__buttons']/a[2]")));
		driver.findElement(By.xpath("//div[@class='header__aside__buttons']/a[2]")).click();

	}

	@BeforeMethod
	public void beforeMethod() {
		driver = new FirefoxDriver();
		driver.get("https://www.google.com");
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}

	@AfterMethod
	public void afterMethod() {
	}

}
