package day15.com.ict.edu2;

// 추상 클래스
public abstract class Ex01_abstract {

	// 추상 클래스와 추상 메서드
	// 추상 메서드 : body(블록{ }, 몸통, 실제 실행할 내용)를 갖고 있지 않은 메서드
	//                   구체적인 실행 내용 x
	//                    반드시 abstract 예약어를 붙여야 함
	//  추상 클래스 : 하나 이상의 추상 메서드를 갖고 있는 클래스
	//                    일반 클래스가 갖는 멤버필드, 멤버 메서드, 생성자를 가질 수 있음
	//                    반드시 abstract 예약어를 붙여야 함
	
	String name = "홍길동";
	
	// 일반 메서드 
	public void play() {
		System.out.println("놀자");
	}	
	public String sound() {
		return ("6시간 이상 잠자기");
	}
	
	// 추상 메서드
	public abstract void hobby();
}
