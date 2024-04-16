package pack03;

public class Ex23Airplane implements Ex23Flyer {

	@Override
	public void fly() {
		System.out.println("엔진, 인천공항");
	}

	@Override
	public boolean isAnimal() {
		return false;
	}
	
	@Override
	public void happy() {
	
	}
	
	

}
