package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login2 {
	
	//Step 1
	WebDriver driver;//12345
	
	//Step 2 Define All locator
	
	//@FindBy(locatorType ="locatorValue")
	//WebElement elementName;
	@FindBy(id ="email")
	WebElement email;
	
	@FindBy(id="pass")
	WebElement password;
	
	@FindBy(id="send2")
	WebElement submit;

	//step 3 //name will be same as class name
	public Login2(WebDriver driver) {//12345
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
//	public void loginToApplication() {		
//        email.sendKeys("standard_user");
//        password.sendKeys("secret_sauce");
//        submit.click();
//	}
	
	public void loginToApplication(String emailID, String userPassword) {		//standard_user","driver
        email.sendKeys(emailID);
        password.sendKeys(userPassword);
        submit.click();
	}

}
