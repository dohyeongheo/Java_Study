package ex_220120;
import java.util.Scanner;

public class Exam09스위치실습홀짝판별 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("정수 입력 : ");
		int num1 = sc.nextInt();

		switch (num1 % 2) {
		case 0:
			System.out.println("짝수입니다!");
		case 1:
			System.out.println("홀수입니다!");
		}

	}

}
