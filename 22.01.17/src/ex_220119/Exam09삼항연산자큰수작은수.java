package ex_220119;
import java.util.Scanner;

public class Exam09���׿�����ū�������� {

	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	System.out.print("ù ��° ���� �Է� : ");
	int num1 = sc.nextInt();
	System.out.print("�� ��° ���� �Է� : ");
	int num2 = sc.nextInt();
	int result = num1 > num2 ? num1-num2 : num2-num1;
	System.out.println("�� ���� �� : " + result);



	}

}
