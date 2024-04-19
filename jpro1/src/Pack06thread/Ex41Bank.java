package Pack06thread;

public class Ex41Bank {
	private int money = 10000; // process 자원 (thread 공유 자원)

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	// synchronized : 스레드의 동기화를 가능하게 하는 스레드 전용 키워드 (접근제한자 뒤에 삽입)
	// 이 키워드가 들어가 있는 메소드끼리 자원을 공유함
	// sleep()도 공유하기 때문에 synchronized 키워드가 없을 때는 시간이 같이 흐르지만,
	// synchronized 키워드를 넣어 주면 공유자원에 lock 이 걸림 (lock : 공유 자원을 쓰고 있을 때에는 대기함)
	
	public synchronized void saveMoney(int mon) { // 입금 (지연 시간 2초)
		int m = this.getMoney();
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
		}
		setMoney(m + mon);
	}

	public synchronized void minusMoney(int mon) { // 출금
		int m = this.getMoney();
		if (mon > m) {
			System.out.println("금액 부족");
			return;
		}
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
		}
		setMoney(m - mon);
	}
}
