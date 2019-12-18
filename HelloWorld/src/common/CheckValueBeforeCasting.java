package common;

public class CheckValueBeforeCasting {
	public static void main(String[] args) {
		int i = 128;
		System.out.println(Byte.MAX_VALUE);
		System.out.println(Byte.MIN_VALUE);
		if (i>Byte.MAX_VALUE || i<Byte.MIN_VALUE) {
			System.out.println("BYTE 타입으로 변환불가");
		}else {
			byte b = (byte) i;
			System.out.println(b);
		}
		
		double maxvalue = Byte.MAX_VALUE;
		double minvalue = Byte.MIN_VALUE;
		System.out.println("Byte.MAX_VALUE = " + maxvalue);
		System.out.println("Byte.MIN_VALUE = " + minvalue);
		
		for( ; minvalue < maxvalue; minvalue++) {
			System.out.println(minvalue);
		}
	}
}
