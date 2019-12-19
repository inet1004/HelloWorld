package Operators;

public class ContinueExample {
	public static void main(String[] args) {
		for(int i=1;i<=10;i++) {
			if(1%2!=0) {
				continue;
			}
			System.out.println(i);
			System.out.println(i);
		}
	}
}
