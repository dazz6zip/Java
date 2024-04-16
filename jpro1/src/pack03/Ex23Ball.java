package pack03;

// 인터페이스를 구현하고 모든 추상 메소드를 오버라이딩 해야 하는 의무에서 벗어날 수 있음
// 추상을 일반 메소드로 만들어 둔 Adapter class 를 상속받았기 때문

public class Ex23Ball extends Ex23FlyerAdapter {
	
	@Override
	public void fly() {
		System.out.println("관중석");
	}
}
