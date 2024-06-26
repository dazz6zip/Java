package pack03;

public class Ex23Main {

	public static void main(String[] args) {
		System.out.println("속도 : " + Ex23Flyer.FAST);

		Ex23Bird bird = new Ex23Bird();
		bird.fly();

		Ex23Airplane airplane = new Ex23Airplane();
		airplane.fly();

		System.out.println("-----");
		Ex23FlyerUtil.show(bird);
		System.out.println();
		Ex23FlyerUtil.show(airplane);

		System.out.println("-----");
		Ex23Ball ball = new Ex23Ball();
		ball.fly(); 
	}

}
