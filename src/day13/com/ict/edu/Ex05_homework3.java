package day13.com.ict.edu;

import java.util.Random;
import java.util.Scanner;

public class Ex05_homework3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		// 높음, 낮음 게임
		// 둘 다 계속할까요(y/n) 사용
		// 승률 구하기(퍼센트)

		String go = "";
		int all = 0;
		int win = 0;
		double winper = 0.0;
		esc: while (true) {
        while (true) {
        	System.out.print("높음 / 낮음 중 하나를 고르시오.\n >>> ");
        	go = scan.next();
        	if (go.equalsIgnoreCase("높음") || go.equalsIgnoreCase("낮음")) {
        		break;
        	}else {
        		System.out.println("다시 입력하세요."); continue;
              	}
		}
			boolean bo = ran.nextBoolean();
			System.out.println(bo);
			if (bo == true) {
				System.out.println("이겼습니다.");
			win++;
		}else if (bo == false) {
				System.out.println("졌습니다.");
			}
			all++;
			while (true) {
				System.out.print("계속할까요?(y/n) >>>");
				String yn = scan.next();
				if (yn.equalsIgnoreCase("y")) {
					continue esc;
				} else if (yn.equalsIgnoreCase("n")) {
					break esc;
				} else {
					System.out.println("다시 입력하세요.");
				}
			}
		}
		winper = ((int)(win * 100) / all) / 1.0;
		//System.out.println("전체 횟수 : " + all);
		//System.out.println("이긴 횟수 : " + win);
		System.out.println("승률 : " + winper);

	}
}
