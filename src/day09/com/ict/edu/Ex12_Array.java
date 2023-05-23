package day09.com.ict.edu;

import java.util.Scanner;

public class Ex12_Array {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// 학생수 받기
		System.out.print("학생 수 : ");
		int su = scan.nextInt();
		int[][] sutArr = new int[su][8];

		// 키보드로 번호, 국어, 영어, 수학 받기
		for (int i = 0; i < su; i++) {
			System.out.print("번호 : ");
			sutArr[i][0] = scan.nextInt();
			System.out.print("국어 점수 : ");
			sutArr[i][1] = scan.nextInt();
			System.out.print("영어 점수 : ");
			sutArr[i][2] = scan.nextInt();
			System.out.print("수학 점수 : ");
			sutArr[i][3] = scan.nextInt();

			sutArr[i][4] = sutArr[i][1] + sutArr[i][2] + sutArr[i][3];
			sutArr[i][5] = sutArr[i][4] / 3;

			// 총점, 평균, 학점, 순위(초기값 지정)

			if (sutArr[i][5] >= 90) {
				sutArr[i][6] = 'A';
			} else if (sutArr[i][5] >= 80) {
				sutArr[i][6] = 'B';
			} else if (sutArr[i][5] >= 70) {
				sutArr[i][6] = 'C';
			} else {
				sutArr[i][6] = 'F';
			}
			sutArr[i][7] = 1;
		}

		// 순위 구하기
		for (int i = 0; i < su; i++) {
			for (int j = 0; j < su; j++) {
				if (i == j)
					continue;
				if (sutArr[i][4] < sutArr[j][4]) {
					sutArr[i][7]++;
				}
			}
		}
		// 순위 오름차순 정렬
		int[] tmp;
		for (int i = 0; i < su - 1; i++) {
			for (int j = i + 1; j < su; j++) {
				if (sutArr[i][7] > sutArr[j][7]) {
					tmp = sutArr[i];
					sutArr[i] = sutArr[j];
					sutArr[j] = tmp;
				}
			}
		}

		// 출력
		System.out.println("번호\t총점\t평균\t학점\t순위");
		for (int i = 0; i < su; i++) {
			System.out.print(sutArr[i][0] + "\t");
			System.out.print(sutArr[i][4] + "\t");
			System.out.print(sutArr[i][5] + "\t");
			System.out.print((char) (sutArr[i][6]) + "학점" + "\t");
			System.out.println(sutArr[i][7]);
		}

	}
}
