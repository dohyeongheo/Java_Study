package ex_220126;
import java.util.Arrays;
import java.util.Random;

public class exam01�ζǹ�ȣ�̱� {

	public static void main(String[] args) {

		Random r = new Random();
		int[] lottoNumber = new int[6];

		// ù��° �ζ� �̴� ���
		// �ش� �ε��� ��ġ�� ������ ���ڸ� �̰��� �������� ���� ������ �ִ��� �� ��
		// �ߺ����� ������ �ش� ��ġ�� ���� �ٽ� �̰� �ٽ� ��
		// �ߺ����� ������ ���� ���� ����

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

		// �ι�° �ζ� �̴� ���
//		�ϴ��� �ߺ� ������� �� �迭 ��ġ�� ���� ���ڸ� �� ����ִ´�.
//		�� ������ �� �ε����� ���� ������ ���ϸ鼭 �ϳ��� �ߺ� ���ڰ� �����Ѵٸ�
//		�ٽ÷��� ���ڸ� ��ü �̴´�.
//		boolean ischeck = false; // �ߺ��� �ִ��� ������ �� �� �ִ� ����

		while (true) {
			// �ζ� ��ȣ ����
			for (int i = 0; i < lottoNumber.length; i++) {
				lottoNumber[i] = r.nextInt(6) + 1;
			}
			// ���� ��ȣ �� 0�ε����� 12345 �� 1�ε����� 02345��...
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
