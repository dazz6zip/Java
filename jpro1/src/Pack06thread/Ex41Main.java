package Pack06thread;

public class Ex41Main {

	public static Ex41Bank bank = new Ex41Bank();

	public static void main(String[] args) {

		System.out.println("원금 : " + bank.getMoney());

		Ex41Tom tom = new Ex41Tom();
		Ex41Wife wife = new Ex41Wife();
		
		tom.start();
		wife.start();

	}

}
