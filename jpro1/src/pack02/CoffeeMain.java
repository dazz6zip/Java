package pack02;

public class CoffeeMain {

	public static void main(String[] args) {
		// class 포함 관계를 이용한 자판기 실행
		CoffeeMachine machine = new CoffeeMachine();
		machine.showData();
		
//		new CoffeeMachine().showData(); // -> 이렇게 작성하는 것을 권장
	}

}