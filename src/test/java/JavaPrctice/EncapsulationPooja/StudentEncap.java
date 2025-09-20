package JavaPrctice.EncapsulationPooja;

import org.testng.annotations.Test;

public class StudentEncap {

	@Test
	public void runMethod() {
		Student obj = new Student();
		
		obj.setName("Rakesh");
		String name =obj.getName();
		System.out.println(name);
	}
}
