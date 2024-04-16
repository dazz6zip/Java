package pack03;

public class Ex17Radio extends Ex17Jepum {
	
	public Ex17Radio() {
		System.out.println("~ 라디오 생성자 ~");
	}
	
	@Override
	public void volumeControl() { // 추상 메소드를 overriding 을 하면 빈 삼각형 아이콘이 생성
		// Ex17Jepum 에서 추상 메소드로 지정해 뒀기 때문에 overriding 필수
		System.out.println("라디오 소리 조정");
	}

}
