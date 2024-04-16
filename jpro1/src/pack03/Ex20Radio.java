package pack03;

public class Ex20Radio implements Ex20Volume {
	private int volLevel;

	public Ex20Radio() {
		volLevel = 0;
	}
	
	@Override
	public void volumeUp(int level) {
		// 인터페이스의 추상 메소드를 오버라이드
		volLevel += level;
		System.out.println("Radio Volume Up : " + volLevel);
	}

	@Override
	public void volumeDown(int level) {
		volLevel -= level;
		System.out.println("Radio Volume Down : " + volLevel);

	}

}
