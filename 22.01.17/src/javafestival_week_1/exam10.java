package javafestival_week_1;

import java.util.Scanner;

public class exam10 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("A 입력 >> ");
		int A = sc.nextInt();
		System.out.print("B 입력 >> ");
		int B = sc.nextInt();

		if (A == 0 || B == 0) {
			System.out.println("종료합니다");
		} else
			System.out.println("결과 >> " + (A - B));

	}
}
