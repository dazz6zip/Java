package pra;

public class Temporary extends Employee {

	private int ilsu = 4; // 일수
	private int ildang = 50000; // 일당

	public Temporary(String irum, int nai, int ilsu, int ildang) {
		super(irum, nai);
		this.ilsu = ilsu;
		this.ildang = ildang;
	}

	@Override
	public double pay() {
		int pay = ilsu * ildang;
		return pay;
	}

	@Override
	public void print() {
		display();
		System.out.println("수령액 : " + (int) pay());
	}

}
