package ex_220120;
import java.util.Scanner;

public class Exam03IF문실습홀짝판별 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int num = sc.nextInt();

		if (num % 2 == 0) {
			System.out.println(num + "는(은) 짝수입니다.");
		} else if (num % 2 > 0) {
			System.out.println(num + "는(은) 홀수입니다.");
		}

	}

}
