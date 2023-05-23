package day07.com.ict.edu2;

import java.util.Scanner;

public class Ex01_Scanner2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 숙제 해답
		// Ex01_Scanner에서 계속할까요? 질문했을 때 2이면 탈출하지만
		// 2를 제외한 나머지는 무조건 실행하는 단점이 있음
		// 단점 : 1제외하고 다른 번호 입력해도 계속함

		// 전체 횟수, 짝수 횟수, 짝수가 나온 퍼센트 구하기(소수점 첫째 자리까지)

		int count = 0;
		int two = 0;
		double tp = 0.0;

		esc: while (true) {
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

			while (true) {
				System.out.print("계속할까요?(1. yes , 2. no) >> ");
				int s1 = scan.nextInt();
				if (s1 == 1) {
					continue esc;
				} else if (s1 == 2) {
					break esc;
				} else {
					System.out.println("제대로 입력하세요");
					continue;
				}
			}
		}
		tp = ((two * 100) / count) * 1.0;
		System.out.println("전체횟수 : " + count);
		System.out.println("짝수횟수 : " + two);
		System.out.println("짝수 나온 퍼센트 : " + tp);
	}
}