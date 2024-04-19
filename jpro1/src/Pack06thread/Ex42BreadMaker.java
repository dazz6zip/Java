package Pack06thread;

public class Ex42BreadMaker extends Thread {
	
	private Ex42BreadPlate plate;
	
	public Ex42BreadMaker(Ex42BreadPlate plate){
		this.plate = plate;
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 30; i++) { // 하루 빵 생산량 30개
			plate.makeBread();
		}
		
	}
	
}
