package pack03;

import java.awt.Color;
import java.awt.Frame;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyFrame06 extends Frame {

	public MyFrame06(String msg) {
		super(msg);

		setSize(300, 250); // super.
		setLocation(200, 200); // super.
		setVisible(true); // super.

		addWindowListener(new WindowAdapter() { // 내부 익명 클래스 생성을 위한 new keyword
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

		addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setBackground(Color.YELLOW);
			}
		});
	}

	public static void main(String[] args) {
		// 내부 무명(익명) 클래스
		new MyFrame06("내부 무명 클래스");
	}
}
