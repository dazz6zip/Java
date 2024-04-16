package pack03;

import java.awt.Frame; // extends 에서 작성됨
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

// 어뎁터 클래스를 이용한 이벤트 처리 연습
// WindowAdapter 추상 클래스는 WindowListener 인터페이스를 구현한 클래스
// WindowListener 의 추상 메소드가 WindowAdapter에서 일반 메소드로 오버라이드 (재정의)
public class MyFrame04Adapter extends WindowAdapter { // 상속
	private Frame frame; // 선언만

	public MyFrame04Adapter() {
		frame = new Frame("Adapter 연습"); // 포함, Frame 호출

		frame.setSize(300, 250);
		frame.setLocation(200, 200);
		frame.setVisible(true);

		frame.addWindowListener(this); // 괄호 안에 WindowListener 를 가지고 있는 class 입력
		// WindowAdapter 가 WindowListener 를 구현하고 있고, this(MyFrame04Adapter) 가 상속받고 있으므로
		// this
	}

	@Override
	public void windowClosing(WindowEvent e) {
		// 선택적으로 필요한 메소드를 오버라이딩
		System.exit(0);
	}

	public static void main(String[] args) {
		new MyFrame04Adapter();
	}

}
