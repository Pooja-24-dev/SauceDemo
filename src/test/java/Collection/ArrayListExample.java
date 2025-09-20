package Collection;

import java.util.ArrayList;
import java.util.Collections;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Framework.DriverSetup;

public class ArrayListExample {
	WebDriver driver;
	@Test
	public void runnerMethod() {
		
		Object marks [] = new Object[5];
		
		//nameOfTheVariable[indexNo] = value;
		marks[0] = true;
		marks[1] ="Rakesh";
		marks[2] = 564564.76;
		
		ArrayList<String> fruit = new ArrayList<String>(); //insertion order is preserved
		
		fruit.add("Apple");
		fruit.add("Mango");
//		fruit.add(true);
		fruit.add("Banana");
		fruit.add("Grapes");

//		System.out.println(fruit.get(1));
//		System.out.println(fruit);
		
//		for(String fruitName : fruit) {
//			System.out.println(fruitName);
//		}
		
		System.out.println("==========================================================");
		
		fruit.set(1, "Dates");
		
		for(String fruitName : fruit) {
			System.out.println(fruitName);
		}
		
		Collections.sort(fruit);
		
		
		System.out.println("======================After Sort====================================");
		
		for(String fruitName : fruit) {
			System.out.println(fruitName);
		}
		
		
		
		fruit.remove(0);
		
		
		System.out.println("======================After Removal index 0====================================");
		
		for(String fruitName : fruit) {
			System.out.println(fruitName);
		}
	}
	
	@Test
	public void runner2() {
		
		
		ArrayList<String> fruit = new ArrayList<String>(); //insertion order is preserved
		
		fruit.add("Apple");
		fruit.add("Mango");
		fruit.add("Banana");
		fruit.add("Grapes");
		
		
		ArrayList<String> fruit2 = new ArrayList<String>(); //insertion order is preserved
		
		fruit2.add("papaya");
		fruit2.add("Chiku");
		
		
		System.out.println("==========================================================");
		
		for(String fruitName : fruit) {
			System.out.println(fruitName);
		}
		
		fruit.addAll(fruit2);
		
		System.out.println("==========================================================");
		
		for(String fruitName : fruit) {
			System.out.println(fruitName);
		}
		
	}
	
	@Test
	public void removeAllTest() {
		
		
		ArrayList<String> fruit = new ArrayList<String>(); //insertion order is preserved
		
		fruit.add("Apple");
		fruit.add("Mango");
		fruit.add("Banana");
		fruit.add("Grapes");
		
		System.out.println("==========================================================");
		
		for(String fruitName : fruit) {
			System.out.println(fruitName);
		}
		
		ArrayList<String> fruit3 = new ArrayList<String>(); //insertion order is preserved
		
		fruit3.add("Mango");
		fruit3.add("papaya");
		
		fruit.removeAll(fruit3);
		
		
		System.out.println("==========================================================");
		
		for(String fruitName : fruit) {
			System.out.println(fruitName);
		}
		
		
		fruit.clear();
		
		System.out.println("==========================After clear================================");
		
		for(String fruitName : fruit) {
			System.out.println(fruitName);
		}
	}
	
	@Test
	public void retainAllMethod() {
		
		ArrayList<String> fruit = new ArrayList<String>(); //insertion order is preserved
		
		fruit.add("Apple");
		fruit.add("Mango");
		fruit.add("Banana");
		fruit.add("Grapes");
		
		ArrayList<String> fruit3 = new ArrayList<String>(); //insertion order is preserved
		
		fruit3.add("Mango");
		fruit3.add("Banana");
		
		System.out.println("==========================before retain================================");
		
		for(String fruitName : fruit) {
			System.out.println(fruitName);
		}
		
		fruit.retainAll(fruit3);
		
		System.out.println("==========================after retain================================");

		for(String fruitName : fruit) {
			System.out.println(fruitName);
		}
		
		System.out.println(fruit.isEmpty());
	}

	@Test
	public void selectOptionInSelenium() {
		
//		DriverSetup obj = new DriverSetup();
//		driver = obj.setup();
//		driver.get("https://magento.softwaretestingboard.com/customer/account/login");
//		
//		driver.get("https://demo.guru99.com/test/newtours/register.php");
//		
//		WebElement element = driver.findElement(By.xpath("//select[@name='country']"));
//		
//		//selenium.selectByIndex(element, 2);
//		//Select objectName = new Select(WebElement);
//		//Select dropdown = new Select(element);
		
	}
}
