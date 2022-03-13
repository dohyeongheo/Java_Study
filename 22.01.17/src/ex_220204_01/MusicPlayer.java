package ex_220204_01;

import java.util.ArrayList;

public class MusicPlayer {

	// Main과 Music을 연결하기 위한 Controller 역할

	ArrayList<music> list = new ArrayList<>();

	// 현재 실행중인 노래의 위치를 알고 있는 변수
	int point = 0;

	// 노래 저장을 위한 MusicPlayer 생성자 메소드 생성
	public MusicPlayer() {
		list.add(new music("겨울잠", "아이유", "발라드", 120, "D:\\music\\겨울잠-아이유.mp3"));
		list.add(new music("사랑은 늘 도망가", "임영웅", "발라드", 150, "D:\\music\\사랑은 늘 도망가-임영웅.mp3"));
		list.add(new music("시작", "가호", "댄스", 180, "D:\\music\\시작-가호.mp3"));
		list.add(new music("next level", "에스파", "댄스", 210, "D:\\music\\Next Level-에스파.mp3"));
		list.add(new music("오늘도 빛나는 너에게", "마크툽", "발라드", 240, "D:\\music\\오늘도빛나는너에게-마크툽.mp3"));
	}

	public music play() {
		// play() 호출시 list에 있는 첫번째 음악 return 하기 
		return list.get(point);
		
	}

}
