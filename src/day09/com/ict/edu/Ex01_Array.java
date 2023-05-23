package day09.com.ict.edu;

public class Ex01_Array {
	public static void main(String[] args) {

		// 배열 : 같은 자료형의 데이터들을 한 곳에 모아둔 묶음
		// 반드시 같은 자료형이어야함(단, 프로모션, 디모션 가능)
		// 생성할 때 반드시 크기를 지정해야함(아니면 오류) - 한 번 지정된 크기는 변경x
		// 배열 데이터를 추출할 때 일반적으로 for문 사용
		int su[];
		su = new int[4];
		su[0] = 100;
		su[1] = 'a';
		su[2] = (int) (2.4);
		su[3] = 124;
		// su[4] = 14;
		su[0] = 12;
		System.out.println(su);

		System.out.println("==========================");

		System.out.println(su[0]);
		System.out.println(su[1]);
		System.out.println(su[2]);
		System.out.println(su[3]);

		System.out.println("==========================");

		for (int i = 0; i < su.length; i++) {
			System.out.println(su[i]);
		}
		System.out.println("==========================");

		// 개선된 for문: 배열이나 컬렉션에 주로 사용
		// 배열 전체에 대해서 정보 출력 및 가공 가능
		// 그러나 특정 몇 개나 특정 하나를 출력하거나 가공할 수 x
		// : <= 오른쪽 배열 데이터를 하나씩 순서대로 왼쪽에 넘긴다
		for (int k : su) {
			System.out.println(k);
		}

		System.out.println("==========================");

	}
}
