package common;

public class ForMultiplicationTableExample {
	public static void main(String[] args) {
		int p;
		int n;
		int m;
			for (p = 2; p <= 9; p++) {
				if(p<9) {
					System.out.print("*** " + p + "단 ***");
				}else {
					System.out.print("*** " + p + "단 ***");
				}
			}

			System.out.println("");
			
			for (n = 2; n <= 9; n++) {
				for (m=1;m<10;m++) {
					if (m<9) {
						System.out.print(n + " x " + m + " = " + (m * n) + ", ");
					} else {
						System.out.println(n + " x " + m + " = " + (m * n) + ", ");
					}
				}
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
