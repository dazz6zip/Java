package pack03;

public class Ex18Main {

	public static void main(String[] args) {
		Ex18Cow cow = new Ex18Cow();
		System.out.print(cow.name() + " : ");
		System.out.print(cow.action() + ", ");
		System.out.println(cow.eat());
		cow.animalPrint();
		
		System.out.println();
		Ex18Lion lion = new Ex18Lion();
		System.out.print(lion.name() + " : ");
		System.out.print(lion.action() + ", ");
		System.out.print(lion.eat() + " ");
		lion.eatOther(); // Ex18Lion 의 고유 메소드
		lion.animalPrint();
		
		System.out.println();
		Ex18Animal animal = null;
		animal = cow;
		System.out.println(animal.name());
		animal = lion;
		System.out.println(animal.name());
		
		System.out.println("\n----- 별도 클래스 사용해 보기 -----");
		Ex18FindUtil.find(cow); // Ex18FindUtil 클래스가 static 이기 때문에 new keyword 없이 바로 부름
		Ex18FindUtil.find(lion);
	}

}
