package pack01;

// 현재 class 는 jpro1 project 안 pack01 package 에 등록
// 성격이 유사한 class 들을 특정 package 에 저장
// 현재 class 에서 package 가 다른 곳의 class 를 호출할 경우, import를 사용

public class Ex06Bank {
	private int money = 1000; // 은행에 계좌를 만들면 기본금 1,000원 지급
	
	int a = 1;
	public int b = 2;

	public Ex06Bank() {
	}

	public Ex06Bank(int money) {
		this.money += money;
	}

	public void deposit(int amount) { // 입금
		if (amount > 0) {
			money += amount;
		}
	}

	public void withDraw(int amount) { // 출금
		if (amount > 0 && (money - amount >= 0)) {
			money -= amount;
		} else {
			System.out.println("금액 오류");
		}
	}
	
	public int getMoney() { // 잔고 반환
		return money;
	}

}
