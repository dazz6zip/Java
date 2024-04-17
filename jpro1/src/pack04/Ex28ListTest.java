package pack04;

import java.util.ArrayList;
import java.util.Iterator;

public class Ex28ListTest {

	public static void main(String[] args) {
		// list의 ArrayList 연습 : 중복 가능, 순서 있음

		ArrayList<String> list = new ArrayList<String>();
		list.add("lee");
		list.add("lee");
		list.add("lee");
		list.add("park");
		list.add("hong");
		list.remove(0); // 순서로 호출 가능 (순서가 없는 Set 에서는 불가능) -> 첫 번째로 add 한 lee String 이 지워짐
		System.out.println("크기 : " + list.size());
		// -> 중복 가능 (각자의 객체로 인식)
		// -> 순서가 있기 때문에 입력된 순서대로 출력

		for (Object obj : list) {
			System.out.println(obj);
		}

		System.out.println();
		Iterator iter = list.iterator();
		while (iter.hasNext()) {
			String ss = (String) iter.next();
			System.out.println(ss);
		}

	}

}
