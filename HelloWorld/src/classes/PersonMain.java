package classes;

import java.util.Scanner;

public class PersonMain {
	public static void main(String[] args) {

//		PersonExample Person1= new PersonExample();
//		Person1.name="박석규";
//		Person1.age=100;
//		Person1.hair="블론드";
//		
//		
//		PersonExample Person2= new PersonExample();
//		Person2.name="홍길동";
//		Person2.age=200;
//		Person2.hair="블랙";

//		PersonExample Person3= new PersonExample();

		PersonExample p1 = new PersonExample("이태백", 300, "실버컬러");
		PersonExample p2 = new PersonExample("홍길동", 300, "블랙");
		PersonExample p3 = new PersonExample("황진이", 300, "그래이");

		PersonExample[] personAry = new PersonExample[3];
		personAry[0] = p1;
		personAry[1] = p2;
		personAry[2] = p3;

		for (int i = 0; i < 3; i++) {
			personAry[i].introduce();
		}

		System.out.println("======================");

		for (PersonExample p : personAry) {
			p.introduce();
		}

		System.out.println("======================");

//		for (int i = 0; i < 10; i++) {
//			System.out.println("person 선택:1,2,3 =? ");
//			Scanner scanner = new Scanner(System.in);
//			int studentGet = scanner.nextInt();
//			if (studentGet == 0) {
//				System.out.println("종료");
//				break;
//			}
//			int m = studentGet;
//			m -= m;
//			personAry[i].introduce();
//		}
		
		for (int i = 0; i < 10; i++) {
			System.out.println("검색하실 person ? ");
			Scanner scanner = new Scanner(System.in);
			String studentGet = scanner.nextLine();
			
			if(studentGet.equals(personAry[0].name)){
				personAry[0].introduce();
			}else if(studentGet.equals(personAry[1].name)){
				personAry[1].introduce();
			}else if(studentGet.equals(personAry[2].name)){
				personAry[2].introduce();
			}else {
				System.out.println("없네요~ 종료합니다.");
				break;
			}
	
//			if (studentGet == "q") {
//				System.out.println("종료");
//				break;
//			}
		
		}
		
		
	}
}
