package ex_220125;
import java.util.Scanner;

public class Ex_06�迭 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] array1 = new int[5];
		int max = 0;

		int sum = 0;
		float avg = 1;

		for (int i = 0; i < array1.length; i++) {
			System.out.print(i + 1 + "��° �Է� >> ");
			array1[i] = sc.nextInt();
		}

		System.out.println("�Էµ� ���� : ");
		for (int a = 0; a < array1.length; a++) {
			System.out.print(array1[a] + " ");
		}
		System.out.println();
		System.out.print("�ְ� ���� : ");
		for (int b = 0; b < array1.length; b++) {
			if (max < array1[b])
				max = array1[b];
		}
		System.out.println(max);

		int min = array1[0];
		System.out.print("���� ���� : ");
		for (int c = 0; c < array1.length; c++) {
			if (min > array1[c])
				min = array1[c];
		}
		System.out.println(min);

		System.out.print("���� : ");
		for (int d = 0; d < array1.length; d++) {
			sum += array1[d];
		}
		System.out.println(sum);

		System.out.print("��� : ");

		System.out.print((double) sum / array1.length);

	}

}
