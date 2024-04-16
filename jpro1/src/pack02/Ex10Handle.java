package pack02;

public class Ex10Handle {
	int quantity; // 회전량
	
	public Ex10Handle() {
		quantity = 0;
	}
	
	String leftTurn(int quantity) {
		this.quantity = quantity;
		return "좌회전"; // return 값이 String 이므로 가능
	}
	
	String rightTurn(int quantity) {
		this.quantity = quantity;
		return "우회전";
	}
	
	String straight(int quantity) {
		this.quantity = quantity;
		return "직진";
	}

}
