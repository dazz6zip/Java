package pack;

public class Test11array {

	public static void main(String[] args) {
		// main method의 매개변수(배열) 확인

		if (args.length == 0) {
			System.out.println("실행시 값을 주세요");
			System.exit(0);
		}
		
		System.out.println(args.length);
		for (int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}
		for (String imsi : args) { // 향상된 for문, args에 String 값이 들어가 있음을 유의
			System.out.println(imsi);
		}
		System.out.println("응용프로그램 종료");
		
	}

}
