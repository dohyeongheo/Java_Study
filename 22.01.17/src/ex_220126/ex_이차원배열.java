package ex_220126;

public class ex_이차원배열 {

	public static void main(String[] args) {

//		int[] arr = new int[3];
//
//		int[][] array = new int[3][2];
//
////		System.out.println(array);
////		System.out.println(array[0]);
//
//		// 2차원 배열 원소에 접근 방법
//		// 1차원 배열 일때는 array[index]
//		// 2차원 배열 일때는 array[행의인덱스번호][열의인덱스번호]
//
//		array[2][1] = 22;
//		System.out.println(array[2][1]);
//
////		문자열을 넣을수 있는 이차원 배열을 만들고 크기는 5*5
//
//		String[][] array1 = new String[5][5];
//
//		array1[2][2] = "나는 정 가운데";
//		System.out.println(array1[2][2]);
//// 2차원 배열의 length
//		System.out.println(array.length);
//		System.out.println(array[0].length);
//		System.out.println(arr.length);

//		그렇다면 우리가 열에 접근을 하려면?
//
//		
//		이차원 배열 
//		일차원 배열안에 배열이 또 들어가 있는 형태
//		쉽게 생각해서 행열 개념으로 봐도 거의 무방하다
//		
//		문제
//		길이가 5인 정수형 2차원 배열 array 생성 후
//		1 2 3 4 5
//		6 7 8 9 10
//		11 12 13 14 15
//		16 17 18 19 20
//		21 22 23 24	25
//		위와 같이 값을 넣고 출력하시오

		int[][] array = new int[5][5];
		int num = 21;
		int num1 = 30;
		int num2 = 31;
		int num3 = 40;
		int num4 = 41;

		for (int i = 0; i < array.length; i++) {
//			for (int j = 0; j < array.length; j++) {
//				array[0][j] = num;
//				num++;
//			}
			array[0][i] = num;
			num++;
			array[1][i] = num1;
			num1--;
			array[2][i] = num2;
			num2++;
			array[3][i] = num3;
			num3--;
			array[4][i] = num4;
			num4++;

		}

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				System.out.print(array[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
