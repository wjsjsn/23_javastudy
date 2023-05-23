package day13.com.ict.edu;

import java.util.Random;
import java.util.Scanner;

public class Ex05_homework2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();

		// 높음, 낮음 게임
		// 둘 다 계속할까요(y/n) 사용
		// 승률 구하기(퍼센트)

		int all = 0;
		int up = 0;
		double uper = 0.0;
		boolean ud = true;

		esc: while (true) {
			System.out.print("0부터 100에서 원하는 숫자를 입력하세요.\n>>> ");
			int su = scan.nextInt();
			int suc = ran.nextInt(101);

			if (su > suc) {
				ud = true;
				System.out.println("결과 : 높음");
				up++;
			}
			if (su < suc) {
				ud = false;
				System.out.println("결과 : 낮음");
			}
			all++;

			System.out.print("계속 할까요?(y / n) >>> ");
			String yn = scan.next();
			if (yn.equalsIgnoreCase("y"))
				continue esc;
			if (yn.equalsIgnoreCase("n")) {
				break esc;
			} else {
				System.out.println("다시 입력하세요.");
				continue;
			}
		}
		uper = ((int) (up * 100) / all) / 1.0;
		System.out.println("전체 : " + all);
		System.out.println("높음 : " + up);
		System.out.println("승률 : " + uper);

	}
}
