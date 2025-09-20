package JavaPractice.OOPS;

import org.testng.annotations.Test;

public class Class2 extends Class1{
	
	int a = 1, b= 2;
	public void add() {
		System.out.println(a+b);
	}
	
	@Test
	public void runMethod() {
		Class2 obj = new Class2();
		obj.add();
	}

}
