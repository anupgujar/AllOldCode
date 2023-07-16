package scripts;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;

public class MyNewHandlingTestNG {
	WebDriver driver;
  //@Test
  public void tryFewWebElementMethod() {
	  boolean LEDLampEnabled = driver.findElement(By.cssSelector("input[value='LEDHeadLamp']")).isEnabled();
	  System.out.println("LED Lamp Enabled ?" + LEDLampEnabled);	
	  boolean LEDLampDisabled = driver.findElement(By.xpath("//input[@value='LEDHeadLamp']")).isDisplayed();
	  System.out.println("LED Lamp Disabled ?" + LEDLampDisabled);
	  boolean LEDLampVisible = driver.findElement(By.xpath("//input[@value='LEDHeadLamp']")).isDisplayed();
	  System.out.println("LED Lamp Visible ?"+LEDLampVisible);
	  String LEDLampTag = driver.findElement(By.xpath("//input[@value='LEDHeadLamp']")).getTagName();
	  System.out.println("LED Lamp TagName ?"+LEDLampTag);
  }
  
  //@Test
  public void handlingCheckBoxes() throws InterruptedException {
	  WebElement airbags = driver.findElement(By.xpath("//input[@value='Airbags']"));
	  Thread.sleep(5000);
	  if(!airbags.isSelected()) {
		  airbags.click();
	  }Thread.sleep(5000);
	  if(airbags.isSelected()) {
		  airbags.click();
	  }
	  Thread.sleep(5000);
  }
  
  //@Test
  public void handlingRadioButtons() throws InterruptedException {
	  Thread.sleep(4000);
	  driver.findElement(By.xpath("//input[@value='Diesel']")).click();
	  Thread.sleep(4000);
  }

  @Test
  public void handlingDropdowns() throws InterruptedException {
		/*
		 * driver.findElement(By.name("make")).click();
		 * driver.findElement(By.xpath("//option[@value='audi']")).click();
		 */
	//driver.findElement(By.name("make")).findElement(By.xpath("//option[@value='audi']")).click();
	/*
	 * List<WebElement> myOptions = driver.findElement(By.name("make")).findElements(By.tagName("option"));
	 * System.out.println(myOptions.size()); Thread.sleep(7000);
	 */
	  	WebElement makeDropDown = driver.findElement(By.name("make"));
	  	Select make = new Select(makeDropDown);
	  	make.selectByVisibleText("Audi");
	  	Thread.sleep(4000);
	  	make.selectByValue("mercedes");Thread.sleep(4000);
	  	make.selectByIndex(03);
	  	Thread.sleep(4000);
	  	
	  	List<String> expectedMakeOptions = new ArrayList<String>();
	  	expectedMakeOptions.add("BMW");
	  	expectedMakeOptions.add("Mercedes");
	  	expectedMakeOptions.add("Audi");
	  	expectedMakeOptions.add("Honda");
	  	
	  	List<String> actualMakeOptions = new ArrayList<String>();
	  	List<WebElement> allMakeOptions = make.getOptions();
	  	
	  	for(WebElement oneOption: allMakeOptions) {
	  		actualMakeOptions.add(oneOption.getText());
	  	}
	  	
	  	assertEquals(actualMakeOptions,expectedMakeOptions);
  }
  @BeforeMethod
  public void beforeMethod() {
	  	System.setProperty("webDriver,firefox,driver","test//resources//gechodriver.exe");
		driver = new FirefoxDriver();
		driver.get("http://www.cookbook.seleniumacademy.com/Config.html");
  
  }

  @AfterMethod
  public void afterMethod() {
	  driver.quit();
  }

}
