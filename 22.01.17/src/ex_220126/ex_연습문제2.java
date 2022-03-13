package ex_220126;
import java.util.Arrays;

public class ex_연습문제2 {

	public static void main(String[] args) {

		int[][] arr = new int[5][5];

		int num = 21;

		// 입력부

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				arr[i][j] = num;
				num++;
			}
		}

		System.out.println(Arrays.deepToString(arr));

				
		// 출력부

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
