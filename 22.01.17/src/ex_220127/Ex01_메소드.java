package ex_220127;

public class Ex01_�޼ҵ� {

	public static void main(String[] args) {

		// �޼��带 ȣ�� �ϴ� ��
		addNumber(3, 5);

		// +2�� �Ϸ�� ������� ����غ��ô�
		// ��, �޼��带 ����ҰŰ�, �Ű����� �ٲ��� �ʰ�
	}

	// �޼��� ����
	// 1. ���� ������ (���� ������) -> public (��/�ܺο��� ������ ������ ������)
	// 2. static -> ����Ǿ����°�
	// 3. ����Ÿ�� (���� Ÿ���� ���� ��� void ���) -> return
	// 4. �޼����� �̸� (ȣ���� �̸�)
	// 5. �Ű����� -> �޼��� �ȿ��� ����ϰ� �� ����

	public static void addNumber(int a, int b) {
		System.out.println(a + b + 2);
	}

}
