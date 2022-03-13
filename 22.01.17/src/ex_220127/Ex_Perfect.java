package ex_220127;
import java.util.Scanner;

public class Ex_Perfect {

	public static void main(String[] args) {

		// isDIvisor() 매서드를 만들건데
		// num2가 num1의 약수인지
		// num2가 num1을 나누어 떨어지게 하는지?
		// num1이 num2의 배수인지?

//		int num1 = 10;
//		int num2 = 3;

//		boolean result = isDivisor(num1, num2);
//		Scanner sc = new Scanner(System.in);
//		System.out.print("약수를 구할 숫자를 입력하세요 : ");
//		int num11 = sc.nextInt();

//		int num11 = 10;
//		int result = getSumofDivisiors(num11);
//
//		System.out.println(num11 + "의 약수의 합 : " + result);
//
//		getDivisior(num11);
//
//		int num = 8196;
//
//		boolean result3 = isperfectNumber(num);
//		System.out.println();
//		System.out.println(num + "은 완전수인가? " + result3);

		int startvalue = 2;
		int endvalue = 1000;
		
		getPerfectNumber (startvalue, endvalue);

//		if (result == true) System.out.println(num1 + "은 " + num2 + "의 약수입니다.");
//		else System.out.println(num1 + "은 " + num2 + "의 약수가 아닙니다.");

	}

	public static boolean isDivisor(int num1, int num2) {

		if (num1 % num2 != 0)
			return false;
		else
			return true;
	}

	public static void getDivisior(int num) {

		System.out.print(num + "의 약수는 : ");
		for (int i = 1; i <= num; i++) {
			if (isDivisor(num, i)) {
				System.out.print(i + " ");
			}

		}

	}

	public static int getSumofDivisiors(int num3) {
		int sum = 0;
//		System.out.println("");
//		System.out.print(num3 + "의 약수의 합은 : ");
		for (int i = 1; i <= num3; i++) {
			if (isDivisor(num3, i)) {
				sum += i;
			}
		}
//		System.out.println(sum);
		return sum;

	}

	// 완전수(完全數)는 자기 자신을 제외한 양의 약수를 더했을 때
	// 자기 자신이 되는 양의 정수를 말한다
	public static boolean isperfectNumber(int num) {

		if (getSumofDivisiors(num) == num * 2)
			return true;
		else
			return false;

	}

	public static void getPerfectNumber(int num1, int num2) {
		System.out.print(num1 + "부터" + num2 + "까지의 완전수 : ");
		for (num1 = 2; num1 <= num2; num1++) {
			if (isperfectNumber(num1)) {
				System.out.print(num1 + " ");
				System.out.println();
			}

		}

	}

}
