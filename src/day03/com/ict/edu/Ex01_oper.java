package day03.com.ict.edu;

public class Ex01_oper {

	public static void main(String[] args) {
	int su1 = 9;
	int su2 = 4;
	int result = 0;
	result = su1 + su2;
	System.out.println("결과 :" + result);
	
	result = su1 -su2;
	System.out.println("결과 :" + result);
	
	result = su1/su2;
	System.out.println("결과 :"+result);
	
	double res = (double)(su1) / su2;
	System.out.println("결과 : "+res);
	
	res = su1 / (su2*1.0);
	System.out.println("결과 : "+res);
	
	res = su1 / su2;
	System.out.println("결과 : "+res);
	
	result = su1 % su2;
	System.out.println("결과 :"+result);
	
	
	}
}
