package javafestival_week_1;

import java.util.Scanner;

public class exam12 {

	public static void main(String[] args) {

		// 행 개수를 입력받아 다음과 같이 삼각형을 출력하시오
		// 행 개수 : 7
		// ******* 7
		// ******6
		// *****5
		// ****4
		// ***3
		// **2
		// *1

		Scanner sc = new Scanner(System.in);
		System.out.print("행 개수 : ");
		int count = sc.nextInt();

		for (int i = 1; i <= count; i++) {

			for (int c = count; c >= 1; c--) {
				System.out.print("*");
			}

			System.out.println();
		}

	}

}
