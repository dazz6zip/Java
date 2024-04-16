package pack01;

import java.util.Scanner;

public class Ex07Pro {
	
	public String name = "사과";
	private int price = 10000;
	private double weight = 0.5;
	public String text;
	
	public Ex07Pro() {
		System.out.println("상품명 : " + name + "\n가격 : " + price + "\n무게 : " + weight);
	}
	
	public Ex07Pro(int price) {
		if (price < 10000) {
			show("저가");
		}else {
			show("고가");
		}
	}
	
	
	public void show(String text) {
		Scanner scname = new Scanner(System.in);
		System.out.print("상품명을 입력해 주세요 : ");
		String name = scname.next();
		
		Scanner scprice = new Scanner(System.in);
		System.out.print("금액을 입력해 주세요 : ");
		int price = scprice.nextInt();
		
		Scanner scweight = new Scanner(System.in);
		System.out.print("금액을 입력해 주세요 : ");
		double weight = scweight.nextDouble();
		
		System.out.println("상품명 : " + name + "\n가격 : " + price + "\n무게 : " + weight + "(" + text + ")");
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public double getWeight() {
		return weight;
	}

}
