package classes;

public class Friend {
	private String name;
	private String phone;
	
	public Friend (){
	}

	public Friend(String name, String phone) {
		super();
		this.name = name;
		this.phone = phone;
	}
	
	public Friend(String name, String phone, String univ, String major) {
		super();
		this.name = name;
		this.phone = phone;
		this.name = univ;
		this.phone = major;
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

	@Override
	public String toString() {
		return "Friend [name=" + name + ", phone=" + phone + "]";
	}

	public void introduce() {
		System.out.println("이름:"+name+"연락처"+phone);
	}
}
