package day06.com.ict.edu2;

import java.util.Scanner;

public class Ex05_Homework {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		/*원하는 회수를 입력 받고 
		숫자를 입력 받아서 
		입력 받은 숫자가 홀수 인지, 짝수인지 판별하는 코딩 */

		System.out.print("원하는 횟수 : ");
		int l = scan.nextInt();
		String n = "";
	    for (int i = 0; i < l; i++) {
		System.out.print("숫자 : ");
		int s = scan.nextInt();
		if (s%2==1) {
			n = "홀수";
		}else {
			n = "짝수";
		}
		System.out.println(n);
	}
	   
	    System.out.println("==================================");
	   /* 이름, 국어, 영어, 수학를 입력 받아서 
	    총점, 평균, 학점을 구하고 
	    이름, 총점, 평균, 학점을 출력하는 코딩 
	    (평균은 소숫점 첫째자리까지 구하자) */
	    
	    System.out.print("이름 : ");
	   String name = scan.next();
	   System.out.print("국어 : ");
	   int kor = scan.nextInt();
	   System.out.print("영어 : ");
	   int eng =scan.nextInt();
	   System.out.print("수학 : ");
	   int math = scan.nextInt();
	   int plus = kor + eng + math;
	   System.out.println("총점 : "+plus);
	   double avg = plus/3.0;
	   double avg2 = (int)(avg*10)/10.0;
	   System.out.println("평균 : "+avg2);
	   String jum = "";
	   
	   if (avg2>=90) {
		  jum = "A";
	} else if(avg2>=80) {
         jum = "B";
	}else if(avg2>=70) {
		jum = "C";
	}else {
		jum = "F";
	}
		
	    System.out.print("학점 : "+jum);
		System.out.println();
		System.out.println("==================================");
		
		/* 첫번째 숫자 받기
		두번째 숫자 받기
		연산자 받기("1 => + \n 2 => - \n 3 => * \n 4 =>  / \n>>>>   ") */
		int first = 0;
		int second = 0;
		System.out.print("첫번째 숫자 : ");
		first = scan.nextInt();
		System.out.print("두번째 숫자 : ");
		second = scan.nextInt();
		double h = 0.0;
		System.out.print("1 => + \n 2 => - \n 3 => * \n 4 =>  / \n>>>>   ");
		int num = scan.nextInt();
		
	    if (num==1) {
			h = first + second;
		}else if(num==2) {
		   h = first - second;
		} else if(num==3) {
		  h = first * second;
		} else if(num==4) {
		  h = ((int)(first*10) / second)/10.0;
		}
		System.out.print("결과 : "+h+"\n");
		
	System.out.println("=================================");	
		
		
		
		
		
		
	}
}
