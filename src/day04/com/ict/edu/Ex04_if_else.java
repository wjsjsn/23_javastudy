package day04.com.ict.edu;

public class Ex04_if_else {
	 public static void main(String[] args) {
	// int k1이 60 이상이면 합격 아니면 불합격
		 int k1 = 79;
		 String str = "";
		 if (k1>=60) {
			str = "합격";
		} else { 
            str = "불합격";
		}
	 System.out.println(str);
	 
	 //int k2가 홀수인지, 짝수인지
	   int k2 = 6;
	   if (k2%2==0) {
		      str = "짝수";
	} else {
              str = "홀수";
	}
	 System.out.println(str);
	 
	 //char k3가 대문자인지, 소문자인지
	 char k3 = 'b';
	 if (k3>='A'&& k3<='Z') {
		       str="대문자";
	} else {
               str="소문자";
	}
	 System.out.println(str);
	 
	//근무시간 8시간까지 시급 9620원
    //초과하면 시간당 1.5배
	//10시간 일하면 얼마?
	 
	 int money = 9620;
	 int hour = 8;
	 int over = 10;
	 int pay = money*hour;
	 if (over>hour) {
		   pay = (money*hour)+(int)((over-hour)*money*1.5);
	} else {
           pay = money*over;
	}
	 System.out.println(pay+"원");
	 }

}
