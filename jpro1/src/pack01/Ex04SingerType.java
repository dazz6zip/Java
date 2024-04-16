package pack01;

public class Ex04SingerType { // 가수들이 가져야 할 기본 요소(멤버)를 클래스로 작성
	private String name = "무명"; // 이름
	private String title = "korea"; // 곡 제목

	// 값 부여하는 방법
	// 1. member field -> 1회용
	// 2. 생성자 -> 1회용
	// 3. setter -> 값을 주고 싶을 때 계속 줄 수 있음 (private)
	
	public Ex04SingerType(String name, String title) { // setter 만들지 않고 생성자를 활용하여 값 넣기
		this.name = name;
		this.title = title;
	}

	public String getName() {
		return name;
	}

	public String getTitle() {
		return title;
	}

	public void sing() {
		System.out.println(name + " is singing " + title + "...");
	}

	public static void main(String[] args) {
		// 응용 프로그램 시작용 method
		// Ex04SingerType 멤버가 아니기 때문에 private member field나 private method를 사용할 수 없음

		Ex04SingerType bts = new Ex04SingerType("BTS", "Dynamite");
		bts.sing();
		System.out.println("가수 : " + bts.getName());
		System.out.println("노래 : " + bts.getTitle());

		System.out.println();

		Ex04SingerType blackpink = new Ex04SingerType("BlackPink", "How you like that");
		blackpink.sing();
		System.out.println("가수 : " + blackpink.getName());
		System.out.println("노래 : " + blackpink.getTitle());
	}

}
