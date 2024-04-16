package pack;

import java.util.Scanner;

public class Test06switch {

	public static void main(String[] args) {
		// 조건판단문 switch : (if문 대비) 조금 더 정형화된 문법으로, 값에 따라 여러 방향으로 분기하는 경우에 사용 p163
		// 길게 늘어진 if문에 비해 코드가 짧고 의미를 파악하기 쉬움
		// 참고 : ctrl + shift + F => 줄 맞춤 단축키

		int age = 15;
		age = age / 10 * 10; // 뒷자리가 날아감 ex) 15 -> 10, 26 -> 20 // 나누기(/)는 몫만 취하는 것을 활용
		// System.out.println(age);
		switch (age) { // 값을 주고 case 별로 출력값 설정
		case 20:
			System.out.println("20대");
			break; // break로 끊어 주지 않으면 다음 케이스까지 수행함
		case 30:
			System.out.println("30대");
			System.out.println("야호");
			break; 
		default : // 위 case 어디에도 해당하지 않을 때 출력값을 지정함
			System.out.println("기타");
			break; // <- 마지막은 break를 쓰지 않아도 되지만 다른 언어에서는 꼭 써야 하는 경우가 있기 때문에 매번 써 주는 것을 권장함
		}
		// 참고 : if문은 참이나 거짓일 때 수행할 수행문을 중괄호({})로 묶어 줬지만 switch문은 케이스를 전부 중괄호로 묶어 줘야 함
		
		System.out.println();
		String jik = "부장";
		switch (jik) { // switch에 string(문자열)도 가능함
		case "대리":
			System.out.println("대리");
			break;
		case "과장":
			System.out.println("과장");
			break;
		case "부장":
			System.out.println("부장");
			System.out.println("바보");
			break;
		default:
			System.out.println("기타 직원");
		}
		
		System.out.println();
		// System.out.println(Math.random()); // 난수를 발생시킴
		// int time = (int)(Math.random() * 10); // 난수를 0 - 9 사이의 정수가 나오게 하는 수행문
		int time = (int)(Math.random() * 4) + 8; // 8 - 11 사이의 정수가 나오게 하는 수행문
		System.out.println(time);
		
		switch(time) {
		case 8:
			System.out.println("등원");
			break;
		case 9:
			System.out.println("인사");
			System.out.println("복습");
			break; // break가 없으면 해당 case 를 수행한 뒤에 dafault 전 case까지 모두 수행함
		case 10:
			System.out.println("문제풀이");
			break;
		default:
			System.out.println("파이팅");
			break;
		}
		
		System.out.println();
		// 키보드로 년도와 월을 입력받아 해당 년, 월의 날수 출력
		
		int year, month, days = 28;
		String msg = "평년";
		Scanner sc = new Scanner(System.in);
		System.out.print("연도 입력: ");
		year = sc.nextInt();
		System.out.print("월 입력: ");
		month = sc.nextInt();
//		year = 2024;
//		month = 3;
		
		// 입력 자료 오류 검사
		if(month < 1 || month > 12) {
			System.out.println("1 - 12 사이의 값을 입력해 주세요");
			System.exit(0); // 프로그램의 강제 종료
		}
		// 윤년이면 2월에 29일, 평년이면 28일을 부여하기 위해 연도 체크하기
		// 2월 날짜를 위한 if문
		if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0) { // 4의 배수이자 100의 배수가 아니거나, 4의 배수이자 400의 배수임을 확인
			days =  29;
			msg = "윤년";
		}
		
		// 2월을 제외한 월의 날짜를 위한 switch문
		switch(month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12: // case 1, 3, 5, 7, 8, 10, 12는 아래 실행문을 수행
			days = 31;
			break; // 아래는 무시하고 넘어감
		case 4:
		case 6:
		case 9:
		case 11: // case 4, 6, 9, 11는 아래 실행문을 수행
			days = 30;
			break;
		}
		
		System.out.println(year + "년 " + month + "월은 " + days + "일(" + msg + ")입니다.");
		}
	
	
		
	}