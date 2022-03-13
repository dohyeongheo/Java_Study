package ex_220125;
import java.util.Random;

public class Ex_07배열 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("=====로또타임=====");

		int[] arr = new int[5];
		Random random = new Random();

		for (int i = 0; i < arr.length; i++) {
			arr[i] = random.nextInt(10) + 1;
			
			
			for (int j = 0; j < i; j++) {
				if (arr[i] == arr[j])
					i--;
			}

		}
		System.out.println("이번주 당첨 번호는요....");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");

		}
		System.out.println("");
		System.out.println("월요일에 농협본점 가즈아");
	}

}
