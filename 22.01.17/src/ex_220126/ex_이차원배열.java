package ex_220126;

public class ex_�������迭 {

	public static void main(String[] args) {

//		int[] arr = new int[3];
//
//		int[][] array = new int[3][2];
//
////		System.out.println(array);
////		System.out.println(array[0]);
//
//		// 2���� �迭 ���ҿ� ���� ���
//		// 1���� �迭 �϶��� array[index]
//		// 2���� �迭 �϶��� array[�����ε�����ȣ][�����ε�����ȣ]
//
//		array[2][1] = 22;
//		System.out.println(array[2][1]);
//
////		���ڿ��� ������ �ִ� ������ �迭�� ����� ũ��� 5*5
//
//		String[][] array1 = new String[5][5];
//
//		array1[2][2] = "���� �� ���";
//		System.out.println(array1[2][2]);
//// 2���� �迭�� length
//		System.out.println(array.length);
//		System.out.println(array[0].length);
//		System.out.println(arr.length);

//		�׷��ٸ� �츮�� ���� ������ �Ϸ���?
//
//		
//		������ �迭 
//		������ �迭�ȿ� �迭�� �� �� �ִ� ����
//		���� �����ؼ� �࿭ �������� ���� ���� �����ϴ�
//		
//		����
//		���̰� 5�� ������ 2���� �迭 array ���� ��
//		1 2 3 4 5
//		6 7 8 9 10
//		11 12 13 14 15
//		16 17 18 19 20
//		21 22 23 24	25
//		���� ���� ���� �ְ� ����Ͻÿ�

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
