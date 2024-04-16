package pack02;

public class CoffeeCoinln {
	private int coin;
	private int jandon;
	private int price = 200;

	public CoffeeCoinln() {
	}

	public void setCoin(int coin) {
		if (coin < price) {
			System.out.println("금액 부족");
			System.exit(0);
		} else {
			this.coin = coin;
		}
	}

	public void calc(int cupCount) {
		jandon = (coin - (cupCount * price));
		if (jandon < 0) {
			System.out.println("금액 부족");
			System.exit(0);
		}
	}

	public int getJandon() {
		return jandon;

	}

}
