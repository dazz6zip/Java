package pack03;

public class Ex25Person {
	public Ex25Saram getSaram() { // 리턴 타입이 Ex25Saram
		return new Ex25Saram() { // 내부 무명 클래스
			public String getIr() { // Ex25Saram 클래스의 메소드를 오버라이딩
				return "김천재";
			} // 리턴되는 클래스(Ex25Saram) 안에 있는 메소드만 오버라이딩 가능함
		};
	}
}
