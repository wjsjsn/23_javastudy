package day05.com.ict.edu;

import java.util.Iterator;

public class Homework {
   public static void main(String[] args) {
	
	   /* 1. if-else문
	    * 농구공 5개씩 한 박스에 들어간다
	    * 40개면 8상자, 26개면 6상자이다
	    * int k1 = 127개
	    * 몇 상자가 필요한가?
	    */
	   int k1 = 127;
	   int ball = 5;
	   int box = k1/ball;
	   if (k1%5==0 ) {
		    box = box;
	} else {
		box = 1+box;
	}
   System.out.println(box+"상자");
	
	  System.out.println("===============================");
	   
	   /* 2. for문으로 풀기
	     0 0 0 0
	     0 0 0 0
	     0 0 0 0
	     0 0 0 0
	    */
   
	    /* (0을 16개로 봤을 때)
	         for(int i = 1; i <17; i++) {  <<== i =0; i <16으로 놓으면 if의 나누기 때문에 0이 하나 더 찍힘
	    	 System.out.print("0 ");
	    	 if(i%4==0) {
	    	 System.out.println();
	    	 }
	         }                           */
	  
       int sum = 0;
         for (int i = 0; i < 4; i++) {
			System.out.println("0 0 0 0");
		}
      
	   System.out.println("=================================");
	   
	   /* 3. 이중 for문으로 풀기
	     1 0 0 0
	     0 1 0 0
	     0 0 1 0
	     0 0 0 1
	    */
	  
	for (int i =0 ; i < 4; i++) {
		for (int j = 0; j < 4; j++) {
			if(i==j) {
				System.out.print("1 ");
			}else {
				System.out.print("0 ");
			}
		}
		System.out.println();
	}
	 
	   System.out.println("=================================");
	   
	   /* 4.   1 + (-2) + 3 + (-4) + 5 + (-6) + 7 + (-8) + 9 + (-10)
		for문을 이용한 누적합 */
	      
		int num = 0;
		for ( int i = 1; i < 11; i++) {
			if (i%2==0) {
				num = num-i;
				} else {
	             num = num+i;
			}
		}
		   System.out.println(num); 
		    
		  System.out.println("=================================");
		    
	  /* 5. 4번문제처럼 계속 더했을 때 , 몇 까지 더해야 총합이 100이상이 되는지 구하시오 */
		  num = 0;
		  int i = 0;
			for ( i = 0; i < 1000; i++) {
				if (i%2==0) {
					num = num-i;
					} else {
		             num = num+i;
				}
				if(num >=100) break;
			}
			System.out.println(i);
		  System.out.println("=================================");
		  
		  
		  /* int sum = 0;
		   * int cnt = 0;
		   * int i = 1;
		   * while(true) {
		   * if(i%2==0) {
		   *  sum = sum - i ;
		   *  } else {
		   *  sum = sum +i ;
		   *  }
		   * cnt = i ;
		   * if(sum>=100){ 
		   *       break ;
		   *     }
		   *     i++ ;
		   * }
		   * System.out.println(cnt);   <<==for문은 횟수가 정해져서 이 문제랑은 조금 안맞음
		   */
		  
      /* 6. *
            * *
            * * *
            * * * *        별짓기 */
		  
		  for (  i = 1; i <5; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		  System.out.println("=================================");
      
		  /* 7.   *
                * * 
              * * *
            * * * *        별짓기 */
		  
		  for (  i = 1; i <5; i++) {
				for (int j = 4; j > 0; j--) {
					if(i<j) {
						System.out.print(" ");
					}else {
						System.out.print("*");
					}
				}
				System.out.println("");
   }
		  System.out.println("=================================");
   }
}
