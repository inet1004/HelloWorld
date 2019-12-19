package common;

// 1에서 100 까지의 홀수의 합구하기 
public class ForSumFrom1To100Example {
	public static void main(String[] args) {
		
		int sum = 0;
		
		for (int i = 1; i <= 100; i += 2) {
			sum += i;
			System.out.println(i + " ");
		}
		
		System.out.println("1에서 100까지 합은 " + sum);
		
//		int sum = 0;
//		
//		for (int i = 1; i <= 100; i ++) {
//			if (i % 2 == 1) sum += i;	// 홀수만 더하기
//			System.out.println(i + " ");
//		}
//		
//		System.out.println("1에서 100까지 합은 " + sum);
	}
}


