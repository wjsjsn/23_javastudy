package day09.com.ict.edu;

import java.util.Iterator;

public class Ex10_Array {
	public static void main(String[] args) {

		// 가변길이 배열 추출
		int[][] su = new int[3][]; // 첫번째 숫자가 무조건 있어야함(없으면 무조건 오류)

		// 초기값으 고정길이방식으로 주면 x => 오류 발생
		/*
		 * su[0][0] = 10; su[0][1] = 20;
		 * 
		 * su[1][0] = 100; su[1][1] = 200;
		 * 
		 * su[2][0] = 1000; su[2][1] = 2000;
		 */

		// 가변길이는 무조건 1차원 배열을 만들어서 넣어야함
		int[] k1 = { 10, 20, 30 };
		int[] k2 = { 100, 200 };
		int[] k3 = { 1000, 2000, 3000, 4000 };

		// 위에서 만들 배열을 다차원 배열에 넣음
		su[0] = k1;
		su[1] = k2;
		su[2] = k3;

		// 출력
		for (int i = 0; i < su.length; i++) {
			for (int j = 0; j < su[i].length; j++) {
				System.out.println(su[i][j]);
			}
		}

		System.out.println("====================");

		// 선언, 생성, 저장 한 번에
		String[][] str = { { "java", "JAVA", "자바" }, { "JSP" }, { "HTML", "CSS" } };

		for (int i = 0; i < str.length; i++) {
			for (int j = 0; j < str[i].length; j++) {
				System.out.println(str[i][j]);
			}
		}
		System.out.println("====================");

	}
}
