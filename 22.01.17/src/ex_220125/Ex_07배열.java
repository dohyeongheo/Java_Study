package ex_220125;
import java.util.Random;

public class Ex_07�迭 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("=====�ζ�Ÿ��=====");

		int[] arr = new int[5];
		Random random = new Random();

		for (int i = 0; i < arr.length; i++) {
			arr[i] = random.nextInt(10) + 1;
			
			
			for (int j = 0; j < i; j++) {
				if (arr[i] == arr[j])
					i--;
			}

		}
		System.out.println("�̹��� ��÷ ��ȣ�¿�....");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");

		}
		System.out.println("");
		System.out.println("�����Ͽ� �������� �����");
	}

}
