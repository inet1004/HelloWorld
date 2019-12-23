package referencetype;

public class ArraySample {
	public static void main(String[] args) {
		int a=6, b=7, c=3, d=5, e=9;
		int maxValue=0;
		// 다섯개의 변수에 들어 있는 값중에서 가장 큰 수를  maxValue에 대입하는
		
		int i;
		int m=0;
		int[]  intArray = {6,7,3,5,9};
		for(i=0;i<5;i++) {
			if (intArray[i] > maxValue) {
			maxValue=intArray[i];
			m = i+1;
			}
		}
		System.out.println("최대값은 " + m + "번째의 수 " + maxValue + "입니다.");
		
		
//		int minValue=Integer.MAX_VALUE;
//		for(int i=0;i<intArray.length;i++) {
//			
//		}
	}
	
//	public static void main(String[] args) {
//		int a=6, b=7, c=3, d=5, e=9;
//		// 다섯개의 변수에 들어 있는 값중에서 가장 큰 수를 minValue에 대입하는
//		
//		int i;
//		int[]  intArray = {6,7,3,5,9};
//		int minValue = intArray[1];
//		int m=0;
//		
//		for(i=0;i<5;i++) {
//			if (intArray[i] < minValue) {
//			minValue=intArray[i];
//			m = i+1;
//			}
//		}
//		System.out.println("최소값은 " + m + "번째의 수 " + minValue + "입니다.");
//	}
}
