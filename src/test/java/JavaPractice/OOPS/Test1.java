package JavaPractice.OOPS;

public class Test1 {

	//public =access from any where (Modifier)
	//static = keyword - these method belong to class
	//void = no return type
	//main = name of the method
	//String[] args = command line arguments
	
	public static void main() {
		System.out.println(100);
	}
	public static void main(String[] args) {
		System.out.println("i m start");
		
		substract();
		Test1 obj = new Test1();
		obj.add();
	}
	
	public void add() {
		System.out.println(10+20);
	}
	
	public static void substract() {
		System.out.println(40);
	}
	
	public int addTwo() {
		return 0;
		
	}

}
