package pack03;

public abstract class Ex17Jepum { // 클래스 안에 추상메소드가 하나 이상 존재하기 때문에 클래스도 추상 클래스로 작성해 주어야 함 (class 앞에 abstract)
	// 가전제품의 원형 클래스 : 추상 클래스
	// 스스로 new 할 수 없으며, 상위 클래스로만 의미가 있게 됨
	
	public int volume = 0;
	
	public Ex17Jepum() { // 생성자 가능
		System.out.println("추상 클래스 생성자");
	}
	
	public abstract void volumeControl(); // {} 가 없는 메소드에는 반환형 앞에 abstract 를 붙여서 추상 메소드인 것을 표현함
	// 하위클래스에서 반드시 overriding 하도록 강요 (필수 사항임)
	// overriding 하지 않으면 해당 하위 클래스에서도 new 를 할 수 없게 됨 (그 하위 클래스에도 해당됨, overriding 하는 순간 가능해짐)
	
	public void volumeShow() {
		System.out.println("소리 크기 : " + volume); // 추상 클래스 안에 일반 메소드가 있는 것도 가능함
	}
}
