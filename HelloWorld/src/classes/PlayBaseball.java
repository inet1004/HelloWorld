package classes;

import java.util.Scanner;

public class PlayBaseball {
	public static void main(String[] args) {
		int[] comAry = new int[3];
		for (int i = 0; i < 3; i++)
			comAry[i] = (int) (Math.random() * 9) + 1;
		Scanner scn = new Scanner(System.in);
		int[] userAry = new int[3];
		for (int i = 0; i < 3; i++) {
			System.out.println("정수를 입력하세요!");
			userAry[i] = scn.nextInt();
		}
		for (int i = 0; i < 3; i++) {
			System.out.println(userAry[i]);
		}
		int strike = 0, ball = 0;
		while (true) {
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
					if (comAry[i] == userAry[j]) {
						if (i == j)
							strike++;
						else
							ball++;
					}
				}

				System.out.println("스트라이크" + strike + ", 볼" + ball);
			}

			if (strike == 3) {
				System.out.println("3스트라이크로 종료합니다");
				break;
			}
		}
	}

}