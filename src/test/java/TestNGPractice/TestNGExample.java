package TestNGPractice;

import org.testng.annotations.Test;

public class TestNGExample {

	@Test(priority =2,description="This test case is for home page validation")
	public void home() {
		System.out.println("i am home");
	}
	
	@Test(priority =5)
	public void checkout() {
		System.out.println("i am checkout");
	}
	
	@Test(priority =1,description="This test case is for positive login")
	public void login() {
		System.out.println("i am login");
	}
	
	@Test(priority =4)
	public void addToCart() {
		System.out.println("i am addToCart");
	}
	
	@Test(priority =3)
	public void search() {
		System.out.println("i am search");
	}
	
	
	
	
	

}
