package day04.com.ict.edu;

public class Ex05_multi_if {
	public static void main(String[] args) {
       
		//int k1의 점수가 90이상이면 A학점, 80 이상은 B학점, 70 이상은 C학점, 나머지는 F학점
		
		int k1 = 80;
		String str = "";
		
		if (k1>=90) {
			str = "A";
		}else if (k1>=80) {
			str = "B";
		}else if (k1>=70) {
			str = "C";
		}else {
			str = "F";
		}
		System.out.println(str+"학점");
	  //char k2가 대문자인지 소문자인지, 숫자인지, 기타문자인지 판별
		
		int k2 = 3;
		if (k2 >= 'A'&& k2<= 'Z') {
			  str = "대문자";
		} else if (k2 >='a'&& k2 <='z') {
			str = "소문자";
		}else if (k2>=0 && k2<=9) {
			str = "숫자";
		}else {
	      str = "기타문자";
		}
		System.out.println(str);
		
		//char k3이 A,a이면 아프리카, B,b이면 브라질, C,c이면 캐나다, 나머지는 한국
	     
		char k3 = 'K';
		if (k3 == 'A'|| k3=='a') {
			str = "아프리카";
		} else if (k3 == 'B'||k3 == 'b') {
			str = "브라질";
		}else if (k3 == 'C'||k3=='c') {
			str = "캐나다";
		}else {
			str = "한국";
		}
		System.out.println(str);
		// menu가 1이면 카페모카 3500, 2이면 카페라떼 4000, 3이면 아메리카노 3000,
		//4이면 과일주스 3500원
		//친구와 2잔을 10000원을 내고 먹음
		//잔 돈은 얼마?(부가세 10% 포함)
		//친구와 같은 음료만 선택 가능
	  
         //int money = 10000;
         //int cup = 2;
         //int pay1 = 3500;
         //int pay2 = 4000;
         //int pay3 = 3000;
		 //int pay4 = 3500;
         //double vac = 1.1;
		 //int chn = 0;
		 //int menu = 3;
	
         //if (menu==1) {
        	 //str = "카페모카";
			    // chn = money -(int)((pay1*cup)*vac);
		//} else if (menu ==2) {
			//str = "카페라떼";
			//chn = money -(int)((pay2*cup)*vac);
		//} else if (menu==3) {
			//str = "아메리카노";
			//chn = money -(int)((pay3*cup)*vac);
		//} else if (menu==4) {
			//str = "과일주스";
			//chn = money -(int)((pay4*cup)*vac);
		//} 
   //System.out.println(str+chn+"원");
       
		int menu = 3;
		int in = 10000;
		int su = 2;
		int dan = 0;
		int total = 0;
		String drink = "";
		int vat = 0;
		int out = 0;
		
		if(menu==1) {
			drink = "카페모카";
			dan = 3500;
		}else if (menu == 2 ) {
			drink = "카페라떼";
			dan = 4000;
		}else if (menu ==3 ) {
			drink = "아메리카노";
			dan = 3000;
		}else if (menu == 4) {
			drink = "과일주스";
			dan = 3500;
		}
		total = dan*su;
		vat = (int)(total*1.1);
		out = in - (total+vat);
		System.out.println(drink);
		System.out.println(dan+"원");
         
	}
}


