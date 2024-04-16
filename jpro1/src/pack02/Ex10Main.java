package pack02;

public class Ex10Main {

	public static void main(String[] args) {
		// class 의 포함 관계 (has a) 연습
		
		Ex10Car tom = new Ex10Car("톰");
		tom.playCarTurnHandle(30);
		System.out.println(tom.ownerName + "의 회전량 : " + tom.turnMessageShow + " (" + tom.handle.quantity + ")");
		
		tom.playCarTurnHandle(-20);
		System.out.println(tom.ownerName + "의 회전량 : " + tom.turnMessageShow + " (" + tom.handle.quantity + ")");
		
		System.out.println();
		Ex10Car james = new Ex10Car("제임스");
		james.playCarTurnHandle(0);
		System.out.println(james.ownerName + "의 회전량 : " + james.turnMessageShow + " (" + james.handle.quantity + ")");
		
	}
}
