package ex_220124;
import java.util.Scanner;

public class for��6������ {

	public static void main(String[] args) {

//		Scanner sc = new Scanner(System.in);
//		System.out.println("���ڸ� �Է��Ͻø� ���ڿ� �´� �������� ��µ˴ϴ�");
//		System.out.print("���ڸ� �Է��ϼ��� >> ");
//		int input = sc.nextInt();
//		for (int i = 1; i <= 9; i++) {
//			int output = input * i;
//			if (output < 100) {
//
//				System.out.println(input + "*" + i + "=" + input * i);
//			}
//		}

//		Scanner sc = new Scanner(System.in);
//		System.out.print("������ �Է��ϼ��� : ");
//		int input = sc.nextInt();
//		System.out.print(input + "�� ����� : ");
//		
//		for (int i=1; i <= input; i++) {
//		if (input%i == 0) {
//			System.out.print(i + " ");
//		}
//		}
//		System.out.print("�Դϴ�!!");

		for (int num = 2; num <= 9; num++) {
			System.out.println("=== " + num + "��" + " ===");

			for (int i = 1; i <= 9; i++) {
				System.out.println(num + " * " + i + " = " + num * i);
			}
			System.out.println();
		}

	}

}
