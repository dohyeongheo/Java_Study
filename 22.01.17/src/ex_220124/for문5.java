package ex_220124;
import java.util.Scanner;

public class for문5 {

	public static void main(String[] args) {
// 사용자에게 한 개의 자연수를 입력받아서
		// 입력받은 수의 배수를 차례로 10개를 출력하는 프로그램 작성
		// 5를 입력받으면
		// 5 10 15 20 .... 50

		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 >> ");
		int input = sc.nextInt();
		for (int i = 1; i <= 10; i++) {
			System.out.println(input * i);
		}

	}

}
