package pack;

public class A {

	public void msg() {
		System.out.println("hello");
	}
	
	public void runMethod() {
		msg();
	}
	
	//private =within the class yes but outside class me nahi kar sakte
	//default = with class yes outside the class also yes but it should be in same package
	//protected = within class yes outside class yes with diffrent package is also yes but with subclass only
	//public = allowed anywhere 
}
