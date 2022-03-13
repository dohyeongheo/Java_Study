package ex_220120;

import java.util.Scanner;

public class Exam06다중if문 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("시험성적 입력 : ");
		int score = sc.nextInt();

		boolean check1 = score >= 90;
		boolean check2 = score >= 80 && score < 90;
		boolean check3 = score >= 70 && score < 80;
		boolean check4 = score >= 60 && score < 70;
		boolean check5 = score < 60;

		if (check1) {
			System.out.println("A학점");
		} else if (check2) {
			System.out.println("B학점");
		} else if (check3) {
			System.out.println("C학점");
		} else if (check4) {
			System.out.println("D학점");
		} else if (check5)
			System.out.println("F학점");
	}

}
