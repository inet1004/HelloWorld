package classes;

import java.util.Scanner;

public class FriendExample {

	static Scanner scn = new Scanner(System.in);
	static Friend[] fArray = new Friend[5];

	public static void main(String[] args) {
		boolean run = true;
		while (run) {
			
			mainMenu();
			int selectNo = scn.nextInt();
			if (selectNo == 1) {
				addFriend();
			} else if (selectNo == 2) {
				searchFriend();
			} else if (selectNo == 3) {
				listFriend();
			} else if (selectNo == 4) {
				run = false;
			}
		}
		System.out.println("프로그램 종료");
	}

	
	

	public static void addFriend() {

		Friend friend = null;
		
		subMenu();
		int selectNo = scn.nextInt();
		scn.nextLine();
		if (selectNo == 1) {
			friend = createFriend();
		} else if (selectNo == 2) {
			friend = createUnivFriend();
		} else if (selectNo == 3) {
			friend = createComFriend();
		}
		for (int i = 0; i < fArray.length; i++) {
			if (fArray[i] == null) {
				fArray[i] = friend;
				break;
			}
		}
	}
	
	
	public static void mainMenu() {
		System.out.println("===================================");
		System.out.println("1.등록 2.조회 3.리스트 4.종료");
		System.out.println("===================================");
		System.out.print("선택>");
	}
	
	
	public static void subMenu() {
		System.out.print("일반:1, ");
		System.out.print("대학:2, ");
		System.out.print("회사:3");
		System.out.print("선택>");
	}
	

	public static Friend createFriend() {
		System.out.print("이름입력:");
		String na = scn.nextLine();
		System.out.print("전화번호입력:");
		String ph = scn.nextLine();

		Friend friend = new Friend(na, ph);
		return friend;
	}

	public static Friend createComFriend() {
		System.out.print("이름입력:");
		String na = scn.nextLine();
		System.out.print("전화번호입력:");
		String ph = scn.nextLine();
		System.out.print("회사입력:");
		String company = scn.nextLine();
		System.out.print("부서입력:");
		String dept = scn.nextLine();

		Friend friend = new ComFriend(na, ph, company, dept);
		return friend;
	}

	public static Friend createUnivFriend() {
		System.out.print("이름입력:");
		String na = scn.nextLine();
		System.out.print("전화번호입력:");
		String ph = scn.nextLine();
		System.out.print("학교입력:");
		String company = scn.nextLine();
		System.out.print("전공입력:");
		String dept = scn.nextLine();

		Friend friend = new UnivFriend(na, ph, company, dept);
		return friend;
	}
	
	public static void listFriend() {
		for (Friend frnd : fArray) {
			if (frnd != null) {
				System.out.println(frnd);
			}
		}
	}

	public static void searchFriend() {

	    Scanner scan = new Scanner(System.in); // 왜 이렇게 따로 다시 정의해 주어야 하나???
	    
		System.out.print("조회할 이름 입력:");
		String name = scan.nextLine();
		for (Friend fnd : fArray) {
			if (fnd != null && fnd.getName().equals(name)) {
				System.out.println(fnd);
			}
		}

	}
}
