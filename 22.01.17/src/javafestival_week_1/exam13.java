package javafestival_week_1;

import java.util.Random;

public class exam13 {

	public static void main(String[] args) {

		// 8ĭ ũ�� ������ �迭 ����
		int array[] = new int[8];
		Random random = new Random();

		// �迭�� ������ �Է��ϱ�
		for (int i = 0; i < array.length; i++) {
			array[i] = random.nextInt(60);
		}
		
		System.out.print("�迭�� �ִ� ��� �� : ");

		// �迭�� �ִ� ��� �� ����ϱ�
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		
		
		
		

	}
}
