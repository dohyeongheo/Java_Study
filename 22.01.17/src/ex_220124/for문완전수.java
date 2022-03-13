package ex_220124;

public class for문완전수 {

	public static void main(String[] args) {

//		i = 약수1 + 약수2 ..

		for (int i = 1; i <= 1000; i++) {

			for (int a = 1; a <= i; i++) {
				if (i % a == 0) {
					int sum = a++;
					if (i - sum == 0) {
						System.out.println("1부터 1000까지의 완전수는 : " + i);
					}

				}
			}

		}
	}

// 완전수 
// 자신의 약수 중에서 자신을 제외한 모든 약수의 합이
// 자기 자신과 같은 수를 의미 합니다.

// 6의 약수 : 1, 2, 3, 6
// 자신을 제외한 수의합 : 1+2+3 = 6
// 자신과 자신을 제외한 약수의 합이 같기 때문에 6는 완전수!!
//  NUM == NUM을 뺀 나머지 약수의 합

// 1 ~ 1000 의 수 중에서 완전수를 구해봅시다.

	int sum = 0;
	for (int i=1;i<=1000;i++)
	{
		// 1 ~ 1000완전수인지 아닌지를 판별 -> 조건식
		for (int j = 1; j <= i; j++) {
			// j가 i의 약수인지 아닌지를 판별
			if (i % j == 0) {
				// sum 변수에 넣어서 합을 구해주자.
				sum = sum + j;
			}

			// 12/2= 6
			// 12 = 6*2
			// sum == i*2 같다면,
			// i를 출력해줘

		}
// 약수의 합이 자기자신과 어떠한 관계 
		// sum - i == i
		// sum == i*2
		// sum /2 == i

		if (sum - i == i) {
			System.out.println(i);
		}

		// sum 변수를 0으로 초기화 시켜주자
		sum = 0;
	}
}
