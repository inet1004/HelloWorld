package referencetype;

public class GetMaxValue {
	public static void main(String[] args) {
		// int a = 5, b = 8, c = 3;
		int[] intArray = { 5, 8, 3, 7, 2 };
		int temp = 0;
		for (int j = 0; j < (intArray.length - 1); j++) {
			for (int i = 0; i < (intArray.length - 1); i++) {
				if (intArray[i] > intArray[i + 1]) {
					temp = intArray[i];
					intArray[i] = intArray[i + 1];
					intArray[i + 1] = temp;
				}
			}
		}
		for (int i = 0; i < intArray.length; i++) {
			System.out.print(intArray[i] + " ");
		}
	}
}
