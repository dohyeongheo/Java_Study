package ex_220120;
import java.util.Scanner;

public class Exam11����ġ�ǽ������Ǻ��� {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("�� �Է� : ");
		int num = sc.nextInt();
		String month = "����";
		String end = "�Դϴ�!";
		String spring = " ��";
		String summer = " ����";
		String fall = " ����";
		String winter = " �ܿ�";

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
