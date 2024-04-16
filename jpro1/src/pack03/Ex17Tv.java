package pack03;

public class Ex17Tv extends Ex17Jepum {
	
	public Ex17Tv() {
		System.out.println("~ 티브이 생성자 ~");
	}
	
	@Override
	public void volumeControl() { // 추상 메소드를 overriding 하면 빈 삼각형 아이콘이 생성
		// Ex17Jepum 에서 추상 메소드로 지정해 뒀기 때문에 overriding 필수
		System.out.println("티브이 소리 변경");
	}
	
	@Override
	public void volumeShow() { // 일반 메소드를 overriding 했기 때문에 일반 삼각형 아이콘 생성
		// Ex17Jepum 에서 일반 메소드로 지정해 뒀기 때문에 overriding 권장 (필수 아님)
		System.out.println("소리 크기 : 일반 (상위 클래스 메소드 대신 새로운 내용으로 대체)");
	}

}
