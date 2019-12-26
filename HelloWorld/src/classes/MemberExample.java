package classes;

import java.util.Scanner; // Scanner 필수

public class MemberExample {
	static Member[] memberAry = new Member[3];
	static Scanner sc = new Scanner(System.in);

	public  void main(String[] args) {
		
		execute();
	}

	
	public  void execute() {
		
		int cnt = 0, menu = 1;
		while (true) {
			System.out.println("==========================");
			System.out.println("1:생성 2:조회 3:리스트 4:종료");
			System.out.println("==========================");
			System.out.println("선택>");
			menu = sc.nextInt();
			sc.nextLine();
			if (menu == 1) {
				createMember();
			} else if (menu == 2) {
				searchMember();
			} else if (menu == 3) {
				listMember();
			} else if (menu == 4) {
				break;
			}

			// createMember();
			// Member[] memberAry=new Member[5]; 여기서는 메모리 사라지면 안되므로 여기서는 사용불가
			cnt++;
			if (cnt == 3) {
				break;
			}
		}
		System.out.println("프로그램 종료");
	}
	
	public  void createMember() {
		Member mem = new Member();
//		System.out.println("이름을 입력: ");
//		String name = sc.nextLine();
//		mem.setName(name);
		System.out.println("아이디를 입력: ");
		String id = sc.nextLine();
		mem.setId(id);
		System.out.println("비번을 입력: ");
		String password = sc.nextLine();
		mem.setPassword(password);
//		System.out.println("나이를 입력: ");
//		String age=sc.nextLine();
//		mem.setAge(age);

		for (int i = 0; i < memberAry.length; i++) {
			if (memberAry[i] == null) {
				memberAry[i] = mem;
				break;
			}

		}

	}

	public  void listMember() {
		for (Member m : memberAry) {
			if (m != null)
				System.out.println(m);
//		Class에서 아래3줄을 선언해 주어야 주소값을 가져오지 않고 실제값을 가져옴 
//		@Override
//		public String toString() {
//			return "Member [name=" + name + ", id=" + id + ", password=" + password + ", age=" + age + "]";
		}
	}

	public  void searchMember() {
		System.out.println("id입력하세요.");
		String inputId = sc.nextLine();
		System.out.println("pw입력하세요.");
		String inputPw = sc.nextLine();
		for (Member mem : memberAry) {
			if (mem != null) {
				if ((inputId.equals(mem.getId())) 
						&& (inputPw.equals(mem.getPassword()))) {
					System.out.println(mem);
				} else if ((inputId.equals(mem.getId())) 
						&& (!inputPw.equals(mem.getPassword()))) {
					System.out.println("비번 틀림!");
				} else if ((!inputId.equals(mem.getId())) 
						&& (inputPw.equals(mem.getPassword()))) {
					System.out.println("아이디 틀림!");
				} else if ((!inputId.equals(mem.getId())) 
						&& (!inputPw.equals(mem.getPassword()))) {
					System.out.println("다틀림");
				
//				} else if ((inputId.equals(mem.getId())) 
//						&& (inputPw != mem.getPassword())) {
//					System.out.println("비번 틀림!");
//				} else if ((inputId != mem.getId()) 
//						&& (inputPw.equals(mem.getPassword()))) {
//					System.out.println("아이디 틀림!");
//				} else {
//					System.out.println("다틀림");
				}
			}

		}

	}
}
