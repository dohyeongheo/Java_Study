package ex_220128;
import java.util.ArrayList;

public class Ex_01���� {

	public static void main(String[] args) {

		// �������� �迭�� ���� ���¸� ������ �ִ� Ŭ����
		// collection å���� �о�� 390p

		// 1. Arraylist �����ϱ�

//		String s = 

		// Arraylist<������ ������ �ڷ���> ������ = new ArrayList<������ ������ �ڷ���>();
		// (); �� �����ֱ�;
		// ������ ������ �ڷ����� ���۷��� Ÿ���̾�� �Ѵ�.
		// String, Integer, Double...

		ArrayList<String> list = new ArrayList<String>();

		// <> : ���׸� ���
		// : Arraylist�� �����ϴ� ������ ������ �ڷ����� �����ϴ� ���
		// ���۷��� ��������, ��ü���¸��� ������ �� ���� (�⺻ �ڷ��� ���� x)

//		2. ���� �߰��ϱ�
		// ���� �߰��ϴ� �ż��尡 ���������� ���谡 �Ǿ� ����

		list.add("������");
		list.add("��������");
		list.add("���");

		// 3. �� ��������
		// list.get(1);

		System.out.println(list.get(1));
		System.out.println(list.get(2));

// 4. �� �����ϱ�

		list.remove(0);

		// �������� ������� ���� �ڿ� �ִ� ������ �ε����� ������ �̵��Ѵ�
		// �������� �ε��� ���� 0�̵ȴ� // ����� �ε��� ���� 1�� �ȴ�.
		System.out.println(list.get(0));

		// 5. ���ϴ� ��ġ�� ���� �߰��ϱ�.
		list.add(1, "�߰�����");
		
		// 6. ����Ǿ� �ִ� �������� �� ũ�� ��������
		list.size();
		System.out.println(list.size());
		
		
		// 7. ��� ���� �����ϴ� ���
		list.clear();
		System.out.println(list.size());
		
		
	}

}
