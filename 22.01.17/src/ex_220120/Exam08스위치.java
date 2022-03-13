package ex_220120;
import java.util.Scanner;

public class Exam08스위치 {

	public static void main(String[] args) {

		// num1 의 값이 1이면 -> 안녕하세요 출력
//		2이면 -> 잘가세요 출력
//		3이면 -> 반갑습니다 출력
//		이외 -> 또 만나요 출력

		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ");
		int num = sc.nextInt();

//		int num = 1;

		switch (num) {
		case 1:
			System.out.println("안녕하세요");
			break;
		case 2:
			System.out.println("잘가세요");
			break;
		case 3:
			System.out.println("반갑습니다");
			break;
		case 4:
			System.out.println("또 만나요");
			break;
		default:
			System.out.println("이제 그만 하세요");
		}

	}

}
