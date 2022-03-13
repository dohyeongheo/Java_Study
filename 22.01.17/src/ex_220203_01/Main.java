package ex_220203_01;

import java.awt.Menu;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Bank myBank = new Bank();

		// 은행프로그램
		// 문제 1. 4 종료를 입력하기 전까지 1,2,3번 입력을 계속 할 수 있게 만드시오
		while (true) {
			System.out.print("1. 입금 2. 출금 3. 잔액확인 4. 종료 >> ");
			int choice = sc.nextInt();
			System.out.println("");
			if (choice == 1) {
				System.out.println("====입금====");
				System.out.print("입금할 금액을 입력해주세요 >> ");
				int inputMoney = sc.nextInt();
				myBank.deposit(inputMoney);
				System.out.println("");
				// 문제
				// 입금할 금액을 내 bank안에 넣어주세요

			} else if (choice == 2) {
				System.out.println("====출금====");
				System.out.print("출금할 금액을 입력해주세요 >> ");
				int outputMoney = sc.nextInt();
				myBank.withdraw(outputMoney);
				System.out.println("");

			} else if (choice == 3) {
				System.out.println("====잔액확인====");
				System.out.println("현재잔액 : " + myBank.showMoney());
				System.out.println("");

			} else if (choice == 4) {
				System.out.println("프로그램을 종료합니다.");
				break;
			} else {
				System.out.println("정확한 숫자를 다시 입력해주세요. ");
			}
		}

//		// myBank 객체 money 안에 50,000원 넣기
////		myBank.money = 50000;
////		System.out.println(myBank.money);
//		
//		// myBank 객체 money 안에 100000원 넣기
//		// 메소드 호출, 10만원 입금
//		myBank.deposit(50000);
//		
//		// mybank 객체 안에 showMoney() 메소드를 만들기
//		System.out.println(myBank.showMoney());
//		
//		// myBank 객체 안에 withdraw() 메소드를 만들기
//		myBank.withdraw(10000);
//		System.out.println(myBank.showMoney());

		// 은행 프로그램
		// 1. 속성 (필드)
		// 금액 :

		// 2. 기능 (메소드)
		// 잔고 확인
		// 입금
		// 출금

	}
}
