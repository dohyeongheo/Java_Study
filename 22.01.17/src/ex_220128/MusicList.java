package ex_220128;
import java.util.ArrayList;
import java.util.Scanner;

public class MusicList {

	public static void main(String[] args) {

		// �Է��ϴ� ������ �ҷ�����
		Scanner sc = new Scanner(System.in);

		ArrayList<String> list = new ArrayList<String>();

		list.add("��");
		list.add("���ƾ�");
		list.add("����Ϲ㿡");

		while (true) {
			// 4���� �Է¹޾����� ����
			System.out.print("[1] �뷡��ȸ [2] �뷡�߰� [3] �뷡���� [4] ���� >> ");
			// ����ڷκ��� � ���ڸ� �Է�
			int select = sc.nextInt();

			if (select == 1) {
				for (int i = 0; i < list.size(); i++)
					System.out.println(list.get(i));
			}

			else if (select == 2) {
				System.out.println("�߰��� �뷡 ������ �Է��ϼ���");
				list.add(sc.next());
//				continue;

			}

			else if (select == 3) {
				System.out.println("������ �뷡 ������ �Է��ϼ���");
				list.remove(sc.next());
			}

			else if (select == 4) {
				System.out.println("���α׷��� �����մϴ�.");
				break;
			} else {
				System.out.println("�߸��Է��ϼ̽��ϴ�.");
			}
		}

	}

}
