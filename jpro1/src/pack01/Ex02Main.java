package pack01;

public class Ex02Main {

	public static void main(String[] args) {
		// getter, setter 연습
		System.out.println("프로그램을 실행하다가...");
		
		// Ex02Car 객체 만들기
		System.out.println();
		Ex02Car tom = new Ex02Car();
		tom.showData();
		System.out.println("이름은 " + tom.irum);
		tom.irum = "톰"; // private가 아니므로 접근 가능
		System.out.println("바꾼 이름은 " + tom.irum);
		
		System.out.println("\n----- getter, setter confirm -----");
		// tom.speed = 80; // private이므로 접근 불가능
		
		// ----- 비밀번호를 부여해 주고 싶을 경우 -----
		// Ex02Car.java에 private에 접근하기 위한 method를 만들고 비밀번호도 부여해 주었음
		// tom.abcd(80, 123); // 호출하면서 80이라는 값을 넘기고 비밀번호를 입력한 것
		
		tom.setSpeed(80); 
		tom.showData();
		System.out.println("속도는 " + tom.getSpeed());
		int result = tom.getSpeed();
		System.out.println("속도는 " + result);
		
		
		
		
		
		
	}

}