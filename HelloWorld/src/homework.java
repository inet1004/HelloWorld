package Operators;

class Student {
	byte byteValue = 10;
	char charValue = 'A';
	
	int intBalue = byteValue;
	int intValut=charValue;
	short shortValue=charValue;
	double doubleValue=byteValue;
	
	
	int intValue=10;
	char charValue='A';
	double doubleValue=5.7;
	String strValue ='A';
	
	double var=(double) intValue;
	byte ver =(bite) intValue;
	int var=(int) doubleValue;
	char var= (char) strValue;
	
	int var1=10;
	long var2=000000000000L;
	char var3=";//작은 따옴표 두개 붙어있음"
	double var4=10;
	float var5=10;
	
}








public class StringEqualsExample {
	public static void main(String[] args) {
		String str1 = "신민철";
		int num1 = 10;
		String str2 = "신민철";
		String str3 = new String("신민철");
		
		
		
		System.out.println(str1==str2);
		System.out.println(str2==str3);
		
		System.out.println(str1.equals(str2));
		System.out.println(str1.equals(str3));
		
		if(str1.contentEquals(str3)) {
			System.out.println("같은내용");
		} else {
			System.out.println("다른내용");
		}
		
		int var1 = 10;
		int var2 = 20;
		int var3 = 30;
		
		if (++var1 > 15 && ++var2 > 30) {
			System.out.println(var1 + ", " + var2);
		}
		System.out.println(var1 + ", " + var2);
		
		int score = 55;
		char grade;
		// char grade = (score > 90) ? 'A' : ((score >80) ? 'B' : 'C');
		grade = ((score > 90) ? 'A' : 'Z');
		if (grade=='Z' && score > 60) {
			grade = ((score > 80) ? 'B' : ((score > 70) ? 'C' : 'D'));
		} else {
			grade = 'F';
		}
		System.out.println(grade);
		}
}