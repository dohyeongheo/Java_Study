package ex_220120;

import java.util.Scanner;

public class Exam06����if�� {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("���輺�� �Է� : ");
		int score = sc.nextInt();

		boolean check1 = score >= 90;
		boolean check2 = score >= 80 && score < 90;
		boolean check3 = score >= 70 && score < 80;
		boolean check4 = score >= 60 && score < 70;
		boolean check5 = score < 60;

		if (check1) {
			System.out.println("A����");
		} else if (check2) {
			System.out.println("B����");
		} else if (check3) {
			System.out.println("C����");
		} else if (check4) {
			System.out.println("D����");
		} else if (check5)
			System.out.println("F����");
	}

}
