package pack01;

// 접근지정자
// + public : 같은 project 내에서 유효, package가 달라도 됨
// - protected : 같은 project 내에서 유효, package가 다른 경우 자식 클래스만 유효
//   default : 같은 package 내에서만 유효
// # private : 현재 class 내에서만 유효, 다른 class에서는 참조 불가

public class Ex01Car {      // [접근지정자][기타제한자] class 클래스_이름 {}
	                        // 참고 : class의 이름과 file 이름은 같아야 함
	
	int wheel;              // 멤버 필드(전역 변수) : default 접근지정자 // 참고 : 변수 선언만 했기 때문에 초기치는 자동 0
	private int airBag = 1; // [접근지정자][기타제한자] type 변수
	private int speed;      // private 접근지정자로 주면 캡슐화
	public String irum;
	
	public Ex01Car() {      // 생성자(Constructor) : class와 이름이 같고 반환형이 없는 method 
							// new keyword를 사용하여 호출할 수 있으며 한 번만 호출 가능
		System.out.println("생성자 : 객체 생성시 초기화, 1회 호출"); // 처음에 실행할 것 있으면 여기에 기재
		wheel = 4;
	}
	
	public void abc() {     // [접근지정자][기타제한자] 반환type method_이름([type 매개변수...])
		System.out.println("abc method 수행");
		System.out.println("에어백 수 : " + airBag);
		def(); 				// 아래 def()는 private이라 다른 클래스에서 사용할 수 없지만, 
							// public 클래스에서 호출한 뒤 다른 클래스에서 abc()를 호출하는 방법을 사용할 수 있다.
	}
	
	private void def() {
		System.out.println("def method 수행");
	}
	
	
	
// 객체 지향 프로그래밍 (opp) 특징 정리 및 공부 필요
// 관련 자료 링크
// https://www.codestates.com/blog/content/%EA%B0%9D%EC%B2%B4-%EC%A7%80%ED%96%A5-%ED%94%84%EB%A1%9C%EA%B7%B8%EB%9E%98%EB%B0%8D-%ED%8A%B9%EC%A7%95
	
	
	
}
