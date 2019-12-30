package classes;

import java.util.Scanner;

public class BankApplication {
	private static Account[] accountArray = new Account[100];
	private static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		boolean run = true;
		while (run) {
			System.out.println("==========================================");
			System.out.println("1:계좌생성 | 2:계좌목록 | 3:예금 | 4:출금 | 5:종료");
			System.out.println("==========================================");
			System.out.println("선택> ");
			int selectNo = scn.nextInt();
			scn.nextLine();

			if (selectNo == 1) {
				// 계좌 생성
				createAccount();
			} else if (selectNo == 2) {
				// 계좌 목록
				accountList();
			} else if (selectNo == 3) {
				// 예금
				deposit();
			} else if (selectNo == 4) {
				// 출금
				withdraw();
			} else if (selectNo == 5) {
				// 종료
				run = false;
			}
		}
		System.out.println("프로그램 종료");
	}

	// 계좌생성하기
	static void createAccount() {
		System.out.println("계좌번호 입력: ");
		String ano = scn.nextLine();
		System.out.println("사용자 입력: ");
		String owner = scn.nextLine();
		System.out.println("금액 입력: ");
		int balance = scn.nextInt();

		Account acnt = new Account(ano, owner, balance);
		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] == null) {
				accountArray[i] = acnt;
				break;
			}
		}

	}

	// 계좌목록 보기
	static void accountList() {
		for (Account acnt : accountArray) {
			if (acnt != null) {
				System.out.println(acnt);
			}
		}

	}

	// 예금하기
	static void deposit() {
		System.out.println("조회할 계좌 입력: ");
		String ano = scn.nextLine();
		System.out.println("입금할 금액 입력: ");
		int amount=scn.nextInt();
		Account accnt = findAccount(ano);
		int balance = accnt.getBalance();
		accnt.setBalance(balance + amount);
		System.out.println(accnt.getBalance());
	}

	// 출금하기
	static void withdraw() {
		System.out.println("조회할 계좌 입력: ");
		String ano = scn.nextLine();
		System.out.println("출금할 금액 입력: ");
		int amount=scn.nextInt();
		Account accnt = findAccount(ano);
		int balance = accnt.getBalance();
		if(balance<amount) {
			System.out.println("잔액이 부족, 종료합니다.");
			return;
		}
		accnt.setBalance(balance - amount);
		System.out.println(accnt.getBalance());
	}

	// Account 배열에서 ano와 동일한 Account 객체 찾기
	static Account findAccount(String ano) {
		Account accnt = null;
		for (Account acnt : accountArray) {
			if (acnt != null) {
				if (ano.equals(acnt.getAno())) {
					accnt = acnt;
					break;
				}
			}
		}

		return accnt;

	}

}
