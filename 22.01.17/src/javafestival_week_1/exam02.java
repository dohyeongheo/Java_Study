package javafestival_week_1;

import java.util.Scanner;

public class exam02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("���� �ݾ� : ");
		int num = sc.nextInt();

		System.out.println("�ܵ� ��ȯ");

		int won10000 = num / 10000;
		num -= (won10000 * 10000);
		int won5000 = num / 5000;
		num -= (won5000 * 5000);
		int won1000 = num / 1000;
		num -= (won1000 * 1000);
		int won500 = num / 500;
		num -= (won500 * 500);
		int won100 = num / 100;

		System.out.println("10000�� : " + won10000 + "��");
		if (won5000 > 0) {
			System.out.println("5000�� : " + won5000 + "��");
		}
		if (won1000 > 0) {
			System.out.println("1000�� : " + won1000 + "��");
		}
		if (won500 > 0) {
			System.out.println("500�� : " + won500 + "��");
		}
		if (won100 > 0) {
			System.out.println("100�� : " + won100 + "��");
		}

	}

}
