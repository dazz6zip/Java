package pack03;

import java.awt.Frame;

public class MyFrame02 extends Frame {
	public MyFrame02() {
		// 생성자
		super("메렁");
	}

	void display() {
		setSize(500, 300); // 상위 class (Frame) 의 method 를 내 것처럼 사용
		setLocation(200, 150);
		setVisible(true);
	}

	public static void main(String[] args) {
		// 상속으로 frame 띄우기

//		MyFrame02 frame = new MyFrame02();
//		Frame.dispaly();

		new MyFrame02().display(); 
	}

}
