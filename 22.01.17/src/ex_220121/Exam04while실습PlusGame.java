package ex_220121;

import java.util.Random;
import java.util.Scanner;

public class Exam04while�ǽ�PlusGame {

	private static final String LINE = "=========================================="; // ���м� ��� ����

	public static void main(String[] args) {

		// plus game -> �� �� ������ ���� ���� ���ߴ� ����
		// ������ ���ڸ� �����ϴ� ���

		Random r = new Random();
		Scanner sc = new Scanner(System.in);

		// 0���� 9���� ����
		// �� �����ȿ� ������ ���ڸ� �����ؼ� �ִ� �ڵ�
		int num1 = r.nextInt(10) + 1;
		int num2 = r.nextInt(10) + 1;
		String question1 = (num1 + "+" + num2 + " = ");

		// ������ ������ ����
		int result = num1 + num2;

		// ����ڿ��� ������ �����ϰ� ���� �Է¹޴� �ڵ�
		int input;

		// ���� ������ ������ ����
		int count = 0;

		// ���䰳���� ������ ����
		int answer_count = 0;

		// ������� ������ ����
		double percent; // �ۼ�Ʈ�� ���ؾ� �ϱ� ������ ����

		// ����� ���� ������ �Է¹޴� �ڵ�
		String answer;

		while (true) { // while ���� �ݺ������� ���Ǻ��� ���๮�� �ο�
			count += 1; // �ݺ��� 1ȸ ����ɶ����� ���� ���� +1
			System.out.println(count + "�� ����");
			System.out.print(question1); // ���� ��� // ���� �� ������ ��� ���ο� ���� ���,
			// ���� �� ������ ��� ���� ���� ���
			input = sc.nextInt(); // ����ڰ� ����� �� �Է�

			if (input == result) { // [1] ����� �Է°��� ������ �ٸ� ���
				answer_count += 1; // ���� ���� +1
				System.out.println(LINE);
				System.out.println("�����Դϴ�.");
				percent = accracy(count, answer_count); // ����� ���
				print_accuracy(percent); // ����� ���
				System.out.print("���� ���� �����Ͻðڽ��ϱ�? Y/N >> ");
				answer = sc.next();
				System.out.println(LINE);
				if (answer.equals("Y")) { // 1. ���� ���� ���� ���� Y �� ���
					num1 = r.nextInt(10) + 1; // num1�� ���ο� ������ �ο�
					num2 = r.nextInt(10) + 1; // num2�� ���ο� ������ �ο�
					question1 = print_question(num1, num2); // ���ο� ���� �ο�
					result = num1 + num2; // ���ο� ���� �ο�
					continue; // WHILE �� ù�κ����� ����
				} else if (answer.equals("y")) { // 2. ���� ���� ���� ���� y �� ���
					num1 = r.nextInt(10) + 1; // num1�� ���ο� ������ �ο�
					num2 = r.nextInt(10) + 1; // num2�� ���ο� ������ �ο�
					question1 = print_question(num1, num2); // ���ο� ���� �ο�
					result = num1 + num2; // ���ο� ���� �ο�
					continue; // WHILE �� ù �κ����� ����
				} else if (answer.equals("N")) { // 3. ���� ���� ���� ���� N �� ���
					percent = accracy(count, answer_count); // ����� ���
					end_message(percent); // ��������, ���� ����� ���
					grade_identify(percent); // �żҵ� ��� ���� �Ǻ�, ���
					break; // while�� ����
				} else if (answer.equals("n")) { // 4. ���� ���� ���� ���� n �� ���
					percent = accracy(count, answer_count); // ����� ���
					end_message(percent); // ��������, ���� ����� ���
					grade_identify(percent); // ���� �Ǻ�, ���
					break; // while�� ����
				}
				continue;
			}

			else if (input != result) { // [2] ����� �Է°��� ������ �ٸ� ���
				System.out.println(LINE);
				System.out.println("�����Դϴ�.");
				percent = accracy(count, answer_count); // ����� ���
				print_accuracy(percent); // ����� ���
				System.out.println("���� ���� �絵�� �Ͻðڽ��ϱ�?");
				System.out.print("����մϴ� : Y/N >> ");
				answer = sc.next();
				if (answer.equals("y")) {
					print_tryagain(); // �絵�� ���� �޽��� ���
					System.out.println(LINE);
					continue;
				} else if (answer.equals("Y")) {
					print_tryagain(); // �絵�� ���� �޽��� ���
					System.out.println(LINE);
					continue;
				} else if (answer.equals("N")) {
					System.out.println(LINE);
					percent = accracy(count, answer_count); // ����� ���
					end_message(percent); // ��������, ����� ���
					grade_identify(percent); // ���� �Ǻ�, ���
					break;
				} else if (answer.equals("n")) {
					System.out.println(LINE);
					percent = accracy(count, answer_count); // ����� ���
					end_message(percent); // ��������, ����� ���
					grade_identify(percent); // ���� �Ǻ�, ���
					break;
				}
			}
		}

	}

	private static void print_tryagain() {
		System.out.println("���� ���� �絵���ϰڽ��ϴ�.");
	}

	private static String print_question(int num1, int num2) {
		String question1;
		question1 = (num1 + "+" + num2 + " = ");
		return question1;
	}

	private static void print_accuracy(double percent) {
		System.out.println("���ݱ��� ����� : " + percent + "%");
	}

	private static double accracy(int count, int answer_count) {
		double percent;
		percent = (double) answer_count / (double) count * 100;
		return percent;
	}

	private static void end_message(double percent) {
		System.out.println("������ �����մϴ�.");
		System.out.println("�����ϼ̽��ϴ�. ");
		System.out.println("���� ����� : " + percent + "%");
	}

	private static void grade_identify(double percent) { // ������� ���� ���� �żҵ� ����
		switch ((int) percent / 10) {
		case 10:
		case 9:
			System.out.println("���� ����� A�����Դϴ�.");
			break;
		case 8:
			System.out.println("���� ����� B�����Դϴ�.");
			break;
		case 7:
			System.out.println("���� ����� C�����Դϴ�.");
			break;
		default:
			System.out.println("���� ����� D�����Դϴ�.");
		}
	}

}