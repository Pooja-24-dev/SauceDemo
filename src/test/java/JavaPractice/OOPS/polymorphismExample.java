package JavaPractice.OOPS;

import org.testng.annotations.Test;

public class polymorphismExample {

	
	
	// poly morph ism
	//compile time polymorphism/Method overloading
	//runtime polymorphism/Method overriding
	
	
	//compile time polymorphism/Method overloading
	//if two or more methods with same name in same class but different in the following ways
	//a no of arguments
	//b type of arguments
	//signature of a method
	
	public void add() {
		System.out.println("this is blank add");
	}
	
	public void add(int a, int b) {
		System.out.println(a+b);
	}
	
	public void add(double a, double b) {
		System.out.println(a+b);
	}
	
	public void add(int a, int b,int c) {
		System.out.println(a+b+c);
	}
	
	@Test
	public void runMethod()
	{
		add();
		add(10,20,30);
		add(12.654,22.76567);
		add(10,20);
	}
}
