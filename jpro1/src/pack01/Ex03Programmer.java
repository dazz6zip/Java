package pack01;

public class Ex03Programmer {
	// 멤버필드
	public String nickName;
	private int age; 
	String spec = "JAVA"; 

	public static String motto = "자바 천재"; // 기타제한자 static 삽입 (접근제한자랑 순서 바꿔도 됨) // 정적 변수
	public final String campName = "에이콘 아카데미"; // final이 붙어서 리터럴임

	// 생성자
	public Ex03Programmer() {
		System.out.println("생성자, 객체 생성시 초기화 담당");
		System.out.println("초기화 없을 때는 생략 가능");
		age = 22;
//		displayData();
//		campName = "도토리"; -> 위에서 final 로 상수 선언(수정 불가능) 했기 때문에 발생하는 에러
		System.out.println("소속 : " + campName);
	}

	// 메소드
	public void displayData() { 
		System.out.println("별명 : " + nickName + ", 나이 : " + age + "살, 보유 기술 : " + spec);
		System.out.println("보유 기술 재확인 - " + showSpec()); // 다른 method를 호출하는 method 작성 가능

	}

	private String showSpec() { // private 사용으로 캡슐화, 반환하는 변수가 문자열이기 때문에 String
		String msg = "프로그래밍 언어 : " + spec;
		return msg + "(야호)"; // 참고 : 반환을 두 개 이상 하고 싶을 경우에는 배열을 사용하면 됨 (ex. String[])
	}

	// private age에 대한 getter, setter

	public void setAge(int age) {
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public static void goodMethod() {
		System.out.println("notice : static method");
//		System.out.println(age); -> static method는 일반 member field를 호출할 수 없기 때문에 발생하는 오류
		System.out.println(motto); // static member field나 static method만 호출할 수 있음
	}

	public void niceMethod() {
		System.out.println(age); // 일반 method는 일반 member field 호출 가능
		System.out.println(motto); // 일반 method는 static member field도 호출 가능
	}

}
