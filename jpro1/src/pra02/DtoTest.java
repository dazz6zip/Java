package pra02;

import java.util.ArrayList;
import java.util.Scanner;

public class DtoTest {

	ArrayList<ScoreDto> list = new ArrayList<ScoreDto>();
	ScoreDto dto;

	public void input() {
		while (true) {
			try {
				dto = new ScoreDto();

				System.out.print("이름 입력 : ");
				Scanner sc = new Scanner(System.in);
				dto.setName(sc.next());

				System.out.print("국어 점수 : ");
				dto.setKor(sc.nextInt());

				System.out.print("영어 점수 : ");
				dto.setEng(sc.nextInt());

				list.add(dto);

				System.out.print("계속할까요?(y/n)\n: ");
				if (sc.next().equalsIgnoreCase("n")) {
					// .equals 만 하면 대소문자를 구분하기 때문에 .equalsIgnoreCase 사용
					break;
				}
			} catch (Exception e) {
				System.out.println("처리 중 오류 발생 : " + e);
				break;
			}
		}
	}

	public void showOutput() {
		System.out.println("\n----------\n이름\t국어\t영어\t총점");
		for (ScoreDto d : list) { // 배열을 활용한 for문은 보통 향상 for문을 사용 (권장)
			int tot = d.getKor() + d.getEng();
			System.out.println(d.getName() + "\t" + d.getKor() + "\t" + d.getEng() + "\t" + tot);
		}
		System.out.println("응시인원 : " + list.size() + "명\n----------");
	}

	public static void main(String[] args) {
		DtoTest test = new DtoTest();
		test.input();
		test.showOutput();
	}

}
