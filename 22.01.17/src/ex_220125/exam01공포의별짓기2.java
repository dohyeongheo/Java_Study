package ex_220125;

public class exam01공포의별짓기2 {

	public static void main(String[] args) {
		//

//		for (int a = 1; a <= 5; a++) {
//			for (int b = 5; b >= a; b--) {
//				System.out.print("*");
//
//			}
//			System.out.println();
//		}

		for (int i = 1; i <= 5; i++) {
			
			for (int c = 4; c >= i; c--) {
				System.out.print(" ");
			}

			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}

	}

}
