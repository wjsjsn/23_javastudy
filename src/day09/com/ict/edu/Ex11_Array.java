package day09.com.ict.edu;

import java.util.Arrays;

public class Ex11_Array {
	public static void main(String[] args) {

		// 숙제
		int[][] arr = new int[5][5];

		// 번호,총점,평균,학점,순위
		int[] p1 = { 1, 270, 90, 'A', 1 };
		int[] p2 = { 2, 210, 70, 'C', 1 };
		int[] p3 = { 3, 180, 60, 'F', 1 };
		int[] p4 = { 4, 300, 100, 'A', 1 };
		int[] p5 = { 5, 285, 95, 'A', 1 };

		// 순위 구하기
		arr[0] = p1;
		arr[1] = p2;
		arr[2] = p3;
		arr[3] = p4;
		arr[4] = p5;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (i == j)
					continue;
				if (arr[i][1] < arr[j][1]) {
					arr[i][4]++;
				}
			}
		}

		// 순위 오름차수로 정렬
		int[] tmp = new int[5]; // 자리 변경을 위한 임시 배열
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i][4] > arr[j][4]) {
					tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		// 출력
		System.out.println("번호\t총점\t평균\t학점\t순위");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (j == 3) {
					System.out.print((char)(arr[i][j]) + "\t");
				} else {
					System.out.print(arr[i][j] + "\t");
				}
			}
			System.out.println();
		}
	}
}
