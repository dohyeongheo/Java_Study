package ex_220120;
import java.util.Scanner;

public class Exam05IF���ǽ���Ʈ���� {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("����� ��ǰ ������ �Է��ϼ���. ");
		int num = sc.nextInt();

		int price = 10000;
		double saleprice = price * 0.9;

		boolean check1 = num >= 11;

		if (check1) {
			System.out.println("������ " + (int)num * saleprice + "�� �Դϴ�.");
		} else {
			System.out.println("������ " + num * price + "�� �Դϴ�.");
		}

	}
}
