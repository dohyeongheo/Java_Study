package ex_220121;
import java.util.Scanner;

public class Exam02다이어트관리프로그램 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("현재 몸무게 : ");
		int current = sc.nextInt();

		System.out.print("목표 몸무게 : ");
		int goal = sc.nextInt();

		int week = 1;
		String result_text = "주차 감량 몸무게 : ";

		while (current > goal) {
			System.out.print(week + result_text);
			int minus = sc.nextInt();
			current -= minus;
			week++;

			if (current <= goal)
				System.out.println(week-1 + "주차 드디어 " + current + "kg 달성!! 축하합니다");
		}

	}

}
			
			
//			break;
			
//			while (week < 5) {
//			System.out.print(week + result_text);
//			int week1 = sc.nextInt();
//			week++;
//			System.out.print(week + result_text);
//			int week2 = sc.nextInt();
//			week++;
//			System.out.print(week + result_text);
//			int week3 = sc.nextInt();
//			week++;
//			System.out.print(week + result_text);
//			int week4 = sc.nextInt();
//			week++;
