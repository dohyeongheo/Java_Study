package ex_220119;
import java.util.Scanner;

public class Exam10���׿����ڳ󱸰����ϱ� {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("�󱸰��� ������ �Է��ϼ��� : " );
	int num1 = sc.nextInt();
	int num2 = 5;
	int result = num1%num2 == 0 ? num1/num2 : (num1/num2) +1;
	System.out.println("�ʿ��� ������ �� : " + result);
		
		
		
	}

}
