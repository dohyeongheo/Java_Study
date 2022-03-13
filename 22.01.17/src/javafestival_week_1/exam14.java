package javafestival_week_1;

import java.util.Arrays;
import java.util.Random;

public class exam14 {
	public static void main(String[] args) {

		// 중복이 없는 6개의 숫자를 랜덤으로 뽑기
		Random r = new Random();
		// 로또번호를 저장할 배열
		int[] lottoNumber = new int[6];

		// 1. 첫번째 로또 뽑는 방법
		// - 해당인덱스 위치에 랜덤의 숫자를 뽑고나서 이전까지 뽑은 값들이 있는지 비교 후
		// 중복값이 있으면 해당위치의 값을 다시 뽑고 다시비교
		// 중복값이 없으면 그냥 넘어간다

//	      for (int i = 0; i < lottoNumber.length; i++) {
//	         lottoNumber[i] = r.nextInt(6) + 1;
//	         for (int j = 0; j < i; j++) {
//	            if (lottoNumber[i] == lottoNumber[j]) {
//	               i--;
//	               break;
//	            }
//	         }
//	      }

		// 2. 두번째 로또뽑는 방법
		// - 일단은 중복상관없이 각 배열위치에 랜덤숫자를 다 집어넣는다
		// 그다음에 각 인덱스를 서로 일일이 비교하면서 하나라도 중복 숫자가 존재한다면
		// 다시 랜덤숫자를 전체 뽑는다

		while (true) {
			for (int i = 0; i < lottoNumber.length; i++) {
				lottoNumber[i] = r.nextInt(6) + 1;
			}

			boolean isCheck = true; // 중복이있는지 없는지 알 수 있는 변수
			// 0 - 1 , 0 - 2, 0 - 3, 0 - 4, 0 -5
			for (int i = 0; i < lottoNumber.length - 1; i++) {
				for (int j = i + 1; j < lottoNumber.length; j++) {
					if (lottoNumber[i] == lottoNumber[j]) {
						isCheck = false;
					}
				}
			}
			if (isCheck) {
				break;
			}
		}

		for (int i = 0; i < lottoNumber.length; i++) {
			System.out.println("행운의 숫자 : " + lottoNumber[i]);

		}

	}
}
