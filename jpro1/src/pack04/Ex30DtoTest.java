package pack04;

import java.util.ArrayList;

public class Ex30DtoTest {
	// DTO : Record 단위의 기억 장소 (설명 추가 필요)

	ArrayList<Ex30StudentDto> list = new ArrayList<Ex30StudentDto>();
	Ex30StudentDto dto; // DTO

	// DTO 유추하기
	public void aa() {
		String persons[] = new String[3];
		persons[0] = "홍길동";
		persons[1] = "고길동";
		persons[2] = "신길동";

		for (String s : persons) {
			System.out.println(s);
		}
	}

	// DTO 사용하기
	public void insertList() { // record 단위 (DTO)로 학생 정보 입력하여 list에 저장
		dto = new Ex30StudentDto();
		dto.setHakbun("ks1");
		dto.setIrum("김천재");
		dto.setJumsu(90);
		list.add(dto); // 첫 번째 학생 자료 list 에 등록

		dto = new Ex30StudentDto(); // 인스턴스 하나만 만드는 것을 권장
		dto.setHakbun("ks2");
		dto.setIrum("김바보");
		dto.setJumsu(50);
		list.add(dto); // 두 번째 학생 자료 list 에 등록

		dto = new Ex30StudentDto(); // 인스턴스 하나만 만드는 것을 권장
		dto.setHakbun("ks3");
		dto.setIrum("김그냥");
		dto.setJumsu(80);
		list.add(dto); // 두 번째 학생 자료 list 에 등록
	}

	public void showList() { // list collection 에 저장된 학생 자료를 출력
		System.out.println("학생 수 : " + list.size() + "명");

		System.out.println();
		for (int i = 0; i < list.size(); i++) {
			Ex30StudentDto sdto = list.get(i); // 아래 두 줄과 동일
//			Ex30StudentDto sdto = new Ex30StudentDto();
//			sdto = list.get(i);
			System.out.println(sdto.getHakbun() + "(" + sdto.getIrum() + ") " + sdto.getJumsu() + "점");
		}
		System.out.println();
		for (Ex30StudentDto d : list) { // 위와 동일, 향상된 for문으로 작성
			System.out.println(d.getHakbun() + "(" + d.getIrum() + ") " + d.getJumsu() + "점");
		}
	}

	public static void main(String[] args) {
		Ex30DtoTest test = new Ex30DtoTest();
		test.aa();
		System.out.println();
		test.insertList();
		test.showList();

	}

}
