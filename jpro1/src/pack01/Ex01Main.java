package pack01;

public class Ex01Main { // 응용 프로그램의 시작, main을 위한 class

	public static void main(String[] args) {
		System.out.println("작업을 하다가...");
		int a = 1;
		System.out.println("기본형 변수 a가 기억한 값 : " + a);
		
		// 자동차 객체 만들기
		Ex01Car car1 = new Ex01Car(); // 클래스 -> 인스턴스화 -> 인스턴스(객체)
		// Ex01Car : 보조기억장치에 있는 Ex01Car.class를 주기억장치로 로딩
		// car1 : 객체 변수 - 객체의 주소를 기억
		// new : 인스턴스화를 위한 keyword
		// Ex01Car() : 생성자를 호출
		
		System.out.println("Ex01Car type에 생성된 객체 주소 car1 : " + car1); // pack01.Ex01Car@38af3868
		System.out.println("바퀴 수 : " + car1.wheel);
		car1.abc(); // member method 호출 
		// car1.def(); -> private이므로 호출 불가
		
		System.out.println("\n----- 객체 하나 더 생성하기 -----");
		
		Ex01Car car2 = new Ex01Car();
		
		System.out.println("Ex01Car type에 생성된 객체 주소 car1 : " + car2); // pack01.Ex01Car@5b2133b1
		System.out.println("바퀴 수 : " + car2.wheel);
		car2.abc();
		
		// car1과 car2는 type(설계도)만 같음
		// heap 영역의 별개 인스턴스이기 때문에 주소도 다름
		
		System.out.println();
		System.out.println(car1.getClass()); // console : class pack01.Ex01Car
		System.out.println(car2.getClass()); // console : class pack01.Ex01Car
		// -> 같은 type
		
		System.out.println(car1.getClass() == car2.getClass()); // type 비교 -> true
		System.out.println(car1 == car2); // address 비교 -> false
		
		// 결론 : car1과 car2는 같은 type 이지만 address가 다름
		
	}
	
			// -----
	
			// 참고 : garbage collector (GC, 쓰레기 수집가) 개념 정리 필요
			// 	 ㄴ heap이 null;일 경우 (비워져 있을 경우) 자동으로 삭제됨
			// 참고 : 생성자 내용이 없을 경우 생략할 수 있음
			// 참고 : 전역 변수와 지역 변수 정리 필요
			// 참고 : 오브젝트 > 인스턴스 (오브젝트가 더 큰 개념)
			
			// static : 응용프로그램 실행 중에는 지워지지 않음
			// stack : 생존 시간이 가장 짧음 (휘발성)
			// heap 
			// 모든 언어 동일 (python, C etc...)
 
}
