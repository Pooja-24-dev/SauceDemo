package JavaPractice;

import java.io.IOException;

import org.testng.annotations.Test;

public class ExceptionHandlingThrowPractice {

	
	void m() throws IOException{
		int a;
		
		throw new IOException("device error");
		
	}
	
	void n() throws IOException {
		m();
	}
	
	void p() {
		try {
			n(); //device error
		} catch (IOException e) {
			System.out.println("exception handled");
		}
	}
	
	
	@Test
	public void runMethod() {
		ExceptionHandlingThrowPractice obj = new ExceptionHandlingThrowPractice();
		obj.p();
	}
	
	
	//final //finally //finalize
	
	//final variable =constant 
	//final method = override not allowed
	//final class = extend nahi kar sakte h
}
