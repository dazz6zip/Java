package pack01;

public class Ex08SingletonClass {
	
	
	int kor = 90;
	
	public Ex08SingletonClass() {
		
	}
	
	// 객체의 인스턴스가 오직 한 개만 생성되는 패턴을 만들기
	// 장점 : 메모리 절약, 데이터 공유 편리
	// 단점 : 테스트 불편, 유연성 부족
	
	
	// new keyword 사용하지 않고 main 에서 호출할 수 있게 하는 singleton class pattern
	
	private static Ex08SingletonClass class1 = new Ex08SingletonClass();
	
	public static Ex08SingletonClass getInstance() {
		return class1;
	}
	
}
