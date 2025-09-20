package SeleniumPractice;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Framework.DriverSetup;
import Framework.SeleniumFunction;

public class Wait extends DriverSetup{

	WebDriver driver;
	SeleniumFunction seleniumFunction;
	
	@BeforeClass
	public void setup() {
		
	  driver= driverSetup();   
	  driver.get("https://demo.guru99.com/test/guru99home/");
	  seleniumFunction = new SeleniumFunction();
	  }
	
	@Test
	public void waitExample() {
		// implicit wait
		driver.findElement(By.xpath("(//*[@id='rt-header']//a[@class='item' and contains(text(),'Testing')])[1]")).click();
		
		
	}
	
	@Test
	public void explicitWaitExample() {
		// explicit wait
		WebDriverWait wait =seleniumFunction.ExplicitWaitForElement(driver, 30);
		WebElement element = driver.findElement(By.xpath("//*[@id='navbar-brand-centered']/ul/li[1]/a"));
		
		wait.until(ExpectedConditions.visibilityOf(element));
		wait.until(ExpectedConditions.elementToBeClickable(element));
		element.click();
	}
	
	public void fluentWaitExample() {
		WebElement element = driver.findElement(By.xpath("//*[@id='navbar-brand-centered']/ul/li[1]/a"));

		FluentWait wait =seleniumFunction.FluentWaitForElement(driver,50, 5);
		
		wait.until(ExpectedConditions.visibilityOf(element));
				
	}
}
