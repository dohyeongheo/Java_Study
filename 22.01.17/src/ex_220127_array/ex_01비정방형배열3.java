package ex_220127_array;

public class ex_01비정방형배열3 {

	public static void main(String[] args) {

		int[][] array = new int[3][];

		array[0] = new int[1];
		array[1] = new int[2];
		array[2] = new int[3];

		int cnt = 1;

		array[0][0] = cnt;
		cnt++;
		array[1][0] = cnt;
		cnt++;
		array[1][1] = cnt;
		cnt++;
		array[2][0] = cnt;
		cnt++;
		array[2][1] = cnt;
		cnt++;
		array[2][2] = cnt;
		cnt++;

		
		
	}

}
