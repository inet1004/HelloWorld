package classes;

import java.util.Scanner;

public class FriendExample {
	public static void main(String[] args) {
//		
//		Friend[] fArray=new Friend[5];
//		
//		UnivFriend[] uArray=new UnivFriend[5];
//		ComFriend[] cArray=new ComFriend[5];
//		
//		UnivFriend uf=new UnivFriend("name1","1111","Yedam","Java");
//		ComFriend cf=new ComFriend("name2","2222","YDCompany","Develop");
//		Friend f=new Friend("name30","3333");
//		Friend f1=uf;
//		Friend f2=cf;
//		
//		uf.getName(); // Friend class
//		uf.getPhone(); // Friend class
//		uf.getUniv(); // Univ
//		uf.getMajor(); //Univ
//		
//		f1.getName(); // Friend
//		f1.getPhone(); // Friend
//		
//		fArray[0]=uf;
//		fArray[1]=cf;
//		fArray[2]=f;
//		
//		for(int i=0;i<3;i++) {
//			// System.out.println(fArray[i]);
//			fArray[i].introduce();
//		}
//		
//		
//		

		Friend[] fArray = new Friend[5];
		UnivFriend[] uArray = new UnivFriend[5];
		ComFriend[] cArray = new ComFriend[5];

		Scanner scn = new Scanner(System.in);

		boolean run = true;
		while (run) {
			System.out.println("===============================");
			System.out.println("1:입력 | 2:조회 | 3:리스트 | 4:종료");
			System.out.println("===============================");
			System.out.println("선택> ");
			int selectNo = scn.nextInt();
			scn.nextLine();

			if (selectNo == 1) {
				// 계좌 생성
				System.out.println("대학:1");
				System.out.println("회사:2");
				System.out.println("기타:3");
				int cate = scn.nextInt();
				if(cate==1) {
					createFriend(1);
				}else if(cate==2) {
					createFriend(2);
				}else{
					createFriend(3);
				}
					
			} else if (selectNo == 2) {
				// 계좌 목록
				findFriend();
			} else if (selectNo == 3) {
				// 예금
				listFriend();
			} else if (selectNo == 4) {
				// 종료
				run = false;
			}
		}
		System.out.println("프로그램 종료");
	}

	// 계좌생성하기
	static void createFriend(int cate) {
		
		if(cate==1) {
			
		}
		
		System.out.println("이름: ");
		String name = scn.nextLine();
		System.out.println("연락처: ");
		String phone = scn.nextLine();

		if (UnivFriend) {
			System.out.println("학교: ");
			String univ = scn.nextLine();
			System.out.println("전공: ");
			String major = scn.nextInt();
			
			Friend acnt = new Friend(name, phone, univ, major);
			for (int i = 0; i < uArray.length; i++) {
				if (uArray[i] == null) {
					uArray[i] = acnt;
				break;
			}
		}else if (ComFriend) {
			System.out.println("회사: ");
			String company = scn.nextLine();
			System.out.println("부서: ");
			String dept = scn.nextInt();
			
			Friend acnt = new Friend(name, phone, company, dept);
			for (int i = 0; i < cArray.length; i++) {
				if (cArray[i] == null) {
					cArray[i] = acnt;
					break;
			}
			}
		}else {
			Friend acnt = new Friend(name, phone, company, dept);
			for (int i = 0; i < fArray.length; i++) {
				if (fArray[i] == null) {
					fArray[i] = acnt;
					break;
				}
			}
		}
	}

	// 계좌목록 보기
	static void findFriend() {
		for (Friend acnt : fArray) {
			if (acnt != null) {
				System.out.println(acnt);
			}
		}

	}

	// 예금하기
	static void listFriend() {
		System.out.println("이름 입력: ");
		String name = scn.nextLine();
		Account accnt = findFriendAccount(name);
		System.out.println(accnt.getName());
	}

	// Account 배열에서 ano와 동일한 Account 객체 찾기
	static friend findFriendAccount(String name) {
		Account accnt = null;
		for (Account acnt : accountArray) {
			if (acnt != null) {
				if (name.equals(acnt.getName())) {
					accnt = acnt;
					break;
				}
			}
		}

		return accnt;

	}
}
