package pack03;

public class Ex25AnonyMain {
	public static void main(String[] args) {
		// 내부 무명(익명) 클래스 연습

		Ex25Saram saram = new Ex25Saram();
		System.out.println(saram.getIr());

		System.out.println();
		Ex25Person person = new Ex25Person();
		Ex25Saram saram2 = person.getSaram();
		System.out.println(saram2.getIr());
		
		System.out.println("write by fix");
		System.out.println("add by main");
		System.out.println("add by fix ");


	}

}
