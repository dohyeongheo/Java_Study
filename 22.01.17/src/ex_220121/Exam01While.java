package ex_220121;

public class Exam01While {

	public static void main(String[] args) {
// 1부터 10까지

		int num = 1;
		while (num <= 10) {
			System.out.println(num);
			num++;

			if (num == 11) {
				break;
			}
			System.out.println(num);
		}
	}
}
