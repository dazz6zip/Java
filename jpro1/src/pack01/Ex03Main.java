package pack01;

public class Ex03Main {

	public static void main(String[] args) {
		// 클래스 기본 연습
		
		Ex03Programmer programmer = new Ex03Programmer();
		programmer.displayData(); // programmer.age는 private이기 때문에 단독 호출 불가능함
		
		System.out.println();
		programmer.setAge(33);
		System.out.println("나이 변경 : " + programmer.getAge());
		programmer.displayData();
		
		System.out.println("\n-----");
		Ex03Programmer tom = new Ex03Programmer();
		tom.nickName = "바보";
		tom.displayData();
		
		System.out.println("\n-----");
		Ex03Programmer james = new Ex03Programmer();
		james.nickName = "천재";
		james.displayData();
		
		System.out.println();
//		System.out.println("모토 : " + james.motto); // 이렇게 써도 가능하지만
		// static 멤버는 "클래스이름.멤버" 하고 사용 권장, 이럴 경우 new 안 써도 됨
		System.out.println("모토 : " + Ex03Programmer.motto); // 권장 형식
		Ex03Programmer.goodMethod();
		
		
	}

}
