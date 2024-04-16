package pack01;

public class Ex09Callby02 {
	public void ex(int a, int b) { // parameter 로 기본형 사용
		int imsi = a;
		a = b;
		b = imsi;
		System.out.println("a in method : " + a + ", b : " + b);
	}
	
	public void ex(Ex09Callby01 data) { // parameter 로 참조형 사용
		int imsi = data.a;
		data.a = data.b;
		data.b = imsi;
		System.out.println("a in method(참조) : " + data.a + ", b : " + data.b);
	}
	
	public void ex(int[] ar) {
		int imsi = ar[0];
		ar[0] = ar[1];
		ar[1] = imsi;	
		System.out.println("array[0] in method : " + ar[0] + ", array[1] : " + ar[1]);
	}

}
