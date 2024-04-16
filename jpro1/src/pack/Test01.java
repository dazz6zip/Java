package pack;

import java.nio.file.spi.FileSystemProvider;

public class Test01 {
	public static void main(String[] args) {
		System.out.println("nice");
		System.out.println("단축키를 사용하자");
		System.out.print("자바");
		System.out.print("변수");
		System.out.println("연습");
		// 한 줄 주석
		/*
		 여러 줄
		 주석. 실행에 참여 안 함
		 */
		System.out.println("주석 연습"); // 한 줄 주석 p60
		
		System.out.println("----- 변수 연습 -----");
		// 기본형 : bcbsilfd - 값을 변수가 직접 기억
		// 참조형 : 객체 - 객체의 주소를 변수가 기억
		// bite : 하나의 단위로 이루어진 이진 문자(bit)의 집합
		// 8bit로 1byte를 구성하는 것이 일반적
		
		// 숫자형 기억장소 : 변수 선언 방법 -> type 변수명
		byte var1; // 1byte 정수 기억장소 -128~127 p82
		var1 = 3;
		var1 = 5;
		System.out.println(var1);
		System.out.println(Byte.MAX_VALUE);
		System.out.println(Byte.MIN_VALUE);
		// var1 = 128; -> Type mismatch error (범위 밖이라는 오류)
		
		System.out.println("-----");
		short var2 = 123; // 2byte 정수 기억장소
		System.out.println(var2);
		
		System.out.println("-----");
		int var3 = 123; // 4byte 정수 기억장소
		System.out.println(var3);
		
		System.out.println("-----");
		long var4 = 123; // 8byte 정수 기억장소
		var4 = 12345678912345L; // 숫자 뒤에 L 붙여서 long으로 type 변환
		System.out.println(var4);
		
		System.out.println("----- 형변환에 대해 : 자동형변환(promotion), 강제형변환(casting) -----"); // p95 ~ 97
		// 자바에서 정수는 int로 인정
		short ss = 10; // promotion
		short ss2 = (short)10; // casting
		System.out.println(ss + " " + ss2); // 여기서 +는 문자열 더하기 (정수 + 문자 + 정수로 문자열 출력됨)
		short ss3 = (short)50000; // casting
		System.out.println(ss3); // output -> -15536
		
		int imsi = 123;
		// short ss4 = 123;
		short ss4 = (short)imsi; //  short ss4 = imsi; 로 들어가면 에러가 발생함
		System.out.println(ss4);
		
		// 참고 : ascii code (아스키 코드) enter->13, 0->48, A->65, a->97 p115
		
		System.out.println("-----");
		// 자바에서 실수는 double 로 인정 (기본)
		double d1 = 1.2; // 8byte 확보 (소숫점 15자리까지 정확도를 확보함)
		System.out.println(d1);
		d1 = 12.345;
		d1 = 12345; // promotion  (정수는 실수 기억장소에 기억될 때 실수로 자동형변환)
		System.out.println(d1);
		
		// float f1 = 12.3; -> type mismatch error
		// float 은 4byte, 실수는 double 로 8byte
		float f1 = 12.3F; // casting
		float f2 = (float)12.3; // casting
		
		// 연산시 큰 타입으로 자동 변환
		double result = 4.5 + 10;
		result = 4.5 + (double)10; // 위와 같은 의미
		System.out.println(result);
		result = (int)4.5 + 10; // 실수를 강제적으로 정수로 바꾸면서 소수점이 절삭됨 (반올림 아님), result 는 실수 기억장소(double)에 저장된 것
		System.out.println(result);
		
		double dd = 5.5;
		// int result2 = 4.5 + 10; -> type mismatch error, 결과값은 실수인데 정수 type에 넣으려고 해서 생기는 오류
		int result2 = (int)(4.5 + 10); // 연산자 우선순위에 의해 4.5 + 10 하고 그 결과를 정수화
		// 만약 (int)(4.5) + 10 라고 기입할 경우 4.5를 정수로 바꾼 후 연산하게 됨
		result2 = (int)4.5 + (int)dd; // 4 + 5
		// result2 = (int)4.5 + dd; -> type mismatch error 앞은 int 값, 뒤는 double 값인데 result2는 int 기억장소기 때문에 생기는 오류
		System.out.println(result2);
		
		System.out.println("----- 논리형(boolean) - 참, 거짓 결과 기억 -----");
		boolean bu1 = true; // 1byte, ture or false만 들어갈 수 있음
		System.out.println(bu1);
		
		System.out.println("----- 문자형(char) -----"); // 문자형과 문자열은 다른 개념
		char c1 = 'a';
		// c1 = 'kbs' -> error, 한 글자만 들어갈 수 있음
		c1 = 'k';
		// c1 = "a"; -> error, 큰 따옴표로 들어가면 문자열(string)이기 때문에 생기는 오류
		c1 = '7'; // 여기서 7은 숫자가 아닌 문자
		c1 = 'A';
		System.out.println(c1);
		System.out.println(c1 + " " + (int)c1 + " " + 65 + " " + (char)65); // char를 int로 형 변환하여 아스키코드로 출력됨
		//                       A를 아스키코드로 변환           아스키코드 65를 문자로 변환
				
		System.out.println("안녕" + 13 + "반가워");
		System.out.println("안녕" + (char)13 + "반가워"); 
		System.out.println("안녕" + "\n" + "반가워"); 
		System.out.println("안녕\n반가워"); // \ <- escape 문자 p88 정리된 링크 https://developer-yeony.tistory.com/82
		
		System.out.println();
		System.out.println(11 + " " + 0xb + " " + 013);
		//               10진수       16진수        8진수
		
		System.out.println("\n----- 문자열 처리 -----");
		// string : 참조형 객체지만 기본형처럼 사용할 수 있음
		String irum = "홍길동"; // 홍길동 객체의 주소를 irum이라는 변수가 기억하는 것
		System.out.println(irum + " 님");
		
		System.out.println("\n----- 상수 -----");
		// 상수 : final type 변수명 = 값 (리터럴, literal)
		// 리터럴은 데이터(값) 그 자체를 뜻함 (즉, 변수에 넣는 변하지 않는 데이터를 의미하는 것)
		// 한 번 저장된 값은 수정 불가능함
		int kbs = 9;
		kbs = 11; // 변수는 덮어씌우기 가능
		System.out.println("kbs : " + kbs);
		final int kbs1 = 9;
		// kbs1 = 11; 상수이므로 수정 불가이기 때문에 생기는 오류
		System.out.println("kbs1 : " + kbs1);
		
		final double PI = 3.14; // final 변수 ( = 상수)는 대문자로 쓰기를 권장 (약속)
		System.out.println("PI : " + PI);
		
		}
}
