package javafestival_week_1;

import java.util.Scanner;

public class exam03 {

	public static void main(String[] args) {

		// 4의 배수 이면서 100의 배수가 아닐때는 윤년
		// 400의 배수일때 윤년이다.

		Scanner sc = new Scanner(System.in);
		System.out.print("년도 입력 >> ");
		int num = sc.nextInt();
		if (num % 4 == 0 && num % 100 != 0) {
			System.out.println("윤년입니다.");
		} else if (num % 400 == 0 && num % 100 != 0) {
			System.out.println("윤년입니다.");
		} else {
			System.out.println("윤년이 아닙니다.");
		}

	}

}
