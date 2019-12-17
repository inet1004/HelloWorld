package common;

public class GugudanExample {
	public static void main(String[] args) {

		int var2 = 2;
		for (int i = 1; i < 9; i++) {
			for (int ii = 1; ii < 10; ii++) {
				System.out.println(var2 + " * " + ii + " = " + (var2 * ii));
			}
			var2++;
		}
	}
}
