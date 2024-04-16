package pack01;

public class Ex02Car {
	private int speed; // 초기치 0
	public String irum; // 초기치 null
	private double weight; // 초기치 0.0

	public Ex02Car() { // 생성자
		irum = "홍길동";
		speed = 10;
	}

	public void showData() {
		System.out.println("이름은 " + irum + ", 속도는 " + speed);
	}

	// public void abcd(int s, int password) { 
	// private인 speed 값을 외부에서 접근하기 위한 method

	public void setSpeed(int s) {
	//			 -> setter method
		speed = s; // this.speed = s; 라고 써도 오류가 생기지는 않지만 불필요함
	//  return; < 써도 실행 가능 (권장하지 않음)
	}
	
	public int getSpeed() {
	//			 -> getter method
		return speed;
	}

	// 우클릭 -> source -> Generate getter and setter...
	
	public double getWeight() { // return 값이 있고, 그 값이 실수이기 때문에 double
		return weight;
	}
	
	public void setWeight(double weight) { // return값 없이 값만 수정해 주기 때문에 void
		this.weight = weight; // 지역변수와 멤버변수 구분을 위해 this. 를 사용
		// 멤버필드 weight에 지역변수 weight의 값을 치환해 줌
		
	// 참고 : this 와 this() 는 다름
		
	}
	
}

//이 위치에서 main method 호출 가능하긴 함
