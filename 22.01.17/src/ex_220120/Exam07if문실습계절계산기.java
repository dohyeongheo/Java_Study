package ex_220120;
import java.util.Scanner;

public class Exam07if���ǽ��������� {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("�� �Է� : ");
		int num1 = sc.nextInt();

		boolean check1 = num1 == 12 || num1 == 1 || num1 == 2;
		boolean check2 = 3 <= num1 && num1 <= 5;
		boolean check3 = 6 <= num1 && num1 <= 8;
		boolean check4 = 9 <= num1 && num1 <= 11;
		boolean check5 = num1 > 12;

		if (check1) {
			System.out.println(num1 + "���� �ܿ��Դϴ�!");
		} else if (check2) {
			System.out.println(num1 + "���� ���Դϴ�!");
		} else if (check3) {
			System.out.println(num1 + "���� �����Դϴ�!");
		} else if (check4) {
			System.out.println(num1 + "���� �����Դϴ�!");
		} else {
			System.out.println("1���� 12 ������ ���ڸ� �Է��ϼ���.");
		}

	}
}
