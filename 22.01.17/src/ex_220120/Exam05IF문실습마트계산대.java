package ex_220120;
import java.util.Scanner;

public class Exam05IF문실습마트계산대 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("사려는 상품 갯수를 입력하세요. ");
		int num = sc.nextInt();

		int price = 10000;
		double saleprice = price * 0.9;

		boolean check1 = num >= 11;

		if (check1) {
			System.out.println("가격은 " + (int)num * saleprice + "원 입니다.");
		} else {
			System.out.println("가격은 " + num * price + "원 입니다.");
		}

	}
}
