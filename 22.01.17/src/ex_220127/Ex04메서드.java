package ex_220127;

public class Ex04메서드 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1 = 10;
		int num2 = 24;
		int result = LargerNumber(num1, num2);
		System.out.println("큰 수 확인 : " + result);

	}

	public static int LargerNumber(int num1, int num2) {
		int result = 0;

		if (num1 > num2) {
			result = num1;
		} else if (num1 < num2) {
			result = num2;
		} else if (num1 == num2) {
			result = 0;
		} else {
		result = 0;
	}
		return result;}

}
