package javafestival_week_1;

import java.util.Scanner;

public class exam08 {

	public static void main(String[] args) {

//	1���� ū ����(n)�� �Է��Ͽ� n!���� ���Ͻÿ�
		// ���丮�� �̶� n�� ������ �۰ų� ���� ��� ���� ������ ��

		Scanner sc = new Scanner(System.in); // �Է� ���� �ޱ� ���ؼ� ��ĳ�� �ҷ�����

		int num; // ��ĳ�ʷ� �Է¹��� ���� ������ ����
		int num1 = 1; // �Է°� ���丮���� ������ ����

		System.out.print("�Է� : ");
		num = sc.nextInt();

		for (int i = 1; i <= num; i++) { // �Է°����� �۰ų� ���� ���� �������� ���� ����
				num1 *= i; // ex)1 * 2 * 3 * 4 ... ���丮�� ���� num1�� ���� 
		}
		System.out.println("��� : " + num1); // num1 ���� ���
	}

}
