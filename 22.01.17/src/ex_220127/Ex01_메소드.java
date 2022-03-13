package ex_220127;

public class Ex01_메소드 {

	public static void main(String[] args) {

		// 메서드를 호출 하는 곳
		addNumber(3, 5);

		// +2가 완료된 결과값을 출력해봅시다
		// 단, 메서드를 사용할거고, 매개변수 바꾸지 않고
	}

	// 메서드 구조
	// 1. 접근 제한자 (접근 지정자) -> public (내/외부에서 접근이 가능한 제한자)
	// 2. static -> 저장되어지는곳
	// 3. 리턴타입 (리턴 타입이 없는 경우 void 사용) -> return
	// 4. 메서드의 이름 (호출할 이름)
	// 5. 매개변수 -> 메서드 안에서 사용하게 될 변수

	public static void addNumber(int a, int b) {
		System.out.println(a + b + 2);
	}

}
