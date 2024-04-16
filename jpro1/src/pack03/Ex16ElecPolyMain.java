package pack03;

public class Ex16ElecPolyMain {

	public static void main(String[] args) {
		// 가전제품 상위 클래스 생성 후 volumeControl() 을 overriding 하여 다형성 구사
		
		Ex16ElecPolyProduct product = null; // 상위 객체로만 의미를 가짐
		
		Ex16ElecPolyRadio radio = new Ex16ElecPolyRadio();
		radio.setVolume(7);
		System.out.println(radio.getVolume());
		radio.volumeControl();
		
		System.out.println();
		Ex16ElecPolyTv tv = new Ex16ElecPolyTv();
		tv.setVolume(3);
		tv.volumeControl();
		tv.tvShow();
		
		System.out.println("\n----- 폴리모피즘(다형성) -----");
		product = radio; // promotonion
		product.volumeControl();
		
		System.out.println();
		product = tv; // promotonion
		product.volumeControl();
	}
	

}
