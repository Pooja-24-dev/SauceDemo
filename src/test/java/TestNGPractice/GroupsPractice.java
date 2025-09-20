package TestNGPractice;

import org.testng.annotations.Test;

public class GroupsPractice {

	@Test(groups = {"Sanity","Regression","P0"})
	public void test1() {
		System.out.println("i am test 1");
	}
	
	@Test(groups = {"Smoke","P0"})
	public void test2() {
		System.out.println("i am test 2");
	}
	
	@Test(groups = {"Sanity","P1"})
	public void test3() {
		System.out.println("i am test 3");
	}
	
	@Test(groups = {"Regression","P2"})
	public void test4() {
		System.out.println("i am test 4");
	}
}
