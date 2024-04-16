package pack03;

// 추상 메소드와 상수로 구성된 클래스
// 다중 상속이 가능
// 인터페이스는 인스턴스(new) 할 수 없다
// 인터페이스는 하위 클래스에서 implements 클래스로 구현한다
// 인터페이스 사이에 상속이 가능하다

public interface Ex20Volume {
	void volumeUp(int level); // public abstract void volumeup(int level); 와 같은 의미
	void volumeDown(int level);
	
//	void print() {
//		// 일반 메소드는 사용할 수 없다
//	}
}
