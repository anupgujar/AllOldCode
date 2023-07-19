package scripts.ActionClass;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import static org.testng.Assert.assertEquals;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActionClassAnnaAssignment {
	WebDriver driver;
	WebDriverWait wait;

	@Test
	public void actionClassAnnaAssignment() throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//ul[@class='nav navbar-nav']/li[4]/a")));
		WebElement source = driver.findElement(By.xpath("//ul[@class='nav navbar-nav']/li[4]/a"));
		Actions builder = new Actions(driver);
		builder.moveToElement(source).perform();
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//li/a[contains(text(),'Mechanical')]")));
		WebElement mechEngg = driver.findElement(By.xpath("//li/a[contains(text(),'Mechanical')]"));
	
		mechEngg.click();
		
		String parentWindow = driver.getWindowHandle();
		Set<String> allWindow = driver.getWindowHandles();
		
		for(String oneWindow:allWindow) {
			if(!oneWindow.equals(parentWindow)) {
				driver.switchTo().window(oneWindow);
			}
		}
		
		wait.until(ExpectedConditions.urlToBe("https://www.annauniv.edu/dme/"));
		String expectedPageTitle = "Department of Mechanical Engineering | Anna University Chennai";
		String actualPageTitle = driver.getTitle();
		assertEquals(actualPageTitle,expectedPageTitle);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//a[contains(text(),'Facilities')]")));
		WebElement facilities = driver.findElement(By.xpath("//a[contains(text(),'Facilities')]"));
		builder.moveToElement(facilities).perform();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@href='https://annauniv.edu/aufrgicc']")));
		WebElement aUFRG = driver.findElement(By.xpath("//a[@href='https://annauniv.edu/aufrgicc']"));
		builder.moveToElement(aUFRG).perform();
		aUFRG.click();
		
		String mechPageHandle = driver.getWindowHandle();
		Set<String> handles = driver.getWindowHandles();
		
		for(String onehandle:handles) {
			if(!onehandle.equals(mechPageHandle)) {
				driver.switchTo().window(onehandle);
			}
		}
		wait.until(ExpectedConditions.urlToBe("https://annauniv.edu/aufrgicc/"));
		String expectedPageTitle1 = "AU-FRG Institute for CAD/CAM - Anna University Chennai";
		String crntActualPageTitle = driver.getTitle();
		System.out.println(crntActualPageTitle);
		assertEquals(crntActualPageTitle,expectedPageTitle1);
		String aUFRGPageHandle = driver.getWindowHandle();
		Set<String> aUFRGHandles = driver.getWindowHandles();
		for(String singleHandle:aUFRGHandles) {
			if(!singleHandle.equals(aUFRGHandles) && !singleHandle.equals(mechPageHandle)){
				driver.switchTo().window(mechPageHandle);
			}
		}
		driver.close();
		driver.switchTo().window(parentWindow);
		
		
	}

	@BeforeMethod
	public void beforeMethod() {
		driver = new FirefoxDriver();
		driver.get("https://www.annauniv.edu");
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	}

	@AfterMethod
	public void afterMethod() {

	}

}
