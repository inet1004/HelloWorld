package classes;

public class CarExample {
	public static void main(String[] args) {
		//객체생성
		Car myCar=new Car();
		
		//필드값 읽기
		System.out.println(myCar);
		
//		System.out.println("제작회사"+ myCar.company);
		System.out.println("모델명"+ myCar.model);
		System.out.println("색깔"+ myCar.color);
		System.out.println("최고속도"+ myCar.maxSpeed);
		System.out.println("현재속도"+ myCar.speed);
		
//		car.company="현대"; public 경우
		Car.setCompany("현대");
		
		Car.r=-10
		double result = Car.getArea();
		System.out.println(result);
		
		//필드값 변경
		myCar.speed=60;
		System.out.println("수정된 속도"+myCar.speed);
	}
}
