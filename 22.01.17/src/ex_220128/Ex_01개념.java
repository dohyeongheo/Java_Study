package ex_220128;
import java.util.ArrayList;

public class Ex_01개념 {

	public static void main(String[] args) {

		// 가변적인 배열과 같은 형태를 가지고 있는 클래스
		// collection 책에서 읽어보기 390p

		// 1. Arraylist 생성하기

//		String s = 

		// Arraylist<저장할 데이터 자료형> 변수명 = new ArrayList<저장할 데이터 자료형>();
		// (); 꼭 붙혀주기;
		// 저장할 데이터 자료형이 레퍼런스 타입이어야 한다.
		// String, Integer, Double...

		ArrayList<String> list = new ArrayList<String>();

		// <> : 제네릭 기법
		// : Arraylist를 생성하는 순간에 저장할 자료형을 결정하는 기법
		// 레퍼런스 변수형태, 객체형태만을 저장할 수 있음 (기본 자료형 저장 x)

//		2. 값을 추가하기
		// 값을 추가하는 매서드가 내부적으로 설계가 되어 있음

		list.add("돈가스");
		list.add("제육볶음");
		list.add("김밥");

		// 3. 값 가져오기
		// list.get(1);

		System.out.println(list.get(1));
		System.out.println(list.get(2));

// 4. 값 삭제하기

		list.remove(0);

		// 돈가스가 사라지고 나면 뒤에 있는 값들의 인덱스가 앞으로 이동한다
		// 제육볶음 인덱스 값이 0이된다 // 김밥의 인덱스 값이 1이 된다.
		System.out.println(list.get(0));

		// 5. 원하는 위치에 값을 추가하기.
		list.add(1, "닭가슴살");
		
		// 6. 저장되어 있는 데이터의 총 크기 가져오기
		list.size();
		System.out.println(list.size());
		
		
		// 7. 모든 값을 삭제하는 방법
		list.clear();
		System.out.println(list.size());
		
		
	}

}
