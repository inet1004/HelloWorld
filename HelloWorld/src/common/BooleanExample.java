package common;

public class BooleanExample {
	public static void main(String[] args) {
		boolean trueOrFalse=true;
		int var1=10;
		trueOrFalse=var1>15;
		
		for(int i=0;i<10;i++) {
			trueOrFalse = var1++ > 15;
			if(trueOrFalse)
				System.out.println(var1 + "=>참 경우");
			else
				System.out.println(var1 + "=>거짓 경우");
		}
	}
}
