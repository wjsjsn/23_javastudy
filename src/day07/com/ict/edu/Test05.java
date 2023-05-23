package day07.com.ict.edu;

import java.util.Scanner;

public class Test05 {
 public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	/* 첫번째 숫자 받기
	두번째 숫자 받기
	연산자 받기("1 => + \n 2 => - \n 3 => * \n 4 =>  / \n>>>>   ") */
	
	System.out.print("첫번째 숫자 : ");
	int s1 = scan.nextInt();
	System.out.print("두번째 숫자 : ");
	int s2 = scan.nextInt();
	System.out.print("1 => + \n 2 => - \n 3 => * \n 4 =>  / \n>>>>   ");
    int y = scan.nextInt();
    
    double res = 0.0;
    
    String oper = "";
   
    if (y==1) {
		res = s1 + s2;
		oper = "+"; 
	} else if (y==2 ) {
		res = s1 - s2;
		oper = "-";
	}else if(y==3) {
		res = s1 * s2;
		oper = "*";
	}else if(y==4) {
		res = (int)(s1 * 10 / s2)/10.0;
		oper = "/";
	}
    
    System.out.print(s1 + oper + s2 + " = "+ res);
}
}
