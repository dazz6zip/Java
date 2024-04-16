package pack03;

// public interface Ex22InterVol {
public interface Ex22InterVol extends Ex22VolEtc { // 인터페이스 사이에 상속이 가능함 
	String vol = "볼륨";
	
	void volUp(int v);
	void volDown(int v);
}
