package ex_220126;
import java.util.Scanner;

public class exam02회원가입시스템 {

	public static void main(String[] args) {

		// 회원가입 시스템
		// 로그인, 회원가입, 종료
		// 1. 회원가입 - 아이디, 패스워드, 닉네임을 입력받아 각각 배열에 저장
		// 2. 로그인 - 아이디, 패스워드를 입력받아 일치하면 닉네임님 환영합니다 출력
		// 3. 종료 - 프로그램 종료

		// 회원의 정보를 저장할 배열
		String[] ids = new String[5]; // 아이디 저장 배열
		String[] pws = new String[5]; // 비밀번호 저장 배열
		String[] nicks = new String[5]; // 닉네임 저장 배열
		int count = 0;

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("1. 회원가입 2. 로그인 3. 종료 >> ");
			int choice = sc.nextInt();

			// 입력받은 아이디, 비밀번호, 닉네임을 배열에 저장
			// 회원가입시 배열의 다음칸에 이어서 저장을 해야 하며
			// 5명의 회원가입이 다 되었다면 추가로 회원가입을 할 시
			// 더 이상 회원가입이 불가능합니다 출력
			// 현재 회원이 몇명 가입되어있는지 기억할 변수 필요

			if (choice == 1) {

				if (count < 5) {
					System.out.print("아이디 입력 : ");
					String id = sc.next();
					System.out.print("비밀번호 입력 : ");
					String pw = sc.next();
					System.out.print("닉네임 입력 : ");
					String nick = sc.next();
					System.out.println();

					ids[count] = id;
					pws[count] = pw;
					nicks[count] = nick;

					count++;

				} else {
					System.out.println();
					System.out.println("더 이상 회원 가입이 불가능합니다");
					System.out.println("처음으로 돌아갑니다. ");

				}

			} else if (choice == 2) {
				System.out.println();
				System.out.print("아이디를 입력해주세요 >> ");
				String id = sc.next();
				System.out.print("비밀번호를 입력해주세요 >> ");
				String pw = sc.next();

				int i = 0;
				for (i = 0; i < nicks.length; i++) {
					if (id.equals(ids[i]) && pw.equals(pws[i])) {
						System.out.println(nicks[i] + "님 로그인 성공했습니다.");
						System.out.println();
						break;
					}
				}

			} else if (choice == 3)

			{

				System.out.println("프로그램을 종료합니다...");
				break;
			}

		}

	}
}
