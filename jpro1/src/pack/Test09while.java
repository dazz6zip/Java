package pack;

import java.util.Scanner;

public class Test09while {

	public static void main(String[] args) {
		// 반복문 while
		
		// ----- 240401 -----

		// while (조건) {실행문들...}
		// ㄴ 참 or 거짓이 유도되는 조건문이어야 함

		int w = 1; 
		while (w <= 5) { // 조건이 참일 때 실행됨
			System.out.print("w = " + w + ", ");
			w++; // while 블럭 내 증감치 지정 (for문과 다른 점)
		}
		System.out.println("\nwhile 수행 후 w: " + w);

		/*
		 * - 결과 - w = 1, w = 2, w = 3, w = 4, w = 5, while 수행 후 w: 6
		 */

		System.out.println();
		int count = 0;
		while (count < 5) {
			count++;
			System.out.println("count : " + count);
			if (count == 3) {
				System.out.println("쉬어가기");
			}
			if (count == 5) {
				System.out.println("종료 : " + count);
			}

			/*
			 * - 결과 - count : 1 count : 2 count : 3 쉬어가기 count : 4 count : 5 종료 : 5
			 */
		}

		System.out.println("\n---- continue와 break ----");
		w = 0;
		while (true) { // 이렇게만 사용하면 무한 루프가 실행됨 (무한 루프는 보통 for문보다 while문을 사용)
			// ㄴ 여기에 false는 들어갈 수 없음
			w++;
			if (w == 5)
				break; // w값이 5가 되었을 때 아래 실행문을 수행하지 않고 위 while문을 종료함
			if (w == 3)
				continue; // w값이 3이 되었을 때 아래 실행문을 수행하지 않고 위 while문으로 돌아감
			System.out.println("w는 " + w);
		}

		System.out.println("\n---- factorial -> n! (계승, 1부터 n까지의 정수를 모두 곱하는 것) ----");
//		Scanner sc = new Scanner(System.in);
//		System.out.print("정수 입력 : ");
//		int number = sc.nextInt(); // 참고 : next.Int()는 JAVA API를 적용한 것
		int number = 5;

		// factorial 계산을 위한 초기값 설정
		int factorial = 1;
		int i = 1; // 반복을 위한 counter 변수

		while (i <= number) {
			// System.out.println(i);
			factorial *= i;
			i++;
		}
		System.out.printf("number : %d, factorial : %d", number, factorial); // print 하면서 서식을 줄 수 있음 // 참고 : d > 정수 s >
																				// 문자 f > 실수

		System.out.println("\n\n----- 다중 while -----");
		int a = 1;
		while (a <= 3) {
			System.out.println("a : " + a + ", ");
			int b = 1; // while문 안에서 선언해 줘야 함 (매번 초기화되어야 하기 때문)
			while (b <= 4) {
				System.out.print("b : " + b + ", ");
				b++;
			}
			a++;
			System.out.println();
		}

		System.out.println("\n\n----- 연습 -----");
		// 키보드로 입력받은 숫자에 대해 1부터 시작하여 그 숫자까지 모든 수에 나누기를 시도하고
		// 나누어 떨어지는 경우(약수) 그 수를 출력
		// 0이나 음수를 입력하면 프로그램을 종료

		/*
		 * Scanner sc = new Scanner(System.in); while (true) { // 무한 루프를 만들고 시작
		 * System.out.print("입력 (정수만 입력 가능) : "); int num = sc.nextInt(); if (num < 1) {
		 * // 입력된 값이 0 이하일 경우 종료하기 위한 if문 System.out.println("정수만 입력 가능합니다."); break; //
		 * 프로그램 종료 } System.out.println(num + "의 약수 : "); int divisor = 1; // 약수를 찾기 위해
		 * 1부터 시작 while (divisor <= num) { if (num % divisor == 0) {
		 * System.out.println(divisor); // 약수를 출력 } divisor++; // 다음 수로 이동 }
		 * 
		 * }
		 */

		System.out.println("\n\n----- do{반복 수행문...}while(조건) ----");
		// 처음에는 조건을 보지 않음 -> 최소 한 번은 무조건 수행함

		int k = 3;
		do { // while문 위에
			System.out.println("k : " + k);
			k++;
		} while (k <= 5); // 참이면 다시 do로 돌아감

		System.out.println("\n\n----- 문제 1 -----");
		// 문제 1
		// 1 ~ 100 사이의 정수 중 3의 배수이지만 2의 배수가 아닌 수를 출력하고, 합과 갯수를 출력

		int x = 1;
		int y = 0; // 합
		int z = 0; // 갯수
		while (x < 101) {
			if (x % 3 == 0 && x % 2 != 0) {
				System.out.print(x + ", ");
				y += x;
				z += 1;
			}
			x++;

		}
		System.out.printf("\n총 갯수 : %d, 합계 : %d", z, y);

		System.out.println("\n----- 문제 1 모범 답안 -----");

		int mm = 1, tot = 0, su = 0;
		while (mm <= 100) {
			mm++;
			if (mm % 3 == 0 && mm % 2 != 0) {
				System.out.print(mm + " ");
				tot += mm;
				su += 1;
			}
		}
		System.out.println("\n합은 " + tot + ", 갯수는 " + su);

		System.out.println("\n\n\n----- 문제 2 -----");
		// 문제 2
		// -1, 3, -5, 7, -9, 11 ... 99 까지의 합을 출력

		int v = -1;
		int u = -1; // 합계
		while (v < 100) {
			v = -v;
			if (v > 0) {
				v = v + 2;
			} else {
				v = v - 2;
			}
			u += v;
			if (v == 99) {
				break;
			}
		}
		System.out.println("합계 : " + u);

		System.out.println("\n----- 문제 2 모범 답안 -----");

		int nn = 1, cnt = 1, hap = 0;
		while (nn < 100) {
			if (cnt % 2 == 0) {
				hap += nn;
			} else {
				hap += -nn; // 부호 변경 후 누적
			}
			nn += 2;
			cnt += 1;

		}
		System.out.println("합계는 " + hap);

		System.out.println("\n----- 문제 2 모범 답안 (for문 사용) -----");

		int hap2 = 0, cnt2 = 1;
		for (int c = 1; c < 100; c += 2) {
			if (cnt2 % 2 == 0) {
				hap2 += c;
			} else {
				hap2 += (-1) * c;
			}
			cnt2++;
		}
		System.out.println("합계는 " + hap);

		System.out.println("\n\n----- 문제 3 -----");
		// 문제 3
		// 1 ~ 100 사이의 정수 중에 소수와 그 갯수를 출력
		// 소수란 1보다 크면서 1과 그 수 자체 이외의 다른 수로는 나누어 떨어지지 않는 수
		// 힌트 : 1은 소수가 아니므로 2부터 출발

		int no = 2;
		int count2 = 0;

		System.out.print("1부터 100까지의 소수 : ");
		while (no <= 100) {
			int no2 = 2;
			while (no >= no2) {
				if (no % no2 == 0) {
					if (no != no2) {
						break;
					} else {
						System.out.print(no + ", ");
						count2 += 1;
					}
				}
				no2++;
			}
			no++;
		}
		System.out.println("총 갯수 : " + count2);

		System.out.println("\n----- 문제 3 모범 답안 (case 1) -----");

		int aa = 2;
		int count3 = 0;
		System.out.print("1부터 100까지의 소수 : ");
		while (aa <= 100) {
			boolean imsi = false;

			int bb = 2;
			while (bb <= aa - 1) {
				if (aa % bb == 0) {
					imsi = true;
				}
				bb++;
			}
			if (imsi == false) {
				System.out.print(aa + " ");
				count3++;
			}
			aa++;
		}
		System.out.println("\n건수 : " + count3);

		System.out.println("\n----- 문제 3 모범 답안 (case 2, 2부터 그 숫자의 제곱근까지의 모든 수로 나누어 떨어지는지 확인) -----");
		// 소수를 찾는 이유로 제곱근까지만 검사하는 것은 어떤 수의 약수는 그 수의 제곱근을 넘지 않기 때문
		int num = 2; // 1은 소수가 아니므로 2부터 출발
		int cnt3 = 0; // 건수
		System.out.print("1부터 100까지의 소수 : ");

		while (num <= 100) {
			boolean isprime = true; // 현재 숫자가 소수인지 판별하기 위한 변수
			int divisor = 2; // 나누는 수 (2부터 출발)
			while (divisor <= Math.sqrt(num)) {
				if (num % divisor == 0) {
					isprime = false;
					break; // 나누어 떨어지지 않으면 더이상 검사할 필요가 없음
				}
				divisor++;
			}

			if (isprime == true) {
				cnt3++;
				System.out.print(num + " ");
			}
			num++;

		}
		System.out.println("\n건수 : " + cnt3);
	}
}
