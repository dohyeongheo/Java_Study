package ex_220119;
import java.util.Scanner;

public class Exam08삼항연산자짝수홀수 {

	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	System.out.print("정수 입력 >> ");
	int A = sc.nextInt();
	
	String result = A%2==0 ? "짝수입니다." : "홀수입니다.";
	System.out.println(result);
		
	
	
	
	}

}
