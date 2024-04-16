package pack02;

import java.util.Scanner;

public class CoffeeMachine {

	private int cupCount;
	CoffeeCoinln money = new CoffeeCoinln();

	public CoffeeMachine() {
		Scanner sc = new Scanner(System.in);
		System.out.print("동전을 입력하세요 : ");
		money.setCoin(sc.nextInt());
		System.out.print("몇 잔을 원하세요 : ");
		cupCount = sc.nextInt();
		money.calc(cupCount);
	}

	public void showData() {
		System.out.println("커피 " + cupCount + "잔과 잔돈 " + money.getJandon() + "원");
	}
}
