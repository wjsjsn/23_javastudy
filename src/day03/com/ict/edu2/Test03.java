package day03.com.ict.edu2;

public class Test03 {
    public static void main(String[] args) {
		//3989초는 몇 시간 몇 분 몇 초인가
    	
    	int t = 3989;
    	int h = 0;
    	int m = 0;
    	int s = 0;
    	int res = 0;
    	
    	h = t/(60*60);
    	res = t%(60*60);
    	m = res/60;
    	s = res%60;
    	System.out.println(h+"시간"+m+"분"+s+"초");
    	
    	
    	
	}
}
