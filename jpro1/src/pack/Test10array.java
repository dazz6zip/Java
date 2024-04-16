package pack;

public class Test10array {

	public static void main(String[] args) { // main method args는 배열의 대표명 (변경 가능)
		// 배열(array) : 성격과 크기가 일치하는 복수 개의 기억장소에 대하여 대표명 하나를 주고 첨자(index)로 각 기억장소를 구분
		// 반복처리가 효과적

		int a; // 기억장소 한 개 선언
//		int ar[]; // 배열 선언, 대괄호가 변수 이름 앞에 와도 무관함 ex) int []ar;
//		ar = new int [5];
		int ar[] = new int[5];
		System.out.println("배열 크기 : " + ar.length); // JAVA API
		ar[0] = 10;
		ar[1] = 20;
		ar[4] = ar[0] + ar[1] + ar[2]; // 첨자(index)로 각 기억장소를 호출
		System.out.println(ar[4]);
		// ar[5] = 50; -> java.lang.ArrayIndexOutOfBoundsException error
		// ar 배열에 다섯 번째 기억장소는 선언한 적 없기 때문에 발생하는 런타임 오류
		int aa = 4, b = 4;
		System.out.println(ar[4] + " " + ar[aa] + " " + ar[b] + " " + ar[1 + 3]);
		// 정수만 가능 첨자(index) 삽입 가능 연산 가능

		System.out.println();
		int[] ar1 = { 1, 2, 3, 4, 5 }; // 배열선언과 동시에 변수선언
		System.out.print(ar1[0] + " " + ar1.length);

		// 반복문으로 배열 자료 출력
		System.out.println();
		for (int i = 0; i < ar1.length; i++) {
			System.out.print(ar1[i] + " ");
		}

		System.out.println("\n\n----- 향상된 for : 배열, 컬렉션에서 사용 가능 -----");
		for (int i : ar1) { // 배열의 type을 적어 줘야 함
			System.out.print(i + " ");
			// 배열의 0번째부터 배열.length까지 순서대로 i에 들어감
		}
		System.out.println();
		String city[] = { "seoul", "daejeon", "jeju" };
		for (String lee : city) {
			System.out.print(lee + " ");
		}
		System.out.println();

		System.out.println("\n\n----- 배열의 값 저장 후 출력 -----");
		int[] ar2 = new int[5];
		for (int i = 0; i < ar2.length; i++) { // 배열에 값 넣는 for문
			ar2[i] = i + 1;
		}
		int tot = 0;
		for (int i = 0; i < ar2.length; i++) { // 배열의 값을 출력하는 for문
			System.out.print(ar2[i] + " ");
			tot += ar2[i];
		}
		System.out.println("\nar2 요소의 총 합 : " + tot);

		System.out.println("\n\n----- 다차원 배열 -----");
		// 첨자[면첨자][행첨자][열첨자]
		// int au[] = new int[12]; // 1차원 배열로 요소 수 12개
		int su[][] = new int[3][4]; // 2차원 배열로 요소 수 12개 // 변수 뒤에 대괄호 갯수에 따라 차원이 달라짐
		su[0][0] = 100;
		System.out.println(su[0][0]);
		System.out.println("행 수 : " + su.length + " " + ", 열 수 : " + su[0].length);

		// 2차원 배열값 저장
		int num = 10;
		for (int i = 0; i < su.length; i++) {
			for (int j = 0; j < su[i].length; j++) {
				su[i][j] = num++; // 10부터 들어감
				// su[i][j] = ++num; // 11부터 들어감
			}
		}
		System.out.println(su[0][0] + " " + su[2][0]);

		for (int i = 0; i < su.length; i++) {
			for (int j = 0; j < su[i].length; j++) {
				System.out.print(su[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("- 위 소스를 향상된 for로 출력");
		for (int[] row : su) {
			for (int ele : row) {
				System.out.print(ele + " ");
			}
			System.out.println();
		}

		System.out.println("\n\n----- 가변 배열 : 행마다 요소(열)의 갯수가 유동적 -----"); // 사용 빈도 적음, 참고
		int[][] scores = new int[2][];
		scores[0] = new int[2];
		scores[1] = new int[3];
		System.out.println(scores.length + " " + scores[0].length + " " + scores[1].length);

		System.out.println();
		int jum[][] = { { 90, 87 }, { 88, 99, 100 } }; // 가변 배열 선언 후 초기치 부여
		for (int i = 0; i < jum.length; i++) {
			for (int j = 0; j < jum[i].length; j++) {
				System.out.print(jum[i][j] + " ");
			}
			System.out.println();
		}
	}
}
