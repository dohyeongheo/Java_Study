package ex_220125;
import java.util.Scanner;

public class exam03�ټ��Ǿ�����ϱ� {

	public static void main(String[] args) {

//	Scanner sc = new Scanner(System.in);

//		for (int a = 2; a <= 30; a++) {
//			System.out.print(a + "�� ��� : ");
//			for (int b = 1; b <= 30; b++) {
//				if (a % b == 0)
//					System.out.print(b + " ");
//			}
//			System.out.println();
//		}

		Scanner sc = new Scanner (System.in);
		System.out.print("ù��° ���ڸ� �Է��ϼ��� >> ");
		int a = sc.nextInt();
		System.out.print("�ι�° ���ڸ� �Է��ϼ��� >> ");
		int b = sc.nextInt();
		
		System.out.println("�ִ����� : ");
		
		for (int c=1; c<=1000; c++) {
			if (a%c==0) {
				int d = c;
				break;
			}
					b%c==0) {
				
				int e = b;
				int result = d*e;
				System.out.print(result);
			}
			
				
			
			
		}
			
		
		
		
		
	}
}

//6�� ���
//2 3
//
//8�� ���
//
//2 4