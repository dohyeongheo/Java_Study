package ex_220124;
import java.util.Scanner;

public class for��5 {

	public static void main(String[] args) {
// ����ڿ��� �� ���� �ڿ����� �Է¹޾Ƽ�
		// �Է¹��� ���� ����� ���ʷ� 10���� ����ϴ� ���α׷� �ۼ�
		// 5�� �Է¹�����
		// 5 10 15 20 .... 50

		Scanner sc = new Scanner(System.in);
		System.out.print("���ڸ� �Է��ϼ��� >> ");
		int input = sc.nextInt();
		for (int i = 1; i <= 10; i++) {
			System.out.println(input * i);
		}

	}

}
