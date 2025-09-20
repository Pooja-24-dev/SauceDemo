package TestScript;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Framework.DriverSetup;
import Pages.Login2;

public class TestLogin2 extends DriverSetup {
    WebDriver driver;
	
	@BeforeClass
	public void setup() {
		
      driver= driverSetup();   
      driver.get("https://magento.softwaretestingboard.com/customer/account/login/referer/aHR0cHM6Ly9tYWdlbnRvLnNvZnR3YXJldGVzdGluZ2JvYXJkLmNvbS8%2C/");
	}
	
	@Test
	public void login() {
		Login2 obj = new Login2(driver);
		//obj.loginToApplication();
		obj.loginToApplication("standard_user","secret_sauce");

	}
	
	@AfterClass
	public void tearDown() {
		driver.close();
	}

}
