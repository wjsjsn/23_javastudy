package day13.com.ict.edu;

import java.util.Random;
import java.util.Scanner;

public class Ex05_homework {
	public static void main(String[] args) {

		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		// 1. 가위, 바위, 보 게임
		// 2. 높음, 낮음 맞히는 게임
		// 둘 다 계속할까요(y/n) 사용
		// 승률 구하기(퍼센트)

		// 가위, 바위, 보 게임
		String rsp = "";

		// System.out.println(rspc);
		double go = 0;
		double win = 0;
		double winper = 0.0;
		esc: while (true) {
			System.out.print("1. 가위, 2.  바위, 3. 보\n숫자를 입력하세요 >> ");
			int game = scan.nextInt();
			int rspc = ran.nextInt(3);

			if (game == 1) {
				rsp = "가위";
			} else if (game == 2) {
				rsp = "바위";
			} else if (game == 3) {
				rsp = "보";
			} else {
				System.out.println("다시 입력하세요.");
				continue;
			}

			if (game == rspc + 1) {
				System.out.println("비겼습니다.");
			} else if (game < rspc + 1 && game == rspc) {
				System.out.println("졌습니다.");
			} else if (game > rspc + 1 && game - 2 == rspc) {
				System.out.println("이겼습니다.");
			} else if (game < rspc + 1 && game == rspc - 1) {
				System.out.println("이겼습니다.");
			} else if (game > rspc + 1 && game - 3 == rspc) {
				System.out.println("졌습니다.");
			}
			go++;
			if (game > rspc + 1 && game - 2 == rspc || game < rspc + 1 && game == rspc - 1) {
				win++;
			}
			while (true) {
				System.out.print("계속할까요?(y / n) >>> ");
				String yn = scan.next();
				if (yn.equalsIgnoreCase("y")) {
					continue esc;
				} else if (yn.equalsIgnoreCase("n")) {
					break esc;
				} else {
					System.out.println("다시 입력하세요.");
					continue;
				}
			}
		}
		winper = ((int) (win * 100) / go) / 1.0;
		// System.out.println("전체 : " + go );
		// System.out.println("이김 수 : " + win );
		System.out.println("승률 : " + winper + "%");

	}
}
