package day03.com.ict.edu2;

public class Test04 {
    public static void main(String[] args) {
		//카페모카 6500원
    	//친구와 둘이서 15000원을 내고 주문
    	//잔돈은 얼마?(단, 부가세 10% 포함)
    	
    	String name = "카페모카";
    	int mon = 6500;
    	int ord = 2;
    	int coin = 15000;
    	int vac = mon*ord/10;
    	int chn = coin-(vac+mon*ord);
    	System.out.println(chn+"원");
	}
}
