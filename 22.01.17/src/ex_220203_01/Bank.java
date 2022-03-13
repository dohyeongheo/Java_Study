package ex_220203_01;

import java.security.PublicKey;

public class Bank {

	// 1. 필드 (속성) - 데이터를 저장하는 공간

	private int money; // 금액을 저장하는 필드

	// 2. 메소드 (기능) - 데이터를 가지고 뭔가 작동하는 것
	// 입금 기능
	public void deposit(int money) {
		// this -> 현재 클래스를 지칭하는 키워드
		this.money += money;
	}

	// 잔액보기
	public int showMoney() {
		return this.money;
	}

	// 출금 기능
	public void withdraw(int money) {
		this.money -= money;
	}

}
