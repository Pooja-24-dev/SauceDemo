package JavaPractice;

import org.testng.annotations.Test;

public class ExceptionHandling {

	//exception
	//Statement 1
	//Statement 2
	//Statement 3
	//Statement 4 //exception
	//Statement 5
	//Statement 6
	//Statement 7
	//Statement 8
	//Statement 9
	//Statement 10
	
	@Test
	public void runMethod() {
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		System.out.println(4);
		int a = 10/0;
		System.out.println(5);
		System.out.println(6);
		System.out.println(7);
		System.out.println(8);
		System.out.println(9);
		System.out.println(10);

	}
	
	@Test
	public void exception1() {
		//two type
		
		//checked exception = compile time pe aaa jate he
		//unchecked exception = run time pe aa jate h
		int a = 5;
		System.out.println(a);
	}
	
	@Test
	public void keyWordInExceptionHandling() {
		
		//try = jaha par bhi exception aati h usko try k andar likh dete h
		//catch = agar exception aati h to kya karna h
		//finally = is block k andar kuch bhi likh do vo execute hoke rahega
		
		System.out.println(3);
		System.out.println(4);
		try {
		int a = 10/1;      //guest aaye kheer / 
		}
		catch(Exception e) {
			//System.out.println("catch block executed"); //suji
		}
		//int z = 10/0;
		
		try {
			System.out.println(5);
			System.out.println(6);
			int a = 10/0;
			
		} 
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBounds exceotion");
		}
		
//		catch (ArithmeticException e) {
//			//e.printStackTrace();
//			System.out.println("exception handled");
//		}
		
//		catch (Exception e) {
//			System.out.println("global exception");
//		}
		
		finally {
		System.out.println("print this line");
		}
	}
	
	@Test
	public void exceptionHandlingExample() {
		
		//card = 100
		int cardPoint = 100;
		int denominator ;
		int value;
		denominator = 0;
		
		try {
			value = cardPoint/denominator;
			try {
				
			}
			catch(Exception a) {
				
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO Auto-generated catch block
			denominator = 10;
			
			try {
				
			}
			catch(Exception e1) {
				
			}
		}
		catch (Exception e) {
		System.out.println("global exception");
		}
		
		finally {
			denominator = 50;
			value = cardPoint/denominator;
			System.out.println(value);
		}
		
	}
	
	@Test
	public void throwExcample() {
		//throw => if you wan to throw and exception =>user defined
		
//		int age =16;
//		
//		if(age<18) {
//			throw new ArithmeticException("Person is not eligile for vote");
//		}
//		
//		System.out.println("this is my normal flow");
		
		
		int marks = 30;
		if(marks<33) {
			System.out.println("you are fail");
			throw new ArrayIndexOutOfBoundsException("program will terminate as marks are below 33");
		}
		
		System.out.println("you are passed");
		System.out.println("you have been promoted to next class");

		
		
	}
	
	@Test
	public void throwsExample() throws InterruptedException  {
		//throws =>notification => ur program may cause an exception || It supress the exception
		int time = 1000000;
		Thread.sleep(time);
	}
}


















