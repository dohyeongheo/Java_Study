package javafestival_week_1;

import java.util.Scanner;

public class exam08 {

	public static void main(String[] args) {

//	1보다 큰 정수(n)를 입력하여 n!값을 구하시오
		// 팩토리얼 이란 n의 수보다 작거나 같은 모든 양의 정수의 곱

		Scanner sc = new Scanner(System.in); // 입력 값을 받기 위해서 스캐너 불러오기

		int num; // 스캐너로 입력받을 값을 저장할 변수
		int num1 = 1; // 입력값 팩토리얼을 저장할 변수

		System.out.print("입력 : ");
		num = sc.nextInt();

		for (int i = 1; i <= num; i++) { // 입력값보다 작거나 같은 양의 정수까지 범위 지정
				num1 *= i; // ex)1 * 2 * 3 * 4 ... 팩토리얼 값을 num1에 저장 
		}
		System.out.println("출력 : " + num1); // num1 값을 출력
	}

}
