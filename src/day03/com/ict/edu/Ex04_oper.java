package day03.com.ict.edu;

public class Ex04_oper {
	public static void main(String[] args) {
   
	int su1 = 10;
	int su2 = 7;
	boolean result;
	result = (su1>=7)&&(su2>=5);
	System.out.println(result);
	
	result = (su1<=7)&&(su2>=5);
	System.out.println(result);
	
	result = (su1>=7)&&(su2<=5);
	System.out.println(result);
	
	result = (su1<=7)&&(su2<=5);
	System.out.println(result);
	
	System.out.println("============================");
	
	result = ((su1=su1+2)>su2) && (su1==(su1=su2=su2+5));
	System.out.println("결과:"+result);
	System.out.println("su1:"+su1);
	System.out.println("su2:"+su2);
	
	System.out.println("===============================");
	
	su1 =10;
	su2 =7;
	
	result = ((su1=su1+2)<su2) && (su1==(su2=su2+5));
	System.out.println("결과:"+result);
	System.out.println("su1:"+su1);
	System.out.println("su2:"+su2);
	System.out.println("===============================");
	
	int su3 = 34;  
	result = su3>=20 && su3<=40;  //범위지정(su3은 20~40 사이에 있다)
	System.out.println(result);
	
    char c1 = 'g';
    result = c1>='a'&&c1<='z'; //c1은 소문자 a~z 사이에 있다
    System.out.println(result);
    
    
    		
	}

}
