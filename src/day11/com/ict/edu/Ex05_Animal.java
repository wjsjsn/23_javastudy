package day11.com.ict.edu;

public class Ex05_Animal {
    // 생존여부
    boolean live;
	// 나이
	int age ;
	// 이름
	String name;
	
	// 생존여부 변경 메서드
	public void setLive(boolean k1) {		
		live = k1;
	}	

	// 생존여부 반환 메서드
	public boolean getLive() {		
	   return live;
	}
	
	// 나이 변경 메서드
	public void setAge(int a2) {
		age = a2;
	}
	// 나이 반환 메서드
	public int getAge() {
		return age;
	}
	// 이름 변경 메서드
	public void setName(String n1) {
		name = n1;
	}
	// 이름 반환 메서드
	public String getName() {
		return name;
	}
	
	//이름,나이,생존여부 한 번에 반환 => 자료형이 다 달라서 못 함
     	
	//이름,나이,생존여부 한 번에 변경
	public void play(String s1, int s2, boolean s3) {  
		name = s1;
		age = s2;
		live = s3;
	}
	                  //인자 순서 바뀌어도 다른 걸로 인식
	public void play(int s2, String s1, boolean s3) { 
		name = s1;
		age = s2;
		live = s3;
	}
	//한 번에 출력
   public void prn() {
	   System.out.println("이름 : "+ name);
	   System.out.println("나이 : "+ age+"살");
	   if(live) {
		   System.out.println("생존여부 : 살아있음");
	   }else {
		   System.out.println("생존여부 : 죽었음");		   
	   }	   	   	  
   }
	
	
	
	
	
	
	
	
	
	
	
}
