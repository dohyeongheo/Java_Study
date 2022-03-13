package ex_220128;
import java.util.Scanner;

public class Exam02바이너리서치 {
	public static void main(String[] args) {
		// 가장 단순한 검색 방법으로 원소의 정렬이 필요없다. 리스트의 길이가 길수록 비효율적
		// # Binary Search
		// 리스트의 중간 값을 정해 크고 작음을 비교해 검색하는 알고리즘 정렬된 리스트에 사용 할 수 있다.
		// 업다운 게임이랑 비슷 절반값 이야기하면서 정답확률 높이기

		Scanner sc = new Scanner(System.in);

		int[] array = { 1, 7, 16, 25, 30, 33, 41, 66, 78, 90 };
		System.out.print("찾고자 하는 숫자를 입력 >> ");

		int searchNumber = sc.nextInt();

		// 문제.
		// BinarySearch를 직접 구현해서 searchNumber가 몇번쨰 인덱스에 있는지 알아내시오.
		// 78입력 -> 78은 8번째 인덱스에 있습니다.
		// 100입력 -> 100은 존재하지 않습니다.

		int low = 0; // 배열안에서 가장 낮은 인덱스 번호를 저장할 변수
		int high = array.length - 1; // 배열안에서 가장 높은 인덱스 번호를 저장할 변수
		int mid; // 배열 안에서 가운데 위치한 인덱스 번호를 저장할 변수
		boolean ischeck = true; // 찾고자 하는 값이 있는지 유무 판단 변수

		while (low <= high) {
			mid = (low + high) / 2;
			if (array[mid] == searchNumber) {
				System.out.println(searchNumber + "은" + mid + "번째 인덱스에 있습니다.");
				ischeck = false;
				break;
			} else if (array[mid] > searchNumber) {
				high = mid - 1;
			} else if (array[mid] < searchNumber) {
				low = mid + 1;
			}

		}

		if (ischeck)
			System.out.println(searchNumber + "은 인덱스 내에 존재하지 않습니다.");

//		

	}
}