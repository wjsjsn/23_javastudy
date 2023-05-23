package day12.com.ict.edu;

public class Ex01_method {
   // 클래스 : 멤버필드, 멤버메서드, 생성자
   // 멤버필드 : 인스턴스 변수, 인스턴스 상수, static 변수, static 상수
   
	String name = "홍길동";   // 인스턴스 변수
    int kor = 80;           // 인스턴스 변수
    int eng = 95;           // 인스턴스 변수
    int math = 85;          // 인스턴스 변수
    int total = 0;          // 인스턴스 변수
    double avg = 0.0;       // 인스턴스 변수
   
    static double ki = 178.5;  //static 변수
    
   // 멤버메서드() : 동작, 기능, 실행하는 것
   // 메서드는 호출해야만 실행 가능하고 실행 후 반드시 호출한 곳으로 되돌아 감 
   // 형식 : [접근제한자][메서드종류] 반환형 메서드이름([인자]),...){ 실행할 내용 }
   //                 생략 가능
   // *반환형 : 반드시 호출한 곳으로 되돌아 가는데 실행 결과를 가지고 갈 때 
   //         실행 결과의 자료형
   // void(예약어) : 실행 결과를 가지고 가지 않는 것
   
   // instance 메서드
    public void getTotal() {
     total = kor + eng + math ;
    	
   //	return; //void에서는 생략 가능
    }
   // instance 메서드 
    public int getTotal2() {
    	int sum = kor + eng + math ;
   // 반환형이 void가 아니면 맨 마지막에 return 데이터나 데이터를 가지고 있는 자료형변수 입력  	
    	return sum; //return : 호출한 곳으로 되돌아간다는 뜻  
    }
  
   // instance 메서드 
    public int getTotal3() {
    	//instance는 static변수 사용 o(static은 미리 만들어져서 호출이 가능)
    return kor + eng + math + (int)(ki) ; 
    }
    
    // static 메서드
    public static void getAvg() {
    	//static일 경우 instance 변수 사용 x
    	// (instance는 객체 생성 전까지는 안만들어져서 호출 불가)
    	//avg = total / 3.0 ; <= 오류남
    	// ki가 static이므로 변수 사용 o
    	ki = ki + 5 ;
    	
    }
    
    // static 메서드
   public static double getAvg2() {
	   
	   return ki = ki + 0.7;	   
   }
   
}
