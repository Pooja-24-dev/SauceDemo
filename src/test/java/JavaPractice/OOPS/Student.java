package JavaPractice.OOPS;

import org.testng.annotations.Test;

public class Student {
	
	int id;
	String name;
	
	Student(int i, String n){
		id = i;
		name = n;
	}
	
	public void display() {
//		System.out.println(id);
//		System.out.println(name);
		
		System.out.println(id+" "+name);

	}
	

	public static void main(String [] args) {
		Student obj1 = new Student(10, "rakesh");
		Student obj2 = new Student(100, "pooja");

		obj1.display();
		obj2.display();
	}

}
