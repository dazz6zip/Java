package Pack06thread;

public class Ex41Tom extends Thread {
	@Override
	public void run() {
	 Ex41Main.bank.saveMoney(5000);
	 
	 System.out.println("tom 잔고 : " + Ex41Main.bank.getMoney());
	}

}
