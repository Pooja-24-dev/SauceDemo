package JavaPractice.OOPS;

import org.testng.annotations.Test;

public class ConstructorExample {

	
	//Constructor == method
	//name == className
	//data type == none
	//only default constructor load at class loading
	//each time they will be call when object of the class will be created
	
	
	//two types of constructor
	//Default constructor = no parameter 
	//Parameterized constructor
	
	ConstructorExample(){
		System.out.println("i am constructor");
	}
	
	ConstructorExample(int a){
		System.out.println("i am param constructor");
	}
	
	ConstructorExample(String a){
		System.out.println("i am string type param constructor");
	}
	
	
	@Test
	public void runMethod() {
		ConstructorExample obj = new ConstructorExample("rakesh");
		
		
	}
}
