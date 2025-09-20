package Collection;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map.Entry;

import org.testng.annotations.Test;

public class MapExample {
	
	@Test
	public void runMethod() {
		
		//name : Pooja
		//mobileNo : 90898
		//1 : Mango
		//2 : Apple
		//LinkedList<String> al=new LinkedList<String>(); 

		HashMap<Integer,String> fruits = new HashMap<Integer,String>();
		
		fruits.put(1, "Mango");
		fruits.put(2,"Apple");    
		fruits.put(3,"Banana");   
		fruits.put(4,"Grapes");   

		
		LinkedHashMap<String,String> PersonalDetails = new LinkedHashMap<String,String>();
		
		PersonalDetails.put("name", "Rakesh");
		PersonalDetails.put("city","Noida");    
		PersonalDetails.put("State","UP");   
		PersonalDetails.put("phoneNo","9036524372");   

		PersonalDetails.put("userName", "Rakesh");
		PersonalDetails.put("name", "Pooja");
		//System.out.println(PersonalDetails.get("State"));
		
		for(Entry<String, String> pd : PersonalDetails.entrySet()) {
			System.out.println(pd.getKey() + " "+ pd.getValue());
		}
		
		PersonalDetails.remove("city");
		
		System.out.println("==============================");
		for(Entry<String, String> pd : PersonalDetails.entrySet()) {
			System.out.println(pd.getKey() + " "+ pd.getValue());
		}
	}

}
