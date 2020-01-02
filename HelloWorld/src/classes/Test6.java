package classes;

public class Test6 {
	int a, b;
	double c, d;
	char e, f;

	Test6(int a, int b) {
		if(a>b) {
			System.out.println("max="+a);
		}else System.out.println("max="+b);
	}

	Test6(double c, double d) {
		if(c>d) {
			System.out.println("max="+c);
		}else System.out.println("max="+d);
	}

	Test6(char e, char f) {
		char e1=e;
		char f1=f;
		if(e1>f1) {
			System.out.println("max="+e1);
		}else System.out.println("max="+f1);
	}
}
