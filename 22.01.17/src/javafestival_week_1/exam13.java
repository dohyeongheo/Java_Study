package javafestival_week_1;

import java.util.Random;

public class exam13 {

	public static void main(String[] args) {

		// 8칸 크기 정수형 배열 선언
		int array[] = new int[8];
		Random random = new Random();

		// 배열에 랜덤수 입력하기
		for (int i = 0; i < array.length; i++) {
			array[i] = random.nextInt(60);
		}
		
		System.out.print("배열에 있는 모든 값 : ");

		// 배열에 있는 모든 값 출력하기
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		
		
		
		

	}
}
