package ex_220127_array;

public class Exam04선택정렬 {

	public static void main(String[] args) {
		// SelectionSort(선택정렬)
		// - 인덱스 찾기
		int[] array = { 45, 7, 12, 82, 25 };
		int maxIndex = 0; // 큰 값의 인덱스를 저장할 변수
		int temp = 0; // 치환할때 임시 값을 저장하는 변수

		// 1STEP

		for (int i = array.length; i > 1; i--) {
			maxIndex = 0; // 회차진행시 기준점 초기화
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
