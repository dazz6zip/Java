package pack03;

public class Ex20Phone implements Ex20Volume {
	private int volLevel;

	public Ex20Phone() {
		volLevel = 0;
	}

	@Override
	public void volumeUp(int level) {
		// 인터페이스의 추상 메소드를 오버라이드
		if (level > 100) {
			level = 100;
		}
		volLevel += level;
		System.out.println("Phone Volume Up : " + volLevel);
	}

	@Override
	public void volumeDown(int level) {
		volLevel -= level;
		if (volLevel < 0) {
			volLevel = 0;
		}
		System.out.println("Phone Volume Down : " + volLevel);
	}

}
