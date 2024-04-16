package pack03;

// public class Ex22Radio implements Ex22InterVol, Ex22VolEtc { // 인터페이스 다중 상속 효과 가능, 
public class Ex22Radio implements Ex22InterVol{ // 하지만 InterVol 에서 VolEtc를 상속받고 있으므로 InterVol만 기입해도 됨
	private int v = 0;

	@Override
	public void volUp(int v) {
		this.v += v;
	}

	@Override
	public void volDown(int v) {
		this.v -= v;
	}

	@Override
	public void volOff() {
		v = 0;
	}

	@Override
	public void volOn() {
		v = 1;
	}
	
	public void showVol() {
		System.out.println("현재 볼륨 : " + v);
	}

}
