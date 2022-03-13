package ex_220119;
import java.util.Scanner;

public class Exam10삼항연산자농구공구하기 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("농구공의 개수를 입력하세요 : " );
	int num1 = sc.nextInt();
	int num2 = 5;
	int result = num1%num2 == 0 ? num1/num2 : (num1/num2) +1;
	System.out.println("필요한 상자의 수 : " + result);
		
		
		
	}

}
