package pack03;

public class Ex20Tv implements Ex20Volume {
	private int volLevel;

	public Ex20Tv() {
		volLevel = 0;
	}
	
	@Override
	public void volumeUp(int level) {
		// 인터페이스의 추상 메소드를 오버라이드
		volLevel += level;
		String msg = "TV Volume Up : ";
		System.out.println(msg + volLevel);
	}

	@Override
	public void volumeDown(int level) {
		volLevel -= level;
		String msg = "TV Volume Down : ";
		System.out.println(msg + volLevel);
	}

}
