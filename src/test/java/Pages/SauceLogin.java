package Pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SauceLogin {

	
	WebDriver driver;
	
	@FindBy(id="user-name")
	WebElement username;
	
	@FindBy(id="password")
	WebElement password;
	
	@FindBy(id="login-button")
	WebElement Submit;
	
	public SauceLogin (WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public void logoinToApplication(String UserName, String Password) {
		
		setUserName(UserName);
		setPassword(Password);
		submitButtonClick();		
	}

	private void submitButtonClick() {
		Submit.click();	
	}

	private void setPassword(String Password) {
		password.sendKeys(Password);
	}

	private void setUserName(String UserName) {
		username.sendKeys(UserName);
	}
	
}
