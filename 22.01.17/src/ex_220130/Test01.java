package ex_220130;
import java.util.Random;

public class Test01 {

	private static final String LINE = "---";
	private static final String CITY = "Seoul";
	private static final int RANDOM_MAX = 10; // ·£´ý ÃÖ´ë°ª

	public static void main(String[] args) {

		// int[] array = new int[5];
		// for (int i = 0; i < array.length; i++) {
		// array[i] = i * 10;
		// }
		int[] array = makeArray(5);
		printArray(array);

	}

	private static int[] makeArray(int size) {
		int[] array = new int[size];
		Random ran = new Random();
		for (int i = 0; i < array.length; i++) {
			array[i] = ran.nextInt(RANDOM_MAX + 1);
		}
		return array;
	}

	private static void printArray(int[] arr) {
		System.out.println(LINE);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println(LINE);
	}

}
