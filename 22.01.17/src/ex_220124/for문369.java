package ex_220124;

public class for문369 {

	public static void main(String[] args) {

		for (int a = 1; a <= 50; a++) {

			if (a % 10 == 3 || a % 10 == 6 || a % 10 == 9) {
				System.out.println(" >> 3,6,9다 박수");
			} else if (a % 10 == 5) {
				System.out.println(a + " >> 5다 으악");
			} else {
				System.out.println(a);

			}
		}

	}
}
