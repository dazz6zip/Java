package pack04;

import java.util.HashSet;
import java.util.Iterator;

// Collection : 다수의 객체를 담을 수 있는 집합형 자료구조
public class Ex27SetTest {

	public static void main(String[] args) {
		// Set의 HashSet 연습 : 중복 불가, 순서 없음

//		Ex27SetTest test = new Ex27SetTest();
//		HashSet<Object> list = new HashSet<Object>(); // <E> : 제네릭
		// 제네릭 안에 들어간 타입만 들어갈 수 있음
		// 제네릭 안에 Ex27SetTest 를 넣어 주면, Ex27SetTest 의 하위 클래스들도 들어갈 수 있음
//		list.add(1);
//		list.add("lee");
//		list.add(test);

		HashSet<String> list = new HashSet<String>();
		list.add("lee");
		list.add("lee");
		list.add("lee");
		list.add("park");
		list.add("hong");
//		list.remove("park"); // list 에서 park 을 지움 : 부분 삭제
//		list.clear(); // list 전체 삭제
		System.out.println("크기 : " + list.size()); // array -> length, collection -> size
		// -> 중복 불가능하기 때문에 lee 는 하나로 출력(카운팅)
		// -> 순서가 없기 때문에 입력된 순서와 상관없이 출력

		for (Object obj : list) {
			System.out.println(obj);
		}
		
		System.out.println();
		// Iterator(반복자) : 개발자가 컨테이너(묶음형 자료) / 컬렉션, 특히 리스트를 순회할 수 있게 해 주는 인터페이스
		Iterator iter = list.iterator();
		while (iter.hasNext()) {
			String ss = (String)iter.next();
			System.out.println(ss);
		}

	}

}
