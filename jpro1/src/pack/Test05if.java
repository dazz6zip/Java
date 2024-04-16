package pack;

import java.net.MulticastSocket;
import java.util.Scanner;

public class Test05if {

	public static void main(String[] args) {
		// 조건판단문 if 연습
		int num = 5;

		if (num >= 3) { // if 조건문은 괄호에 넣어 주고, 참일 때 수행할 문장이 하나면 중괄호가 필요없으나 두 개 이상이면 중괄호로 묶어 주기
			System.out.println("크다"); // 위 if문과 관련이 있음
			System.out.println("참일 때"); // 위 if문과 관련이 없음 (보기 좋게 들여쓰기로 구분해 주는 것이 좋음)
		}

		System.out.println("출력");

		num = 5;
		if (num < 3) { // 조건에 따라 참 또는 거짓 영역 수행, if 뒤에는 boolean 결과값이 나오는 논리연산자를 넣어 줘야 함
			System.out.println("작다");
			System.out.println("참일 때 수행"); // 참일 경우 여기서 else를 무시하고 지나감
		} else {
			System.out.println("거짓일 때 수행"); // 거짓일 경우 위 실행문을 무시하고 else 실행문만 실행하고 지나감
		}
		System.out.println("출력2");

		System.out.println("----- 다중 if -----");
//		Scanner sc = new Scanner(System.in);
//		System.out.println("점수 입력: ");
//		int jumsu = sc.nextInt();

		int jumsu = 60;

		if (jumsu >= 70) {
			if (jumsu >= 90) {
				System.out.println("우수");
			} else {
				System.out.println("보통");
			}
		} else {
			System.out.println("70점 미만");
			if (jumsu > 50) {
				System.out.println("50점 초과");
			} else {
				System.out.println("50점 미만");
			}
		}
		System.out.println("출력 끝");

		jumsu = 75;
		String msg = "";
		if (jumsu >= 90) {
			msg = "수";
		} else if (jumsu >= 80) {
			msg = "우";
		} else if (jumsu >= 70) {
			msg = "미";
		} else if (jumsu >= 60) {
			msg = "양";
		} else { // 60점보다 낮으면 나올 수 있는 값이 하나밖에 없기 때문에 조건문을 따로 넣어 주지 않아도 됨
			msg = "가";
		}
		System.out.println("평가 결과: " + msg);

		// 240329

		System.out.println();
		// 입장료
		// 8세 이하, 65세 이상 무료
		// 9세 이상, 20세 미만 3,000원
		// 20세 이상, 65세 미만 5,000원

//		int age = 10;
//		if(8 >= age || age >= 65) {
//			System.out.println("무료");
//		}else if(9 <= age && age < 20) { // 범위이기 때문에 and(&&) 사용
//			System.out.println("3,000원");
//		}else {
//			System.out.println("5,000원");
//		}
//		// 연습

		int age = 10;
		if (8 >= age || age >= 65) {
			System.out.println("무료");
		}
		if (9 <= age && age < 20) { // 범위이기 때문에 and(&&) 사용
			System.out.println("3,000원");
		}
		if (20 <= age && age < 65) {
			System.out.println("5,000원");
		}
		// 위 실행문은 3개의 if문을 전부 실행하기 때문에 효율이 떨어짐

		System.out.println();
		age = 10;
		int total = 0;
		if (9 <= age && age < 20) { // 범위이기 때문에 and(&&) 사용
			total = 3000;
		} else if (20 <= age && age < 65) {
			total = 5000;
		}
		System.out.println(total + "원");
		// 이렇게 수정하는 것을 추천함 (최대한 간결하게)

		System.out.println();
		// 문제: 키보드로 상품명, 수량, 단가를 각각 입력받아 금액(수량 * 단가)을 출력하시오
		// 조건: 금액이 5만 원 이상이면 금액에 10%를, 아니면 금액의 5%를 세금으로 출력
		// 출력 모양은 상품명:*** 금액:*** 세금:***

		Scanner sc = new Scanner(System.in);
		System.out.print("상품명: ");
		String name = sc.next();
		System.out.print("수량: ");
		int many = sc.nextInt();
		System.out.print("금액: ");
		int price = sc.nextInt();

		int allprice = many * price; // 가격
		double tax = 0; // 세금은 실수와 계산해야 하기 때문에 double로 선언
		// 여기서 double tax; 로 초기값 없이 변수 선언해도 됨
		// 대신 이후 if문에서 어느 조건에도 해당되지 않을 경우 출력에서 에러가 발생하기 때문에 초기값 부여를 권장함

		// 세금 계산을 위한 if문
		if (allprice >= 50000) {
			tax = allprice * 0.1;
		} else {
			tax = allprice * 0.05;
		}

		System.out.println("상품명: " + name + "\n금액: " + allprice + "원\n세금: " + (int) tax + "원"); // 세금을 정수로 casting

	}

}
