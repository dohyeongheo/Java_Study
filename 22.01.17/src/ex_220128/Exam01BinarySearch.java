package ex_220128;
import java.util.Scanner;

public class Exam01BinarySearch {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] array = { 1, 7, 16, 25, 30, 33, 41, 66, 78, 90 };
		int minindex = array[0];
		int maxindex = array[array.length - 1];
		int avg = minindex + maxindex / 2;

		System.out.print("찾고자 하는 숫자를 입력 >> ");
		int serchnumber = sc.nextInt();

		for (int i = 0; i < array.length; i++) {
//			minindex = array[i];
			
			if (serchnumber >= avg) {
				minindex = array[i];
				avg = minindex + maxindex / 2;

			} else if (serchnumber == array[i]) {
				System.out.println(serchnumber + "은 " + i + "번째 인덱스에 있습니다. ");
			}

			else if (serchnumber != array[i]) {
				System.out.println(serchnumber + "은 인덱스 내에 존재하지 않습니다.");
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
//				System.out.println(serchnumber + "은" + i + "번째 인덱스에 있습니다. ");
//		}

// 문제 바이너리 서치를 직접 구현해서 서치넘버가 몇번째 인덱스에 있는지 알아내시오
// 78입력 > 78은 8번째 인덱스에 있습니다.
//		>> 100 입력 > 100은 존재하지 않습니다.
