package pack02;

public class Ex10Car {
	// 여러 개의 부품이 모인 차 설계도

	int speed = 0;
	String ownerName, turnMessageShow;
	Ex10Handle handle; // Ex10Handle class 를 자신의 member 처럼 사용
	// ㄴ 여기서 값까지 선언해 버리면 어떤 생성자를 쓰더라도 handle 을 사용할 수 있게 됨

	// 생성자 overloading
	public Ex10Car() {
	}

	public Ex10Car(String name) {
		ownerName = name;
		handle = new Ex10Handle(); // 클래스의 포함관계(has a)
	}

	// method
	public void playCarTurnHandle(int q) { // q : 핸들 회전량
		if (q > 0) {
			turnMessageShow = handle.rightTurn(q);
		} else if (q < 0) {
			turnMessageShow = handle.leftTurn(q);
		} else {
			turnMessageShow = handle.straight(q);
		}
	}
}
