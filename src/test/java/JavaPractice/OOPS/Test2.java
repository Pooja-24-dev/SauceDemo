package JavaPractice.OOPS;

import org.testng.annotations.Test;

import Framework.JavaFunction;

public class Test2 extends JavaFunction {

	String color1 = "Black";
	
	@Test
	public void runMethod() {
		Test2 obj = new Test2();
		int a =obj.addTwoNo(100, 200);
		System.out.println(a);
		
		//System.out.println(obj.color);
	}
}
