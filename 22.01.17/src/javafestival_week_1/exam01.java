package javafestival_week_1;

import java.util.Scanner;

public class exam01 {

	public static void main(String[] args) {
// �ݿø��� ����
//		1,2,3,4 = �����ڸ� ����
//      5,6,7,8,9 = �����ڸ� ������, �����ڸ� 1����

		Scanner sc = new Scanner(System.in);
		System.out.print("�ݿø� �� �� : ");
		int input = sc.nextInt();
		int num = input % 10;
		
		
		int num1 = input / 10 *10;
		int num2 = ((input / 10 * 10) + 10);

		if (num < 5) {
			System.out.println("�ݿø� �� �� : " + num1);
		} else if (num >= 5) {
			System.out.println("�ݿø� �� �� : " + num2);
		}

//	

	}

}
