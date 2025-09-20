package JavaPractice.OOPS;

import org.testng.annotations.Test;

public class One {
	
	//OOPS - object oriented programming system
	
	//object
	//class
	//inheritance
	//polymorphism
	//abstraction
	//encapsulation
	
	//object=
	//class=
	int a= 100,b =200;
	public void add() {
		System.out.println("add");
	}
	
	public void sub() {
		System.out.println("sub");
	}
	
//	public static void main(String[] args) {
//		
//		//className objectName = new className();
//		One obj = new One();
//		int c = obj.a;
//		System.out.println(c);
//		obj.add();
//	}
	
	@Test
	public void runMethod() {

		System.out.println(a);
		add();
	}
}
