package pack03;

public class Ex20Main {

	public static void main(String[] args) {
//		Ex20Volume volume = new ex20Volume(); // 인터페이스는 new 불가능함
		Ex20Volume volume;

		Ex20Radio radio = new Ex20Radio();
		Ex20Tv tv = new Ex20Tv();
		Ex20Phone phone = new Ex20Phone();

		radio.volumeUp(5);
		radio.volumeDown(2);

		tv.volumeUp(10);
		tv.volumeDown(7);

		phone.volumeUp(7);
		phone.volumeDown(1);

		System.out.println("-----");
		volume = radio;
		volume.volumeUp(1);

		volume = tv;
		volume.volumeUp(2);

		volume = phone;
		volume.volumeUp(3);

		System.out.println("\n----- 배열과 for문 -----");
		Ex20Volume volArr[] = new Ex20Volume[3]; // 인터페이스지만 new 로 배열 생성은 가능함
		volArr[0] = radio;
		volArr[1] = tv;
		volArr[2] = phone;

		for (int a = 0; a < volArr.length; a++) {
			volArr[a].volumeDown(1);
		}

		System.out.println("----- 향상된 for문 -----");
		for (Ex20Volume v : volArr) {
			v.volumeDown(1);
		}

	}

}
