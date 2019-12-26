package classes;

public class Car {
	// 필드
	private String company="현대자동차";
	public String model="그랜져";
	public String color="검정";
	public int maxSpeed=350;
	public int speed;
	private int r;
	
	
	Car(){
	}
	
	Car(String company){
		this.company=company;
	}

	Car(String company,String model,String color,int maxSpeed,int speed){
		
	}
	
	void setCompany(String company) {
		this.company=company;
	}
	
	void setR(int r) {
		if(r>0)	this.r=r;
	}
	double gerArea(int r) {
		double result=0;
		if(this.r>0) { result =3.14*r;
		return result;
		}else {
			return 0;
		}
	
	}	
}
