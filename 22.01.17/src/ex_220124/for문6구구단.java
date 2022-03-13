package ex_220124;
import java.util.Scanner;

public class for문6구구단 {

	public static void main(String[] args) {

//		Scanner sc = new Scanner(System.in);
//		System.out.println("숫자를 입력하시면 숫자에 맞는 구구단이 출력됩니다");
//		System.out.print("숫자를 입력하세요 >> ");
//		int input = sc.nextInt();
//		for (int i = 1; i <= 9; i++) {
//			int output = input * i;
//			if (output < 100) {
//
//				System.out.println(input + "*" + i + "=" + input * i);
//			}
//		}

//		Scanner sc = new Scanner(System.in);
//		System.out.print("정수를 입력하세요 : ");
//		int input = sc.nextInt();
//		System.out.print(input + "의 약수는 : ");
//		
//		for (int i=1; i <= input; i++) {
//		if (input%i == 0) {
//			System.out.print(i + " ");
//		}
//		}
//		System.out.print("입니다!!");

		for (int num = 2; num <= 9; num++) {
			System.out.println("=== " + num + "단" + " ===");

			for (int i = 1; i <= 9; i++) {
				System.out.println(num + " * " + i + " = " + num * i);
			}
			System.out.println();
		}

	}

}
