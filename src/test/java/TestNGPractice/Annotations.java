package TestNGPractice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations {
	
	@Test
	public void test() {
		System.out.println("This is from Test");
	}
	
	@BeforeSuite
	public void BeforeSuiteTest() {
		System.out.println("This is from Before Suite");
	}

	@AfterSuite
	public void AfterSuiteTest() {
		System.out.println("This is from After Suite");
	}

	@BeforeClass
	public void BeforeClassTest() {
		System.out.println("This is from Before Class");
	}
	
	@AfterClass
	public void AfterClassTest() {
		System.out.println("This is from After Class");
	}
	
	
	@BeforeTest
	public void BeforeTestTest() {
		System.out.println("This is from Before Test");
	}
	
	@AfterTest
	public void AfterTestTest() {
		System.out.println("This is from After Test");
	}
	
	@BeforeMethod
	public void BeforeMethodTest() {
		System.out.println("This is from Before Method");
	}
	
	@AfterMethod
	public void AfterMethodTest() {
		System.out.println("This is from After Method");
	}
}
