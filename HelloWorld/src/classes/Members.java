package classes;

public class Members {

	private String name;
	private String phone;
	private String etc;
	
	public Members (){
	}

	public Members(String name, String phone) {
		super();
		this.name = name;
		this.phone = phone;
	}
	
	public Members(String name, String phone, String etc) {
		super();
		this.name = name;
		this.phone = phone;
		this.etc = etc;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}


	public String getEtc() {
		return etc;
	}

	public void setEtc(String etc) {
		this.etc = etc;
	}
	
	@Override
	public String toString() {
		return "Members [name=" + name + ", phone=" + phone + ", etc=" + etc +"]";
	}

	public void introduce() {
		System.out.println("이름:"+name+"연락처"+phone+"기타"+ etc);
	}

}
