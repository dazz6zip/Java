package Pack06thread;

public class Ex42BreadPlate {

	private int breadCount = 0; // thread 자원 공유 대상

	public Ex42BreadPlate() {
	}

	// 현재 메소드를 스레드로 호출하면 해당 스레드의 처리가 진행되는 동안 lock
	public synchronized void makeBread() {
		if (breadCount >= 10) {
			System.out.println("~ Bread maximum");
			try {
				wait(); // not runnable 로 만듦
			} catch (Exception e) {
			}
		}
		breadCount++;
		System.out.println("After make, Bread count : " + breadCount);
		notify(); // runnable 로 복귀
	}

	public synchronized void eatBread() {
		if (breadCount < 1) {
			System.out.println("~ Sold out, Wait for bread");
			try {
				wait(); // not runnable 로 만듦
			} catch (Exception e) {
			}
		}
		breadCount--;
		System.out.println("After eat, Bread count : " + breadCount);
		notify(); // runnable 로 복귀
	}

}
