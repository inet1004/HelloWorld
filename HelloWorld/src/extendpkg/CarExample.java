package extendpkg;

public class CarExample {
	public static void main(String[] args) {
		Car car = new Car();

		for (int i = 0; i < 5; i++) {
			int problemLocation = car.run();
			switch(problemLocation) {
			case 1:
				System.out.println("앞왼 펑크 교체");
				car.tires[0]=new HankookTire("앞왼",10);
				break;
			case 2:
				System.out.println("앞오 펑크 교체");
				car.tires[1]=new KumhoTire("앞오",11);
				break;
			case 3:
				System.out.println("앞왼 펑크 교체");
				car.tires[2]=new HankookTire("뒤왼",13);
				break;
			case 4:
				System.out.println("앞오 펑크 교체");
				car.tires[3]=new KumhoTire("뒤오",12);
				break;
			}
			System.out.println("-------------------------------");
		}
	}
}
