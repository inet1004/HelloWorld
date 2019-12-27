package classes;

class Calculators{
	static double PI=3.142592654;
	String color;
	void setColor(String color) {
		this.color=color;
	}
	static int plus(int x, int y) {
		return x+y;
	}
	static int minus(int a, int b) {
		return a-b;
	}
}

public class CalculatorsExample {
	public static void main(String[] args) {
		Calculators cal=new Calculators();
		cal.color="white";
		cal.plus(4,5);
		cal.setColor("Black"); // 인스턴스 매소드는 인스턴스 선언후 사용가능
		
		Calculators.plus(6, 7); // static  정적 메소드는 클래스명,메소드 로 사용가능
		
		
	}
}
