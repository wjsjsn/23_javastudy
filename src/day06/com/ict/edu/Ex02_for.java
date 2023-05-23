package day06.com.ict.edu;

public class Ex02_for {
	public static void main(String[] args) {

		// 안녕하세요를 열 번 출력
		for (int i = 1; i < 11; i++) {
			System.out.println(i + "=안녕하세요");
		}
		System.out.println("======================");

		// 0부터 10까지 출력
		for (int i = 0; i < 11; i++) {
			System.out.print(i + " ");
		}
		System.out.println();

		// 0부터 10까지 짝수만 출력
		for (int i = 0; i < 11; i = i + 2) {
			System.out.print(i + " ");
		}
		System.out.println();

		for (int i = 0; i < 11; i++) {
			if (i % 2 == 0)
				;
			{
				System.out.print(i + " ");
			}
		}
		System.out.println();

		// 구구단 7단 출력
		for (int i = 1; i < 10; i++) {
			System.out.println("7*" + i + "=" + (i * 7));
		}

		// 1~10까지 누적합(합계 구하기)
		// 누적합 공식 : 이전 저장 = 이전 저장 + 현재값
		// sum = sum + i =>sum = 0
		// 누적곱 sum = sum * i => sum = 1(0은 곱하면 안되니까)

		int sum = 0;
		for (int i = 1; i < 11; i++) {
			sum = sum + i;
		}
		System.out.println("누적합 : " + sum);
		
		//0~10까지 짝수의 누적합
		int even = 0;
		for (int i = 0; i < 11; i++) {
			 if(i%2==0) {
			 even = even + i;
			 }
	 }
          System.out.println("짝수의 누적합 : "+even);
          
       // 7!(factory) = 7*6*5*4*3*2*1;   
	
	int su = 1;
	for (int i = 1; i < 8; i++) {  //(int i = 7; i >0 ; i--)
		su = su *i;
	}
	System.out.println("7! : "+su);
	
	//숙제  1 + (-2) + 3 + (-4) + 5 + (-6) + 7 + (-8) + 9 + (-10)
	//for문을 이용한 누적합
      
	int num = 0;
	for (int i = 0; i < 11; i++) {
		if (i%2==0) {
			num = num-i;
		} else {
             num = num+i;
		}
	}
	    System.out.println(num);
	} 
}

