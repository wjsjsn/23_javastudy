package day12.com.ict.edu;

import java.util.Scanner;

public class Ex09_main {
 public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	Ex09_method e1 = new Ex09_method();
	
	int su = 5;
	double[][] arr = new double[su][8];
	
	for (int i = 0; i < su; i++) {
		double[] d = new double[8];
	
		System.out.print("번호 : ");
		d[0] = scan.nextInt();
		System.out.print("국어 점수 : ");
		d[1] = scan.nextInt();
				System.out.print("영어 점수 : ");
		d[2] = scan.nextInt();
				System.out.print("수학 점수 : ");
		d[3] = scan.nextInt();
		
		//총점
		d[4] =e1.getSum(d[1], d[2], d[3]);
		
		
		//평균
		d[5] = e1.getAvg(d[4]);
		
		//학점
		d[6] = e1.getHak(d[5]);
		//순위 초기값 지정
       d[7] = 1;
       arr[i] = d;
	}
	//순위 구하기
	for (int i = 0; i < arr.length; i++) {
		for (int j = 0; j < arr.length; j++) {
			if (i==j) 
				continue;
			if(arr[i][4]<arr[j][4]) {
				arr[i][7]++;
			}
		}
	}
	//순위 오름차순 정렬
	double[] tmp = new double[8]; 
	for (int i = 0; i < arr.length-1; i++) {
		for (int j = i+1; j < arr.length; j++) {
			if (arr[i][7]>arr[j][7]) {
				tmp = arr[i];
				arr[i] = arr[j];
				arr[j] = tmp;
			}
		}
	}
	System.out.println("번호\t총점\t평균\t학점\t순위");
	for (int i = 0; i < arr.length; i++) {
		for (int j = 0; j < arr[i].length; j++) {
		if(j==1 || j==2 || j==3) {
			continue;
		}else if (j==6) {
				System.out.print((char)(arr[i][j])+"학점"+"\t");
			} else if(j==5){
                System.out.print(arr[i][j]+"\t");
			}else {
				System.out.print((int)(arr[i][j])+"\t");
			}
		}
		System.out.println();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
