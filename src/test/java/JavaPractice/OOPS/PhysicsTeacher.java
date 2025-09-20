package JavaPractice.OOPS;

import org.testng.annotations.Test;

public class PhysicsTeacher extends Techer {
	
	String mainSubject ="Physics";
	
	@Test
	public void runMethod() {
		PhysicsTeacher obj = new PhysicsTeacher();
		System.out.println(obj.collegeName);
		System.out.println(obj.deignation);
		System.out.println(obj.mainSubject);
		obj.does();
	}

}
