package classes;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		System.out.println("성적을 입력하세요:");
		Scanner scn = new Scanner(System.in);
		int inputNo = scn.nextInt();
		if ((inputNo < 0) || (inputNo > 100)) {
			System.out.println("입력 오류");
		} else {
			System.out.println(inputNo);
		}

		String name;
		int kor, eng, mat;
		System.out.println("입력하세요:");
		Scanner scn7 = new Scanner(System.in);
		name = scn7.nextLine();
		Scanner scn1 = new Scanner(System.in);
		kor = scn1.nextInt();
		Scanner scn2 = new Scanner(System.in);
		eng = scn2.nextInt();
		Scanner scn3 = new Scanner(System.in);
		mat = scn3.nextInt();
		int sum = kor + eng + mat;
		double avg = sum / 3;
		double per = Double.parseDouble(String.format("%.2f", avg));
		System.out.println(name);
		System.out.println(sum);
		System.out.println(per);

		for (int i = 1; i <= 100; i++) {
			if ((i % 3 == 0) && (i % 7 == 0)) {
				System.out.print(i + " ");
			}
		}

	}
}
