package ex_220203_02;

import java.nio.charset.IllegalCharsetNameException;
import java.security.cert.PKIXBuilderParameters;
import java.util.jar.Attributes.Name;

import ex_220203_01.Bank;

public class main {
	public static void main(String[] args) {
// 학생(성적) 관리 프로그램
		// 학생 객체
		// 문제
		// student 객체 pbk를 만든 후
		// 이름 박병관, 학번 20180852, 수학점수 : 82, 영어점수 71, 과학점수 65를 넣어주세요

		student pbk = new student("박병관", "20180625", 95, 84, 66);
		student kmg = new student("김민근", "20147777", 99, 76, 54);
		student jjy = new student("정정용", "20138879");
		
		
		// 메소드 오버로딩 (중복중의)
		// 동일한 이름의 메소드를 사용하는 방법
		// 둘 중 하나의 조건만 만족하면 동일한 이름의 메소드를 만들 수 있다.
		// 1. 매개변수의 개수가 다를 때
		// 2. 매개변수의 데이터 타입이 다를 때
		
		
		
		// 생성자 : 객체가 생성될 때 자동으로 호출되는 특별한 메소드 (객체를 생성하는 것)
		// 객체를 생성할때 무조건 이름, 학번, 각종 점수를 넣도록 한다면?
		// 누락되는 데이터가 존재할까? 아니오.
		
		
		
		// 문제
		// student 클래스에 setName() 메소드를 만들어서
		// 이름을 매개변수로 받아 자신의 필드 name에 값을 넣는
		// 매소드를 정의하시오

//		pbk.setName("박병관");
//		String name = pbk.getName();
//		System.out.println(name);
		// student 클래스에 getName() 메소드를 만들어서
		// 객체 안에 있는 name 값을 돌려주는 메소드를 만드시오
//		pbk.setStuId("20180852");
		pbk.setMath(82);
		pbk.setEng(71);
		pbk.setSci(65);
		

		System.out.println(pbk.getName());
		System.out.println(pbk.getStuId());
		System.out.println(pbk.getMath());
		System.out.println(pbk.getEng());
		System.out.println(pbk.getSci());
		System.out.println(pbk.getScore());
		
		

	}
}
