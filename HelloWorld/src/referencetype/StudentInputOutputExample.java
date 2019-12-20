package referencetype;

import java.util.Scanner;

public class StudentInputOutputExample {
	public static void main(String[] args) {

		int[] studentNum = new int[5];
		int studentGet = 0;
		double avgg=0;
		int summm=0;
		int i;
		System.out.println(studentGet);
		for (i = 0; i < studentNum.length; i++) {
			Scanner scanner = new Scanner(System.in);
			studentGet = scanner.nextInt();
			if(studentGet==0) break;
			studentNum[i] = studentGet;
			System.out.println((i + 1) + "번 입력 값은 = " + studentNum[i]);
			summm += studentNum[i];
			avgg=summm/(i+1);
		}
		System.out.println("학생의 수는 " + i );
		System.out.println("학생의 총합 점수는 " + summm );
		System.out.println("학생의 평균은 " + avgg + "입니다.");
		System.out.println("프로그램 종료");

//		
//		System.out.println("메시지를 입력하세요");
//		System.out.println("프로그램을 종료하려면 q를 입력하세요");
//		
//		Scanner scanner=new Scanner(System.in);
//		String inputString;
//		
//		do {
//			System.out.println(">");
//			inputString=scanner.nextLine();
//			System.out.println(inputString);
//		} while( ! inputString.contentEquals("q"));
//		
//		System.out.println();
//		System.out.println("프로그램 종료");
	}

}
