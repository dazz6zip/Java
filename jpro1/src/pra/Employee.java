package pra;

public abstract class Employee {

	private String irum; // 이름
	private int nai; // 나이

	public Employee(String irum, int nai) {
		this.irum = irum;
		this.nai = nai;
	}

	public abstract double pay();

	public abstract void print();

	public void display() {
		System.out.println("이름 : " + irum + ", 나이 : " + nai);

	}

}
