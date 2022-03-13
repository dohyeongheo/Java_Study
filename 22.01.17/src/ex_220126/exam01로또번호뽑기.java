package ex_220126;
import java.util.Arrays;
import java.util.Random;

public class exam01로또번호뽑기 {

	public static void main(String[] args) {

		Random r = new Random();
		int[] lottoNumber = new int[6];

		// 첫번째 로또 뽑는 방법
		// 해당 인덱스 위치에 랜덤의 숫자를 뽑고나서 이전까지 뽑은 값들이 있는지 비교 후
		// 중복값이 있으면 해당 위치의 값을 다시 뽑고 다시 비교
		// 중복값이 없으면 다음 숫자 뽑음

//		for (int i = 0; i < lottoNumber.length; i++) {
//			lottoNumber[i] = r.nextInt(6) + 1;
//			for (int j = 0; j < i; j++) {
//				if (lottoNumber[i] == lottoNumber[j]) {
//					i--;
//					break;
//				}
//			}
//		}
//		System.out.println(Arrays.toString(lottoNumber));

		// 두번째 로또 뽑는 방법
//		일단은 중복 상관없이 각 배열 위치에 랜덤 숫자를 다 집어넣는다.
//		그 다음에 각 인데스를 서로 일일이 비교하면서 하나라도 중복 숫자가 존재한다면
//		다시랜덤 숫자를 전체 뽑는다.
//		boolean ischeck = false; // 중복이 있는지 없는지 알 수 있는 변수

		while (true) {
			// 로또 번호 생성
			for (int i = 0; i < lottoNumber.length; i++) {
				lottoNumber[i] = r.nextInt(6) + 1;
			}
			// 뽑은 번호 비교 0인덱스와 12345 비교 1인덱스와 02345비교...
//				
//					if (lottoNumber[i] == lottoNumber[i + 1]) {
//						continue;
//					}

			for (int a = 1; a < 6; a++) {
				if (lottoNumber[a] == lottoNumber[a + 1]) {
					continue;
				}

				else if (lottoNumber[a] != lottoNumber[a + 1]) {
					break;
				}

			}
			System.out.println(Arrays.toString(lottoNumber));
		}

	}
}
