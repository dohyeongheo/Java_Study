package javafestival_week_1;

import java.util.Scanner;

public class exam04 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("ù ��° ���� �Է� >> ");
		int num1 = sc.nextInt();
		System.out.print("�� ��° ���� �Է� >> ");
		int num2 = sc.nextInt();
		
	int result1 = num1 * (num2%10);	
	int result2 = num1 * (num2%100/10); 
	int result3 = num1 * (num2/100);
	int total = num1 * num2;
	
	System.out.println(result1);
	System.out.println(result2);
	System.out.println(result3);
	System.out.println(total);
	}

}
