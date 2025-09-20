package Collection;

import java.util.LinkedList;

import org.testng.annotations.Test;

public class LinkedListExample {
	
	@Test
	public void runMethod() {
		  LinkedList<String> al=new LinkedList<String>(); 
		  
		  al.add("Ravi"); 
		  al.add("Mohit");
		  al.add("Ravi");
		  al.add("Vijay");  
		  al.add("Ravi");  
		  al.add("Ajay");  
		  
		  //System.out.println(al.get(0));


			//al.add(0, null);
			al.addFirst("Rakesh");
			al.addLast("Joshi");

			for(String name : al) {
				System.out.println(name);
			}
			
			al.removeFirst();
			al.removeLast();
			System.out.println("=======================================");
			

			
			al.removeLastOccurrence("Ravi");
			
			for(String name : al) {
				System.out.println(name);
			}
	}

}
