package pack03;

// 보통 Adapter 라는 이름이 붙은 class 는 인터페이스를 구현하여 추상을 일반 메소드로 작성
// 그리고 자신은 추상 클래스가 됨

public abstract class Ex23FlyerAdapter implements Ex23Flyer { 
	// Ex23FlyerAdapter 는 상위 클래스로만 의미를 가짐
	// 일반 메소드로 변경했기 때문에 선택적으로 오버라이딩 할 수 있게 됨
	
	@Override
	public void fly() {
	}

	@Override
	public boolean isAnimal() {
		return false;
	}

	@Override
	public void happy() {

	}
}
