package ex_220120;
import java.util.Scanner;

public class Exam09����ġ�ǽ�Ȧ¦�Ǻ� {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("���� �Է� : ");
		int num1 = sc.nextInt();

		switch (num1 % 2) {
		case 0:
			System.out.println("¦���Դϴ�!");
		case 1:
			System.out.println("Ȧ���Դϴ�!");
		}

	}

}
