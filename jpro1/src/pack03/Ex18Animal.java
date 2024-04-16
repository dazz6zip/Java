package pack03;

public abstract class Ex18Animal { // 추상 클래스
	
	// 추상 메소드, 전부 overriding 필수 (강요)
	public abstract String name(); 
	public abstract String eat();
	public abstract String action();
	
	// 일반 메소드
	public void animalPrint() { 
		System.out.println("~ 동물 추상 클래스의 일반 메소드 ~");
	}
}
