package pack03;

public class Ex15polyBus extends Ex15polyCar {
	private int passenger = 10;
	
	public void show() { // Ex15polyCar 고유 method
		System.out.println("버스");
	}
	
	@Override // Annotatio, metadata(메타데이터) : 컴파일러에게 다양한 정보를 알려 주는 역할
	public void displaySpeed() {
		System.out.println("버스 승객 수 : " + passenger);
		System.out.println("버스 속도 : " + speed);
	}

}
