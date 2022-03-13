package ex_220127_perfectnumber;

public class 메서드정복 {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 2;
		boolean divisior = isdivisor(num1, num2);
//		System.out.println(divisior);

//		getDivisor(10);
		getsumofdivisors(10);

	}

	public static boolean isdivisor(int num1, int num2) {
		boolean isdivisior = false;
		if (num1 % num2 == 0) {
			isdivisior = true;
			return isdivisior;
		}
		return isdivisior;

	}

	public static void getDivisor(int num) {
		String result = "";
		result += num + "의 약수 : ";
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				result += i + " ";
			}
		}
		System.out.println(result);
	}

	public static int getsumofdivisors(int num) {

		int result = 0;
		int sum = 0;
		System.out.print(num + "의 약수의 합 : ");
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				sum += i;
			}
		}
		result = sum;
		System.out.println(sum);

		System.out.print(num + "의 약수 : ");
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				System.out.print(i + " ");
			}

		}

		return result;

	}

}
