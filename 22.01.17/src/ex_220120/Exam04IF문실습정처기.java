package ex_220120;
import java.util.Scanner;

public class Exam04IF���ǽ���ó�� {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("DB : ");
		int score1 = sc.nextInt();
		System.out.print("���ڰ��� ���� : ");
		int score2 = sc.nextInt();
		System.out.print("os : ");
		int score3 = sc.nextInt();
		System.out.print("��������� : ");
		int score4 = sc.nextInt();
		System.out.print("����Ʈ������� : ");
		int score5 = sc.nextInt();

		int standard = 8;
		int sum = score1 + score2 + score3 + score4 + score5;

		boolean check1 = score1 >= 8 && score2 >= 8 && score3 >= 8 && score4 >= 8 && score5 >= 8;
		boolean check2 = sum >= 60;

		if (check1 && check2) {
			System.out.println("�հ�!");
		} else {
			System.out.println("���հ�..");
		}

//		if (score1 < 8 || score2 < 8 || score3 < 8 || score4 < 8 || score5 < 8) {
//			System.out.println("���հ��Դϴ�.");
//		} else if (score1 >= 9 && score2 >= 9 && score3 >= 9 && score4 >= 9 && score5 >= 9
//				&& score1 + score2 + score3 + score4 + score5 >= 60) {
//			System.out.println("�հ��Դϴ�.");

//		if (score1 > standard && score2 > standard && score3 > standard && score4 > standard && score5 > standard && sum >= 60) {
//			System.out.println("�հ��Դϴ�.");
//		} else {
//			System.out.println("���հ��Դϴ�");
	}

}
