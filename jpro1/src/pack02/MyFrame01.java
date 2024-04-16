package pack02;

import java.awt.Frame;

// JAVA 가 제공하는 Frame class 로 창 띄우기 : 포함 관계
public class MyFrame01 {
	private String title = "포함 관계";
	private Frame frame;

	public MyFrame01() { // 생성자에 많은 내용을 넣는 것은 권장하지 않으므로 추가적으로 method 작성하여 생성자에서 호출하는 것을 추천함
		frame = new Frame(title);
	}

	private void display() {
		frame.setSize(500, 300);
		frame.setLocation(200, 150);
		frame.setVisible(true);
	}

	public static void main(String[] args) {
//		MyFrame01 frame01 = new MyFrame01();
		new MyFrame01().display(); // 객체 변수가 없을 수도 있음
//		frame01.display(); // 종료하려면 console 에서 강제 멈춤
	}

}
