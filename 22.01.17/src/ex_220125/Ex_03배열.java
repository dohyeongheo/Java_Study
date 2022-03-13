package ex_220125;
import java.util.Scanner;

public class Ex_03배열 {

	public static void main(String[] args) {

		// 우리가 입력하는 수 (데이터) 를 배열에 넣어보자!
		// 배열의 크기는 10
		// 배열의 타입은 정수형
		// 입력하는 도구를 불러와서
		Scanner sc = new Scanner(System.in);

//		int[] array1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };
//	
//
//		System.out.print("숫자를 입력하세요 >> ");
//		int num = sc.nextInt();
//		System.out.print("결과는 >> " + array1[num - 1]);

		int[] arr = new int[10];

		for (int i = 0; i < arr.length; i++) {
			System.out.print("숫자를 입력하세요 >> ");
			arr[i] = sc.nextInt();
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}

	}

}
