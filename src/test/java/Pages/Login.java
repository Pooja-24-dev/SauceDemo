package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Login {
	
	//object - any entity 
	//Class- a similar type of object
	//Method - container - glass box from big bazaar
	
	//lets create your first method
	@Test
	public void printName() {
		
		//how to print in java - syso ctrl + space then enter
		System.out.println(1000);
		System.out.println("Rakesh Joshi");
	}
	
	@Test
	public void successfulLogin() {
		
		//system property - give path for chromedriver.exe
		
		 // Set the path to the ChromeDriver executable
        // System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver"); // For macOS/Linux
        System.setProperty("webdriver.chrome.driver", "C:\\java workspace\\PoojaAutomation\\src\\main\\resources\\chromedriver.exe"); // For Windows
        
        //open chrome
        WebDriver driver = new ChromeDriver();
		
        
        //navigation kese karte h
        driver.get("https://magento.softwaretestingboard.com/customer/account/login/referer/aHR0cHM6Ly9tYWdlbnRvLnNvZnR3YXJldGVzdGluZ2JvYXJkLmNvbS8%2C/");
        
        
        //how to identify an element
        //driver.findElement(By.id("id value"))
        //how to type - driver.findElement(By.id("id value")).sendKeys("");
        driver.findElement(By.id("email")).sendKeys("rakeshjoshi@gmail.com");
     
        driver.findElement(By.id("pass")).sendKeys("abcd123@");
        
        //click 
        driver.findElement(By.id("send2")).click();
        
	}

}
