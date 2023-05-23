package day06.com.ict.edu;

public class Ex01_switch {
 public static void main(String[] args) {
	
	 //int k1이 1이면 카페모카, 2이면 카페라떼, 3이면 아메리카노, 4이면 과일주스를 출력
	
	  int k1 = 3;
	  String res = "";
	  switch (k1) {
	     case 1: res = "카페모카";break;
	     case 2: res = "카페라떼";break;
	     case 3: res = "아메리카노";break;
	     case 4: res = "과일주스";break;
	  }
	  System.out.println(res);
	  System.out.println("====================");
	  
	  //break가 없을 때
	  int k2 = 2;
	  switch (k2) {
	     case 1: System.out.println("카페모카");
	     case 2: System.out.println("카페라떼");
	     case 3: System.out.println("아메리카노");
	     case 4: System.out.println("과일주스");
	     	  }
	  
	  //char k3이 A,a이면 아프리카, B,b이면 브라질, C,c이면 캐나다, 나머지는 한국
	  char k3 = 'a';
	  switch (k3) {
	       case 'A': 
	       case 'a': res = "아프리카";break;
	       case 'B': 
	       case 'b': res = "아프리카";break;
	       case 'C': 
	       case 'c': res = "아프리카";break;
	
	default:res = "한국";
		break;
	}
	System.out.println(res);
	System.out.println("===================");
	
	//String k4가 한국이면 서울, 중국이면 베이징, 일본이면 도쿄를 출력하는 코딩
	
	String k4 = "한국";
	switch (k4) {
	   case "한국": res="서울"; break;
	   case "중국": res="베이징"; break;
	   case "일본": res="도쿄"; break;
		}
	 System.out.println(res);
	 System.out.println("=========================");
	
	 // int k5가 3~5는 봄, 6~8은 여름, 9~11은 가을, 12~2는 겨울
	 
	 int k5 = 5;
	 switch (k5) {
	   case 3 : 
	   case 4 : 
	   case 5 : res = "봄";break;
	   case 6 : 
	   case 7 :
	   case 8 : res = "여름";break;
	   case 9 : 
	   case 10 : 
	   case 11 : res = "가을";break;
	   case 12 : 
	   case 1 : 
	   case 2 : res = "겨울";break;
		}
	 System.out.println(res);
	 System.out.println("=========================");
	 
	 //int k6의 점수가 90이상이면 A학점, 80이상이면 B학점, 70이상이면 C학점, 나머지는 F학점
	 /*
	 int k6 = 35;
	 switch (k6) {
	case 100:
	case 99:
		***
	case 90:res="A학점";break;
	case 89:
	case 88:
		***
	case 80:res="B학점";break;
	}  ===>>>너무 복잡
	*/
	int k6 = 80;
	 
	switch ((int)(k6/10)) {
	case 10:
	case 9: res = "A";break;
	case 8: res = "B";break;
	case 7: res = "C";break; 
    default : res = "F";
	}
	System.out.println(res+"학점");
	System.out.println("=========================");
   }
 }

