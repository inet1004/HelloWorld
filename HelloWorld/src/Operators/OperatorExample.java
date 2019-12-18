package Operators;

public class OperatorExample {
	public static void main(String[] args) {
  		int result = 0;
		int a = 10, b = 20;
//		result = a + b;
//		System.out.println("결과: " + result);
		sum(a,b);
		multi(a,b);
		
	}
	
	public static void sum(int a, int b) {
		int result = a + b;
		System.out.println("결과: " + result);

	}
	
	public static void multi(int a, int b) {
		int multi = a * b;
		System.out.println("결과: " + multi);

	}
}
