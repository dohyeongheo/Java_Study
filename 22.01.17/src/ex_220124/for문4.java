package ex_220124;

public class for문4 {

	public static void main(String[] args) {

		// 1에서부터 100까지의 수 중에서
		// 3의 배수만을 출력

//		for (int i=1; i <= 99; i++) {
//		i += 2;
//		System.out.println(i);
//		}

//		for (int i = 1; i <= 100; i++) {
//			if (i % 3 == 0) {
//				System.out.println(i); 
//			}
//		}

		// 1~100 까지의 수 중에서 3의 배수, 5의 배수 두 가지 조건을 만족하는 수 출력

		for (int i = 1; i <= 100; i++) {
//			if (i % 3 == 0 && i % 5 == 0)
			if (i % 15 == 0)
				System.out.println(i);
		}

	}

}
