package pack03;

public class Ex18Lion extends Ex18Animal {
	
	@Override
	public String name() {
		return "사자";
	}
	
	@Override
	public String eat() {
		return "고기";
	}
	
	@Override
	public String action() {
		return "밤";
	}
	
	public void eatOther() { // 고유 메소드
		System.out.println("+ 물");
	}
	

}
