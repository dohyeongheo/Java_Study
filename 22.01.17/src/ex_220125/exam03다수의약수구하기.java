package ex_220125;
import java.util.Scanner;

public class exam03다수의약수구하기 {

	public static void main(String[] args) {

//	Scanner sc = new Scanner(System.in);

//		for (int a = 2; a <= 30; a++) {
//			System.out.print(a + "의 약수 : ");
//			for (int b = 1; b <= 30; b++) {
//				if (a % b == 0)
//					System.out.print(b + " ");
//			}
//			System.out.println();
//		}

		Scanner sc = new Scanner (System.in);
		System.out.print("첫번째 숫자를 입력하세요 >> ");
		int a = sc.nextInt();
		System.out.print("두번째 숫자를 입력하세요 >> ");
		int b = sc.nextInt();
		
		System.out.println("최대공약수 : ");
		
		for (int c=1; c<=1000; c++) {
			if (a%c==0) {
				int d = c;
				break;
			}
					b%c==0) {
				
				int e = b;
				int result = d*e;
				System.out.print(result);
			}
			
				
			
			
		}
			
		
		
		
		
	}
}

//6의 약수
//2 3
//
//8의 약수
//
//2 4