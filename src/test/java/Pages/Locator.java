package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Locator {
	
	@Test
	public void successfulLogin() {
		
        System.setProperty("webdriver.chrome.driver", "C:\\java workspace\\PoojaAutomation\\src\\main\\resources\\chromedriver.exe"); // For Windows
        WebDriver driver = new ChromeDriver();
        driver.get("https://bstackdemo.com/");
        
        
        
//        driver.findElement(By.id("email")).sendKeys("rakeshjoshi@gmail.com");
//        driver.findElement(By.id("pass")).sendKeys("abcd123@");
//        driver.findElement(By.id("send2")).click();     
//        
//        
//        driver.findElement(By.name("login[username]"));
//        
//        driver.findElement(By.className("action create primary"));
        
        
//        driver.findElement(By.linkText("REGISTER")).click();
//        driver.findElement(By.partialLinkText("REG")).click();
        
//        driver.findElement(By.tagName("input")).sendKeys("abcd1234");
        
        
        //css selector
        //driver.findElement(By.cssSelector("a#offers")).click();
        
        //startingtag#idvalue
        //a#offers
        //#offers
        
        //startingTag[id='value']
        //a[id='offers']

        
        
        //with class name
        //span.bag__quantity
        //.bag__quantity
        //span[class='bag__quantity']
        
        //a[href='/favourites']
        
        
        //xpath = are of two type
        //absolute xpath /
        ///html/body/div[2]/div[1]/div/ul[1]/li[1]/a
        ///
        //Relative xpath
        //
        ////input[@id='email']
        ///
        //driver.findElement(By.xpath("//input[@title='Email']"));
        
        
        ////a[text()='SAP Payroll']
        ///
        ///
        ///
        ///
        //startingtag[contains(text(),'value')]
      //a[contains(text(),'SAP SD')]
	}

}
