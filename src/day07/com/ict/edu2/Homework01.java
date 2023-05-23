package day07.com.ict.edu2;

import java.util.Scanner;

public class Homework01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
     int ch = 0;
     int two = 0;
     double tp = 0.0;
		while (true) {

			System.out.print("숫자 입력 : ");
			int su = scan.nextInt();

			String str = "";
			if (su % 2 == 0) {
				str = "짝수";
			} else {
				str = "홀수";
			}
			ch++;
			if(su%2==0) {
				two++;
			}
			System.out.println("결과 : " + str);
  
			System.out.print("계속할까요?(1.yes,  2.no) >>");
			int s1 = scan.nextInt();

			while (true) {
				if (s1 != 1 && s1 != 2) {
					System.out.println("잘못 입력했습니다.");
					System.out.print("계속할까요?(1.yes,  2.no) >>");
					s1 = scan.nextInt();
				} else if (s1 == 2 || s1 ==1) {
					break;
				}
        
			}
			if(s1 ==2)break;
		}
	tp = ((int)(two)*100/ch)*1.0;
	System.out.println("총횟수 : "+ch);
	System.out.println("짝수횟수 : "+two);
	System.out.println("짝수 퍼센트 : "+tp);
	}
}
