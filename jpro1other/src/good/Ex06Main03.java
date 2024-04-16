package good;

import pack01.Ex06Bank;

public class Ex06Main03 {

	public static void main(String[] args) {
		// project 가 다른 곳에서 Ex06Bank class 사용하기
		// .java 와 .class 의 압축 -> .jar
		// 불러오고 싶은 class 우클릭 -> export -> java -> .jar 저장 
		// project 우클릭 -> Build path -> Configure ~ -> Libraries -> Class path 선택 -> Ex ~ Jars 
		Ex06Bank kildong = new Ex06Bank();
		kildong.deposit(5000);
		kildong.withDraw(2000);
		System.out.println("kildong 현재 예금액 : " + kildong.getMoney());

	}

}
