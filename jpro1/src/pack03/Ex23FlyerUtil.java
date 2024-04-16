package pack03;

public class Ex23FlyerUtil {
	public static void show(Ex23Flyer f) { // Ex23Flyer 타입의 객체 주소를 가지고 호출
		f.fly();
		System.out.println("동물인가요? " + f.isAnimal());
	}
}
