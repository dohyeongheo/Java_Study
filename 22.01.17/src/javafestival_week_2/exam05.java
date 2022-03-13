package javafestival_week_2;

public class exam05 {

	public static void main(String[] args) {

		int[][] array = new int[5][5];

		
		// 원본 배열 입력부
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				array[i][j] = 5*i + j+1;
			}
		}

		
		// 원본 배열 출력부
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				System.out.print(array[i][j] + "\t");
			}
			System.out.println();
		}

		// 수정본 배열 입력부
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				array[i][j] = 25 - 5*i -j;
				
			}
		}
		
		
		// 수정본 배열 출력부
		System.out.println("=====수정 후 =====");
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				System.out.print(array[i][j] + "\t");
			}
			System.out.println();
		}
		
		
		
	}

}
