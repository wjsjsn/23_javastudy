package day07.com.ict.edu2;

import java.util.Scanner;

public class Ex01_Scanner_ {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// 전체 횟수, 짝수 횟수, 짝수가 나온 퍼센트 구하기(소수점 첫째 자리까지)

		int count = 0;
		int two = 0;
		double tp = 0.0;
		while (true) {
			System.out.print("숫자 입력 : ");
			int su = scan.nextInt();

			String str = "";
			if (su % 2 == 0) {
				str = "짝수";
			} else {
				str = "홀수";
			}
			count++;
			if (su % 2 == 0) {
				two++;
			}
			System.out.println(su + "는 " + str + "입니다.");

			System.out.print("계속할까요?(1. yes , 2. no) >> ");
			int s1 = scan.nextInt();
			if (s1 == 2)
				break; // 단점 : 1제외하고 다른 번호 입력해도 계속함
		}
		
		tp = ((two*100) / count)*1.0;
		System.out.println("전체횟수 : " + count);
		System.out.println("짝수횟수 : " + two);
		System.out.println("짝수 나온 퍼센트 : " + tp);

	}
}
