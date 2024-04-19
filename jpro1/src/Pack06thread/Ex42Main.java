package Pack06thread;

public class Ex42Main {

	public static void main(String[] args) {
		// 스레드 자원 공유 및 스레드 활성화/비활성화 연습
		
		Ex42BreadPlate plate = new Ex42BreadPlate();
		Ex42BreadMaker maker = new Ex42BreadMaker(plate);
		Ex42BreadEater eater = new Ex42BreadEater(plate);
		
		maker.start();
		eater.start();
	}
}
