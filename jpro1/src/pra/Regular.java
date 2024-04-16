package pra;

public class Regular extends Employee {

	private int salary; // 기본급

	public Regular(String irum, int nai, int salary) {
		super(irum, nai);
		this.salary = salary;
	}

	@Override
	public double pay() {
		return salary;
	}

	@Override
	public void print() {
		display();
		System.out.println("수령액 : " + (int) pay());
	}

	public int getSalary() {
		return salary;
	}

}
