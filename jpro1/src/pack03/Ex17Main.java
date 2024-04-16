package pack03;

public class Ex17Main {

	public static void main(String[] args) {
		// 추상 클래스 연습

//		Ex17Jepum jepum = new Ex17Jepum(); // 추상 클래스는 인스턴스 (new keyword) 불가
		Ex17Jepum jepum = null;

		Ex17Radio radio = new Ex17Radio();
		// Ex17Radio 에서 Ex17Jepum의 추상 메소드 (volumeControl()) 을 overriding 해 줬기 때문에 가능함
		// Ex17Radio 에서 overriding 을 해 주지 않으면 실행 오류 및 Ex17Radio.java 파일도 오류
		jepum = radio;
		jepum.volumeControl();

		System.out.println();
		Ex17Tv tv = new Ex17Tv();
		jepum = tv;
		jepum.volumeControl();
		
		System.out.println();
		Ex17Jepum jepumArr[] = {radio, tv};
		for (Ex17Jepum j : jepumArr) {
			j.volumeControl();
		}
		
	}

}
