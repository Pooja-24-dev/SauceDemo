package JavaPractice.OOPS;

import org.testng.annotations.Test;

public class Dog extends Animal{

	String color = "Black";
	
//	public void a() {
//		System.out.println("child add");
//	}
	
	@Test
	public void runMethod() {
		
		System.out.println(color);
		System.out.println(super.color);
		//super
		add();
		super.add();
	}
}
