package classes;

public class Student {
	// 필드
	String university;
	String studentNo;
	String studentName;
	String major;
	int age;
	// 생성자
	Student(){
		
	}
	
	Student(String university, String studentNo, String studentName ){
		this.university=university;
		this.studentNo=studentNo;
		this.studentName=studentName;
	}

	
	// 메쏘드
	void introduce() {
		System.out.println("학번:"+ studentNo+", 이름:" + studentName +", 학교:" + university +" .");
	}
	void study() {
		System.out.println("공부한다.");
	}
	void basketBall() {
		System.out.println(studentName + "가 농구한다.");
	}
	void sleep() {
		System.out.println("잠을 잔다.");
	}
	void major() {
		System.out.println("전공");
	}
}
