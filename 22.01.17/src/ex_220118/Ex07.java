package ex_220118;
import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {

Scanner sc = new Scanner(System.in);

	System.out.print("JAVA 점수 입력 : ");
	int javascore = sc.nextInt();

	System.out.print("Web 점수 입력 : ");
	int webscore = sc.nextInt();

	System.out.print("Android 점수 입력 : ");
	int andscore = sc.nextInt();

// 여러 행 복사 : 영역 선택후 ctrl alt 위 아래 

	int sum = javascore + webscore + andscore;
	int avg = sum/3;
	
	System.out.println("합계 : " + sum);
	System.out.print("평균 : " + avg);

	}
}
