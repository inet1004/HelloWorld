package extendpkg;

public class Child extends Parent{
	String field2;

	@Override
	void method1() {
		System.out.println("자식 클 메소드1");
	}

	@Override
	void method2() {
		System.out.println("자식 클 메소드2");
	}
	
	void method3() {
		System.out.println("자식 클 메소드3");
	}
}
