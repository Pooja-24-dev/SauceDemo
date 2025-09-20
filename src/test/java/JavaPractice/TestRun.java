package JavaPractice;

import org.testng.annotations.Test;

import JavaPractice.OOPS.InheritanceExample1;

public class TestRun extends InheritanceExample1 {

	@Test
	public void runMethod() {
		
		InheritanceExample1 obj = new InheritanceExample1();
		obj.whatHeDO();
	}
}
