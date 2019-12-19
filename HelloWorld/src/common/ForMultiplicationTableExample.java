package common;

public class ForMultiplicationTableExample {
	public static void main(String[] args) {
		int p;
		int n;
		int m=1;
			for (p = 2; p <= 9; p++) {
				if(p<9) {
					System.out.print("*** " + p + "단 ***");
				}else {
					System.out.println("*** " + p + "단 ***");
				}
			}
			for (n = 2; n <= 9; n++) {
				if(n<9) {
					System.out.print(n + " x " + m + " = " + (m * n) + ", ");
				}else {
					for(m=1;m<9;m++) {
					System.out.print(n + " x " + m + " = " + (m * n) + ", ");
					}
				}
				m++;
			}		
}
}
//			for (n = 1; n <= 9; n++) {
//					if(p<9) {
//						System.out.println(n + " x " + p + " = " + (p * n) + ", ");
//					} else {
//						System.out.print(n + " x " + p + " = " + (p * n) + ", ");
//					}
//			}
