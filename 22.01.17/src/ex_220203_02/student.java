package ex_220203_02;

import java.security.PublicKey;

public class student {

	// �ʵ� (�Ӽ�)
	private String name; // �̸�
	private String stuId; // �й�
	private int math; // ����
	private int eng; // ����
	private int sci; // ����

	public student(String name, String stuId, int math, int eng, int sci) {
		this.name = name;
		this.stuId = stuId;
		this.math = math;
		this.eng = eng;
		this.sci = sci;
	}

	// �żҵ� �����ε�
	public student(String name, String stuId) {
		this.name = name;
		this.stuId = stuId;
	}

	// ����Ʈ ������ - �����ڰ� ���� ������ �ʴ´ٸ�
	// �����Ϸ��� �ڵ����� ������ִ� ������

	// ����� ���� ������
	// ����ڰ� �ʿ信 ���ؼ� �ٽ� ������ ������

// �������� Ư¡ 
	// 1. Ŭ���� �̸��� �����ϴ�
	// 2. ���� Ÿ���� �������� �ʴ´�
	// 3. ��ü�� ������ �� �ݵ�� ȣ��ȴ�
	//

	// �޼ҵ� (���)

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
