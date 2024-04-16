package pack03;

public class Ex15polyMain {

	public static void main(String[] args) {
		Ex15polyCar car1 = new Ex15polyCar(); // 상위
		Ex15polyBus bus1 = new Ex15polyBus(); // 하위
		Ex15polyTaxi taxi1 = new Ex15polyTaxi();

		System.out.println();
		car1.displaySpeed();
		System.out.println(car1.getSpeed());

		System.out.println();
		bus1.displaySpeed();
		System.out.println(bus1.getSpeed());

		System.out.println();
		taxi1.displaySpeed();
		System.out.println(taxi1.getSpeed());

		System.out.println("\n----- 객체 주소 치환 -----");
		Ex15polyCar car2 = new Ex15polyBus(); // promotion, 하위 클래스 주소를 상위 클래스 타입 변수에게 치환
		car2.displaySpeed(); // Ex15polyBus 에 있는 speed 값이 찍힌 것 (위에서 주소를 치환해 줬기 때문에) 
		// 이제 상위 클래스 type 으로 하위 클래스  overriding method 호출 가능
		System.out.println(car2.getSpeed()); // Ex15polyBus의 주소를 따라 가서 getSpeed() 를 찾아보고, 없으면 상위 클래스인 Ex15polyCar 에 가서 찾음
//		car2.show(); // show() 는 overriding method 가 아니므로 호출할 수 없음 // 하위 클래스 고유 method 기 때문에 상위 클래스에서 간섭(호출) 불가능인 것
		
		// ----- 0411 ----- (Ex15polyTaxi.java 포함)
		
		System.out.println();
		Ex15polyCar car3 = taxi1; // promotion
		// type 은 Ex15polyCar, 저장하고 있는 주소는 Ex15polyTaxi
		System.out.println("주소 확인 : " + car3 + " " + taxi1); // pack03.Ex15polyTaxi@72ea2f77 로 같은 주소를 갖고 있음
		car3.displaySpeed();
		System.out.println(car3.getSpeed());
		
		System.out.println("\n----- class casting -----");
//		Ex15polyBus bus2 = new Ex15polyCar(); // 하위 클래스 type 에 상위 type 클래스를 치환하는 것은 불가능함
		Ex15polyBus bus3 = (Ex15polyBus)car2; // car2는 Ex15polyCar 의 type 을 가졌지만 Ex15polyBus 의 주소를 가지고 있음
		// car2 (Ex15polyCar(상위 클래스) 의 type 을 가지고 Ex15polyBus(하위 클래스) 의 주소를 가지고 있는 변수) 를 Ex15polyBus type 으로 casting
		// bus3 과 car2 가 같은 type 이 됐으므로 치환할 수 있음
		bus3.displaySpeed();
		
		System.out.println();
//		Ex15polyTaxi taxi2 = new Ex15polyCar(); // type mismatch error (casting 의 여지조차 없는 케이스)
		Ex15polyTaxi taxi2 = (Ex15polyTaxi)car3; // car3는 Ex15polyTaxi 의 주소를 가지고 있기 때문에 casting 이후 치환 가능
		taxi2.displaySpeed();
		
//		Ex15polyTaxi taxi3 = (Ex15polyTaxi)car1; // Ex15polyTaxi 로 casting 해서 문제가 없는 것처럼 보이지만 실행 오류(runtime error)
//		car1 자체가 상위 class 의 주소를 가지고 있기 때문에 안 됨
		
		System.out.println("\n-----");
		Ex15polyCar mycar;
		mycar = bus1;
		mycar.displaySpeed();
		
		mycar = taxi1;
		mycar.displaySpeed();
		
		System.out.println("\n----- 향상된 for문, 배열 활용 -----");
		Ex15polyCar p[] = new Ex15polyCar[3];
		p[0] = car1;
		p[1] = bus1;
		p[2] = taxi1;
		for (Ex15polyCar poly : p) {
			poly.displaySpeed();
		}
		
		
		
		
		
		
	}

}
