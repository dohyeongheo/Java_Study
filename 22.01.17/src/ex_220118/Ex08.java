package ex_220118;
import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�� �Է� : ");
		int totalsecond = sc.nextInt();
		int hour = totalsecond/3600;
		int min = totalsecond%3600/60;
		int sec = totalsecond%3600%60;
//		int sec = totalsecond%60;
		System.out.println(hour + "�� " + min + "�� " + sec + "��");
		
//		
		

		
	}

}
