package day03.com.ict.edu;

public class Ex05_oper {
	public static void main(String[] args) {
	
		int su1 = 10;
		int su2 = 7;
		boolean result ;
		
		result = (su1>=7)||(su2 >= 5);
		System.out.println(result);
		
		result = (su1<=7)||(su2 >= 5);
		System.out.println(result);
		
		result = (su1>=7)||(su2 <= 5);
		System.out.println(result);
		
		result = (su1<=7)||(su2 <= 5);
		System.out.println(result);
		
		System.out.println("===========================");
		
		result = ((su1=su1+2)>su2)||(su1==(su2=su2+5));
		System.out.println("결과:"+result);
		System.out.println("su1:"+su1);
		System.out.println("su2:"+su2);
		
		System.out.println("================================");
		
		boolean res = true;
		System.out.println(res);
		System.out.println(!res);
	}

}
