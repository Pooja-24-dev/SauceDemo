package ArrayInJava;
import org.testng.annotations.Test;

public class TestArray {

	// 
	@Test
	public void runMethod() {
		
		int a;
		a= 10;
		//syntax
		//datatype variableName [] = new datatype[size]; // declaration //instantiation
		int marks [] = new int[5];
		
		//nameOfTheVariable[indexNo] = value;
		marks[0] = 10;
		marks[1] = 40;
		marks[2] = 60;
		marks[3] = 20;
		marks[4] = 90;
		
		//System.out.println(marks[0]+" "+ marks[1]);	
		
		//marks[0]
		//marks[1]
		//marks[2]
		//marks[3]
		//marks[4]
//		System.out.println(marks.length);
//		for(int i= 0;i<marks.length ; i++) {
//			System.out.println(marks[i]);
//		}
		
		for(int i : marks) {
			System.out.println(i);
		}
	}	
	
	@Test
	public void TestArray() {
		int no[]= {10,40,60,20,90};
	}
	
	@Test
	public void minValue() {
		
		int no[]= {40,60,2,20,90,10};
		
		int min = no[0];
		
		for(int i= 1;i<no.length ; i++) {
			
			//min 2
			//min 2 no[i] 10
			// 2 > 10
			if(min>no[i]) {
				min = no[i];
				//min = 2
			}
			
			//min 2
		}
			System.out.println(min);		
	}
}
