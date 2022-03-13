package ex_220203_02;

import java.util.Scanner;

public class main2 {
	public static void main(String[] args) {
		student pbk = new student("박병관", "20188065", 99, 81, 78);
		student csm = new student("채수민", "20178065", 79, 82, 48);
		student jjy = new student("조자연", "20168065", 89, 84, 89);
		student kdw = new student("김동원", "20158065", 69, 89, 91);
		student ksg = new student("강성관", "20148065", 74, 73, 99);

		// 여러개의 데이터를 묶어서 보관하는 방법
		// 1. 배열
		// 2. arraylist

		student[] list = { pbk, csm, jjy, kdw, ksg };
		Scanner sc = new Scanner(System.in);

		while (true) {

			System.out.print("1.전체이름보기 2.조회 3. 종료 >> ");
			int choice = sc.nextInt();

			if (choice == 1) {
				System.out.println("==전체이름보기==");
				for (int i = 0; i < list.length; i++) {
					System.out.println(i + 1 + "." + list[i].getName());
				}

			}

			else if (choice == 2) {
				System.out.print("조회할 사람의 이름 입력 : ");
				String name = sc.next();
				boolean ischeck = true;

				for (int i = 0; i < list.length; i++) {
					if (list[i].getName().equals(name)) {
						System.out.print(list[i].getName() + " - " + list[i].getStuId() + " - " + list[i].getScore());
						System.out.println("");
						ischeck = false;
					}
				}
				if (ischeck)
					System.out.println("일치하는 사람이 없습니다.");

			} else if (choice == 3) {
				System.out.println("프로그램이 종료됩니다.");
				break;
			}

			else {
				System.out.println("정확한 숫자를 입력해주세요.");

			}

		}

	}
}
