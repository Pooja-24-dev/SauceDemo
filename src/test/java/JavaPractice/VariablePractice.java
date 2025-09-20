package JavaPractice;

import org.testng.annotations.Test;

public class VariablePractice {
	//similar type of objects together called as class
	//object is nothing but any entity 
	
	
	//Variable = objects where values changes
	//Method
	
	//Data type name = value

	

	//global variable
	int g;
	@Test
	public void testVariable() {
		//local variable
		
//		int a=25;
//		System.out.println(a);
//		int b =100;
//		
//		int c;
//		c=200;
//		
//		int d,e,f;
//		d =10;
//		e=11;
//		f=12;
//		
//		a=100;
//		System.out.println(a);
		
		
	
		//System.out.println(g);
		//constant
//		final int h = 1000;
//		h =1001;
		
		double i = 123.7657858787585;
		
		char j = 'a';
		
		//Sequence of char is string
		String k = "Rakesh";
		
		boolean l = false;//true/false
	}
	
	public void test2() {
		
		int age = 26;
		String name = "Rakesh";
		
		//final trick
		String userName = "rakesh123";
//		int a = 10;
//		
//		System.out.println(A);
	}
	
	
	//
	@Test
	public void practiceOperators() {
		
		//Arithmetic Operator
		// + - * / %
//		int a =10, b =100;
//		int c = a+b;
//		System.out.println(c);
		
		
		//Unary operator
		// ++ --
		
//		int a = 10;
//		System.out.println(a++);
//		System.out.println(a);
		
		//comparison operator
		// a==b = true
		// a!=b 
		// a>b
		// a<b
		// a>=b
		// a<=b
		
//		int a =10, b =20;
//		//boolean c = a==b;
//		System.out.println(a!=b); //true
		
		
		//logical operator
		//AND OR NOT
		//&&  ||  !
		
		//AND
		//true true = true
		//true false = false
		//false true = false
		//false false = false
		
		//OR
		//true true = true
		//true false = true
		//false true = true
		//false false = false
		
		//NOT
		//true => false
		//false => true
		
//		boolean a = true, b = false;
//		System.out.println(!(a&&b)); //!(true&&false) => (!(false)) => true
		
//		int a = 10, b =20;
//		System.out.println(!((a>b)||(a<=b))); //(!(10>20)||(10<=20)) =>(!(true)) => false
	}

}
