package ex_220120;
import java.util.Scanner;

public class Exam02IF���ǽ� {

	public static void main(String[] args) {
// ���� NUM�� �����ϰ� Ű����κ��� ������ �Է¹޽��ϴ�.
//���� num�� ���� 3�� ����̸鼭 5�� ������
//00�� 3�� 5�� ����Դϴ�.
//�ƴ϶��
//00�� 3�� 5�� ����� �ƴմϴ�.

		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		int num = sc.nextInt();		
		if (num % 3 == 0 && num % 5 == 0) {
			System.out.println(num + "��(��) 3�� 5�� ����Դϴ�.");
		} else {
			System.out.println(num + "��(��) 3�� 5�� ����� �ƴմϴ�.");
		}

	}
}
