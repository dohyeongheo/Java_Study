package ex_220127_array;

public class Exam04�������� {

	public static void main(String[] args) {
		// SelectionSort(��������)
		// - �ε��� ã��
		int[] array = { 45, 7, 12, 82, 25 };
		int maxIndex = 0; // ū ���� �ε����� ������ ����
		int temp = 0; // ġȯ�Ҷ� �ӽ� ���� �����ϴ� ����

		// 1STEP

		for (int i = array.length; i > 1; i--) {
			maxIndex = 0; // ȸ������� ������ �ʱ�ȭ
			for (int j = 1; j < i; j++) {
				if (array[maxIndex] < array[j]) {
					maxIndex = j;
				}
			}
			temp = array[i - 1];
			array[i - 1] = array[maxIndex];
			array[maxIndex] = temp;
		}

		System.out.println(arrays.toString(array));

	}

}
