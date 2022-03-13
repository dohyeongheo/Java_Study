package ex_220203_02;

import java.security.PublicKey;

public class student {

	// 필드 (속성)
	private String name; // 이름
	private String stuId; // 학번
	private int math; // 수학
	private int eng; // 영어
	private int sci; // 과학

	public student(String name, String stuId, int math, int eng, int sci) {
		this.name = name;
		this.stuId = stuId;
		this.math = math;
		this.eng = eng;
		this.sci = sci;
	}

	// 매소드 오버로딩
	public student(String name, String stuId) {
		this.name = name;
		this.stuId = stuId;
	}

	// 디폴트 생성자 - 개발자가 따로 만들지 않는다면
	// 컴파일러가 자동으로 만들어주는 생성자

	// 사용자 정의 생성자
	// 사용자가 필요에 의해서 다시 정의한 생성자

// 생성자의 특징 
	// 1. 클래스 이름과 동일하다
	// 2. 리턴 타입이 존재하지 않는다
	// 3. 객체를 생성할 때 반드시 호출된다
	//

	// 메소드 (기능)

	public void setName(String name) {
		this.name = name;
	}

	public String getName(String name) {
		return this.name;
	}

	public String getStuId() {
		return stuId;
	}

	public void setStuId(String stuId) {
		this.stuId = stuId;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getSci() {
		return sci;
	}

	public void setSci(int sci) {
		this.sci = sci;
	}

	public String getName() {
		return name;
	}

	public double getScore() {
		return (math + eng + sci) / 3.0;
	}

}
