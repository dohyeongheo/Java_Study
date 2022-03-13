package ex_220119;
import java.util.Scanner;

public class Exam09삼항연산자큰수작은수 {

	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	System.out.print("첫 번째 정수 입력 : ");
	int num1 = sc.nextInt();
	System.out.print("두 번째 정수 입력 : ");
	int num2 = sc.nextInt();
	int result = num1 > num2 ? num1-num2 : num2-num1;
	System.out.println("두 수의 차 : " + result);



	}

}
