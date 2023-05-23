package day04.com.ict.edu;

public class Ex03_if {
	public static void main(String[] args) {
	
		//int k1이 60 이상이면 합격
		int k1 = 55;
		String res = "초기값";
		if (k1 >=60) {
			res = "합격";
		}
		
		if(k1<60) 
			res = "불합격";
		System.out.println(res);
		
		//int k2가 홀수인지 짝수인지 판별
		int k2 = 43;
		res = "짝수";
		
		if (k2%2==1) {
			res = "홀수";
		}
		System.out.println(res);
		
		//char k3가 대문자인지 소문자인지 판별
		char k3 = 'T';
		res = "대문자 아님";
		if (k3>='A'&& k3<='Z') {
			res = "대문자";
		}
		System.out.println(res);
		
		//근무시간 8시간까지 시급 9620원
				//초과하면 시간당 1.5배
				//10시간 일하면 얼마?
		
	    	 int time = 10;
	    	 int limt = 8;
	    	 int dan = 9620;
	    	 int pay = time * dan;
	    	 if (time > limt) {
				pay = (limt*dan)+(int)((time-limt)*dan*1.5);
			}
	    System.out.println(pay+"원");
	    	
	}

}
