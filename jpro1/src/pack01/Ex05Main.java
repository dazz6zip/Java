package pack01;

public class Ex05Main {

	public static void main(String[] args) {
		// method overloading 연습
		
		Ex05AnimalOverload tiger = new Ex05AnimalOverload();
		tiger.display();
		tiger.display(5); 
		tiger.display("바보1");
		tiger.display("바보2", 2);		
		tiger.display(3, "바보3");		
		
		System.out.println("\n----- 생성자 오버로딩 -----");
		Ex05AnimalOverload dog = new Ex05AnimalOverload();
		dog.display();
		
		Ex05AnimalOverload hen = new Ex05AnimalOverload(2);
		hen.display();
		
		Ex05AnimalOverload wolf = new Ex05AnimalOverload("늑대", 3, 4);
		wolf.display();
		
		
		
		
	}
	// 참고 : 괄호 안에 들어가는 내용은 인수(인자, argument)라고 부름
}
