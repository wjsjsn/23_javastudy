package day15.com.ict.edu2;

import java.util.Scanner;

public class Homework {
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

		int v1 = 3;
		int v2 = 3;
		int v3 = 3;
		String g = "";
		while (true) {
			System.out.print("선택하세요(1. TV 2. 스피커 3. 이어폰 4. 나가기)\n>>> ");
			int m = scan.nextInt();

			if (m == 4) {
				break;
			} else if (m == 0 || m > 4) {
				System.out.println("다시 입력하세요.");
				continue;
			}  
		
			System.out.print("입력하세요 1. up /  2. down >>> ");
			g = scan.next();			
			if (m == 1) {
				if (g.equalsIgnoreCase("u") || g.equals("1")) {
					v1++;
				} else if (g.equalsIgnoreCase("d") || g.equals("2") ) {
					v1--;
				}
				if (v1 >= 10 ) {
					v1 = 10;				
				} else if (v1<0) {
					v1 = 0;				
				}
				System.out.println("현재 TV볼륨 : " + v1);
			} else if (m == 2) {
				if (g.equalsIgnoreCase("u")|| g.equals("1")) {
					v2++;
				} else if (g.equalsIgnoreCase("d")|| g.equals("2")) {
					v2--;
				}
				if (v2 >= 10 ) {
					v2 = 10;				
				} else if (v2<0) {
					v2 = 0;				
				}
				System.out.println("현재 스피커 볼륨 : " + v2);
			} else if (m == 3) {
				if (g.equalsIgnoreCase("u")|| g.equals("1")) {
					v3++;
				} else if (g.equalsIgnoreCase("d")|| g.equals("2")) {
					v3--;
				}
				if (v3 >= 10 ) {
					v3 = 10;				
				} else if (v3<0) {
					v3 = 0;						
				}
				System.out.println("현재 이어폰 볼륨 : " + v3);
			}
		}
	}
}