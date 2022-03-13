package ex_220128;
import java.util.Scanner;

public class Exam03���̳ʸ���ġ�޼ҵ� {

	public static void main(String[] args) {
		// ���� �ܼ��� �˻� ������� ������ ������ �ʿ����. ����Ʈ�� ���̰� ����� ��ȿ����
		// # Binary Search
		// ����Ʈ�� �߰� ���� ���� ũ�� ������ ���� �˻��ϴ� �˰��� ���ĵ� ����Ʈ�� ��� �� �� �ִ�.
		// ���ٿ� �����̶� ��� ���ݰ� �̾߱��ϸ鼭 ����Ȯ�� ���̱�

		Scanner sc = new Scanner(System.in);

		System.out.print("ã���� �ϴ� ���ڸ� �Է� >> ");

		int searchNumber = sc.nextInt();
		binerysearch(searchNumber);
		int searchNumber1 = sc.nextInt();
		binerysearch(searchNumber1);
		int searchNumber2 = sc.nextInt();
		binerysearch(searchNumber2);

		// ����.
		// BinarySearch�� ���� �����ؼ� searchNumber�� ����� �ε����� �ִ��� �˾Ƴ��ÿ�.
		// 78�Է� -> 78�� 8��° �ε����� �ֽ��ϴ�.
		// 100�Է� -> 100�� �������� �ʽ��ϴ�.

	}

	public static void binerysearch(int num1) {

		binarysearch1(num1);

	}

	private static void binarysearch1(int num1) {
		int[] array = { 1, 7, 16, 25, 30, 33, 41, 66, 78, 90 };

		int low = 0; // �迭�ȿ��� ���� ���� �ε��� ��ȣ�� ������ ����
		int high = array.length - 1; // �迭�ȿ��� ���� ���� �ε��� ��ȣ�� ������ ����
		int mid; // �迭 �ȿ��� ��� ��ġ�� �ε��� ��ȣ�� ������ ����
		boolean ischeck = true; // ã���� �ϴ� ���� �ִ��� ���� �Ǵ� ����

		while (low <= high) {
			mid = (low + high) / 2;
			if (array[mid] == num1) {
				System.out.println(num1 + "�� " + mid + "��° �ε����� �ֽ��ϴ�.");
				ischeck = false;
				break;
			} else if (array[mid] > num1) {
				high = mid - 1;
			} else if (array[mid] < num1) {
				low = mid + 1;
			}

		}
		if (ischeck)
			System.out.println(num1 + "�� �ε��� ���� �������� �ʽ��ϴ�.");
	}

}

//		if (ischeck) System.out.println(searchNumber + "�� �ε��� ���� �������� �ʽ��ϴ�.");
