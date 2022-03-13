package ex_220125;

public class Ex_04배열 {

	public static void main(String[] args) {

		// 최대값 찾아보자

		// 배열의 데이터 타입은 정수형
		// 안에들어갈 데이터는 -> 23,24,95,17,6,89,47,56,68,71

		/// 이 안에 있는 데이터 값들 중에 제일 큰 수를 가진 인덱스의 값과 데이터값을 출력!

		// 인덱스 :
		// 제일 큰 수 :

//		int[] arr = { 23, 45, 95, 17, 6, 89, 47, 56, 68, 71 };
//		int max = arr[0];
//		int index = 0;
//
//		for (int i = 0; i < arr.length; i++) {
//			if (max < arr[i]) {
//				max = arr[i];
//
//			}
//			if (max == arr[i]) {
//				index = i;
//			}
//		}
//		System.out.println("인덱스 : " + index);
//		System.out.println("최대값 : " + max);

		int[] array = {23, 45, 95, 17, 6, 89, 47, 56, 68, 71};
	      int max = array[0];
	      int maxIndex = 0 ;
	      for (int i = 0; i < array.length; i++) {
	         if(array[i] > max) { // max랑 max 다음거 비교해서 더 큰거 다시 max 변수에 담기
	            max = array[i];
	            maxIndex=i; // max와 비교해서 더 큰 현재의 인덱스를 담기
	         }
	      }
	      System.out.println("인덱스 : " + maxIndex);
	      System.out.println("max : " + max);
		
		
	}

}
