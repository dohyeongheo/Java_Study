package javafestival_week_1;

import java.util.Scanner;

public class exam12 {

	public static void main(String[] args) {

		// �� ������ �Է¹޾� ������ ���� �ﰢ���� ����Ͻÿ�
		// �� ���� : 7
		// ******* 7
		// ******6
		// *****5
		// ****4
		// ***3
		// **2
		// *1

		Scanner sc = new Scanner(System.in);
		System.out.print("�� ���� : ");
		int count = sc.nextInt();

		for (int i = 1; i <= count; i++) {

			for (int c = count; c >= 1; c--) {
				System.out.print("*");
			}

			System.out.println();
		}

	}

}
