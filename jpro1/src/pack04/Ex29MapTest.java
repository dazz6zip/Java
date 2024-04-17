package pack04;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Ex29MapTest {

	public static void main(String[] args) {
		// Map의 HashMap 연습 : 자료를 key(키)와 value(값)로 저장, 검색이 편리함
		HashMap<String, String> list = new HashMap<String, String>();
		list.put("1", "lee");
		list.put("2", "kim");
		list.put("3", "kim");
		list.put("4", "han");
		list.put("5", "choi");
		// value 는 중복될 수 있지만 key 는 중복될 수 없다
		
		System.out.println("크기 : " + list.size());
		
		System.out.println(list.containsKey("2"));
		System.out.println(list.containsKey("7"));
		System.out.println(list.containsValue("han"));
		// .containsKey 나 .containsValue 를 사용하여 key 나 Value 의 존재 여부 확인
		// True 나 False 값을 반환
		
		System.out.println();
		
		Set set = list.keySet();
		Iterator iter = set.iterator();
		while (iter.hasNext()) {
			String ss = (String)iter.next();
			System.out.println(ss); // key 출력
			System.out.println(list.get(ss)); // value 출력
		}
	}
}
