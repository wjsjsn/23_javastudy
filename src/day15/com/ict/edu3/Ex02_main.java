package day15.com.ict.edu3;

public class Ex02_main {
public static void main(String[] args) {
	
	Ex02_Calc calc = new Ex02_Calc();
	
	double s1 = calc.plus(9, 3);
	double s2 = calc.minus(9, 3);
	double s3 = calc.mul(9, 3);
	double s4 = calc.div(9, 3);
	
	System.out.println((int)(s1));
	System.out.println((int)(s2));
	System.out.println((int)(s3));
	System.out.println((int)(s4));
}
}
