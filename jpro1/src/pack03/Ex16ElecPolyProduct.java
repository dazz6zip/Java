package pack03;

public class Ex16ElecPolyProduct {
	// 가전제품이 가져야 할 기본 멤버를 선언하는 상위 클래스
	
	private int volume = 0;
	
	public Ex16ElecPolyProduct() {	
	}
	
	public void volumeControl() {
		// 가전제품의 볼륨을 조절하는 기능
		// 하위 클래스가 overriding 하여 사용하기를 기대하는 메소드 (필수 사항 아님)
	}
	
	public int getVolume() {
		return volume;
	}
	
	public void setVolume(int volume) {
		this.volume = volume;
	}

}
