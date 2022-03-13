package ex_220120;
import java.util.Scanner;

public class Exam01단순IF문 {

	public static void main(String[] args) {
// 변수 AGE의 값이 20이상이면 성인입니다 를 출력
		int age = 20;
// 조건문(조건식) { 
// 조건식이 true일때 실행될 코드
//	}
		if (age >= 20) {
			System.out.println(" 성인입니다.");
		} else {
			if (age < 20) {
				System.out.println("미성년자입니다.");
			}

//		if 조건식에 true에 해당되지 않는 녀석들이 다 넘어오는 부분

			// Scanner sc = new Scanner(System.in);

		}
	}
}
