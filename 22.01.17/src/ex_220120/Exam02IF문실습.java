package ex_220120;
import java.util.Scanner;

public class Exam02IF문실습 {

	public static void main(String[] args) {
// 변수 NUM을 선언하고 키보드로부터 정수를 입력받습니다.
//만약 num의 값이 3의 배수이면서 5의 배수라면
//00은 3과 5의 배수입니다.
//아니라면
//00은 3과 5의 배수가 아닙니다.

		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();		
		if (num % 3 == 0 && num % 5 == 0) {
			System.out.println(num + "은(는) 3과 5의 배수입니다.");
		} else {
			System.out.println(num + "은(는) 3과 5의 배수가 아닙니다.");
		}

	}
}
