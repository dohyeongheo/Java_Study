package ex_220128;
import java.util.Scanner;

public class Exam01BinarySearch {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] array = { 1, 7, 16, 25, 30, 33, 41, 66, 78, 90 };
		int minindex = array[0];
		int maxindex = array[array.length - 1];
		int avg = minindex + maxindex / 2;

		System.out.print("ã���� �ϴ� ���ڸ� �Է� >> ");
		int serchnumber = sc.nextInt();

		for (int i = 0; i < array.length; i++) {
//			minindex = array[i];
			
			if (serchnumber >= avg) {
				minindex = array[i];
				avg = minindex + maxindex / 2;

			} else if (serchnumber == array[i]) {
				System.out.println(serchnumber + "�� " + i + "��° �ε����� �ֽ��ϴ�. ");
			}

			else if (serchnumber != array[i]) {
				System.out.println(serchnumber + "�� �ε��� ���� �������� �ʽ��ϴ�.");
				break;
			}
		}
	}
}

//		minindex=0;
//		
//		for (int i = 0; i < array.length; i++) {
//			if (serchnumber <= avg) {
//				maxindex = array[i];
//				avg = minindex + maxindex / 2;
//			} else if (serchnumber == array[i]) {
//				System.out.println(serchnumber + "��" + i + "��° �ε����� �ֽ��ϴ�. ");
//		}

// ���� ���̳ʸ� ��ġ�� ���� �����ؼ� ��ġ�ѹ��� ���° �ε����� �ִ��� �˾Ƴ��ÿ�
// 78�Է� > 78�� 8��° �ε����� �ֽ��ϴ�.
//		>> 100 �Է� > 100�� �������� �ʽ��ϴ�.
