package pack03;

public class Ex12FamilyMain {

	public static void main(String[] args) {
		// 상속 연습 : 가족 소개

		Ex12GrandFa gr0 = new Ex12GrandFa();
		System.out.println("가보 : " + gr0.gabo);
		System.out.println("가훈 : " + gr0.gahun);
		System.out.println(gr0.say());
		gr0.eat();
		System.out.println("할아버지 연세 : " + gr0.getNai());

		System.out.println();
		// parameter 가 있는 생성자 호출
		Ex12GrandFa gr1 = new Ex12GrandFa(77);
		System.out.println("가훈 : " + gr1.gahun);
		System.out.println("할아버지 연세 : " + gr1.getNai());

		System.out.println("\n----- Father -----");
		Ex12Father father0 = new Ex12Father(); // 포함 관계
		// Ex12Father 의 상위 class 인 Ex12GrandFa 의 member field 와 method 를 사용할 수 있음
		System.out.println("가보 : " + father0.gabo); // 먼저 Ex12Father 에서 찾고, 없으면 상위 class(Ex12GrandFa) 에서 찾음
		System.out.println("가훈 : " + father0.gahun);
		System.out.println(father0.say());
		father0.eat();
		System.out.println("아버지 연세 : " + father0.getNai());
		System.out.println(father0.getHouse());
		// 상속은 단순히 가져다 쓰는 것에 국한하지 않고 다형성을 추구함

		System.out.println();
		father0.showData();

		System.out.println("\n----- Me -----");
		Ex12Me me = new Ex12Me();
		System.out.println("가보 : " + me.gabo);
		System.out.println("가훈 : " + me.gahun);
		System.out.println(me.say());
		me.eat();
		System.out.println("나이 : " + me.getNai());
		System.out.println(me.getHouse());
		me.biking();
		
		
	}

}
