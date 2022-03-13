package ex_220120;
import java.util.Scanner;

public class Exam04IF문실습정처기 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("DB : ");
		int score1 = sc.nextInt();
		System.out.print("전자계산기 구조 : ");
		int score2 = sc.nextInt();
		System.out.print("os : ");
		int score3 = sc.nextInt();
		System.out.print("데이터통신 : ");
		int score4 = sc.nextInt();
		System.out.print("소프트웨어공학 : ");
		int score5 = sc.nextInt();

		int standard = 8;
		int sum = score1 + score2 + score3 + score4 + score5;

		boolean check1 = score1 >= 8 && score2 >= 8 && score3 >= 8 && score4 >= 8 && score5 >= 8;
		boolean check2 = sum >= 60;

		if (check1 && check2) {
			System.out.println("합격!");
		} else {
			System.out.println("불합격..");
		}

//		if (score1 < 8 || score2 < 8 || score3 < 8 || score4 < 8 || score5 < 8) {
//			System.out.println("불합격입니다.");
//		} else if (score1 >= 9 && score2 >= 9 && score3 >= 9 && score4 >= 9 && score5 >= 9
//				&& score1 + score2 + score3 + score4 + score5 >= 60) {
//			System.out.println("합격입니다.");

//		if (score1 > standard && score2 > standard && score3 > standard && score4 > standard && score5 > standard && sum >= 60) {
//			System.out.println("합격입니다.");
//		} else {
//			System.out.println("불합격입니다");
	}

}
