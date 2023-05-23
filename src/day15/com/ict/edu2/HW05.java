package day15.com.ict.edu2;

import java.util.Scanner;

public class HW05 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// 볼륨 조절 리모컨
		// 장치들 각각 볼륨 조절 가능
		// 현재 볼륨 기본값 : 3
		// 최대치 10, 최소치 0
		// 선택하세요 >>> 버튼
		// 1. TV, 2. 스피커, 3. 이어폰, 4. 나가기
		// 볼륨 up , 볼륨 down 선택해서 볼륨 조절(전부 따로)
		// 일반적인 방법, 상속&추상, 인터페이스로 해서 18일까지 제출

		int ch = 0;
		String g = "";
		String name = "";

		while (true) {
			System.out.print("선택하세요(  1. TV 2. 스피커 3. 이어폰 4. 나가기)\n>>> ");
			ch = scan.nextInt();
			int[] vol = { 3, 3, 3 }; // tv, 스피커, 이어폰의 볼륨 배열

			if (ch == 4) {
				break;
			} else if (ch == 0 || ch > 4) {
				System.out.println("다시 입력하세요.");
				continue;
			}
			esc: while (true) {
				System.out.print("입력하세요 1. up /  2. down >>> ");
				g = scan.next();

				for (int i = 0; i < 4; i++) {
					if (i == 1) {
						name = "TV";
					} else if (i == 2) {
						name = "스피커";
					} else if (i == 3) {
						name = "이어폰";
					}
					if (ch == i) {
						if (g.equalsIgnoreCase("u") || g.equals("1")) {
							vol[i - 1] = Math.min(vol[i - 1] + 1, 10); // 최대값 10까지 업
						} else if (g.equalsIgnoreCase("d") || g.equals("2")) {
							vol[i - 1] = Math.max(vol[i - 1] - 1, 0); // 최소값 0까지 다운
						} else {
							System.out.println("다시 입력하세요.");
							continue esc;
						}
						System.out.println("현재 " + name + " 볼륨 : " + vol[i-1]); 
					}
				}
			}
		}
	}
}
