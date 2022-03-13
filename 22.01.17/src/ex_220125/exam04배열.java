package ex_220125;

public class exam04배열 {

	public static void main(String[] args) {

		// 배열 만드기
		// 길이가 3인 정수형 배열 ARRAY를 만들기

		int[] array = new int[10];
		System.out.println(array);

		int cnt = 70;

		for (int i = 0; i < array.length; i++) {
			array[i] = cnt;
			cnt += 10;

		}

		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}

}

//		System.out.println(array[0]);
//		System.out.println(array[1]);
//		System.out.println(array[2]);
