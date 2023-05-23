package day11.com.ict.edu;

public class Ex02_method_void {
   String name = "홍길동";
   int kor = 90;
   int eng = 80;
   int math = 80;
   int sum = 0;
   double avg = 0;
   String hak = "";
   // 전부 void
  
   // 총점 구하는 메서드
   public void getSum() {
	sum = kor + eng + math ; // {} 벗어나면 사라져서 의미 x => {} 밖에서 먼저 써야함  
	//System.out.println("총점 : "+sum);
   }
   
   //평균 구하는 메서드
   public void getAvg() {
	avg = sum /3;
	//System.out.println("평균 : "+avg); //sysout을 여기서 찍으면 전역변수 굳이 안써도 됨
   }
   
   //학점 구하는 메서드
   public void getHak() {
	   if (avg >= 90) {
		hak = "A";
	}else if(avg >=80) {
		hak = "B";
	}else if(avg >=70) {
		hak = "C";
	}else {
		hak = "F";
	}
	   //System.out.println("학점 : "+hak);
   }
   
   
   
   
  
}
