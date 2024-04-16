package pack03;

import java.awt.event.WindowAdapter;

// 내부 클래스
// 클래스의 멤버로 필드, 메소드, 클래스를 사용할 수 있다
// 추가적으로 특정 클래스 내에서 클래스를 선언하여 사용할 수 있는데, 이를 내부 클래스라고 한다
// 내부 클래스를 포함한 외부 클래스에 의해 통제되기 때문에 내부 클래스는 독립적으로 인스턴스할 수 없다

public class Ex24Outer {
	private int a;
	private Inner inner;

	public Ex24Outer() {
		System.out.println("Outer 생성자");
		a = 10;
		inner = new Inner(); // 내부 클래스는 외부 클래스를 통해 인스턴스
	}

	public void aa() {
		System.out.println("외부에 있는 aa 메소드 실행");
		bb(); // aa 와 동급인 method
		inner.cc(); // 내부 클래스의 멤버이기 때문에 inner. 을 적어 줘야 함
		System.out.println("1. Outer의 a: " + a + ", Inner의 b: " + inner.b);
	}

	public void bb() {
		System.out.println("외부에 있는 bb 메소드 실행");
	}

	// 내부 클래스
	public class Inner { // Ex24Outer 의 접근제한자가 public 이기 때문에 해당 문장에서 public 생략 가능함
		private int b;

		public Inner() {
			System.out.println("Inner 생성자");
			b = 20;
		}

		public void cc() {
			System.out.println("내부 클래스에 있는 cc 메소드 실행");
			bb(); // 내부 클래스는 외부 클래스의 멤버를 자유롭게 호출 가능
			System.out.println("2. Outer의 a: " + a + ", Inner의 b: " + b);
		}

		// 내부 클래스 내에서 다시 내부 클래스 선언
		public class InnerInner {

		}
	}

	// 내부 클래스의 수 만큼 extends (상속) 를 사용할 수 있음
//	public class Inner2 extends Frame {
//	}
//
//	public class Inner3 extends WindowAdapter {
//	}
}
