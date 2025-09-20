package JavaPractice.OOPS;

import org.testng.annotations.Test;

public class MathsTeacher extends Techer{
String mainSubject ="Maths";
	
	@Test
	public void runMethod() {
		MathsTeacher obj = new MathsTeacher();
		System.out.println(obj.collegeName);
		System.out.println(obj.deignation);
		System.out.println(obj.mainSubject);
		obj.does();
	}
}
