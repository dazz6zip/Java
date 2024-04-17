package pack04;

import java.util.ArrayList;
import java.util.StringTokenizer;

public class Ex32DtoTest02 {

	private ArrayList<Ex32HaksaengDto> dtos = new ArrayList<Ex32HaksaengDto>();

	public void inputData(String datas[]) {
		// csv 문자열을 분리
		
//		StringTokenizer tokenizer = new StringTokenizer("kbs,mbc,sbs",",");
//		String s1 = tokenizer.nextToken();
//		String s2 = tokenizer.nextToken();
//		String s3 = tokenizer.nextToken();
//		System.out.println(s1 + " " + s2 + " " + s3);
		
		for (int i = 0; i < datas.length; i++) {
			StringTokenizer tok = new StringTokenizer(datas[i],",");
			String ir = tok.nextToken();
			int kor = Integer.parseInt(tok.nextToken());
			int eng = Integer.parseInt(tok.nextToken());
			int mat = Integer.parseInt(tok.nextToken());
			Ex32HaksaengDto dto = new Ex32HaksaengDto(); // DTO 처리
			dto.setName(ir);
			dto.setKor(kor);
			dto.setEng(eng);
			dto.setMat(mat);
			
//			Ex32HaksaengDto dto2 = new Ex32HaksaengDto(ir, kor, eng, mat); // 이렇게 생성자 활용하는 것도 가능함
			
			dtos.add(dto);
		}
	}

	public void displayData() {
		for(Ex32HaksaengDto hd : dtos) {
			int tot = hd.getKor() + hd.getEng() + hd.getMat();
			double avg = tot / 3.0;
			System.out.println(hd.getName() + "의 총 점수 : " + tot + ", 평균 : " + avg );
		}
	}

	public static void main(String args[]) {
		String datas[] = new String[3];
		datas[0] = "김밥,100,100,100";
		datas[1] = "주먹밥,80,75,88";
		datas[2] = "비빔밥,77,88,80";

		Ex32DtoTest02 test = new Ex32DtoTest02();
		test.inputData(datas);
		test.displayData();
	}

}
