package classes;

import java.util.Scanner;

public class SwimMembers {

	static Scanner scn = new Scanner(System.in);
	static Members[] mArray = new Members[100];

	public static void main(String[] args) {
		boolean run = true;
		while (run) {
			mainMenu();
			int selectNo = scn.nextInt();
			scn.nextLine(); // Int 다음에 꼭 필요함
			if (selectNo == 1) {
				addMembers();
			} else if (selectNo == 2) {
				alterMembers();
			} else if (selectNo == 3) {
				delMembers();
			} else if (selectNo == 4) {
				listMembers();
			}else if (selectNo == 5) {
				run = false;
			} 
		}
		System.out.println("프로그램 종료");
	}
	
	
	public static void mainMenu() {
		System.out.println("===================================");
		System.out.println("1.등록 2.수정 3.삭제  4.리스트 5.종료");
		System.out.println("===================================");
		System.out.print("선택>");
	}
	

	public static void addMembers() {

		System.out.print("이름입력:");
		String name = scn.nextLine();
		System.out.print("전화번호입력:");
		String phone = scn.nextLine();
		System.out.print("아이디입력:");
		String etc = scn.nextLine();

		Members members = new Members(name, phone, etc);

		for (int i = 0; i < mArray.length; i++) {
			if (mArray[i] == null) {
				mArray[i] = members;
				break;
			}
		}
	}
	
	
	public static void alterMembers() {
		System.out.print("변경할 ID 입력:");
		String etc = scn.nextLine();
		for (Members mbrs : mArray) {
			if (mbrs != null && mbrs.getName().equals(etc)) {
				System.out.println(mbrs);
				String aaa=scn.nextLine();
				System.out.println(aaa);
				mbrs.setName(aaa);
			}
		}
	}
	private static void setName(String etc) {
		setName(etc);
	}


	public static void delMembers() {
		System.out.print("삭제할 ID 입력:");
		String etc = scn.nextLine();
		for (Members mbrs : mArray) {
			if ((mbrs != null) && mbrs.getName().equals(etc)) {
				mbrs=null;
			}
		}
	
	}	


	public static void listMembers() {
		for (Members mbrs : mArray) {
			if (mbrs != null) {
				System.out.println(mbrs);
			}
		}
	}
	

}







