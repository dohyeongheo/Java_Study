package ex_220126;
import java.util.Scanner;

public class exam02ȸ�����Խý��� {

	public static void main(String[] args) {

		// ȸ������ �ý���
		// �α���, ȸ������, ����
		// 1. ȸ������ - ���̵�, �н�����, �г����� �Է¹޾� ���� �迭�� ����
		// 2. �α��� - ���̵�, �н����带 �Է¹޾� ��ġ�ϸ� �г��Ӵ� ȯ���մϴ� ���
		// 3. ���� - ���α׷� ����

		// ȸ���� ������ ������ �迭
		String[] ids = new String[5]; // ���̵� ���� �迭
		String[] pws = new String[5]; // ��й�ȣ ���� �迭
		String[] nicks = new String[5]; // �г��� ���� �迭
		int count = 0;

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("1. ȸ������ 2. �α��� 3. ���� >> ");
			int choice = sc.nextInt();

			// �Է¹��� ���̵�, ��й�ȣ, �г����� �迭�� ����
			// ȸ�����Խ� �迭�� ����ĭ�� �̾ ������ �ؾ� �ϸ�
			// 5���� ȸ�������� �� �Ǿ��ٸ� �߰��� ȸ�������� �� ��
			// �� �̻� ȸ�������� �Ұ����մϴ� ���
			// ���� ȸ���� ��� ���ԵǾ��ִ��� ����� ���� �ʿ�

			if (choice == 1) {

				if (count < 5) {
					System.out.print("���̵� �Է� : ");
					String id = sc.next();
					System.out.print("��й�ȣ �Է� : ");
					String pw = sc.next();
					System.out.print("�г��� �Է� : ");
					String nick = sc.next();
					System.out.println();

					ids[count] = id;
					pws[count] = pw;
					nicks[count] = nick;

					count++;

				} else {
					System.out.println();
					System.out.println("�� �̻� ȸ�� ������ �Ұ����մϴ�");
					System.out.println("ó������ ���ư��ϴ�. ");

				}

			} else if (choice == 2) {
				System.out.println();
				System.out.print("���̵� �Է����ּ��� >> ");
				String id = sc.next();
				System.out.print("��й�ȣ�� �Է����ּ��� >> ");
				String pw = sc.next();

				int i = 0;
				for (i = 0; i < nicks.length; i++) {
					if (id.equals(ids[i]) && pw.equals(pws[i])) {
						System.out.println(nicks[i] + "�� �α��� �����߽��ϴ�.");
						System.out.println();
						break;
					}
				}

			} else if (choice == 3)

			{

				System.out.println("���α׷��� �����մϴ�...");
				break;
			}

		}

	}
}
