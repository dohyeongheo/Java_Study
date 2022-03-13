package ex_220124;

public class for문2 {

	public static void main(String[] args) {
// 1부터 10까지 더한 값을 출력
		// 1~10까지 반복을 하는데,
		// 실행 코드 연산자 사용해서 합을 구하자
//		int sum = 0;
//		for (int i = 1; i <= 10; i++) {
//			System.out.println(i);
//			sum = sum + i;
//			if (i == 10) {
//				System.out.println("1부터 10까지의 합계는 : " + sum);
//			}
//		}

// 97부터 ~ 53까지 출력
//		for (int i = 97; i >= 53; i--) {
//			System.out.println(i);
//		}

		// for문을 사용해서 21에서 57까지의 수중 홀수만 출력
		// i가 홀수인지 아닌지, 맞다면 출력

		for (int i = 21; i <= 57; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}

		}
	}
}