package Pack06thread;

public class Ex42BreadEater extends Thread {
	
	private Ex42BreadPlate plate;
	
	public Ex42BreadEater(Ex42BreadPlate plate){
		this.plate = plate;
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 30; i++) { // 하루 빵 섭취 30개
			plate.eatBread();
		}
	}
}
