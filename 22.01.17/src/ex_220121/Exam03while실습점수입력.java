package ex_220121;
import java.util.Scanner;

public class Exam03while실습점수입력 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String text = "숫자를 입력하세요";

		int sum = 0;
		int count = 0;

		while (true) {
			System.out.println(text);
			int num = sc.nextInt();

			if (num < 0 || num > 100) {
				break;
			}
			sum += num;
			count++;
		}

		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + sum / (double)count);

	}

}
