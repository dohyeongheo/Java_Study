package ex_220127;
import java.util.Scanner;

public class ex03_메소드 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("첫번째 숫자 입력 >>  ");
		int num1 = sc.nextInt();
		System.out.print("두번째 숫자 입력 >>  ");
		int num2 = sc.nextInt();
		System.out.print("연산자 입력 >> ");
		String op = sc.next();

		System.out.println(cal(num1, num2, op));
	}

	public static int cal(int num1, int num2, String op) {

//		int result = num1 - num2;
//		int result2 = num1 + num2;
//		int result3 = num1 * num2;
//		int result4 = num1 / num2;
		int result = 0;

		if (op.equals("-")) {
			result = num1 - num2;
		} else if (op.equals("+")) {
			result = num1 + num2;
		} else if (op.equals("*")) {
			result = num1 * num2;
		} else if (op.equals("/")) {
			result = num1 / num2;
		}
//		else {
//		return 0}
		return result;

		// op에 따른 다른 결과값을 돌려줘야하는데
		// op가 뭔지 판단 ->

	}

}
