package ex_220120;
import java.util.Scanner;

public class Exam03IF���ǽ�Ȧ¦�Ǻ� {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է��ϼ��� : ");
		int num = sc.nextInt();

		if (num % 2 == 0) {
			System.out.println(num + "��(��) ¦���Դϴ�.");
		} else if (num % 2 > 0) {
			System.out.println(num + "��(��) Ȧ���Դϴ�.");
		}

	}

}
