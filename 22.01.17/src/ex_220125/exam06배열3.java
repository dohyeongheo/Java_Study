package ex_220125;

public class exam06�迭3 {

	public static void main(String[] args) {

		// �迭�� ����
		// ���۷����� ����� �ּ��� ���簡 �Ͼ��..
		
		int num1 = 10;
		int num2 = num1;
		num1 = 30;

		System.out.println(num1);
		System.out.println(num2);
		
		int[] array1 = {10, 20, 30};
		int[] array2 = array1;
		
		array1[0] = 1000;
		
		System.out.println(array1[0]);
		System.out.println(array2[0]);
		
	}

}
