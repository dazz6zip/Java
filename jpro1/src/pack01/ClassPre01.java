package pack01;

public class ClassPre01 {

	public static void main(String[] args) {
		// 클래스 이해 전에 자원의 재활용에 대해 알아보기

		int su1 = 6;
		int su2 = 3;

		System.out.println("----- 방법 1 -----");
		System.out.println("합 : " + (su1 + su2));
		System.out.println("차 : " + (su1 - su2));

		// 뭔가를 하다가...
		System.out.println();
		// 합과 차 구하기가 또 필요할 때

		System.out.println("합 : " + (su1 + su2));
		System.out.println("차 : " + (su1 - su2));

		System.out.println("\n----- 방법 2 -----");
		// 별도의 단위 프로그램 작성 후 필요할 때마다 호출
		hap(su1, su2);
		cha(su1, su2);

		// 뭔가를 하다가...
		System.out.println();
		// 합과 차 구하기가 또 필요할 때

		hap(su1, su2);
		cha(su1, su2);

		System.out.println("\n----- 방법 3 : ClassPre2 의 단위 프로그램을 호출 -----");
		// 별도의 단위 프로그램 작성 후 필요할 때마다 호출
		
		ClassPre02 my = new ClassPre02(); // 불러오는 법
		my.hap(su1, su2); 
		my.hap(20, 5);
		my.cha(su1, su2);
		
		
	}

	public static void hap(int su1, int su2) { // 합을 구하는 코드 별도 작성
		System.out.println("합 : " + (su1 + su2));
	}

	public static void cha(int su1, int su2) { // 차를 구하는 코드 별도 작성
		System.out.println("차 : " + (su1 - su2));
	}

}
