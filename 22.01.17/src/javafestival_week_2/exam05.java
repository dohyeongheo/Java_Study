package javafestival_week_2;

public class exam05 {

	public static void main(String[] args) {

		int[][] array = new int[5][5];

		
		// ���� �迭 �Էº�
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				array[i][j] = 5*i + j+1;
			}
		}

		
		// ���� �迭 ��º�
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				System.out.print(array[i][j] + "\t");
			}
			System.out.println();
		}

		// ������ �迭 �Էº�
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				array[i][j] = 25 - 5*i -j;
				
			}
		}
		
		
		// ������ �迭 ��º�
		System.out.println("=====���� �� =====");
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				System.out.print(array[i][j] + "\t");
			}
			System.out.println();
		}
		
		
		
	}

}
