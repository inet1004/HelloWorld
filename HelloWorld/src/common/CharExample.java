package common;

public class CharExample {
	public static void main(String[] args) {
		char c1 = 'A';
		char c2 = 65;
		char c3 = '\u0041';
		int v1 = c2;
		System.out.println("v1=" + v1);
		

		System.out.println("c1: " + c1 + ", " + "c2: " + c2 + ", " + "c3: " + c3);

		c1 = (char) (c1 + 1);
		System.out.println("c1+1: " + c1);

		char cc1 = 'A';
		for (int i = 0; i < 26; i++) {
			System.out.print(cc1++ + ", ");
		}

		System.out.println(" ");
		System.out.println("\t ");
		char aa = 65;
		System.out.println(aa + " = char 65");
	}

}
