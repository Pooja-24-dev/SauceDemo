package JavaPractice.OOPS.Encapsulation;

import org.testng.annotations.Test;

public class StudentTest {
	
	@Test
	public void runMethod() {
		
		Student obj = new Student();
		//System.out.println(obj.name);
		
		obj.setName("Rakesh");
		
		String value = obj.getName();
		System.out.println(value);
	}

}
