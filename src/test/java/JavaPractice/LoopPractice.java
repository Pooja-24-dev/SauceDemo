package JavaPractice;

import org.testng.annotations.Test;

public class LoopPractice {
	
	//For loop
	//while loop
	//do while loop
	//enhanced loop
	
	@Test
	public void forLoop() {
		
		//1 - 10
		
		//starting 1 1no gap  ending 10
		
		//syntax
		//for(init;condition;incement/decrement){ statments}  
		
		for(int i=1;i<=100;i++) { // 1;11<=10;11
			
			System.out.println(i);
			int c= 10, d=20;
			System.out.println(c+d);
			if(c<d) {
				System.out.println();
			}
		}
		
		
		
		//10 to 1
		//1 to 5 but no 4 print nahi hona chahiye
		//1 - 10 but no 4 and no 9 print nahi hona chahiye
		
	}
	
	@Test
	public void whileLoopPractice() {
		
		
		//for loop syntax ==== 		//for(init;condition;incement/decrement){ statments}  
		
		//syntax for while loop
		//init
		//while(condition){
		//statements
		//increment/decrement
		//}
		
		//1 - 10
		
		int i =1;
		while(i<=10) {
			System.out.println(i);
			i++;
		}
		
		
		//10 to 1
		//1 to 5 but no 4 print nahi hona chahiye
		//1 - 10 but no 4 and no 9 print nahi hona chahiye
	}
	
	@Test
	public void doWhileLoopPractice() {
		
		
		//syntax for while loop
		//init
		//while(condition){
		//statements
		//increment/decrement
		//}
		
		
		//syntax for do while loop
		//init
		//do{
		//statement
		//increment/decrement
		//}
		//while(condition);
		
		//1 - 10
		int i =1; //10
		do {
			 //11
			System.out.println(i); //11
			i++;
		}
		while(i<=10);
		
	}

}
