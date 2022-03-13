package javafestival_week_1;

import java.util.Scanner;

public class exam11 {

	public static void main(String[] args) {

		// 정수 n을 입력받아 1,2,4,7,11과 같은 수열의 n번째 항까지 출력하시오
		// 수열의 규칙 n n+1 n+2 n+3 n+4 ....

		Scanner sc = new Scanner(System.in);
		System.out.print("n 입력 : ");
		int n = sc.nextInt();
		int result = 1;

		for (int i = 0; i <= n-1; i++) {
			result += i;
			System.out.print(result + " ");
			
			
		}

	}

}
