package javafestival_week_1;

import java.util.Scanner;

public class exam11 {

	public static void main(String[] args) {

		// ���� n�� �Է¹޾� 1,2,4,7,11�� ���� ������ n��° �ױ��� ����Ͻÿ�
		// ������ ��Ģ n n+1 n+2 n+3 n+4 ....

		Scanner sc = new Scanner(System.in);
		System.out.print("n �Է� : ");
		int n = sc.nextInt();
		int result = 1;

		for (int i = 0; i <= n-1; i++) {
			result += i;
			System.out.print(result + " ");
			
			
		}

	}

}
