package classes;

public class MethodExample1 {
	public static void main(String[] args) {
		showName();
		showName("Park");
		showAge(100);
	}
	
	public static void showName() {
		System.out.println("Hello, I am Charlie");
	}
	
	public static void showName(String name) {
		System.out.println("Hello, I am " + name);
	}
	
	public static void showAge(int age) {
		System.out.println("Hello, I am " + age + " year old.");
	}
	
	
	
	
}
