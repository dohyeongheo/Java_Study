package ex_220127_array;
import java.util.Arrays;

public class Exam04bubblesort {

	public static void main(String[] args) {

		// ���� ����

		int[] array = { 45, 7, 12, 82, 25 };
		// 1STEP

	      for(int i = array.length - 1; i > 0; i--) {
	         for(int j = 0; j < i; j++) {
	            if(array[j] > array[j + 1]) {
	               int temp = array[j];
	               array[j] = array[j + 1];
	               array[j + 1] = temp;

				}
			}
		}

		System.out.println(Arrays.toString(array));

//		int[] array = {45, 7, 12, 82, 25};
//        
//	      for(int i = 1; i < array.length; i++) {
//	         for(int j = 0; j < 5; j++) {
//	            if(array[i] < array[j]) {
//	               int temp = array[i];
//	               array[i] = array[j];
//	               array[j] = temp;
//	            }
//	         }
//	      }
//	      System.out.println(Arrays.toString(array));
//
//	   }
//
//	}

//		if (array[0] > array[1]) {
//			// array[0]�� array[1]�� ������ ���� ��ȯ���ּ���
//
//			int temp = array[0];
//			array[0] = array[1];
//			array[1] = temp;
//
//		}
//
//		if (array[1] > array[2]) {
//			int temp = array[1];
//			array[1] = array[2];
//			array[2] = temp;
//		}

	}

}
