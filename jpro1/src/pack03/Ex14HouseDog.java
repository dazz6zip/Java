package pack03;

public class Ex14HouseDog extends Ex14Dog {
	private String where = "house";
	
	public Ex14HouseDog(String name) {
		super(name);
	}
	
	public void show() {
		System.out.println("live in " + where);
	}
	
	@Override
	public void printMsg() {
	System.out.println(getName() + " ~ live in " + where);
	}

}
