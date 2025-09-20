package TestNGPractice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGExample2 {

	@Test(enabled = false)
	public void home() {
		System.out.println("i am home");
	}
	
	@Test()
	public void checkout() {
		System.out.println("i am checkout");
	}
	
	@Test()
	public void login() {
		System.out.println("i am login");
		Assert.assertEquals(false, true);
	}
	
	@Test(dependsOnMethods = {"login"} )
	public void addToCart() {
		System.out.println("i am addToCart");
	}
	
	@Test()
	public void search() {
		System.out.println("i am search");
	}
	
	
	
	
	

}
