package TestScript;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Framework.DriverSetup;
import Framework.configReaderFile;
import Pages.SauceLogin;

public class TestSauceLogin extends DriverSetup{

	WebDriver driver;
	configReaderFile configRead;
	SauceLogin login; 
	
	@BeforeClass
	public void setup() {
	  configRead = new configReaderFile("configuration");
	  
	  driver= driverSetup();   
	  login =  new SauceLogin(driver);
	  driver.get(configRead.getPropertyFileConfig("URL"));		 
	  
	  }

	@Test
	public void login() throws InterruptedException {
		login.logoinToApplication(configRead.getPropertyFileConfig("UserName"),configRead.getPropertyFileConfig("Password"));
	}
	
	@AfterClass
	public void tearDown() {
		driver.close();
	}
}
