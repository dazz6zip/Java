package pack;

public class Test02 {
	public static void main(String[] args) {
		// 응용프로그램의 시작 메소드(method) -> 무조건 main(String[] args)
		
		int a = 5; // 치환연산자, 오른쪽 최종 결과값을 왼쪽 기억장소에 저장하는 연산자
		int b = 3;
		int c = a + b;
		System.out.println("c는 " + c);
		
		System.out.println("----- 산술연산자 연습 -----");
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b); // 나누기의 몫
		System.out.println(a % b); // 나누기의 나머지
		System.out.println(a / (double)b); // 실수연산을 함으로써 몫과 나머지를 전부
		System.out.println(3 + 4 * 5); // 일반 사칙연산과 우선순위가 동일함
		System.out.println((3 + 4) * 5); // 연산자 우선순위 조정
		
		// System.out.println(a / 0); 정수연산인 경우 ErithmeticException -> 0으로 나눌 수 없어서 생기는 오류
		System.out.println(a / 0.0); // 실수연산인 경우 Infinity (무한대)
		System.out.println(a % 0.0); // NaN (Not a Number) 숫자가 아니기 때문에 표현할 수 없는 상태를 뜻함
		
		System.out.println("\n----- 문자열 더하기 연산 : + -----");
		String ss1 = "배가";
		String ss2 = "고파";
		String ss3 = ss1 + ss2;
		System.out.println(ss3);
		System.out.println(ss3 + " " + 123); // 숫자가 문자열로 promotion 후 연산
		System.out.println(ss3 + " " + 123 + 100);
		System.out.println(ss3 + " " + (123 + 100)); 
		// String ss4 = 5 + 6; -> type mismatch error  
		String ss4 = "5" + 6; // promotion
		System.out.println(ss4);
		String ss5 = Integer.toString(5)+ 6; // casting, Int>Str 강제 변환하는 형식, int 기본형 클래스는 Integer (wrapper class)
		System.out.println(ss5);
		String ss6 = Double.toString(5.5) + 6; // casting, Double>Str 강제 변환하는 형식
		System.out.println(ss6);
		
		System.out.println();
		// int abc = 5 + 6; -> type mismatch error
		int abc2 = 5 + Integer.parseInt("6");
		System.out.println(abc2);
		double abc3 = 5 + Double.parseDouble("6.7");
		System.out.println(abc3);
		
		System.out.println();
		// 누적
		int no = 1;
		no = no + 1;
		no += 1;
		no++; // 후위 증감연산자 
		++no; // 전위 증감연산자
		System.out.println("no : " + no);
		
		int imsi = 5;
		int result = ++imsi + 1; // 늘어난 뒤에 연산됨 (imsi가 연산 전에 1 증가)
		System.out.println("imsi : " + imsi);
		System.out.println("result : " + result);
		
		int imsi2 = 5;
		int result2 = imsi2++ + 1; // 연산된 후에 늘어남 (imsi가 연산 후에 1 증가)
		System.out.println("imsi2 : " + imsi2);
		System.out.println("result2 : " + result2);
		
		// 주의 : 증감연산자는 다른 연산자와 함께 사용하지 않고 단독으로 사용하는 것을 권장함
		// 참고 : for문에서 증감연산자를 자주 사용하게 됨
		
		// 부호 관련
		int imsi3  = 3;
		System.out.println(imsi3);
		System.out.println(-imsi3); // 부호 변경하는 법
		System.out.println(imsi3 * -1); 
		
		
		
	}
}
