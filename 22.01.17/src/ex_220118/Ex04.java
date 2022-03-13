package ex_220118;

public class Ex04 {

	public static void main(String[] args) {

	int orange = 3729;
	int number = 52;
	
	// 몇 개의 박스가 필요한지 결과를 담을 수 있는 변수 생성
	int result = orange/number;
	
	// 박스에 담지 못한 갯수
	int result2 = orange%number;
	
	
	System.out.println("김모씨가 귤 박스를 줄 수 있는 박수의 수는? " + result);
	System.out.println("남은 귤의 갯수 : " + result2);
	
	
	}

}
