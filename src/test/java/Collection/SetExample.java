package Collection;

import java.util.HashSet;
import java.util.LinkedHashSet;

import org.testng.annotations.Test;

public class SetExample {
	
	@Test
	public void runMethod() {
		
		LinkedHashSet<String> set = new LinkedHashSet<String>();
		
        set.add("One");    
        set.add("Two");    
        set.add("Three");   
        set.add("Four");  
        set.add("Five");  

        set.add("One");
		for(String No : set) {
			System.out.println(No);
		}
	}

}
