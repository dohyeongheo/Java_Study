package ex_220125;
import java.util.Scanner;

public class Ex_03�迭 {

	public static void main(String[] args) {

		// �츮�� �Է��ϴ� �� (������) �� �迭�� �־��!
		// �迭�� ũ��� 10
		// �迭�� Ÿ���� ������
		// �Է��ϴ� ������ �ҷ��ͼ�
		Scanner sc = new Scanner(System.in);

//		int[] array1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };
//	
//
//		System.out.print("���ڸ� �Է��ϼ��� >> ");
//		int num = sc.nextInt();
//		System.out.print("����� >> " + array1[num - 1]);

		int[] arr = new int[10];

		for (int i = 0; i < arr.length; i++) {
			System.out.print("���ڸ� �Է��ϼ��� >> ");
			arr[i] = sc.nextInt();
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}

	}

}
