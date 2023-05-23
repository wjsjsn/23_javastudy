package dd.com.ict.edu;

import java.util.Random;
import java.util.Scanner;

public class Team {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		// 숫자 야구게임
		// 3자리를 숫자 0-9까지 랜덤으로 추출(중복 x)
		// 숫자 넣기
		// 다 틀리면 out / 다시 숫자 넣기
		// 다 맞으면 home run / 끝
		// 한 개 맞으면 1 strike
		// 맞는데 자리가 안맞으면 ball
		// 몇 번만에 맞히는지 출력(승률 x) => 몇 번째만에 맞히셨습니다.
		// 10번째부터 계속할까요(y/n)? 넣기
		int first = 0;
		int second = 0;
		int third = 0;
		int all = 0;
		int ball = 0;
		int strike = 0;
		String res = "";

		int fst = ran.nextInt(10);
		int snd = ran.nextInt(10);
		int trd = ran.nextInt(10);
	
	 while (fst == snd) {
		snd =  ran.nextInt(10);
	}
	 while (snd == trd || trd == fst) {
		 trd = ran.nextInt(10);     
	 }
	 	//System.out.println(fst);
		//System.out.println(snd);
		//System.out.println(trd);
		
		esc: while (true) {
			all++;
			while(all>10) {
				System.out.print("계속할까요?(y/n) >>>");
				String yn = scan.next();
				if (yn.equalsIgnoreCase("y")) {
					break ;
				} else if (yn.equalsIgnoreCase("n")) {
					break esc;
				} else {
					System.out.println("다시 입력하세요.");
				}
			}
			
			System.out.print(" 첫번째 숫자를 입력하세요.\n >>> ");
			first = scan.nextInt();
			System.out.print(" 두번째 숫자를 입력하세요.\n >>> ");
			second = scan.nextInt();
			System.out.print(" 세번째 숫자를 입력하세요.\n >>> ");
			third = scan.nextInt();

			strike = 0;
			ball = 0;
			if (first == fst && second == snd && third == trd) {
				res = "home run";
				System.out.println(res);
				break;
			}
			if (res.equalsIgnoreCase("home run")) {
				break;
			}
			
			if (first == fst) {
				strike++;
			} else if (first == snd) {
				ball++;
			} else if (first == trd) {
				ball++;
			}
			
			if (second == snd) {
				strike++;
			} else if (second == fst) {
				ball++;
			} else if (second == trd) {
				ball++;
			}
			
			if (third == trd) {
				strike++;
			} else if (third == snd) {
				ball++;
			} else if (third == fst) {
				ball++;
			} else if (first != fst && second != snd && third != trd) {
				res = "out";
				System.out.println(res); continue esc;
			}
			
			System.out.println(strike + "Strike" + " " + ball + "ball");
			
		}
		if (res.equalsIgnoreCase("home run")) {
			System.out.println(all + "번째에 맞히셨습니다.");
		}
	}
}
