package ex_220120;
import java.util.Scanner;

public class Exam10����ġ�ǽ������Ǻ� {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		int totalscore = sc.nextInt();

		switch (totalscore / 10) {
		case 10:
			System.out.println("A�����Դϴ�!");
			break;
		case 9:
			System.out.println("A�����Դϴ�!");
			break;
		case 8:
			System.out.println("B�����Դϴ�!");
			break;
		case 7:
			System.out.println("C�����Դϴ�!");
			break;
		default:
			System.out.println("D�����Դϴ�!");
		}

	}

}
