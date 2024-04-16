package pack;

import java.util.Scanner;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

public class Test07for {

	public static void main(String[] args) {
		// 반복문 for
		// for(초기치;조건;증감치){반복 처리 대상}
		// 반복 횟수가 정확히 몇 번인지 알 경우 주로 사용

		int a;
		for (a = 1; a <= 5; a = a + 1) { // 초기치에 변수 선언도 가능함 (for문 안에서 일회성으로 사용할 경우) -> 유지보수 측면에서 권장
			// a(1)를 5가 될 때까지 1씩 더한다는 의미 (a = a + 1 대신 a += 1 과 a++ 도 가능함)
			// 조건이 true일 때만 수행함, a가 5를 초과할 경우 해당 for문을 수행하지 않음
			System.out.println("a : " + a);
			// 주의 : for 블럭 안에서 변수에 손을 대면 안 됨 (예상하지 못한 결과값이 나오게 됨)
		}
		System.out.println("반복문 수행 후 a : " + a);

		// 1부터 10까지의 합 구하기
		int sum = 0; // 누적 기억장소
		for (a = 1; a <= 10; a++) {
			// System.out.println("a : " + a);
			sum += a;
		}
		System.out.println("반복문 수행 후 a : " + a);
		System.out.println("합 : " + sum);

		for (int i = 65; i <= 90; i++) { // 참고 : for 문 안에 변수는 i를 많이 씀 (index)
			System.out.print((char) i + " "); // 아스키코드를 위해 char로 casting
		}

		System.out.println();

		for (int i = 'A'; i <= 'Z'; i++) {
			System.out.print(i + " ");
		}

		// 감소
		System.out.println();
		for (int i = 10; i > 1; i -= 2) {
			System.out.print(i + " ");
		}

		System.out.println();
		for (int ytn = 0, tvn = 5; ytn <= 5; ytn++, tvn++) { // 반점(,)으로 구분하여 여러 변수를 넣을 수 있음 // 대신 조건은 하나여야 함
			System.out.print(ytn + ", " + tvn);
		}

		System.out.println();
		int aa = 1;
		for (; aa <= 5; aa++) { // 이미 변수를 지정해 뒀기 때문에 초기치를 비워도 됨 (권장하는 방법은 아님)
			System.out.print(aa + " ");
		}

		System.out.println("\n\n----- 다중 for -----");
		for (int m = 1; m <= 3; m++) { // 이 블럭 안에 있는 실행문은 3번 수행
			System.out.println("m = " + m);
			for (int n = 1; n <= 4; n++) { // 이 블럭 안에 있는 실행문은 4번 수행
				System.out.print("n = " + n + ", "); // 12번 수행
			}
			System.out.println();
		}

		System.out.println();
		for (char i = 65; i <= 90; i++) {
			// 대문자 A를 뜻함
			System.out.print(i + " : ");
			for (char j = i; j <= 'Z'; j++) { // 여기 기초 변수 j는 위에 있는 i 의 영향을 받음
				System.out.print(j);
			}
			System.out.println();
		}

		System.out.println();
		// 구구단 3단 출력
		for (int count = 1; count <= 9; count++) {
			System.out.println("3 * " + count + " = " + (3 * count));
		}

		System.out.println("\n\n----- 문제 1번 -----");
		// 문제 1 : 키보드로 숫자를 받아서 구구단을 출력
		// 예) 몇 단?
		// 3*1=3 3*2=6 ...

		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력해 주세요: ");
		int number = sc.nextInt();

		for (int number2 = 1; number2 < 10; number2++) {
			System.out.print(number + " * " + number2 + " = " + (number * number2) + ", ");
		}

		System.out.println("\n----- 문제 1번 모범 답안-----");
		// Scanner sc = new Scanner(System.in);
		System.out.print("몇 단?");
		int dan = sc.nextInt();

		for (int count = 1; count < 10; count++) {
			System.out.print(dan + " * " + count + " = " + (dan * count) + " ");
		}

		System.out.println("\n\n----- 문제 2번 -----");
		// 문제 2 : 1 ~ 100 사이의 정수 중 3의 배수이면서 5의 배수인 것의 갯수와 그 합을 출력

		int num = 0;
		int num2 = 0;
		for (int i = 1; i < 101; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				num += i;
			}
			if (i % 3 == 0 && i % 5 == 0) {
				num2 += 1;
			}
		}
		System.out.println("갯수 : " + num2 + ", 합 : " + num);

		System.out.println("\n----- 문제 2번 모범 답안-----");

		int gaesu = 0;
		int hap = 0;

		for (int su = 1; su < 101; su++) {
			if (su % 3 == 0 && su % 5 == 0) {
				gaesu += 1;
				hap += su;
			}
		}
		System.out.println("갯수는 " + gaesu + ", 합은 " + hap);

		System.out.println("\n\n----- 문제 3번 -----");
		// 문제 3 : 2 ~ 9단까지 출력 (다중 for)
		// 2*1=2 2*2=4 ...
		// ...
		// 9*1=9 9*2=18...

		for (int tntwk = 2; tntwk < 10; tntwk++) {
			for (int tntwk2 = 1; tntwk2 < 10; tntwk2++) {
				System.out.print(tntwk + " * " + tntwk2 + " = " + (tntwk * tntwk2) + ", ");
			}
			System.out.println();
		}

		System.out.println("\n----- 문제 3번 모범 답안-----");

		for (int dan2 = 2; dan2 < 10; dan2++) {
			for (int no = 1; no < 10; no++) {
				System.out.print(dan2 + " * " + no + " = " + (dan2 * no) + ", ");
			}
			System.out.println();
		}
		
		System.out.println("\n\n----- 삼각형 찍기 연습-----");
		for (int i = 1; i < 6; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
				if (j == i) {
					System.out.println();
				}
			}
		}
	}

}
