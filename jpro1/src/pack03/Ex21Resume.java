package pack03;

public interface Ex21Resume { // 이력서 표준 양식

	String SIZE = "A4"; // public final static String SIZE = "A4";

	void setIrum(String irum);

	void setPhone(String phone);

	void printData();
	
	// JAVA 1.8 이후부터,
	// 메소드 이름에 default 나 static 을 기재해 주면 추상 메소드가 아니어도 인터페이스에 작성 가능해짐

	default void display(boolean b) {
		if (b) {
			System.out.println("참");
		} else {
			System.out.println("거짓");
		}
	}
	
	static void play() {
		System.out.println("play method");
	}
	

}
