package pack01;

// method overload : 한 개의 class 내에 이름이 같은 method 를 여러 개 선언
// 성립 조건 : 매개변수의 갯수, type, 순서가 달라야 함 (반환형과는 관계없음)

public class Ex05AnimalOverload {
	private int leg = 4;
	private int age;
	private String name;
	public final static int MOUTH = 1;

	public Ex05AnimalOverload() {
		// 내용이 없다고 하더라도 적어 두는 것을 권장
		this(10); // 생성자가 다른 생성자를 호출, 다른 실행문보다 먼저 적어 줘야 함 (첫줄)
		System.out.println("empty");		
	}
//		메소드명(); -> 생성자가 메소드를 호출

	public Ex05AnimalOverload(int leg) { // 생성자 overloading
		this.leg = leg;
	}

	public Ex05AnimalOverload(String name) { // 생성자 overloading
		this.name = name;
	}

	public Ex05AnimalOverload(String name, int age, int leg) { // 생성자 overloading
		this.name = name;
		this.age = age;
		this.leg = leg;
	}
	//
	//

	public void display() {
		System.out.println("leg : " + leg + ", age : " + age + ", name : " + name);
	}

	// method overloading
	public void display(int age) {
//		this.age = age; // 지역 변수 age 를 멤버 필드 age 에 기억
		System.out.println("leg : " + leg + ", age : " + age + ", name : " + name);
	}

	// display method 와 print method 는 기능이 비슷하기 때문에 같은 method name 을 줄 수 있음
	// 하지만 parameter 는 달라야 함 (method name 뒤에 있는 parameter 까지 같으면 오류 발생)

	public void display(String name) {
		System.out.println("leg : " + leg + ", age : " + age + ", name : " + name);
	}

	public void display(String name, int age) {
		System.out.println("leg : " + leg + ", age : " + age + ", name : " + name);
	}

	public void display(int age, String name) {
		System.out.println("leg : " + leg + ", age : " + age + ", name : " + name);
	}

//	public void display(int leg) { // type과 갯수가 위에 있는 display(int age)와 같기 때문에 생기는 오류
//		System.out.println("leg : " + leg + ", age : " + age + ", name : " + name);
//	}

//	public String display(int leg) { // overloading 은 parameter 와만 관련이 있음 (반환형-String-과는 관계가 없음)
//		System.out.println("leg : " + leg + ", age : " + age + ", name : " + name);
//	}
}

// 관례 : final member field 는 대문자로 쓰는 것
// 참고 : 생성자는 내용이 없는 경우 생략 가능