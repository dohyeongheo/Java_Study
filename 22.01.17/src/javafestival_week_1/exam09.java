package javafestival_week_1;

import java.util.Scanner;

public class exam09 {

	public static void main(String[] args) {

		// 소인수 분해를 해주는 프로그램을 작성하시오
		// 소인수분해 할 수를 입력하세요. : 20
		// 20 = 2*2*5
		// 소인수 분해란 : 서로 곱해서 n의 값이 나오는 수들을 구하는 것
//		num1 * num2 * num3 = num4

		Scanner sc = new Scanner(System.in);
		System.out.print("소인수분해 할 수를 입력하세요 : ");
		int insert_num = sc.nextInt();

		System.out.print(insert_num + " = ");
//		20 = 2 2 5
//		24 = 2 2 2 3

//		for (int i = 2; i <= insert_num; i++) {
//			for (int j = 1; j <= i; j++) {
//
//			}
//			while (insert_num % i == 0) {
//				System.out.print(i);
//				insert_num /= i;
//			}
//		}
//		if (insert_num != 1) {
//			System.out.print(insert_num);
//		}

		int i = 2;
		while (true) {
			if (insert_num == 1)
				break;
			if (insert_num % i == 0) {
				System.out.print(i + "*");
				
				insert_num /= i;
			} else
				i++;

		}

	}

}
