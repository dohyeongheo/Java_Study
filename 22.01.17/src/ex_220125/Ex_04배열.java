package ex_220125;

public class Ex_04�迭 {

	public static void main(String[] args) {

		// �ִ밪 ã�ƺ���

		// �迭�� ������ Ÿ���� ������
		// �ȿ��� �����ʹ� -> 23,24,95,17,6,89,47,56,68,71

		/// �� �ȿ� �ִ� ������ ���� �߿� ���� ū ���� ���� �ε����� ���� �����Ͱ��� ���!

		// �ε��� :
		// ���� ū �� :

//		int[] arr = { 23, 45, 95, 17, 6, 89, 47, 56, 68, 71 };
//		int max = arr[0];
//		int index = 0;
//
//		for (int i = 0; i < arr.length; i++) {
//			if (max < arr[i]) {
//				max = arr[i];
//
//			}
//			if (max == arr[i]) {
//				index = i;
//			}
//		}
//		System.out.println("�ε��� : " + index);
//		System.out.println("�ִ밪 : " + max);

		int[] array = {23, 45, 95, 17, 6, 89, 47, 56, 68, 71};
	      int max = array[0];
	      int maxIndex = 0 ;
	      for (int i = 0; i < array.length; i++) {
	         if(array[i] > max) { // max�� max ������ ���ؼ� �� ū�� �ٽ� max ������ ���
	            max = array[i];
	            maxIndex=i; // max�� ���ؼ� �� ū ������ �ε����� ���
	         }
	      }
	      System.out.println("�ε��� : " + maxIndex);
	      System.out.println("max : " + max);
		
		
	}

}
