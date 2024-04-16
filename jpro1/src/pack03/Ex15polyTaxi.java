package pack03;

public class Ex15polyTaxi extends Ex15polyCar {
	private int passenger = 2;

	public Ex15polyTaxi() {
		System.out.println("택시");
	}

	@Override
	public void displaySpeed() {
		System.out.println("택시 승객 수 : " + passenger + "명");
	}

}
