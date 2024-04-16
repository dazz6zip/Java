package pack01other;

import pack01.Ex06Bank; // 다른 package 에 있는 class 읽기
//import pack01.*; // pack01에 있는 모든 class 읽기 : 비권장 (메모리 낭비)

public class Ex06Main02 {

	public static void main(String[] args) {
		// 같은 project, 다른 package 에 있는 Ex06Bank class 사용

		Ex06Bank kildong = new Ex06Bank(); // Ex06Bank 는 다른 package 에 있어서 error 발생
//		System.out.println("a : " + kildong.a); // default member -> 다른 package 에서는 default member 호출 불가능
		System.out.println("b : " + kildong.b); // public member -> package 가 달라도 import 만 해 주면 호출 가능

	}

}
