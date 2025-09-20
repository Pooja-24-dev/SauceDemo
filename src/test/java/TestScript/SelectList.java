package TestScript;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Framework.DriverSetup;
import Pages.Login2;

public class SelectList extends DriverSetup {
    WebDriver driver;
	
	@BeforeClass
	public void setup() {
		
      driver= driverSetup();   
      driver.get("https://demo.guru99.com/test/newtours/register.php");
	}
	
	@Test
	public void login() {
		
		
		WebElement element = driver.findElement(By.xpath("//select[@name='country']"));
		
		Select dropdown = new Select(element);
		
		List<WebElement> countryNames = new ArrayList<WebElement>();
		countryNames =dropdown.getOptions();
		
		for(WebElement wb : countryNames) {
			System.out.println(wb.getText());
		}

	}
	
	@AfterClass
	public void tearDown() {
		//driver.close();
	}

}
