package ex_220124;

public class for��369 {

	public static void main(String[] args) {

		for (int a = 1; a <= 50; a++) {

			if (a % 10 == 3 || a % 10 == 6 || a % 10 == 9) {
				System.out.println(" >> 3,6,9�� �ڼ�");
			} else if (a % 10 == 5) {
				System.out.println(a + " >> 5�� ����");
			} else {
				System.out.println(a);

			}
		}

	}
}
