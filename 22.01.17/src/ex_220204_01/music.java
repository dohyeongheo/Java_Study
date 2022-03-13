package ex_220204_01;

public class music {

	// 제목, 가수, 장르, 재생시간, 경로
	private String title;
	private String singer;
	private String genre;
	private int playTime;
	private String path;

	
	public music(String title, String singer, String genre, int playTime, String path) {
		super();
		this.title = title;
		this.singer = singer;
		this.genre = genre;
		this.playTime = playTime;
		this.path = path;
	}



	// 문제
	// 필드가 private로 접근제한자가 걸려있다
	// 그러면 외부로부터 바로 필드로 접근할 수 없다
	// 그래서 우회해서 데이터를 넣거나 뺄 수 있는
	// 메소드를 만드시오 get,set

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSinger() {
		return singer;
	}

	public void setSinger(String singer) {
		this.singer = singer;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public int getPlayTime() {
		return playTime;
	}

	public void setPlayTime(int playTime) {
		this.playTime = playTime;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

}
