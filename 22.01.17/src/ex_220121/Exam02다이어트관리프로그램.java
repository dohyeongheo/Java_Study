package ex_220121;
import java.util.Scanner;

public class Exam02���̾�Ʈ�������α׷� {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("���� ������ : ");
		int current = sc.nextInt();

		System.out.print("��ǥ ������ : ");
		int goal = sc.nextInt();

		int week = 1;
		String result_text = "���� ���� ������ : ";

		while (current > goal) {
			System.out.print(week + result_text);
			int minus = sc.nextInt();
			current -= minus;
			week++;

			if (current <= goal)
				System.out.println(week-1 + "���� ���� " + current + "kg �޼�!! �����մϴ�");
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
