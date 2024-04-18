package pra02;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Work {
	private String number, name;
	private int nowYear = 2024;
	private int startYear, pay;
	
}

/*
 * number 사번
 * name 이름
 * startYear 입사년도
 * nowYear 현재년도(2024)
 * pay 기본급
 * yearCount 근무년수
 * yearPay 근속수당
 * minusTax 공제세율
 * finalPay 기본급 + 근속수당 (급여액)
 * minusPay 공제액
 * payPay 수령액
 */
