package javafestival_week_1;

import java.util.Scanner;

public class exam03 {

	public static void main(String[] args) {

		// 4�� ��� �̸鼭 100�� ����� �ƴҶ��� ����
		// 400�� ����϶� �����̴�.

		Scanner sc = new Scanner(System.in);
		System.out.print("�⵵ �Է� >> ");
		int num = sc.nextInt();
		if (num % 4 == 0 && num % 100 != 0) {
			System.out.println("�����Դϴ�.");
		} else if (num % 400 == 0 && num % 100 != 0) {
			System.out.println("�����Դϴ�.");
		} else {
			System.out.println("������ �ƴմϴ�.");
		}

	}

}
