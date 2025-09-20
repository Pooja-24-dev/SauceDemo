package JavaPractice;

import org.testng.annotations.Test;

public class ConditionalWait {
	
	@Test
	//Decision Making statements
	public void flowStatement() {
		
		//if statement
		//Switch statement
		
		//Syntax for if
		// if(condition){  
		//}
		
//		int age = 15;
//		if(age>=18) { // if(true)
//			System.out.println("you can vote");
//		}
//		else {
//			System.out.println("you can not vote");
//		}
		
		
		//nested if condition
//		int a = 10, b=10;
//		if(a>b) {
//			System.out.println("a is bigger");
//		}
//		else if(a==b) {
//			System.out.println("a and b both are same");
//		}
//		else {
//			System.out.println("b is bigger");
//		}
		
		//assignment compare three no's
		
		
		//compound statement
		//if(condition1) && (condition2){
		//if(condition1) || (condition2){
		
//		int mathMark = 70, englishMark = 60;
//		if((mathMark>=70)&&(englishMark>=70)){
//			System.out.println("student will get a bike ");
//		}
//		else {
//			System.out.println("student will not get a bike ");
//
//		}
		
//		if((mathMark>=70)||(englishMark>=70)){
//			System.out.println("student will get a bike ");
//		}
//		else {
//			System.out.println("student will not get a bike ");
//
//		}
//		
	}
	
	@Test
	public void switchPractice() {
		
		char grade = 'D';
		
		//syntax
		//switch(varableName){
		//}
		
		switch(grade) {
		
		//Case 
		//syntax
		// case varableValue1:
		//syso
		//break;
		// case varableValue2:
		//syso
		
		case 'A':
			System.out.println("Excellent");
			break;
		case 'B':
			System.out.println("Good");
			break;
		case 'C':
			System.out.println("Can be better");
			break;
		case 'F':
			System.out.println("Fail");
			break;
			//break should be last statement in switch case
		default:
			System.out.println("Invalid grade");
			break;
		
//		case 'L':
//			System.out.println("Fail");
//			break;
		}
		
	}

}
