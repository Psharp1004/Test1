package ca.demo.test1;

public class Main{
	public static void main(String[] args) {
		Test1 data = new Test1();
		
		displayGreeting();
		data.display();
	}
	
	private static void displayGreeting() {
		System.out.println("Hello World!!!");
		System.out.println("This app shows test data");
		
		System.out.println("This is Test1");
	}
}

