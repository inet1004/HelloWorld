package classes;

public class MethodExample2 {
	public static void main(String[] args) {
		double result = sum(3.3, 4.5);
		System.out.println("걸과값은 " + result + "입니다.");

		int[] intAry = { 2, 3, 4, 5, 6, 7 };
		int sum = sum(intAry);
		System.out.println("합계는 " + sum);
		int[] intAry2 = { 3, 4, 5 };
		int sum2 = sum(intAry2);
		System.out.println("합계는 " + sum2);

		char ch = 'X'; // String "X"
		int cy = 5;
		printString(cy, ch);

	}

	public static int sum(int[] iary) {
		int sum = 0;
		for (int i = 0; i < iary.length; i++) {
			sum = sum + iary[i];
		}
		return sum;

	}

	public static double sum(double a, double b) {
		return a + b;
	}

	private static void printString(int x, char chr) {
		for (int i = 0; i < x; i++) {
			for (int m = 0; m < i; m++) {
				System.out.print(chr);
			}
			System.out.println(chr);
		}

	}

}
