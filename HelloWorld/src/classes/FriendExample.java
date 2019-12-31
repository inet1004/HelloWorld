package classes;

import java.util.Scanner;

public class FriendExample {

	static Scanner scn = new Scanner(System.in);

	static Friend[] fArray = new Friend[5];

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

		boolean run = true;
		while (run) {
			System.out.println("===============================");
			System.out.println("1:입력 | 2:조회 | 3:리스트 | 4:종료");
			System.out.println("===============================");
			System.out.println("선택> ");
			int selectNo = scn.nextInt();

			if (selectNo == 1) {
				// 계좌 생성
				System.out.println("기타:1");
				System.out.println("대학:2");
				System.out.println("회사:3");
				int cate = scn.nextInt();
				if (cate == 1) {
					createFriend(1);
				} else if (cate == 2) {
					createFriend(2);
				} else {
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
		for(Friend fList:fArray) {
			if (fList!=null) {
				System.out.println(fList);
			}
		}
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
