package pack;

public class Test03 {

	public static void main(String[] args) {
		// 관계, 논리 연산자 
		int a = 5;
		
		// 관계 연산자
		System.out.println(a > 3);
		boolean bo = a > 3;
		System.out.println(bo);
		System.out.println(a >= 3);
		System.out.println(a <= 3);
		System.out.println(a == 3);
		System.out.println(a != 3);
		
		// 논리 연산자 p144
		System.out.println();
		int b = 10;
		System.out.println(a > 3);
		System.out.println(b > 3);
		System.out.println(a > 3 && b > 3); // and, 둘 다 참일 때만 true
		System.out.println(a > 3 || b > 3); // or, 하나라도 참이면 true
		
		System.out.println(a < 3 || b <= 1 + 1 * 1);
		boolean bb = a < 3 || b <= 1 + 1 * 1;
		System.out.println(bb);
		// 연산자 우선순위 : () 소괄호 > 산술연산자 (*,/) > 산술연산자 (+,-) > 관계연산자 > 논리연산자 > 치환
		
		
		System.out.println("\n\n----- shift 연산 -----"); 
		// int ii = 8, ij;
		// System.out.println("ii: "+ ii + ", " + ij); -> local variable error (지역 변수), ij 초기화 필요
		int ii = 8, ij = 0;
		System.out.println("ii: " + Integer.toBinaryString(ii)); // Interger.toBinaryString -> 10진수를 2진수로 변환
		
		ij = ii << 1; // << 좌측으로 1bit 이동, 남는 우측은 0으로 채움
		System.out.println("ii: "+ ii + ", ij: " + ij);
		// 00001000 이 00010000가 된 것
		
		ij = ii >> 1; // << 우측으로 1bit 이동, 남는 좌측은 부호(0:양수, 1:음수)와 같은 값으로 채움
		System.out.println("ii: "+ ii + ", ij: " + ij);
		// 00001000 이 00000100가 된 것
		
		ij = ii >>> 2; // << 우측으로 2bit 이동, 남는 좌측은 0으로 채움
		System.out.println("ii: "+ ii + ", ij: " + ij);
		// 00000100 이 00000010가 된 것
		
		System.out.println("\n----- 삼항 연산자----- "); // 표현식 -> (조건)?참일때값:거짓일때값 p130
		int sbs = 3;
		int mbc = (sbs > 5)?100:10 + 20 * 2;
		System.out.println(mbc);
		
		System.out.println();
		int x, y, z;
		x = y = z = 5;
		System.out.println(x + " " +  y + " " + z);
		
		System.out.println("\n----- 논리연산자에서 주의할 점 -----");
		
//		aa(); // 별도의 단위 코드를 짜 두고 호출하면 그 코드를 먼저 실행함 (return true라서 true를 가지고 돌아왔음)
//		
//		System.out.println(aa()); // 단발성
//		
//		boolean imsi = aa(); // 가지고 온 true를 imsi에 넣었으므로 계속 사용 가능
//		System.out.println(imsi);
		
		// boolean a1 = false, b1 = true, c1;
		boolean a1 = true, b1 = false, c1;
		c1 = a1 || b1; // or
		System.out.println("c1 : " + c1);
		c1 = a1 && b1; // and
		System.out.println("c1 : " + c1);
		
		System.out.println();
		boolean b2, b3;
		b1 = aa();
		System.out.println(b1);
		System.out.println(bb()); // static을 부르면 기울임 적용됨 (Eclipse 기능)
		
		System.out.println("-----");
//		b2 = aa() || bb();
//		System.out.println(b2); // or(||)를 사용했을 경우 첫 번째(aa())가 true면 두 번째(bb())는 수행하지 않음
		
//		b2 = bb() || aa();
//		System.out.println(b2); // 첫 번째 (bb())가 false기 때문에 두 번째 (aa())도 실행되었음
		
		b2 = aa() | bb(); // or(|) : 모든 method 호출
		System.out.println(b2);
		
//		System.out.println();
//		b3 = bb() && aa(); // and(&&)를 사용했을 경우 첫 번째 (aa())가 false면 두 번째 (bb())를 수행하지 않음
		
		System.out.println();
		b3 = bb() & aa(); // and(&) 모든 method 호출
		
		System.out.println(b3);
		
		// or(||)의 경우 true인 것이 발견된 순간 이후는 수행하지 않음을 주의해야 함
		// or(|)의 경우 무조건 모두 수행함
		
		// and(&&)의 경우 false인 것이 발견된 순간 이후는 수행하지 않음을 주의해야 함
		// and(&)의 경우 무조건 모두 수행함
		
		System.out.println("프로그램 종료");
		
		
		
	} // <- main이 끝나면 종료
	
	public static boolean aa() { // return 값이 true라서 boolean인 것, 정수면 int 실수면 double을 넣으면 됨
		System.out.println("aa 출력");
		return true;
	}
	
	public static boolean bb() {
		System.out.println("bb 출력");
		return false;
	}
	
}
