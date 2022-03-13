package ex_220127;

public class Ex02매o리o {

	public static void main(String[] args) {
		sum(3, 5);
		System.out.println(sum(3, 5));

		// 3과 5를 더해서 출력

	}

	// 리턴타입 int : 메소드를 호출했을 때, 나에게 돌아오는 값이 int 형태

	public static int sum(int a, int b) {

		int result = a + b;
		System.out.println(result);
		return result;

	}

}
