package pack05io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.StringTokenizer;
//import java.io.BufferedReader;
//import java.io.InputStreamReader;
//import java.util.Scanner;

public class Ex34ioTest {

	public static void main(String[] args) throws Exception {
		// Console과 File을 통한 입력

		// 1. Console을 통한 입력
//		InputStreamReader in = new InputStreamReader(System.in);
//		BufferedReader br = new BufferedReader(in);
//		System.out.print("이름 : ");
//		String ir = br.readLine();
//		System.out.println("이름 : " + ir);
//		br.close();
//		in.close();

//		// 2. Console을 통한 입력 - Scanner
//		Scanner sc = new Scanner(System.in);
//		System.out.print("이름 : ");
//		String ir = sc.nextLine();
//		System.out.print("몸무게 : ");
//		double w = sc.nextDouble();
//		System.out.println(ir + " 님의 몸무게 : " + w + "kg");
//		sc.close();

		// 3. file 읽기
		File f = new File("c:\\work\\good.txt");
		// 3-1. 문자 단위로 읽기
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr); // Buffer 는 선택 사항 (option)
		while (true) {
			String ss = br.readLine();
			if (ss == null) {
				break;
			}
			System.out.println(ss); // read 는 전부, readLine 은 한 줄씩
		}
		br.close(); // Garbage collector 에게 점유 메모리 해제 요청
		fr.close();

		// 3-2. csv 파일 읽기
		System.out.println("\n-----전국 도서관 정보 파일 일부 읽기 -----");
		File file = new File("c:/work/전국도서관표준데이터.csv");
		FileReader fr2 = new FileReader(file);
		BufferedReader br2 = new BufferedReader(fr2);
		int count = 0;
		String ss = br2.readLine(); // 첫 줄을 빼기 위한 행
		while (true) {
			count++;
			ss = br2.readLine();
			if (ss == null || count >= 10) {
				break;
			}
			StringTokenizer tok = new StringTokenizer(ss, ",");
			String s1 = tok.nextToken();
			String s2 = tok.nextToken();
			String s3 = tok.nextToken();
			String s4 = tok.nextToken();

			System.out.println(s1 + "\t" + s2 + "\t" + s3 + "\t" + s4);

		}
		System.out.println("건수 : " + count);

	}

}
