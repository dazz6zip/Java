package pack01;

import java.time.LocalDate;

public class Ex08Main {

	public static void main(String[] args) {
		// singleton pattern
		
		Ex08SingletonClass s1 = new Ex08SingletonClass(); // pack01.Ex08SingletonClass@24d46ca6
		System.out.println(s1.kor);

		Ex08SingletonClass s2 = new Ex08SingletonClass(); // pack01.Ex08SingletonClass@4517d9a3
		System.out.println(s2.kor);
		
		// new keyword -> 새로 만들어짐
		
		System.out.println(s1 + " " + s2);
//		System.out.println(s1.hashCode() + " " + s2.hashCode()); -> 십진수
		
		// new keyword 를 사용하지 않고 호출
		
		System.out.println("-----");
		Ex08SingletonClass s3 = Ex08SingletonClass.getInstance(); // pack01.Ex08SingletonClass@13221655
		System.out.println(s3.kor);
		
		Ex08SingletonClass s4 = Ex08SingletonClass.getInstance(); // pack01.Ex08SingletonClass@13221655
		System.out.println(s4.kor);
		
		System.out.println(s3 + " " + s4);
		
		System.out.println("\n----- singleton pattern 사용하여 날짜 출력 -----");
		LocalDate mynow = LocalDate.now(); // 4145412
		LocalDate mynow2 = LocalDate.now(); // 4145412
		System.out.println(mynow.hashCode() + " " + mynow2.hashCode());
		System.out.println(mynow.getYear()); // private year, getter method 작성 유추 가능
		
	}

}

// 정리 : call by value 와 call by address(reference)
