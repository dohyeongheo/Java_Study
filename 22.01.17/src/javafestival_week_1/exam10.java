package javafestival_week_1;

import java.util.Scanner;

public class exam10 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("A �Է� >> ");
		int A = sc.nextInt();
		System.out.print("B �Է� >> ");
		int B = sc.nextInt();

		if (A == 0 || B == 0) {
			System.out.println("�����մϴ�");
		} else
			System.out.println("��� >> " + (A - B));

	}
}
