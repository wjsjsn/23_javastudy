package day14.com.ict.edu;

public class Ex03_main {
 public static void main(String[] args) {
	
	 // 자식클래스를 객체로 만들면 부모클래스는 먼저 자동으로 만들어짐
	 // 부모 자식 클래스는 주소가 같음
	 Ex03_Sub  sub = new Ex03_Sub();
	 System.out.println("메인에서 생성자 호출 : " + sub);
	 
	 System.out.println(sub.name);
	 System.out.println(sub.age);
	 System.out.println(sub.addr);
	
	 // 외부에서는 private 호출 x
	 // System.out.println(sub.dog);
	 // System.out.println(sub.cat);
	 
	 // static(접근제한자 우선순위가 더 높음)
	 System.out.println(Ex03_Sub.computer);
	 System.out.println(Ex03_Super.playStation);

	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
}
}
