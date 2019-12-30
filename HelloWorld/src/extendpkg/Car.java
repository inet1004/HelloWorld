package extendpkg;

public class Car {
	
//	Tire frontLeft=new Tire("앞왼",6);
//	Tire frontRight=new Tire("앞오",3);
//	Tire backLeft=new Tire("뒤왼",3);
//	Tire backRight=new Tire("뒤오",4);
	
	Tire[] tires= {new Tire("앞왼",6), new Tire("앞오",3), 
				   new Tire("뒤왼",3), new Tire("뒤오",4)};
	
	void stop() {
		System.out.println("자동차 멈춤");
	}
	
	int run() {
		System.out.println("자동차 달림");
		if(tires[0].roll()==false) {
			stop();
			return 1; //앞왼
		}
		System.out.println("자동차 달림");
		for(int i=0;i<tires.length;i++) {
			if (tires[i].roll()==false) {
				stop();
				return i+1;
			}
		}
//		if(tires[1].roll()==false) {
//			stop();
//			return 2; //앞오
//			
//		}
//		if(tires[2].roll()==false) {
//			stop();
//			return 3; //
//			
//		}
//		if(tires[3].roll()==false) {
//			stop();
//			return 4; //
//		}
		return 0;
	}
	
}
