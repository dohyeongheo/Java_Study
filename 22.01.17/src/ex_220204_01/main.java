package ex_220204_01;

import java.util.ArrayList;
import java.util.Scanner;

import javazoom.jl.player.MP3Player;

public class main {

	public static void main(String[] args) {
		// �����÷��̾�
		// ��� ��� ���� ������ ������ ����
		Scanner sc = new Scanner(System.in);
		
		MusicPlayer mc = new MusicPlayer();
		
		// �뷡�� ������ ������ music class ����
		// ����, ����, �帣, ����ð�, ���(���ı��)
		// ����. �˷���-������-�߶��-60-"" �� ������ ������ �ִ� music ��ü�� ���弼��
//		music myMusic = new music();

//		music myMusic = new music("�˷���", "������", "�߶��", 60);

		

		// �뷡���� ���� arraylist ����



		// player jar �ȿ� �ִ� mp3�� ��������ִ� ��ü
		MP3Player mp3 = new MP3Player();

		// �뷡 ����
//		mp3.play("D:\\music\\����-��ȣ.mp3");
// �뷡 ����
//		mp3.stop();
		// ���� �뷡�� �������� �� �� �ִ� ���
//		mp3.isPlaying()




		while (true) {
			System.out.print("1.��� 2.��� 3.���� 4.���� 5.���� 6.���� >> ");
			int choice = sc.nextInt();

			if (choice == 1) {
				System.out.println("====�����====");
				
				mc.play();
				
				if (mp3.isPlaying()) {
					mp3.stop();
				}
				mp3.play(list.get(point).getPath());
				System.out.print(list.get(point).getTitle() + " - ");
				System.out.print(list.get(point).getSinger() + " - 1");
				System.out.print(list.get(point).getGenre() + " - ");
				System.out.println(list.get(point).getPlayTime() + "��");
			}

			else if (choice == 2) { // ���� ������ �ִ� ������ ����ϱ�
				System.out.println();
				System.out.println("====���====");
				for (int i = 0; i < list.size(); i++) {
					System.out.println(i + 1 + ". " + list.get(i).getTitle() + " - " + list.get(i).getSinger());
				}
				System.out.println();

			} else if (choice == 3) {
				System.out.println("�뷡�� �����մϴ�.");
				if (mp3.isPlaying()) {
					mp3.stop();
				}

			} else if (choice == 4) {
				System.out.println("====������====");
				if (point < list.size() - 1) // ������ �ε������� �������� 1������ �����ϵ���
				{
					point++;
					if (mp3.isPlaying()) {
						mp3.stop();
					}
					mp3.play(list.get(point).getPath());
					System.out.print(list.get(point).getTitle() + " - ");
					System.out.print(list.get(point).getSinger() + " - ");
					System.out.print(list.get(point).getGenre() + " - ");
					System.out.println(list.get(point).getPlayTime() + "��");

				} else { // ������ �ε����� 5���� Ŭ ���
					System.out.println("�������� �����ϴ�.");
				}

			} else if (choice == 5) {
				System.out.println("====������====");
				if (point > 0) {
					point--;
					if (mp3.isPlaying()) {
						mp3.stop();
					}
					mp3.play(list.get(point).getPath());
					System.out.print(list.get(point).getTitle() + " - ");
					System.out.print(list.get(point).getSinger() + " - ");
					System.out.print(list.get(point).getGenre() + " - ");
					System.out.println(list.get(point).getPlayTime() + "��");
				}
			} else if (choice == 6) {
				System.out.println("���α׷��� �����մϴ�.");
				mp3.stop();
				break;

			} else {
				System.out.println("��Ȯ�� ���ڸ� �ٽ� �Է����ּ���.");

			}

		}

	}

}
