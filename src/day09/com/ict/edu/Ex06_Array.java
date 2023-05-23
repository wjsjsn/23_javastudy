package day09.com.ict.edu;

import java.util.Scanner;

public class Ex06_Array {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// 정보를 배열에 넣기 위해(배열을 미리 만들기 위해) 인원수 묻기
		System.out.print("학급 인원수 : ");
		int count = scan.nextInt();

		// 미리 배열 만들기
		String[] name = new String[count];
		int[] kor = new int[count];
		int[] eng = new int[count];
		int[] math = new int[count];
		int[] sum = new int[count];
		double[] avg = new double[count];
		String[] hak = new String[count];
		int[] rank = new int[count];

		for (int i = 0; i < count; i++) {
			System.out.print("이름 : ");
			name[i] = scan.next();
			System.out.print("국어 점수 : ");
			kor[i] = scan.nextInt();
			System.out.print("영어 점수 : ");
			eng[i] = scan.nextInt();
			System.out.print("수학 점수 : ");
			math[i] = scan.nextInt();

			sum[i] = kor[i] + eng[i] + math[i];
			avg[i] = ((int) (sum[i] / 3.0) * 10) / 10.0;

			if (sum[i] >= 90) {
				hak[i] = "A학점";
			} else if (sum[i] >= 80) {
				hak[i] = "B학점";
			} else if (sum[i] >= 70) {
				hak[i] = "C학점";
			} else {
				hak[i] = "F학점";
			}

			rank[i] = 1;
		}
		for (int i = 0; i < count; i++) {
			for (int j = 0; j < count; j++) {
				if (i == j)
					continue;
				if (sum[i] < sum[j]) {
					rank[i]++;
				}
			}
		}
		System.out.println("이름\t총점\t평균\t학점\t순위");
		for (int i = 0; i < count; i++) {
			System.out.print(name[i] + "\t");
			System.out.print(sum[i] + "\t");
			System.out.print(avg[i] + "\t");
			System.out.print(hak[i] + "\t");
			System.out.println(rank[i]);
		}
	}
}
