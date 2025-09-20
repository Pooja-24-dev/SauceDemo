package TestScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionPractice {
	
	
	@Test
	public void runMethod() {
		
//		String expectedPrice = "$29.999";
//		//run time actual price
//		String price ="$29.99";
//		
//		int a = 10,b =20;
//		boolean c = true, d = false;
//		Assert.assertEquals(c, a);
		
		
		//Login Test Case
		//user 
		//password
		//submit
		
		//Title = element.getTitle();
		//Assert.assertEquals(expectedTitle, actualTitle);
		//Assert.assertEquals(elogo, alogo);
		//Assert.assertEquals(elogout, alogout);
		//Assert.assertEquals(eusername, auserName);
		
		
		//SoftAssert
		SoftAssert soft = new SoftAssert();
		
		soft.assertEquals(0, 0);
		soft.assertEquals(0, 1);
		soft.assertEquals(10, 10);
		soft.assertEquals(20, 10);
		soft.assertEquals("rakesh", "Rakesh");
		
		WebDriver driver = null;
		WebElement element = driver.findElement(By.id("user-name"));
		
		boolean elementDisplayFlag = element.isDisplayed(); //true/false
		boolean elementEnableFlag =element.isEnabled();//true/false
		
		soft.assertTrue(elementDisplayFlag);
		soft.assertEquals(true, elementDisplayFlag);
		
		
		soft.assertFalse(elementEnableFlag);

		
		soft.assertAll();
		
	}

}
