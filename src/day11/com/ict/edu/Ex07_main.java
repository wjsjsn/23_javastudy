package day11.com.ict.edu;

import java.util.Scanner;

public class Ex07_main {
 public static void main(String[] args) {
	 Scanner scan = new Scanner(System.in);
	 // 5명의 이름, 국어, 영어, 수학을 입력 받아서
	 // 이름, 총점, 평균, 학점, 순위 구하고
	 String[] name = new String[5];
	 int[] kor = new int[5];
	 int[] eng = new int[5];
	 int[] math = new int[5];
	 int[] sum = new int[5];
	 double[] avg = new double[5];
	 String[] hak = new String[5];
	
	 Ex07_method m1 = new Ex07_method();
	 // 입력받기
	//System.out.print("학생 수 : ");
	//int su = scan.nextInt();
	
	 for (int i = 0; i < hak.length; i++) {
		System.out.print("이름 : ");
		 name[i] = scan.next();
		 System.out.print("국어 점수 : ");
		 kor[i] = scan.nextInt();
		 System.out.print("영어 점수 : ");
		 eng[i] = scan.nextInt();
		 System.out.print("수학 점수 : ");
		 math[i] = scan.nextInt();
		 
		 // 총점 구하기
	     m1.getSum(kor[i], eng[i], math[i]);
	     sum[i] = m1.sum;
	     // 평균 구하기
	     m1.getAvg(sum[i]);
	     avg[i] = m1.avg;
	     // 학점 구하기
	    m1.getHak(avg[i]);
	    hak[i] = m1.hak;
	     
	     // 출력하기
	 }
	 for (int i = 0; i < hak.length; i++) {		
	 System.out.println("이름\t총점\t평균\t학점");
	 System.out.print(name[i]+"\t"); 
	 System.out.print(sum[i]+"\t");
	 System.out.print(avg[i]+"\t");
	 System.out.println(hak[i]+"학점");
	 }
}
}
