package javafestival_week_2;

import java.util.Scanner;

import javax.security.auth.callback.ConfirmationCallback;

import org.graalvm.compiler.phases.common.LoopSafepointInsertionPhase;

public class exam07 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("N*N �迭�� ����� ������ �Է��ϼ��� >> ");
		int input = sc.nextInt();

		int[][] array = new int[input][input];
		int k = 1;
		int q = 10;

		// �Էº�

		for (int i = 0; i < array.length; i++) {
			if (i % 2 == 0) {
				for (int j = 0; j < array[i].length; j++) {
					array[i][j] = k;
					++k;
				}

			} else {
				for(int j = array[i].length-1)
			}
		}

		// ��º�
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				System.out.print(array[i][j] + "\t");
			}
			System.out.println();
		}

	}
}
