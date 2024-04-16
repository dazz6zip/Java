package pack01;

public class Ex06Main {

	public static void main(String[] args) {
		// 같은 package 에 있는 Ex06Bank class 를 사용

		Ex06Bank kildong = new Ex06Bank();
		kildong.deposit(5000);
		kildong.withDraw(2000);
		System.out.println("kildong 현재 예금액 : " + kildong.getMoney());
//		kildong.money(); // error : private member 해당 class 에서만 참조 가능
		System.out.println("a : " + kildong.a); // default member
		System.out.println("b : " + kildong.b); // public member

		System.out.println();
		Ex06Bank dajeong = new Ex06Bank(2000);
		dajeong.deposit(5000);
		dajeong.withDraw(2000);
		System.out.println("dajeong 현재 예금액 : " + dajeong.getMoney());

		System.out.println("\n----- 객체 주소 관련 -----");
		System.out.println("kildong 주소 : " + kildong + " " + kildong.hashCode()); // pack01.Ex06Bank@38af3868 951007336
		System.out.println("dajeong 주소 : " + dajeong + " " + dajeong.hashCode()); // pack01.Ex06Bank@1fb3ebeb 531885035

		Ex06Bank tom = null; // Ex06Bank tom; 과 같은 의미
		System.out.println("tom 주소 : " + tom); // null
//		System.out.println("tom 현재 예금액 : " + tom.getMoney()); // java.lang.NullPointerException error
		tom = dajeong; // 주소를 치환해 준 것 // tom 과 dajeong 이 같은 Ex06Bank type 이기 때문에 가능 (type 다르면 안 됨)
		System.out.println("tom 현재 예금액 : " + tom.getMoney());

		System.out.println();
		if (dajeong == tom) {
			System.out.println("! 동일 주소");
		} else {
			System.out.println("! 다른 주소");
		}

//		System.out.println("tom 주소 : " + tom);         // pack01.Ex06Bank@1fb3ebeb
//		System.out.println("dajeong 주소 : " + dajeong); // pack01.Ex06Bank@1fb3ebeb

		System.out.println();
		if (dajeong == kildong) {
			System.out.println("! 동일한 주소");
		} else {
			System.out.println("! 동일하지 않은 주소");
		}

		// 결론 : kildong != (dajeong == tom)

		System.out.println();
		if (dajeong instanceof Ex06Bank) {
			// instanceof : 객체 타입 비교 연산자
			System.out.println("Ex06Bank type");
		} else {
			System.out.println("NOT Ex06Bank type");
		}

		System.out.println("\n\n----- String type 값 비교 -----");

		// String class : 기본형처럼 사용할 수 있음 (JAVA 기능)

		// String 값을 넣어 주는 방법들
		// 첫 번째 방법
		String ss1 = "kor"; // literal pool 에 생성됨

		// 두 번째 방법
		String ss2 = new String(); // literal pool 에 이미 생성돼 있는 값의 주소를 ss2에 추가로 저장함
		ss2 = "kor";

		// 세 번째 방법
		String ss3 = new String("kor"); // heap 에 생성됨
		String ss4 = new String("KOR");

		System.out.println(ss1 + " " + ss2 + " " + ss3);

		// 기본형의 == 은 값 비교, 참조형의 == 은 주소 비교

		if (ss1 == ss2) { // 결과 : 같음(1)
			System.out.println("같음(1)");
		} else {
			System.out.println("다름(1)");
		}

		if (ss1 == ss3) { // 결과 : 다름(2)
			System.out.println("같음(2)");
		} else {
			System.out.println("다름(2)");
		}

		// 결론 : String 은 주소 비교가 아니라 값을 비교하는 것이 목적이므로 equals() 사용

		if (ss1.equals(ss2)) { // 값 비교
			System.out.println("같음(3)");
		} else {
			System.out.println("다름(3)");
		}
		
		if (ss1.equals(ss3)) { // 값 비교
			System.out.println("같음(4)");
		} else {
			System.out.println("다름(4)");
		}
		
		// 참고 : String 값 비교에서 대소문자 구분 안 하는 method -> equlsIgnoreCase()
		if (ss1.equalsIgnoreCase(ss4)) { // 값 비교
			System.out.println("같음(5)");
		} else {
			System.out.println("다름(5)");
		}

	}

}
