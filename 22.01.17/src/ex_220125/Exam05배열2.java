package ex_220125;

public class Exam05배열2 {

	public static void main(String[] args) {

//		 길이가 3인 정수형 배열안에 10, 20, 30 넣기
//		 배열의 여러가지 생성 방법
//		 1. 배열을 먼저 생성하고 나서 각각 인덱스 안에 값을 넣는 방법 (인덱스에 어떤 값을 넣을지 모르는 경우)

		int[] array1 = new int[3];
		array1[0] = 10;
		array1[1] = 20;
		array1[2] = 30;
		System.out.println(array1[0]);

//		 2. 배열을 생성함과 동시에 값을 넣는 방법
		int[] array2 = {10, 20, 30};
		System.out.println(array2[0]);
		
		

	}

}
