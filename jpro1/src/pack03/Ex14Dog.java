package pack03;

public class Ex14Dog {
	// 개과의 동물이 가져야 할 기본 속성과 행위를 별도의 class 로 작성한 후 상속

	private String name = "개";

	public Ex14Dog() {
	}

	public Ex14Dog(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public String callName() {
		return "종류 : " + name;
	}

	public void printMsg() {
		System.out.println(name + ": earth");
	}
}
