package classes;

public class PersonExample {
	String name;
	int age;
	String hair;
	
	PersonExample(){
	}
	
	PersonExample(String name, int ager){
		this.name=name;
		this.age=age;
	}
	
	PersonExample(String name, int age, String hair){
		this.name=name;
		this.age=age;
		this.hair=hair;
	}
	
	// 메쏘드
	void introduce() {
		System.out.println("이름:"+ name + ", 나이:" + age + ", 머리색:" + hair);
	}
	
}
