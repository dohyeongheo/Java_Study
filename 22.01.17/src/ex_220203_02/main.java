package ex_220203_02;

import java.nio.charset.IllegalCharsetNameException;
import java.security.cert.PKIXBuilderParameters;
import java.util.jar.Attributes.Name;

import ex_220203_01.Bank;

public class main {
	public static void main(String[] args) {
// �л�(����) ���� ���α׷�
		// �л� ��ü
		// ����
		// student ��ü pbk�� ���� ��
		// �̸� �ں���, �й� 20180852, �������� : 82, �������� 71, �������� 65�� �־��ּ���

		student pbk = new student("�ں���", "20180625", 95, 84, 66);
		student kmg = new student("��α�", "20147777", 99, 76, 54);
		student jjy = new student("������", "20138879");
		
		
		// �޼ҵ� �����ε� (�ߺ�����)
		// ������ �̸��� �޼ҵ带 ����ϴ� ���
		// �� �� �ϳ��� ���Ǹ� �����ϸ� ������ �̸��� �޼ҵ带 ���� �� �ִ�.
		// 1. �Ű������� ������ �ٸ� ��
		// 2. �Ű������� ������ Ÿ���� �ٸ� ��
		
		
		
		// ������ : ��ü�� ������ �� �ڵ����� ȣ��Ǵ� Ư���� �޼ҵ� (��ü�� �����ϴ� ��)
		// ��ü�� �����Ҷ� ������ �̸�, �й�, ���� ������ �ֵ��� �Ѵٸ�?
		// �����Ǵ� �����Ͱ� �����ұ�? �ƴϿ�.
		
		
		
		// ����
		// student Ŭ������ setName() �޼ҵ带 ����
		// �̸��� �Ű������� �޾� �ڽ��� �ʵ� name�� ���� �ִ�
		// �żҵ带 �����Ͻÿ�

//		pbk.setName("�ں���");
//		String name = pbk.getName();
//		System.out.println(name);
		// student Ŭ������ getName() �޼ҵ带 ����
		// ��ü �ȿ� �ִ� name ���� �����ִ� �޼ҵ带 ����ÿ�
//		pbk.setStuId("20180852");
		pbk.setMath(82);
		pbk.setEng(71);
		pbk.setSci(65);
		

		System.out.println(pbk.getName());
		System.out.println(pbk.getStuId());
		System.out.println(pbk.getMath());
		System.out.println(pbk.getEng());
		System.out.println(pbk.getSci());
		System.out.println(pbk.getScore());
		
		

	}
}
