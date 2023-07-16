package scripts.ActionClass;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.openqa.selenium.interactions.Actions;

public class ActionClassTriphoboAssignment {
	WebDriver driver;
	WebDriverWait wait;

	@Test
	public void actionClassTriphoboAssignment() throws InterruptedException {
		driver.findElement(By.id("plan-my-trip")).click();
		WebElement city = driver.findElement(By.className("js_city_search"));
		city.sendKeys("Houston");
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//ul[@class='city-list-collection']/li[1]/span")));
		driver.findElement(By.xpath("//ul[@class='city-list-collection']/li[1]/span")).click();
		
		//Start Date
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='start-date-control']/input")));
		driver.findElement(By.xpath("//span[@class='start-date-control']/input")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr[4]/td[7]/a[text()='24']")));
		driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr[4]/td[7]/a[text()='24']")).click();
		//End Date
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='end-date-control']/input")));
		driver.findElement(By.xpath("//span[@class='end-date-control']/input")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr[5]/td[6]/a[text()='30']")));
		driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr[5]/td[6]/a[text()='30']")).click();
		//Planning
		driver.findElement(By.xpath("//div[@class ='input-container row']/span")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("js_city_next_step_title")));
		driver.findElement(By.id("js_city_next_step_title")).click();
		//Skip to about us
		
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("js_city_next_step_name")));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("js_city_next_step_name")));
		//Thread.sleep(7000);
		driver.findElement(By.id("js_city_next_step_name")).click();
		
		//skip to trip Overview
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//span[@class = 'next-button js_city_step_move next-btn-dsk']/span")));
		//Thread.sleep(7000);
		driver.findElement(By.xpath("//span[@class = 'next-button js_city_step_move next-btn-dsk']/span")).click();
		
		//edit this plan
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Edit This Plan')]")));
		//Thread.sleep(7000);
		driver.findElement(By.xpath("//span[contains(text(),'Edit This Plan')]")).click();
		//feedback window
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("icon-close-modal")));
		//driver.findElement(By.className("icon-close-modal")).click();
		
		//source1
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[@class='fc-content-skeleton']/table/tbody/tr/td[2]//div[2]/a[4]/div[1]/following-sibling::div[1]")));
		WebElement source = driver.findElement(By.xpath("//div[@class='fc-content-skeleton']/table/tbody/tr/td[2]//div[2]/a[4]/div[1]/following-sibling::div[1]"));
		
		// source2
		WebElement source2 = driver.findElement(By.xpath("//*[@id=\"calendar\"]/div[2]/div/table/tbody/tr/td/div/div/div[3]/table/tbody/tr/td[2]/div/div[2]/a[4]/div[1]/div[2]"));
		//Target
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"calendar\"]/div[2]/div/table/tbody/tr/td/div/div/div[3]/table/tbody/tr/td[4]/div/div[2]/a[7]/div[2]")));
		WebElement target = driver.findElement(By.xpath("//*[@id=\"calendar\"]/div[2]/div/table/tbody/tr/td/div/div/div[3]/table/tbody/tr/td[4]/div/div[2]/a[7]/div[2]"));
		
		
		//Thread.sleep(7000);
		Actions builder = new Actions(driver);
		builder.dragAndDrop(source, target).perform();
		Thread.sleep(6000);	
		builder.dragAndDrop(source2, target).perform();
	}

	@BeforeMethod
	public void beforeMethod() {
		driver = new FirefoxDriver();
		driver.get("https://www.triphobo.com/");
		wait = new WebDriverWait(driver, Duration.ofSeconds(20));

	}

	@AfterMethod
	public void afterMethod() {
	}

}
