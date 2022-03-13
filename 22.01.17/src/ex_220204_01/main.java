package ex_220204_01;

import java.util.ArrayList;
import java.util.Scanner;

import javazoom.jl.player.MP3Player;

public class main {

	public static void main(String[] args) {
		// 뮤직플레이어
		// 재생 목록 정지 다음곡 이전곡 종료
		Scanner sc = new Scanner(System.in);
		
		MusicPlayer mc = new MusicPlayer();
		
		// 노래의 정보를 저장할 music class 정의
		// 제목, 가수, 장르, 재생시간, 경로(추후기능)
		// 문제. 알로하-조정석-발라드-60-"" 이 정보를 가지고 있는 music 객체를 만드세요
//		music myMusic = new music();

//		music myMusic = new music("알로하", "조정석", "발라드", 60);

		

		// 노래들을 담을 arraylist 생성



		// player jar 안에 있는 mp3를 실행시켜주는 객체
		MP3Player mp3 = new MP3Player();

		// 노래 실행
//		mp3.play("D:\\music\\시작-가호.mp3");
// 노래 정지
//		mp3.stop();
		// 현재 노래가 나오는지 알 수 있는 방법
//		mp3.isPlaying()




		while (true) {
			System.out.print("1.재생 2.목록 3.정지 4.다음 5.이전 6.종료 >> ");
			int choice = sc.nextInt();

			if (choice == 1) {
				System.out.println("====현재곡====");
				
				mc.play();
				
				if (mp3.isPlaying()) {
					mp3.stop();
				}
				mp3.play(list.get(point).getPath());
				System.out.print(list.get(point).getTitle() + " - ");
				System.out.print(list.get(point).getSinger() + " - 1");
				System.out.print(list.get(point).getGenre() + " - ");
				System.out.println(list.get(point).getPlayTime() + "초");
			}

			else if (choice == 2) { // 내가 가지고 있는 재생목록 출력하기
				System.out.println();
				System.out.println("====목록====");
				for (int i = 0; i < list.size(); i++) {
					System.out.println(i + 1 + ". " + list.get(i).getTitle() + " - " + list.get(i).getSinger());
				}
				System.out.println();

			} else if (choice == 3) {
				System.out.println("노래를 종료합니다.");
				if (mp3.isPlaying()) {
					mp3.stop();
				}

			} else if (choice == 4) {
				System.out.println("====다음곡====");
				if (point < list.size() - 1) // 마지막 인덱스보다 작을때만 1증가가 가능하도록
				{
					point++;
					if (mp3.isPlaying()) {
						mp3.stop();
					}
					mp3.play(list.get(point).getPath());
					System.out.print(list.get(point).getTitle() + " - ");
					System.out.print(list.get(point).getSinger() + " - ");
					System.out.print(list.get(point).getGenre() + " - ");
					System.out.println(list.get(point).getPlayTime() + "초");

				} else { // 마지막 인덱스가 5보다 클 경우
					System.out.println("다음곡이 없습니다.");
				}

			} else if (choice == 5) {
				System.out.println("====이전곡====");
				if (point > 0) {
					point--;
					if (mp3.isPlaying()) {
						mp3.stop();
					}
					mp3.play(list.get(point).getPath());
					System.out.print(list.get(point).getTitle() + " - ");
					System.out.print(list.get(point).getSinger() + " - ");
					System.out.print(list.get(point).getGenre() + " - ");
					System.out.println(list.get(point).getPlayTime() + "초");
				}
			} else if (choice == 6) {
				System.out.println("프로그램을 종료합니다.");
				mp3.stop();
				break;

			} else {
				System.out.println("정확한 숫자를 다시 입력해주세요.");

			}

		}

	}

}
