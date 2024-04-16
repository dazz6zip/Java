package pack03;

public class Ex12Father extends Ex12GrandFa { // Ex12Father 를 Ex12GrandFa 의 하위 class 로 지정함
	// 이제 Ex12Father 의 private 을 제외한 member field 와 method 를 사용 가능함
	// Ex12GrandFa fa = new Ex12GrandFa(); // 포함관계
	// method 에 final 선언하면 자식 클래스에서 overriding 불가능

	public String gabo = "꽃병"; // 은닉화
	private int nai = 55;
	private int house = 1;

	public Ex12Father() {
//		super(); // parameter 가 없는 부모 생성자 호출 (안 썼을 경우 기본값임)
		System.out.println("Father 생성자");
	}

	public Ex12Father(int n) {
		System.out.println("Father 생성자입니다");
	}

	@Override // for overriding check
	// 부모와 같은 이름의 method 를 선언하면 overriding
	public int getNai() { // Method overriding(오버라이딩)
		return nai;
	}
	
	public String say() { // overriding
		return "메롱 ㅋㅋ";
	}

	public String getHouse() { 
		return "집 : " + house + "채";
	}

	public void showData() {
		System.out.println("아버지 나이 : " + nai); // 현재 구역 내에서 지역변수 nai 를 찾고 나서 멤버필드 nai 를 찾아 봄
		System.out.println("아버지 나이 : " + this.nai); // 멤버필드 nai 를 바로 찾음
		System.out.println("아버지 나이 : " + getNai()); // 현재 클래스 내에서 getNai 를 찾고 나서 상위 클래스 getNai 를 찾아 봄
		System.out.println("아버지 나이 : " + this.getNai()); // 위와 동일
		System.out.println("할아버지 나이 : " + super.getNai()); // 상위 클래스 getNai 를 바로 찾음
		// ㄴ super.nai 는 상위 클래스 nai 가 private 이기 때문에 에러 발생
		
		System.out.println();
		String gabo = "물병";
		System.out.println("가보 : " + gabo); // 물병 // 현재 지역 내의 member field 로 감 (없으면 현재 class 내의 member field, 그래도 없으면 상위 class 로)
		System.out.println("가보 : " + this.gabo); // 꽃병 // 현재 class 내의 member field 로 감 (없으면 상위 class 로)
		System.out.println("가보 : " + super.gabo); // 청자 // 상위 class 내의 member field 로 감
	}

}
