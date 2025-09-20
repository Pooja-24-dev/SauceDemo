package ArrayInJava;

import org.testng.annotations.Test;

public class MultiDimentionalArray {

	@Test
	public void runnerMethod() {
		
		//int marks [] = new int[5];
		//marks[0] = 10;
		int multiArray [][] = new int[3][3];
		multiArray[0][0]=1;
		multiArray[0][1]=2;  
		multiArray[0][2]=3;  
		multiArray[1][0]=4;  
		multiArray[1][1]=5;  
		multiArray[1][2]=6;  
		multiArray[2][0]=7;  
		multiArray[2][1]=8;  
		multiArray[2][2]=9;  

		//	System.out.println(marks[i]);
		//System.out.println(multiArray[0][0]);
		for(int i=0;i<3;i++) {
			for(int j =0;j<3;j++) {
				System.out.print(multiArray[i][j]);
			}
			System.out.println();
			
		}
		
	}
	
}