//
//
//
//
//package test;
//
//import java.util.ArrayList;
//import java.util.Scanner;
//
//
///*
// * PoolManager를 실행하기 위해선 싱글톤화 되어 있기 때문에
// * PoolManager.getInstance().execute();
// * 를 이용하여 실행
// */
//public class Test7
//{
//	private Scanner scan;
//	private ArrayList<Member> memberList;
//	private static boolean isRunning = false;
//	
//	/*
//	 * 싱글톤 부분
//	 * 여러 쓰레드에서 동시에 실행하려고 할때 접근을 막기위해 isRunning을 추가하여 excute중일땐 null을 반환
//	 */
//	private static Test7 instance;
//	public static Test7 getInstance()
//	{
//		if( isRunning )
//		{
//			System.out.println("이미 인스턴스가 싫행중 입니다");
//			return null;
//		}
//		
//		if( instance == null )
//		{
//			instance = new Test7();
//		}
//		return instance;
//	}
//	
//	/*
//	 * 싱글톤이외의 방법으로 클래스 인스턴스화를 막기위해 생성자를 private로 막아둠
//	 */
//	private Test7() {}
//	
//	/*
//	 * 전역 변수들 초기화하는 함수
//	 */
//	private void init()
//	{
//		isRunning = true;
//		scan = new Scanner(System.in);
//		memberList = new ArrayList<Member>();
//		
//	}
//	
//	/*
//	 * 실행 부분
//	 */
//	public void execute()
//	{
//		System.out.println("@@@@@7번문제 프로그램을 시작합니다@@@@@");
//		init();
//		
//		while(true)
//		{
//			switch( intro() )
//			{
//			case 1:
//				addMember();
//				break;
//			case 2:
//				modifyMember();
//				break;
//			case 3:
//				deleteMember();
//				break;
//			case 4:
//				showMembers();
//				break;
//			case 5:
//				isRunning = false;
//				System.out.println("프로그램 종료");
//				return;		
//			}
//			
///*
// * switch가 아닌 if else문 방식도 가능
// */
////			int select = 0;
////			select = intro();
//			
////			if( select == 1 )
////			{
////				addMember();
////			}else if( select == 2)
////			{
////				modifyMember();
////			}else if( select == 3)
////			{
////				deleteMember();
////			}else if( select == 4)
////			{
////				showMembers();
////			}else if( select == 5)
////			{
////				break;
////			}
//			
//			
//		}
//		
//	}
//	
//	private int intro()
//	{
//		int select = 0;
//		System.out.println("---------------------------");
//		System.out.print("1.추가, 2.수정, 3.삭제, 4.리스트, 5.종료 > ");
//		select = scan.nextInt();
//		scan.nextLine();
//		System.out.println("---------------------------");
//		return select;
//	}
//	
//	
//	/*
//	 * member를 추가하나 동일 ID가 존재할 경우 추가하지 않습니다
//	 */
//	private void addMember()
//	{
//		System.out.println("사용자를 추가합니다");
//		System.out.print( "ID 입력 > ");
//		String memberId = scan.nextLine();
//		Member tempMember = findMember(memberId);
//		
//		if( tempMember != null )
//		{
//			System.out.println("해당 ID가 이미 존재합니다");
//			return;
//		}
//		
//		
//		System.out.print( "이름 입력 > ");
//		String name = scan.nextLine();
//		
//		System.out.print( "전화번호 입력 > ");
//		String phone = scan.nextLine();
//		
//		Member member = new Member(memberId, name, phone);
//		
//		memberList.add( member );
//		
//	}
//	
//	
//	/*
//	 * 해당 ID가 존재할경우 ID를 제외한 이름과 전화번호를 수정하나 ID가 없을경우 함수를 return 시킵니다
//	 */
//	private void modifyMember()
//	{
//		System.out.println("사용자를 수정합니다");
//		System.out.print( "ID 입력 > ");
//		String memberId = scan.nextLine();
//		Member member = findMember(memberId);
//		
//		if( member == null )
//		{
//			System.out.println("해당 ID가 존재하지 않습니다");
//			return;
//		}
//		
//		System.out.print( "이름 입력 > ");
//		String name = scan.nextLine();
//		
//		System.out.print( "전화번호 입력 > ");
//		String phone = scan.nextLine();
//		
//		member.setName( name );
//		member.setPhone( phone );
//	}
//	
//	/*
//	 * 해당 ID가 존재할 경우 삭제합니다
//	 */
//	private void deleteMember()
//	{
//		System.out.print("삭제할 ID 입력 > ");
//		String id = scan.nextLine();
//		
//		Member member = findMember(id);
//		
//		if( member != null)
//		{
//			memberList.remove( member );
//		}else {
//			System.out.println("해당 ID가 존재하지 않습니다");
//		}
//		
//		
//	}
//	
//	/*
//	 * 전체 리스트를 보여줍니다
//	 */
//	private void showMembers()
//	{
//		
//		System.out.println("리스트를 보여줍니다.");
//		
//		//Member클래스의 toString을 재정의
//		for(Member member : memberList )
//		{
//			System.out.println( member );
//		}
//	}
//	
//	/*
//	 * ID를 입력 받아 List에서 해당 ID와 맞는 인스턴스를 반환하는 함수
//	 * 위의 add, modify, delete 등에서 사용하기 위해 제작
//	 * 해당 사용자가 없을 경우 null을 반환
//	 */
//	private Member findMember(String id)
//	{
//		Member member = null;
//		Member temp = null;
//		for( int i = 0 ; i < memberList.size(); ++i)
//		{
//			temp = memberList.get( i );
//			if( temp.getMemberId().equals( id ))
//			{
//				member = temp;
//				break;
//			}
//		}
//		
//		return member;
//	}
//	
//	
//	
//}

