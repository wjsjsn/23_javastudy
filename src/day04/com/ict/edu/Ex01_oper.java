package day04.com.ict.edu;

public class Ex01_oper {
	public static void main(String[] args) {
    
		String str = (true)? "강아지" : "고양이";
		System.out.println(str);
		
		//int avg = 80;
		double avg = 85.3;
		str = (avg>=60)?"합격" :"불합격" ;
		System.out.println(str);
		
		char c1 = 'g';
		str = (c1>='a'&&c1<='z')?"소문자" :"소문자 아님" ;
		System.out.println(str);
		
		//gender = 1 or 3이면 남자 아니면 여자
		int gender = 1;
		str =(gender==1||gender==3)?"남자" :"여자" ;
		System.out.println(str);
		
		//gender가 홀수면 남자, 짝수면 여자
		gender = 4;
		str = (gender%2==1)?"남자":"여자";
		System.out.println(str);
		
		//3의 배수인지 아닌지 
		int su1 = 157;
		str = (su1%3==0) ? "3의 배수" : "3의 배수 아님";
		System.out.println(str);
		
		//근무시간 8시간까지 시급 9620원
		//초과하면 시간당 1.5배
		//10시간 일하면 얼마?
		
        int ti = 10;
	    int m = 9620;
		int h = 8;
		double o =1.5;
		int wh = 0;
		int gn =(m*ti); 
		
		wh =(m*h+(int)(m*(ti-h)*o));
				
	    wh = (ti>h) ? wh : gn;
		System.out.println(wh+"원");
		
		//int time = 10;
		//int dan =9620;
		//int pay = (time > 8) ? (8*dan)+(int)((time-8)*dan*1.5)  : time*dan;
		//System.out.println(pay+"원");
		
		int num1 = 47;
		int num2 = 32;
		int res = (num1>num2)?num1:num2;
		System.out.println("큰 값 : "+res);
		
		int res2=Math.max(num1, num2);        
		System.out.println("큰값:"+res2);
		
		int res3 = -38;
		int res4 = (res3>0)?res3:res3*-1;
		System.out.println("결과:"+res4);
		
		int res5 =Math.abs(res3);
		System.out.println("결과:"+res5);
		
		
		
	
		
		
		
		
		
				
		
		
	}

}
