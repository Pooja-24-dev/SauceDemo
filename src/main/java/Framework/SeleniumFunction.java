package Framework;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumFunction {

	
	public void clickToElement(WebElement element) {
		element.click();
	}
	
	public WebDriverWait ExplicitWaitForElement(WebDriver driver, int time) {
	WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(time));
	return wait;
	
	}
	
	public FluentWait FluentWaitForElement(WebDriver driver, int timeout, int poolingTime) {
		
		FluentWait wait = new FluentWait(driver).
				withTimeout(Duration.ofSeconds(timeout)).
				pollingEvery(Duration.ofSeconds(poolingTime)).
				ignoring(NoSuchElementException.class);
		return wait;
	}
}
