package pack03;

import java.awt.Color;
import java.awt.Frame; // extends 에서 작성됨
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener; // implements 에서 작성됨

// 인터페이스를 이용한 이벤트 처리 연습
// 이벤트 발생 : 사용자
// 화면 디자인, 메소드 작성 : 프로그래머
// 이벤트 핸들러 메소드 -> 이벤트 처리를 위한 메소드

// WindowListener : 다중 상속의 효과를 위해 인터페이스를 사용한 케이스 
public class MyFrame03 extends Frame implements WindowListener, MouseListener {
	public MyFrame03() {
//		super("메렁"); // 생성자를 사용하여 값 부여 (한 번 사용 가능)
		setTitle("메렁"); // setter를 사용하여 값 부여 (여러 번 사용 가능)

		display();

		addWindowListener(this); // 현재 Frame 에 이벤트리스너를 장착한 것 (this : 현재 class 를 의미함)
		addMouseListener(this);

	}

	void display() {
		setSize(500, 300);
		setLocation(200, 150);
		setVisible(true);
	}

//	WindowListener 가 가진 추상 메소드 오버라이딩

	@Override
	public void windowActivated(WindowEvent e) {
	}

	@Override
	public void windowClosed(WindowEvent e) {

	}

	@Override
	public void windowClosing(WindowEvent e) {
//		System.out.println("종료");
//		setTitle("아직");
		System.exit(0);
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		System.out.println("windowDeiconified");
	}

	@Override
	public void windowIconified(WindowEvent e) {
		System.out.println("windowIconified");
	}

	@Override
	public void windowOpened(WindowEvent e) {
		System.out.println("windowOpened");
	}

	@Override
	public void mouseClicked(MouseEvent e) {
//		System.out.println("점심");
//		setBackground(new Color(200, 150, 50));
//		System.out.println((int)(Math.random() * 255)); // 255 이내의 난수 발생
		int r = (int)(Math.random() * 255);
		int g = (int)(Math.random() * 255);
		int b = (int)(Math.random() * 255);
		setBackground(new Color(r, g, b));
	}

	@Override
	public void mouseEntered(MouseEvent e) {
	}

	@Override
	public void mouseExited(MouseEvent e) {
	}

	@Override
	public void mousePressed(MouseEvent e) {
	}

	@Override
	public void mouseReleased(MouseEvent e) {
	}

	public static void main(String[] args) {
		new MyFrame03();
	}

}
