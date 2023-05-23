package day09.com.ict.edu;

public class Ex08_Array {
	public static void main(String[] args) {

		// 다차원배열 : 1차원 배열이 여러 개 모인 것
		// 종류 : 기본자료형, 참조자료형
		// 고정길이배열, 가변길이배열(다차원에만 존재)

		// 고정길이 배열
		// 1. 선언 : 자료형[][] 이름;
		int su[][];

		// 2. 생성 : 이름 = new 자료형[1차원 배열의 수][1차원 배열 안에 존재하는 배열의 크기]
		su = new int[2][3]; // 1차원 배열이 2개고 각각 3개의 배열을 갖고 있음

		// 3. 데이터 저장
		su[0][0] = 10;
		su[0][1] = 20;
		su[0][2] = 30;

		su[1][0] = 100;
		su[1][1] = 200;
		su[1][2] = 300;

		// 배열의 주소
		System.out.println(su);
		System.out.println(su[0]);
		System.out.println(su[1]);

		System.out.println("============");

		// 다차원 출력
		System.out.println(su[0][0]);
		System.out.println(su[0][1]);
		System.out.println(su[0][2]);

		System.out.println(su[1][0]);
		System.out.println(su[1][1]);
		System.out.println(su[1][2]);

		System.out.println("============");

		for (int i = 0; i < su.length; i++) { // su는 int[] su[][]에서 앞의 [] 개수 의미
			for (int j = 0; j < su[i].length; j++) { // su[i]는 뒤의 [] 개수 의미
				System.out.println(su[i][j]);
			}
		}

	}
}
