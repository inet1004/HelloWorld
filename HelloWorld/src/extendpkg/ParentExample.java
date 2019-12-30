package extendpkg;

public class ParentExample {
	public static void main(String[] args) {
		Parent parent = new Child();
		parent.method1();
		parent.method2();
		// parent.method3(); //부모긑래스에 정의 없어 사용불가
		Child child = (Child) parent;
		child.field2 = "data2";
		child.method3();

//		Parent parent2=new Child();
//		if(parent instanceof Child) {
//			Child child=(Child) parent;
//			child.field2="data2";
//			child.method3();
//		}

		Parent parent2 = new Parent();
		if (parent2 instanceof Child) {
			Child child2 = (Child) parent2;
			child.method3();
		} else {
			System.out.println("형변환 불가");
		}
		
		Object obj=new Parent();
	}
}
