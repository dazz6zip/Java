package pack03;

// 자동차가 가져야 할 기본 멤버를 선언한 자원 클래스
// 다른 클래스 포함 또는 상속을 통해 자원을 사용할 수 있다
public class Ex15polyCar {
	protected int speed = 50;

	public Ex15polyCar() {
		System.out.println("자동차 원형 클래스");
	}
	
	public void displaySpeed() {
		System.out.println("속도 : " + speed);
	}
	
	public int getSpeed() {
		return speed;
	}

}
