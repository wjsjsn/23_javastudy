package day07.com.ict.edu;

import java.util.Scanner;

public class Test04 {
 public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	/* 이름, 국어, 영어, 수학를 입력 받아서 
    총점, 평균, 학점을 구하고 
    이름, 총점, 평균, 학점을 출력하는 코딩 
    (평균은 소숫점 첫째자리까지 구하자) */
	
	System.out.print("이름 : ");
	String name = scan.next();
	
	System.out.print("국어 점수 : ");
	int kor = scan.nextInt();
	
	System.out.print("영어 점수 : ");
    int eng = scan.nextInt();
   
    System.out.print("수학 점수 : ");
    int math = scan.nextInt();
    
    int sum = kor + eng + math;
    double avg = (int)((sum/3.0)*10)/10.0;
    String str = "";
    if (avg>=90) {
		str = "A";
	} else if(avg>=80) {
		str = "B";

	}else if(avg>=70) {
		str = "C";
	}else str = "F";
    System.out.println("이름 : "+name);
    System.out.println("총점 : "+sum);
    System.out.println("평균 : "+avg);
    System.out.println("학점 : "+str);
 
 
}
}
