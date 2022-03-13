package javafestival_week_1;

public class exam05 {

	public static void main(String[] args) {

		int a = 1;
		int b = -2;
		int c = 0;
//
		for (a = 1; a <= 99; a++) {
			System.out.print(a + " " + b + " ");
			c += a+b;
			a += 1;
			b -= 2;
		}
		System.out.println();
		System.out.println("결과 : " + c);
//			
//
//			if (a == count) {
//				System.out.println();
//				System.out.println("결과 : " + c);
//			}
//		}

	}
}
