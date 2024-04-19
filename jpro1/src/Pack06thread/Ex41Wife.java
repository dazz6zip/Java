package Pack06thread;

public class Ex41Wife extends Thread {
	@Override
	public void run() {
	 Ex41Main.bank.minusMoney(2000);
	 
	 System.out.println("wife 잔고 : " + Ex41Main.bank.getMoney());
	}

}
