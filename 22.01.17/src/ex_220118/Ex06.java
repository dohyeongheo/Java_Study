package ex_220118;
import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {

		// 사용자가 입력한 데이터 값 저장하기
		// 키보드를 사용한 사용자 입력값 받기
		
		// 1. 입력 할 수 있는 키보드 기능 불러오기
		// sc는 Scanner를 간단하게 부를 별칭
		// Scanner를 불러올때 꼭! import 작업 실행하기
		
	Scanner sc = new Scanner(System.in);
	// CTRL + SHIFT + O = IMPORT 자동완성
	
	System.out.print("숫자 입력 : ");
	int num = sc.nextInt();
	System.out.println("입력된 숫자는 : " + num + " 입니다.");
	System.out.print("이름 입력 : ");
	String name= sc.next();
	System.out.println("입력된 이름은 : "+ name + " 입니다.");

	// 정수형 입력 받기
	// sc.nextint();
	
	// 문자형 입력 받기
	// sc.next();
	
	
	}

}
