package ex_220203_01;

import java.awt.Menu;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Bank myBank = new Bank();

		// �������α׷�
		// ���� 1. 4 ���Ḧ �Է��ϱ� ������ 1,2,3�� �Է��� ��� �� �� �ְ� ����ÿ�
		while (true) {
			System.out.print("1. �Ա� 2. ��� 3. �ܾ�Ȯ�� 4. ���� >> ");
			int choice = sc.nextInt();
			System.out.println("");
			if (choice == 1) {
				System.out.println("====�Ա�====");
				System.out.print("�Ա��� �ݾ��� �Է����ּ��� >> ");
				int inputMoney = sc.nextInt();
				myBank.deposit(inputMoney);
				System.out.println("");
				// ����
				// �Ա��� �ݾ��� �� bank�ȿ� �־��ּ���

			} else if (choice == 2) {
				System.out.println("====���====");
				System.out.print("����� �ݾ��� �Է����ּ��� >> ");
				int outputMoney = sc.nextInt();
				myBank.withdraw(outputMoney);
				System.out.println("");

			} else if (choice == 3) {
				System.out.println("====�ܾ�Ȯ��====");
				System.out.println("�����ܾ� : " + myBank.showMoney());
				System.out.println("");

			} else if (choice == 4) {
				System.out.println("���α׷��� �����մϴ�.");
				break;
			} else {
				System.out.println("��Ȯ�� ���ڸ� �ٽ� �Է����ּ���. ");
			}
		}

//		// myBank ��ü money �ȿ� 50,000�� �ֱ�
////		myBank.money = 50000;
////		System.out.println(myBank.money);
//		
//		// myBank ��ü money �ȿ� 100000�� �ֱ�
//		// �޼ҵ� ȣ��, 10���� �Ա�
//		myBank.deposit(50000);
//		
//		// mybank ��ü �ȿ� showMoney() �޼ҵ带 �����
//		System.out.println(myBank.showMoney());
//		
//		// myBank ��ü �ȿ� withdraw() �޼ҵ带 �����
//		myBank.withdraw(10000);
//		System.out.println(myBank.showMoney());

		// ���� ���α׷�
		// 1. �Ӽ� (�ʵ�)
		// �ݾ� :

		// 2. ��� (�޼ҵ�)
		// �ܰ� Ȯ��
		// �Ա�
		// ���

	}
}
