package ex_220125;
import java.util.Random;

public class Ex_05�迭 {

	public static void main(String[] args) {

		// 1~30�� ������ ���� �����Ϳ� �־�����
		// ������Ÿ���� �迭�� ũ�� 10�� �������� 1. �迭�� �� �ֱ�

		// �׸��� �� ������ ���� �߿��� ���� ���� ���� ã�Ƽ� ����غ���.. 2. �ּڰ� ã��
		// " ���� ���� ���� ___ �Դϴ� " 3. ����ϱ�

		Random random = new Random();

		int index = 0;
		int[] array1 = new int[10]; // 1-1. �迭 �����ϱ�
//		int min = array1[0]; -> �ʱ⿡ �迭���� 0������ ���� �־�� ! ���� ��ġ���� array1[0]�� 0 �Դϴ�! 

		System.out.print("�迭�� ������ >> ");
		for (int i = 0; i < array1.length; i++) { // 1-2. �迭�� ������ �ֱ�
			array1[i] = random.nextInt(30) + 1;
			System.out.print(array1[i] + " ");
//			if (min > array1[i]) {
//				min = array1[i]; // ���� �迭�� ���� �� �ȵ��� ���¿��� min�� ���ϸ� ó���� min�� 0�̴ϱ� ������ 0�� ���Ϳ�!
////				index = i;
			}

			int min = array1[0];
			for (int a = 0; a < array1.length; a++) {
				if (array1[a] < min) { // max�� max ������ ���ؼ� �� ū�� �ٽ� max ������ ���
					min = array1[a];

				}
			}
			System.out.println("");
			System.out.println("���� ���� ���� " + min);
		}

	}
