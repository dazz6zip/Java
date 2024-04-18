package pra02;

import java.util.ArrayList;
import java.util.StringTokenizer;

public class WorkMain {

	ArrayList<Work> w = new ArrayList<Work>();
	Work work;
	int yearCount, yearPay, minusPay, payPay;

	public void work() {
		
//		(추가) StringTokenizer 사용
		
		work = new Work();

		yearCount = (work.getNowYear() - work.getStartYear());
		if (yearCount <= 3) {
			yearPay = 150000;
		} else if (yearCount >= 9) {
			yearPay = 1000000;
		} else {
			yearPay = 450000;
		}

		double minusTax;
		int finalPay = (int) (work.getPay() + yearPay);
		if (finalPay >= 3000000) {
			minusTax = 0.5;
		} else if (finalPay < 2000000) {
			minusTax = 0.15;
		} else {
			minusTax = 0.3;
		}
		minusPay = (int) ((work.getPay() + yearPay) * minusTax);

		payPay = (int) (work.getPay() + yearPay - minusPay);

		w.add(work);
	}

	public void showData() {
		System.out.println("사번\t이름\t기본급\t근무년수\t근속수당\t공제액\t수령액");
		for (Work ww : w) {
			System.out.println(ww.getNumber() + "\t" + ww.getName() + "\t" + ww.getPay() + "\t" + yearCount + "\t"
					+ yearPay + "\t" + minusPay + "\t" + payPay);
		}
		System.out.println("처리 건수 : " + w.size() + "건");
	}

	public static void main(String[] args) {
		WorkMain wm = new WorkMain();
		
//		배열 입력 추가
		
		wm.work();
		wm.showData();
	}

}
