package ex_220127;
import java.util.Scanner;

public class Ex_Perfect {

	public static void main(String[] args) {

		// isDIvisor() �ż��带 ����ǵ�
		// num2�� num1�� �������
		// num2�� num1�� ������ �������� �ϴ���?
		// num1�� num2�� �������?

//		int num1 = 10;
//		int num2 = 3;

//		boolean result = isDivisor(num1, num2);
//		Scanner sc = new Scanner(System.in);
//		System.out.print("����� ���� ���ڸ� �Է��ϼ��� : ");
//		int num11 = sc.nextInt();

//		int num11 = 10;
//		int result = getSumofDivisiors(num11);
//
//		System.out.println(num11 + "�� ����� �� : " + result);
//
//		getDivisior(num11);
//
//		int num = 8196;
//
//		boolean result3 = isperfectNumber(num);
//		System.out.println();
//		System.out.println(num + "�� �������ΰ�? " + result3);

		int startvalue = 2;
		int endvalue = 1000;
		
		getPerfectNumber (startvalue, endvalue);

//		if (result == true) System.out.println(num1 + "�� " + num2 + "�� ����Դϴ�.");
//		else System.out.println(num1 + "�� " + num2 + "�� ����� �ƴմϴ�.");

	}

	public static boolean isDivisor(int num1, int num2) {

		if (num1 % num2 != 0)
			return false;
		else
			return true;
	}

	public static void getDivisior(int num) {

		System.out.print(num + "�� ����� : ");
		for (int i = 1; i <= num; i++) {
			if (isDivisor(num, i)) {
				System.out.print(i + " ");
			}

		}

	}

	public static int getSumofDivisiors(int num3) {
		int sum = 0;
//		System.out.println("");
//		System.out.print(num3 + "�� ����� ���� : ");
		for (int i = 1; i <= num3; i++) {
			if (isDivisor(num3, i)) {
				sum += i;
			}
		}
//		System.out.println(sum);
		return sum;

	}

	// ������(�����)�� �ڱ� �ڽ��� ������ ���� ����� ������ ��
	// �ڱ� �ڽ��� �Ǵ� ���� ������ ���Ѵ�
	public static boolean isperfectNumber(int num) {

		if (getSumofDivisiors(num) == num * 2)
			return true;
		else
			return false;

	}

	public static void getPerfectNumber(int num1, int num2) {
		System.out.print(num1 + "����" + num2 + "������ ������ : ");
		for (num1 = 2; num1 <= num2; num1++) {
			if (isperfectNumber(num1)) {
				System.out.print(num1 + " ");
				System.out.println();
			}

		}

	}

}
