package ex_220120;
import java.util.Scanner;

public class Exam08����ġ {

	public static void main(String[] args) {

		// num1 �� ���� 1�̸� -> �ȳ��ϼ��� ���
//		2�̸� -> �߰����� ���
//		3�̸� -> �ݰ����ϴ� ���
//		�̿� -> �� ������ ���

		Scanner sc = new Scanner(System.in);
		System.out.print("���ڸ� �Է��ϼ��� : ");
		int num = sc.nextInt();

//		int num = 1;

		switch (num) {
		case 1:
			System.out.println("�ȳ��ϼ���");
			break;
		case 2:
			System.out.println("�߰�����");
			break;
		case 3:
			System.out.println("�ݰ����ϴ�");
			break;
		case 4:
			System.out.println("�� ������");
			break;
		default:
			System.out.println("���� �׸� �ϼ���");
		}

	}

}
