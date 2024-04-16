package pack01;

public class ClassPre02 {
	// 다른 클래스에서 필요한 자원을 담아 둔 저장소 역할
	
	// ----- 방법 3 : 합 구하기 코드 별도 클래스에서 작성 -----
	// public 뒤 static을 삭제함 (main method가 아니기 때문에)
	
	public void hap(int su1, int su2) { // 합을 구하는 코드 별도 작성
		System.out.println("(방법 3) 합 : " + (su1 + su2));
	}

	public void cha(int su1, int su2) { // 차를 구하는 코드 별도 작성
		System.out.println("(방법 3) 차 : " + (su1 - su2));
	}
	
	/* --- 클래스를 배워야 하는 이유 ---
	 * 1. 클래스를 작성하기 위해
	 * 2. 다른 클래스(이미 JAVA에서 제공해 주고 있거나 타인이 만들어 배포한 클래스)를 분석 후 사용하기 위해
	 
	 * 클래스에 괄호가 없을 경우 member field
	 * 클래스에 괄호가 있을 경우 method
	 *
	 */

}