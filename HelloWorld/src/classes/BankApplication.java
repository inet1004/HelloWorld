package classes;

import java.util.Scanner;

public class BankApplication {
	private static Account[] accountArray=new Account[100];
	private static Scanner scanner=new Scanner(System.in);
	
	public static void main(String[] args) {
		boolean run=true;
		while(run) {
			System.out.println("==========================================");
			System.out.println("1:계좌생성 | 2:계좌목록 | 3:예금 | 4:출금 | 5:종료");
			System.out.println("==========================================");
			System.out.println("선택> ");
			int selectNo=scanner.nextInt();
			
			if(selectNo==1) {
				createAccount();
			}else if(selectNo==2) {
				accountList();
			}else if(selectNo==3) {
				deposit();
			}else if(selectNo==4) {
				withdraw();
			}else if(selectNo==5) {
				run=false;
			}
		}
		System.out.println("프로그램 종료");
	}
	
	// 계좌생성하기
	private static void createAccount() {
		Account[] accAry=new Account[5];
		System.out.println("계좌번호 입력: ");
		static Scanner acc = new Scanner(System.in);
		String id = acc.nextLine();
		mem.setAno(id);

		

	}
	
	// 계좌목록 보기
	private static void accountList() {
		// TODO Auto-generated method stub

	}
	
	// 예금하기
	private static void deposit() {
		// TODO Auto-generated method stub

	}
	
	// 출금하기
	private static void withdraw() {
		// TODO Auto-generated method stub

	}
	
	
	//Account 배열에서 ano와 동일한 Account 객체 찾기
	private static void findAccount(String ano) {
		// TODO Auto-generated method stub

	}
	
	
	
}
