package ex_220121;
import java.util.Scanner;

public class Exam03while�ǽ������Է� {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String text = "���ڸ� �Է��ϼ���";

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

		System.out.println("�հ� : " + sum);
		System.out.println("��� : " + sum / (double)count);

	}

}
