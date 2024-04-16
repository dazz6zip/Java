package pack03;

public class Ex13Object { // 생략되었지만 extends Object 가 되어 있는 것
	
	@Override
	public String toString() { // object 가 가지고 있는 toString() method 를 재정의 (overriding)
		// 부모의 본래 기능을 자식이 원하는 명령으로 재정의
		return "JAVA";
	}

	public static void main(String[] args) {
		// 최상위 super class object
		// 모든 class 는 자동으로 object class 를 상속받음 (불변, 다중상속이 가능한 유일한 케이스)
		Ex13Object obj = new Ex13Object();
		System.out.println(obj); 			
		System.out.println(obj.toString()); 
		// toString() : 객체 변수의 주소를 입력하는 method --> 생략 가능
		
		// 위 override method 가 없었을 때는 obj 의 주소가 출력되었는데
		// override method 에서 상위 class (object) 의 toString() method 를 재정의했으므로
		// override method 의 return 값인 JAVA 를 출력함
	}

}
