package javafestival_week_2;

public class exam04 {
	public static void main(String[] args) {

		int num1 = 1;
		int num2 = num1 + 5;

		int[][] array = new int[5][5];

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				array[i][j] = (i + 1) + 5 * j;
			}

		}

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				System.out.print(array[i][j] + "\t");
			}
			System.out.println();

		}
	}
}
