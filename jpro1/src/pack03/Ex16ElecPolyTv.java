package pack03;

public class Ex16ElecPolyTv extends Ex16ElecPolyProduct {
	
	@Override
	public void volumeControl() {
		int soriSize = getVolume();
		System.out.println("티브이 소리 변경 후 : " + soriSize);
	}
	
	public void tvShow() {
		System.out.println("~ 티브이 고유 메소드 ~");
	}

}
