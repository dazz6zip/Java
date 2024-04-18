package pack05io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class Ex35ioTest02 {
	// 1byte 단위로 데이터 입출력 : 문자, 그림, 소리 파일 등 다양한 데이터 처리 가능

	public void writeFile(File file, ArrayList<String> strdatas) {

		try {
			BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), "utf-8"));
			for (String m : strdatas) {
				writer.write(m, 0, m.length());
				writer.newLine(); // line skip
			}
			if (writer != null) {
				writer.close();
			}
		} catch (Exception e) {
			System.out.println("writeFile error : " + e);
		}
	}

	public void readFile(File file) {
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(file), "utf-8"));
			String oneline;

//			String strs = null;
			// 문자열 더하기가 많은 경우 StringBuffer(권장) 나 StringBuilder 사용
			StringBuffer buffer = new StringBuffer();
//			StringBuilder builder = new StringBuilder();
			while ((oneline = reader.readLine()) != null) {
//				strs += oneline + "n"; // 누적 : 문자열 더하기 (비권장)
				buffer.append(oneline + "\n"); // 권장
			}
			if (reader != null) {
				reader.close();
				System.out.println(buffer.toString());
			}
		} catch (Exception e) {
			System.out.println("readFile error : " + e);
		}
	}

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("김천재");
		list.add("김바보");
		list.add("그냥바보");

		File file = new File("c:/work/iotest.txt");

		Ex35ioTest02 test2 = new Ex35ioTest02();
		test2.writeFile(file, list);
		test2.readFile(file);

	}

}
