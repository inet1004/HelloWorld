package common;

public class IntExample {
	public static void main(String[] args) {
		int var1 = 10;
		int var2 = 010;
		int var3 = 0x5;
		
		System.out.print("var1: " + var1 +"\t");
		System.out.print("var2: " + var2 +"\t");
		System.out.print("var3: " + var3 +"\t");
		
		for(int i=0;i<10;i++) {
			// System.out.println(var3++);
			System.out.printf("%2X",var3++);
		}
	}
}
