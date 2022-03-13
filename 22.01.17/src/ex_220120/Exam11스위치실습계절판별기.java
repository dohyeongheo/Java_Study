package ex_220120;
import java.util.Scanner;

public class Exam11스위치실습계절판별기 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("월 입력 : ");
		int num = sc.nextInt();
		String month = "월은";
		String end = "입니다!";
		String spring = " 봄";
		String summer = " 여름";
		String fall = " 가을";
		String winter = " 겨울";

		switch (num) {
		case 1, 2 :
			System.out.println(num + month + winter + end);
			break;
		case 3, 4, 5:
			System.out.println(num + month + spring + end);
			break;
		case 6, 7, 8:
			System.out.println(num + month + summer + end);
			break;
		case 9, 10, 11:
			System.out.println(num + month + fall + end);
			break;
		case 12:
			System.out.println(num + month + winter + end);
			break;
		}

	}

}
