package ex_220203_01;

import java.security.PublicKey;

public class Bank {

	// 1. �ʵ� (�Ӽ�) - �����͸� �����ϴ� ����

	private int money; // �ݾ��� �����ϴ� �ʵ�

	// 2. �޼ҵ� (���) - �����͸� ������ ���� �۵��ϴ� ��
	// �Ա� ���
	public void deposit(int money) {
		// this -> ���� Ŭ������ ��Ī�ϴ� Ű����
		this.money += money;
	}

	// �ܾ׺���
	public int showMoney() {
		return this.money;
	}

	// ��� ���
	public void withdraw(int money) {
		this.money -= money;
	}

}
