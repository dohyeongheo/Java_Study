package ex_220204_01;

import java.util.ArrayList;

public class MusicPlayer {

	// Main�� Music�� �����ϱ� ���� Controller ����

	ArrayList<music> list = new ArrayList<>();

	// ���� �������� �뷡�� ��ġ�� �˰� �ִ� ����
	int point = 0;

	// �뷡 ������ ���� MusicPlayer ������ �޼ҵ� ����
	public MusicPlayer() {
		list.add(new music("�ܿ���", "������", "�߶��", 120, "D:\\music\\�ܿ���-������.mp3"));
		list.add(new music("����� �� ������", "�ӿ���", "�߶��", 150, "D:\\music\\����� �� ������-�ӿ���.mp3"));
		list.add(new music("����", "��ȣ", "��", 180, "D:\\music\\����-��ȣ.mp3"));
		list.add(new music("next level", "������", "��", 210, "D:\\music\\Next Level-������.mp3"));
		list.add(new music("���õ� ������ �ʿ���", "��ũ��", "�߶��", 240, "D:\\music\\���õ������³ʿ���-��ũ��.mp3"));
	}

	public music play() {
		// play() ȣ��� list�� �ִ� ù��° ���� return �ϱ� 
		return list.get(point);
		
	}

}
