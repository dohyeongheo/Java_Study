package ex_220118;
import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {

		// ����ڰ� �Է��� ������ �� �����ϱ�
		// Ű���带 ����� ����� �Է°� �ޱ�
		
		// 1. �Է� �� �� �ִ� Ű���� ��� �ҷ�����
		// sc�� Scanner�� �����ϰ� �θ� ��Ī
		// Scanner�� �ҷ��ö� ��! import �۾� �����ϱ�
		
	Scanner sc = new Scanner(System.in);
	// CTRL + SHIFT + O = IMPORT �ڵ��ϼ�
	
	System.out.print("���� �Է� : ");
	int num = sc.nextInt();
	System.out.println("�Էµ� ���ڴ� : " + num + " �Դϴ�.");
	System.out.print("�̸� �Է� : ");
	String name= sc.next();
	System.out.println("�Էµ� �̸��� : "+ name + " �Դϴ�.");

	// ������ �Է� �ޱ�
	// sc.nextint();
	
	// ������ �Է� �ޱ�
	// sc.next();
	
	
	}

}
