package ex_220124;

public class for��4 {

	public static void main(String[] args) {

		// 1�������� 100������ �� �߿���
		// 3�� ������� ���

//		for (int i=1; i <= 99; i++) {
//		i += 2;
//		System.out.println(i);
//		}

//		for (int i = 1; i <= 100; i++) {
//			if (i % 3 == 0) {
//				System.out.println(i); 
//			}
//		}

		// 1~100 ������ �� �߿��� 3�� ���, 5�� ��� �� ���� ������ �����ϴ� �� ���

		for (int i = 1; i <= 100; i++) {
//			if (i % 3 == 0 && i % 5 == 0)
			if (i % 15 == 0)
				System.out.println(i);
		}

	}

}
