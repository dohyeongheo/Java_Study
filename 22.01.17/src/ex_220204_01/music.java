package ex_220204_01;

public class music {

	// ����, ����, �帣, ����ð�, ���
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



	// ����
	// �ʵ尡 private�� ���������ڰ� �ɷ��ִ�
	// �׷��� �ܺηκ��� �ٷ� �ʵ�� ������ �� ����
	// �׷��� ��ȸ�ؼ� �����͸� �ְų� �� �� �ִ�
	// �޼ҵ带 ����ÿ� get,set

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
