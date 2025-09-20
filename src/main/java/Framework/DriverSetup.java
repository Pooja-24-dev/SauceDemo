package Framework;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DriverSetup {
	WebDriver driver;

	public WebDriver driverSetup() {

		ChromeOptions options = new ChromeOptions();

		// Disable password manager and save credentials popup
		Map<String, Object> chromePrefs = new HashMap<>();

		// Disable the password manager and leak detection
		chromePrefs.put("credentials_enable_service", false);
		chromePrefs.put("profile.password_manager_enabled", false);
		chromePrefs.put("profile.password_manager_leak_detection", false); // Important for "Change Password" pop-up

		// Create ChromeOptions and set the preferences
		options.setExperimentalOption("prefs", chromePrefs);

		System.setProperty("webdriver.chrome.driver",
				"C:\\java workspace\\PoojaAutomation\\src\\main\\resources\\chromedriver.exe"); // For Windows
		driver = new ChromeDriver(options); // 12345
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		return driver;
	}

}
