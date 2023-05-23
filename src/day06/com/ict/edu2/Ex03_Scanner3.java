package day06.com.ict.edu2;

import java.util.Scanner;

public class Ex03_Scanner3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		//근무시간이 8시간까지는 시간당 9620
		//8시간 초과하면 시간당 1.5배
		//현재 근무시간 10시간
		//얼마?
		System.out.print("근무시간 :");
		
		int time = scan.nextInt();
		int money = 9620;
		int pay = 0;
		if (time>8) {
			pay = (8*money)+(int)((time-8)*money*1.5);
		}else {
			pay = money*time;
		}
		System.out.println("받을 금액은 "+pay+"입니다.");
				
		//menu 1- 카페모카 3500, 2 - 카페라떼 4000, 3 - 아메리카노 3000, 4 - 과일주스 3500
		 // 친구와 함께 2잔을 10000 내고 먹었다.
        // 선택한 메뉴와 잔돈을 출력하자 (단, 부가세 10%는 포함)
        // (친구와 같은 음료을 먹어야 한다.)
         //System.out.print();

	    System.out.print("메뉴선택 \n1.카페모카(3500)\n2.카페라떼(4000)"+
	    	             "\n3.아메리카노(3000)\n4.과일주스(3500)\n>>>>>>>>>>>>>");
		String drink = "";
		int su = 2;
		int dan = 0;
		int vat = 0;
		int in = 10000;
		int out = 0;
		int total = 0;
		int menu = scan.nextInt();
		if (menu==1) {
			drink = "카페모카";
			dan = 3500;	
		} else if(menu==2) {
            drink = "카페라떼";
		dan = 4000;
	}else if(menu==3) {
		drink = "아메리카노";
		dan = 3000;
	}else if(menu==4) {
		drink = "과일주스";
		dan = 3500;
	}
		total = dan*su;
		vat =(int)(total*0.1);
		out = in-(total+vat);
		System.out.println("잔돈은 "+out+"원입니다.");
		
		//나라를 입력하면 수도가 출력
		//한국 - 서울, 중국 - 베이징, 일본 - 도쿄, 미국 - 워싱턴, 나머지 - 데이터 없음
		//switch~case 사용
		
		System.out.print("나라입력 : ");
		String name = "";
		String nara = scan.next();
		switch (nara) {
		case "한국": name = "서울";break;
		case "중국": name = "베이징"; break;
		case "일본": name = "도쿄"; break;
		case "미국" : name = "워싱턴";break;
		default: name = "데이터 없음";
		}
		System.out.println(nara+"의 수도는 "+name+"입니다.");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
