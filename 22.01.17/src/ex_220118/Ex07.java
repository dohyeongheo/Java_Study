package ex_220118;
import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {

Scanner sc = new Scanner(System.in);

	System.out.print("JAVA ���� �Է� : ");
	int javascore = sc.nextInt();

	System.out.print("Web ���� �Է� : ");
	int webscore = sc.nextInt();

	System.out.print("Android ���� �Է� : ");
	int andscore = sc.nextInt();

// ���� �� ���� : ���� ������ ctrl alt �� �Ʒ� 

	int sum = javascore + webscore + andscore;
	int avg = sum/3;
	
	System.out.println("�հ� : " + sum);
	System.out.print("��� : " + avg);

	}
}
