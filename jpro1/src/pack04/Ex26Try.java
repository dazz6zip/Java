package pack04;

import java.io.FileNotFoundException;
import java.io.FileReader;

// 예외 처리 : 키보드, 파일 처리, 네트워크, DB 연동 처리 등 외부와의 접속을 통한 프로그래밍 작업 중 예상치 못한 에러가 발생할 때 주로 사용  
// try ~ catch 구문 사용
public class Ex26Try {

	public void testMethod() {
		System.out.println("testMethod");
		try {
			int a[] = { 1, 2, 3 };
			System.out.println("배열 요소 값 출력 : " + a[0]);
			System.out.println("배열 요소 값 출력 : " + a[3]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("testMethod 오류 -> " + e);
		}
	}

//	public static void main(String[] args) throws Exception { // 실행은 가능, 발생한 오류문을 출력
	public static void main(String[] args) {
		// try 블럭 내에서 파일 관련 작업, 에러가 발생하면 catch로 이동
		try {
//			// 보조 기억장치의 파일 읽기
			FileReader fr = new FileReader("c:/work/aa.txt");
			// 객체가 인스턴스의 주소를 갖지 않은 경우
//			Ex26Try try1 = null;
			Ex26Try try1 = new Ex26Try();
			try1.testMethod();

			int re = 10 / 0;
			System.out.println("re : " + re);
		} catch (FileNotFoundException e1) {
			System.out.println("해당 파일이 존재하지 않습니다.");
		} catch (NullPointerException e2) {
//			e2.printStackTrace();
			System.out.println("객체 변수 에러 원인 -> " + e2);
//			System.out.println("객체 변수 에러 원인 -> " + e2.getMessage()); // e2 와 e2.getMessage() 는 동일함
		} catch (ArrayIndexOutOfBoundsException e3) {
			System.out.println("배열 처리 에러 원인 -> " + e3);
		} catch (ArithmeticException e4) { 
			System.out.println("연산 에러 원인 -> " + e4);
		} finally {
			System.out.println("에러와 상관없이 반드시 출력");
		}
		// 괄호 안에 Exception e를 넣어 주면 모든 오류에 반응함 (Exception 최상위 클래스)
		System.out.println("- 프로그램 종료 -");
	}
}
