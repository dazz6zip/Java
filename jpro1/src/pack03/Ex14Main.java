package pack03;

public class Ex14Main {

	public static void main(String[] args) {
		// 개과의 동물들 상속으로 처리
		
		Ex14Dog dog = new Ex14Dog();
		dog.printMsg();
		System.out.println(dog.callName());
		
		System.out.println("\n----- House Dog -----");
		Ex14HouseDog hd = new Ex14HouseDog("dog");
		hd.printMsg();
		System.out.println(hd.callName());
		
		System.out.println("\n----- Wolf -----");
		Ex14Wolf w = new Ex14Wolf("wolf");
		w.printMsg();
		System.out.println(w.callName());
		
		System.out.println("-");
		w.display();
		
		System.out.println("\n\n----- 주소 치환 -----");
		Ex14Wolf bd = w; // 같은 type 변수에게 주소를 치환
		w.printMsg();
		bd.printMsg();
		
		System.out.println();
//		Ex14HouseDog hd2 = w; // type mismatch error. 
		Ex14Dog d2 = w; // type 이 다르지만 Ex14Dog 가 w(Ex14Wolf) 의 상위 class 이기 때문에 주소 치환이 가능함
		d2.printMsg();
		// d2 는 Ex14Dog type 이지만 w(Ex14Wolf) 의 주소를 치환해 줬기 때문에 w class 안에 있는 printMsg 가 호출됨
		
		Ex14Dog d3 = new Ex14Dog();
		d3.printMsg();
//		Ex14Wolf w2 = d3; // type mismatch error. 하위 객체변수에 상위 변수 주소 치환은 불가능함
//		w = d3; // type mismatch error.

	}

}
