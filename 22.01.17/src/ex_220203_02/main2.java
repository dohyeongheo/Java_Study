package ex_220203_02;

import java.util.Scanner;

public class main2 {
	public static void main(String[] args) {
		student pbk = new student("�ں���", "20188065", 99, 81, 78);
		student csm = new student("ä����", "20178065", 79, 82, 48);
		student jjy = new student("���ڿ�", "20168065", 89, 84, 89);
		student kdw = new student("�赿��", "20158065", 69, 89, 91);
		student ksg = new student("������", "20148065", 74, 73, 99);

		// �������� �����͸� ��� �����ϴ� ���
		// 1. �迭
		// 2. arraylist

		student[] list = { pbk, csm, jjy, kdw, ksg };
		Scanner sc = new Scanner(System.in);

		while (true) {

			System.out.print("1.��ü�̸����� 2.��ȸ 3. ���� >> ");
			int choice = sc.nextInt();

			if (choice == 1) {
				System.out.println("==��ü�̸�����==");
				for (int i = 0; i < list.length; i++) {
					System.out.println(i + 1 + "." + list[i].getName());
				}

			}

			else if (choice == 2) {
				System.out.print("��ȸ�� ����� �̸� �Է� : ");
				String name = sc.next();
				boolean ischeck = true;

				for (int i = 0; i < list.length; i++) {
					if (list[i].getName().equals(name)) {
						System.out.print(list[i].getName() + " - " + list[i].getStuId() + " - " + list[i].getScore());
						System.out.println("");
						ischeck = false;
					}
				}
				if (ischeck)
					System.out.println("��ġ�ϴ� ����� �����ϴ�.");

			} else if (choice == 3) {
				System.out.println("���α׷��� ����˴ϴ�.");
				break;
			}

			else {
				System.out.println("��Ȯ�� ���ڸ� �Է����ּ���.");

			}

		}

	}
}
