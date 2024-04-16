package pack;

public class Test08for {

	public static void main(String[] args) {
		// 반복문 : continue, break (참고 : if문에는 없는 개념임)
		System.out.println("뭔가를 하다가...");

		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
			if (i == 3) {
				continue; // 아래 문장을 무시하고 대응하는 for문으로 올라감
			}
			if (i == 5) {
				break; // break를 포함하고 있는 for문을 빠져나옴
			}
			System.out.println("금요일");
		}

		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
			if (i == 3) {
				continue; // 아래 문장을 무시하고 대응하는 for문으로 올라감
			}
			/*
			 * if (i == 5) { break; // break를 포함하고 있는 for문을 빠져나옴 }
			 */
			if (i == 5) {
				System.exit(0); // 응용프로그램의 종료
			}
			System.out.println("금요일");

			// for문을 사용하여 무한 루프 만들기
			System.out.println();
			int kk = 0;
			for (;;) { // 조건이 없으므로 무한 반복임 (무한 루프)
				kk++;
				System.out.println("무한 반복 출력");
				if (kk == 10) { // 10번 출력한 뒤
					break; // 반복을 빠져나옴
				}
			}

			// for문 앞에 라벨 달기
			System.out.println();
			kbs: for (int ii = 1; ii <= 3; ii++) {
				mbc: for (int j = 1; j <= 5; j++) {
					System.out.print(i + " " + j + " ");
					if (j == 3) {
						continue kbs; // 해당 label로 분기
					}
					if (j == 5) {
						break kbs; // 해당 label로 분기
					}
				}
				System.out.println("-----");
			}

		}
	}
}
