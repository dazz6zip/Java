package pack03;

public class Ex14Wolf extends Ex14Dog {
	private String where = "mountain";
	
	public Ex14Wolf(String name) {
		super(name);
	}
	
	public void show() {
		System.out.println("wolf live in " + where);
	}
	
	@Override
	public void printMsg() {
	System.out.println(getName() + " ~ live in " + where + "!");
	}
	
	public void display() { // Wolf class 고유 method
		printMsg();
		this.printMsg();
		super.printMsg();
	}
	
	

}
