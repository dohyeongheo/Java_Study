package ex_220128;
import java.util.ArrayList;
import java.util.Scanner;

public class MusicList {

	public static void main(String[] args) {

		// 입력하는 도구를 불러오기
		Scanner sc = new Scanner(System.in);

		ArrayList<String> list = new ArrayList<String>();

		list.add("깡");
		list.add("미쳤어");
		list.add("토요일밤에");

		while (true) {
			// 4번을 입력받았을때 종료
			System.out.print("[1] 노래조회 [2] 노래추가 [3] 노래삭제 [4] 종료 >> ");
			// 사용자로부터 어떤 숫자를 입력
			int select = sc.nextInt();

			if (select == 1) {
				for (int i = 0; i < list.size(); i++)
					System.out.println(list.get(i));
			}

			else if (select == 2) {
				System.out.println("추가할 노래 제목을 입력하세요");
				list.add(sc.next());
//				continue;

			}

			else if (select == 3) {
				System.out.println("삭제할 노래 제목을 입력하세요");
				list.remove(sc.next());
			}

			else if (select == 4) {
				System.out.println("프로그램을 종료합니다.");
				break;
			} else {
				System.out.println("잘못입력하셨습니다.");
			}
		}

	}

}
