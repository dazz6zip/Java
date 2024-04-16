package pack03;

public class Ex12Me extends Ex12Father {
	final int score = 90;
	public Ex12Me() {
//		super(); // 생략 가능
		System.out.println("Me 생성자");
//		score = 80; // member field 에 final 선언을 하면 값 수정 불가능
	}
	
	public void biking() {
		System.out.println("자전거");
	}

}
