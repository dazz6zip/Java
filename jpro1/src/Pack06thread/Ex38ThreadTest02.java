package Pack06thread;

public class Ex38ThreadTest02 implements Runnable {
	public Ex38ThreadTest02() {
	}

	public Ex38ThreadTest02(String name) {
		Thread tt = new Thread(this, name);
		tt.start();
	}

	public void run() {
		for (int i = 1; i <= 50; i++) {
			System.out.print(i + ":" + Thread.currentThread().getName() + " "); // .currentThread() : 현재 수행되고 있는 스레드
			try {
				Thread.sleep(100); // 스레드를 일정 시간 동안 비활성화
			} catch (Exception e) {
			}
		}
	}

	public static void main(String[] args) {
//		Ex38ThreadTest02 my1 = new Ex38ThreadTest02();
//		Ex38ThreadTest02 my2 = new Ex38ThreadTest02();
//		Thread t1 = new Thread(my1);
//		t1.start();
//		Thread t2 = new Thread(my2);
//		t2.start();
		new Ex38ThreadTest02("one");
		new Ex38ThreadTest02("two");

		System.out.println("프로그램 종료");
	}

}
