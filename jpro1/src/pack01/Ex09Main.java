package pack01;

public class Ex09Main {

	public static void main(String[] args) {
		// method 호출시 parameter 를 통한 자료 전달 (type 기본형, 참조형)

		Ex09Callby01 mydata = new Ex09Callby01();
		Ex09Callby02 mymethod = new Ex09Callby02();

		System.out.println("기존 a : " + mydata.a + ", 기존 b : " + mydata.b);
		mymethod.ex(mydata.a, mydata.b); // 인수로 기본형 전달 (값이 전달) -> call by value

		System.out.println("1. method 수행 후 a : " + mydata.a + ", method 수행 후 b : " + mydata.b);
		// 값을 맞바꾼 method는 Ex09Callby02.java 에서 호출, Ex09Callby01.java에 있는 선언한 값은 그대로임
		// 기억장소 4개

		System.out.println();
		mymethod.ex(mydata); // Ex09Callby01 type 의 address 를 전달
		System.out.println("2. method 수행 후 a : " + mydata.a + ", method 수행 후 b : " + mydata.b);
		// 주소를 받아서 맞바꾼 것이기 때문에 Ex09Callby02.java 에서 바꾸면 Ex09Callby01.java 에도 동시 적용됨
		// object 2개

		System.out.println();
		System.out.println("배열의 대표명 c : " + mydata.c);
//		int kbs[] = mydata.c;
//		System.out.println(mydata.c[0]);
//		System.out.println(kbs[0]);
		mymethod.ex(mydata.c);
		System.out.println("3. array 수행 후 c[0] : " + mydata.c[0] + ", c[1] : " + mydata.c[1]);

	}

}

// 참고 : 포함(has a) 과 상속(is a) -> 정리도
// 정리 : 객체지향프로그램 (oop) 특징
