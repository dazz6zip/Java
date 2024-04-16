package pra;

public class Manager extends Regular {

	private double incentive; // 관리수당

	public Manager(String irum, int nai, int salary) {
		super(irum, nai, salary);
	}

	@Override
	public double pay() {
		double imsi;
		if (getSalary() < 2000000) {
			imsi = 0.4;
		} else if (getSalary() >= 2500000) {
			imsi = 0.6;
		} else {
			imsi = 0.5;
		}
		incentive = getSalary() * imsi;

		return getSalary() + incentive;
	}

	@Override
	public void print() {
		display();
		System.out.println("수령액 : " + (int) pay());
	}

}
