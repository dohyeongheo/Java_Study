package javafestival_week_1;

import java.util.Scanner;

public class exam01 {

	public static void main(String[] args) {
// 반올림의 조건
//		1,2,3,4 = 일의자리 버림
//      5,6,7,8,9 = 일의자리 버리고, 십의자리 1증가

		Scanner sc = new Scanner(System.in);
		System.out.print("반올림 전 값 : ");
		int input = sc.nextInt();
		int num = input % 10;
		
		
		int num1 = input / 10 *10;
		int num2 = ((input / 10 * 10) + 10);

		if (num < 5) {
			System.out.println("반올림 후 값 : " + num1);
		} else if (num >= 5) {
			System.out.println("반올림 후 값 : " + num2);
		}

//	

	}

}
