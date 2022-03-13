package ex_220125;
import java.util.Random;

public class Ex_05배열 {

	public static void main(String[] args) {

		// 1~30의 임의의 값을 데이터에 넣어주자
		// 정수형타입의 배열을 크기 10을 생성하자 1. 배열에 값 넣기

		// 그리고 그 임의의 값들 중에서 가장 작은 값을 찾아서 출력해보자.. 2. 최솟값 찾기
		// " 가장 작은 값은 ___ 입니다 " 3. 출력하기

		Random random = new Random();

		int index = 0;
		int[] array1 = new int[10]; // 1-1. 배열 선언하기
//		int min = array1[0]; -> 초기에 배열에는 0값들이 들어가져 있어요 ! 여기 위치에서 array1[0]은 0 입니다! 

		System.out.print("배열의 값들은 >> ");
		for (int i = 0; i < array1.length; i++) { // 1-2. 배열에 랜덤값 넣기
			array1[i] = random.nextInt(30) + 1;
			System.out.print(array1[i] + " ");
//			if (min > array1[i]) {
//				min = array1[i]; // 아직 배열에 값이 다 안들어가진 상태에서 min과 비교하면 처음의 min이 0이니까 무조건 0이 나와요!
////				index = i;
			}

			int min = array1[0];
			for (int a = 0; a < array1.length; a++) {
				if (array1[a] < min) { // max랑 max 다음거 비교해서 더 큰거 다시 max 변수에 담기
					min = array1[a];

				}
			}
			System.out.println("");
			System.out.println("가장 작은 값은 " + min);
		}

	}
