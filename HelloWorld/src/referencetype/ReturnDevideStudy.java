package referencetype;

public class ReturnDevideStudy {
	public static void main(String[] args) {
		double s1= devideBy(5,3);
		System.out.println("s1 = " + s1);
		
		String result=resultPrint("이창호");
		System.out.println(result);
		
		double aha=calculator(5,6,"/");
		System.out.println(aha);
		
		
	}
	
	public static double devideBy(int a, int b) {
		double result=0;
		result = (double)a/b;
		return result;
	}
	
	public static String resultPrint(String name) {
		String str="반갑습니다 " + name +"씨.";
		return str;
	}
	
	public static double calculator(double a, double b, String cal) {
		double result=0;
		if(cal.equals("/")) result=a/b;
		return result;
	}
	
	
	
	
}
