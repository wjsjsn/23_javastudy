package day11.com.ict.edu;

public class Ex03_main {
	public static void main(String[] args) {
    
		Ex03_method t1 = new Ex03_method();
		
	/*	t1.getSum();   //return 하면 저장해야됨
		t1.getAvg();
		t1.getHak();
		
		System.out.println(t1.sum);
		System.out.println(t1.avg);
		System.out.println(t1.hak);   */
		
		int k1 = t1.getSum();     //이게 정상적인 방법
		double k2 = t1.getAvg();
		String k3 = t1.getHak();
		
		System.out.println(k1);
		System.out.println(k2);
		System.out.println(k3);
	}
}
