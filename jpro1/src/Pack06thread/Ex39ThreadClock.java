package Pack06thread;

import java.awt.Button;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.time.LocalDate;
import java.time.LocalTime;

public class Ex39ThreadClock extends Frame implements ActionListener, Runnable {

	Label lblMsg;
	boolean bExit = false;
	Thread t;

	public Ex39ThreadClock() {

		lblMsg = new Label("TIME", Label.CENTER); // .CENTER 정렬
		super.add("Center", lblMsg); // "Center" 위치

		Button btnClick = new Button("CLICK HERE");
		super.add("South", btnClick);
		btnClick.addActionListener(this);

		setTitle("Thread Clock");
		setBounds(200, 200, 300, 300);
		setVisible(true);

		super.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				bExit = true; // run() 의 무한루핑을 탈출하기 위한 실행문
				System.exit(0);
			}
		});

		t = new Thread(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// 버튼을 클릭하면 수행될 메소드

		// 만약 사용자 정의 스레드가 이미 있다면 start() 를 호출하지 않음

		if (t.isAlive()) {
			return;
		}
		t.start();
	}

	@Override
	public void run() {
		while (true) {
			if (bExit) { // bExit 가 true 면 아래 블럭을 수행
				break;
			}
			showData();
			try {
				Thread.sleep(1000); // 1초 동안 비활성화
			} catch (Exception e) {
			}
		}
	}

	private void showData() {
		LocalDate ld = LocalDate.now(); // singleton pattern
		int y = ld.getYear();
		int m = ld.getMonthValue();
		int d = ld.getDayOfMonth();

		LocalTime time = LocalTime.now(); // singleton pattern
		int h = time.getHour();
		int m2 = time.getMinute();
		int s = time.getSecond();

		String ss = y + " - " + m + " - " + d + " / " + h + " : " + m2 + " : " + s;

		lblMsg.setText(ss);
		lblMsg.setFont(new Font("Times new Roman", Font.BOLD, 20));
	}

	public static void main(String[] args) {
		// 스레드를 이용하여 현재 날짜 및 시간 표시
		new Ex39ThreadClock();
	}

}
