package ex_220125;

public class Ex_02�迭 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array1 = { 3, 10, 4, 8, 17, 22, 31 };
//
//		for (int i = 0; i < array1.length; i++) {
//			if (i % 2 == 1) {
//				System.out.println(array1[i]);
//			}
//		}
		
		int b = 0;
		System.out.print("array1�� Ȧ���� �ش��ϴ� ���� : ");
		for (int a = 0; a < array1.length; a++) {
			if (array1[a] % 2 !=0) {
				System.out.print(array1[a] + " ");
				b++;
			}
		}
		System.out.print("�� �ְ�, �� " + b + "���� �ֽ��ϴ�.");
	}
}
