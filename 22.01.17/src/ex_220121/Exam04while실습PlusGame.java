package ex_220121;

import java.util.Random;
import java.util.Scanner;

public class Exam04while실습PlusGame {

	private static final String LINE = "=========================================="; // 구분선 상수 선언

	public static void main(String[] args) {

		// plus game -> 두 개 숫자의 더한 값을 맞추는 게임
		// 랜덤의 숫자를 추출하는 방법

		Random r = new Random();
		Scanner sc = new Scanner(System.in);

		// 0부터 9까지 추출
		// 각 변수안에 랜덤의 숫자를 추출해서 넣는 코드
		int num1 = r.nextInt(10) + 1;
		int num2 = r.nextInt(10) + 1;
		String question1 = (num1 + "+" + num2 + " = ");

		// 정답을 저장할 변수
		int result = num1 + num2;

		// 사용자에게 문제를 제시하고 답을 입력받는 코드
		int input;

		// 문제 갯수를 저장할 변수
		int count = 0;

		// 정답개수를 저장할 변수
		int answer_count = 0;

		// 정답률을 저장할 변수
		double percent; // 퍼센트로 구해야 하기 때문에 더블

		// 사용자 선택 사항을 입력받는 코드
		String answer;

		while (true) { // while 무한 반복내에서 조건별로 실행문을 부여
			count += 1; // 반복이 1회 실행될때마다 문제 개수 +1
			System.out.println(count + "번 문제");
			System.out.print(question1); // 계산식 출력 // 정답 후 리턴일 경우 새로운 계산식 출력,
			// 오답 후 리턴일 경우 이전 계산식 출력
			input = sc.nextInt(); // 사용자가 계산결과 값 입력

			if (input == result) { // [1] 사용자 입력값과 정답이 다를 경우
				answer_count += 1; // 정답 개수 +1
				System.out.println(LINE);
				System.out.println("정답입니다.");
				percent = accracy(count, answer_count); // 정답률 계산
				print_accuracy(percent); // 정답률 출력
				System.out.print("다음 문제 도전하시겠습니까? Y/N >> ");
				answer = sc.next();
				System.out.println(LINE);
				if (answer.equals("Y")) { // 1. 다음 문제 도전 여부 Y 일 경우
					num1 = r.nextInt(10) + 1; // num1에 새로운 랜덤값 부여
					num2 = r.nextInt(10) + 1; // num2에 새로운 랜덤값 부여
					question1 = print_question(num1, num2); // 새로운 계산식 부여
					result = num1 + num2; // 새로운 정답 부여
					continue; // WHILE 문 첫부분으로 리턴
				} else if (answer.equals("y")) { // 2. 다음 문제 도전 여부 y 일 경우
					num1 = r.nextInt(10) + 1; // num1에 새로운 랜덤값 부여
					num2 = r.nextInt(10) + 1; // num2에 새로운 랜덤값 부여
					question1 = print_question(num1, num2); // 새로운 계산식 부여
					result = num1 + num2; // 새로운 정답 부여
					continue; // WHILE 문 첫 부분으로 리턴
				} else if (answer.equals("N")) { // 3. 다음 문제 도전 여부 N 일 경우
					percent = accracy(count, answer_count); // 정답률 계산
					end_message(percent); // 게임종료, 최종 정답률 출력
					grade_identify(percent); // 매소드 사용 학점 판별, 출력
					break; // while문 종료
				} else if (answer.equals("n")) { // 4. 다음 문제 도전 여부 n 일 경우
					percent = accracy(count, answer_count); // 정답률 계산
					end_message(percent); // 게임종료, 최종 정답률 출력
					grade_identify(percent); // 학점 판별, 출력
					break; // while문 종료
				}
				continue;
			}

			else if (input != result) { // [2] 사용자 입력값과 정답이 다를 경우
				System.out.println(LINE);
				System.out.println("오답입니다.");
				percent = accracy(count, answer_count); // 정답률 계산
				print_accuracy(percent); // 정답률 출력
				System.out.println("이전 문제 재도전 하시겠습니까?");
				System.out.print("계속합니다 : Y/N >> ");
				answer = sc.next();
				if (answer.equals("y")) {
					print_tryagain(); // 재도전 여부 메시지 출력
					System.out.println(LINE);
					continue;
				} else if (answer.equals("Y")) {
					print_tryagain(); // 재도전 여부 메시지 출력
					System.out.println(LINE);
					continue;
				} else if (answer.equals("N")) {
					System.out.println(LINE);
					percent = accracy(count, answer_count); // 정답률 계산
					end_message(percent); // 게임종료, 정답률 출력
					grade_identify(percent); // 학점 판별, 출력
					break;
				} else if (answer.equals("n")) {
					System.out.println(LINE);
					percent = accracy(count, answer_count); // 정답률 계산
					end_message(percent); // 게임종료, 정답률 출력
					grade_identify(percent); // 학점 판별, 출력
					break;
				}
			}
		}

	}

	private static void print_tryagain() {
		System.out.println("이전 문제 재도전하겠습니다.");
	}

	private static String print_question(int num1, int num2) {
		String question1;
		question1 = (num1 + "+" + num2 + " = ");
		return question1;
	}

	private static void print_accuracy(double percent) {
		System.out.println("지금까지 정답률 : " + percent + "%");
	}

	private static double accracy(int count, int answer_count) {
		double percent;
		percent = (double) answer_count / (double) count * 100;
		return percent;
	}

	private static void end_message(double percent) {
		System.out.println("게임을 종료합니다.");
		System.out.println("수고하셨습니다. ");
		System.out.println("최종 정답률 : " + percent + "%");
	}

	private static void grade_identify(double percent) { // 정답률에 따른 학점 매소드 생성
		switch ((int) percent / 10) {
		case 10:
		case 9:
			System.out.println("게임 결과는 A학점입니다.");
			break;
		case 8:
			System.out.println("게임 결과는 B학점입니다.");
			break;
		case 7:
			System.out.println("게임 결과는 C학점입니다.");
			break;
		default:
			System.out.println("게임 결과는 D학점입니다.");
		}
	}

}