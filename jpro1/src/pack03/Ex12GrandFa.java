package pack03;

// 상속 : 하나의 class 가 다른 class 를 포함하는 상위 개념일 때 두 class 사이에 일반화 관계가 존재
//	     이런 일반화 관계를 상속 관계(is a kind of)라고 한다
//		 class 간 부모 자식의 구조를 갖는다
//		 부모 class 는 자식 class 의 member field 나 method 를 제공하는 틀 역할을 한다

public class Ex12GrandFa { // class 에 final 선언하면 상속 불가능
	private int nai = 80;
	public String gabo = "청자";
	protected String gahun = "야호";

	public Ex12GrandFa() {
		System.out.println("GrandFa 생성자");
	}

	public Ex12GrandFa(int nai) {
		this(); // 인수가 없는 위 생성자도 호출함
		this.nai = nai;
	}
	
	public String say() {
		return "메롱";
	}
	
	public void eat() {
		System.out.println("delicious");
	}
	
	public int getNai() {
		return nai;
	}
}
