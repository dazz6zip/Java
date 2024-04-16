package pra;

public class Classname {
	private Innerclass inner;

	public Classname() {
		inner = new Innerclass();
		inner.a = 3;

	}

	public class Innerclass {
		private int a;
	}

}
