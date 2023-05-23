package day15.com.ict.edu3;

// 인터페이스 : 서비스를 제공하는 목록
//                  상수와 추상 메서드만 갖고 있음
//                  일반적인 변수와 메서드는 존재 x
//                  객체 생성 x (생성자 x)
//                  다중 상속 가능(인터페이스는 여러 개의 인터페이스를 부모로 만들기 가능)
//                  일반 클래스를 부모로 만들 수 x
//                 '인터페이스가 같다'라는 말은 호환, 대체가 가능하다는 뜻
//                  일반 클래스가 인터페이스를 상속받을 때 implements 사용

// 인터페이스 상속 : 인터페이스 extends 인터페이스, 클래스 extends 클래스
//                          클래스 implements 인터페이스
public interface Ex01_interface {
	// 어떻게 쓰든 모두 다 static final 이다.
	final int su1 = 10;
	static final int su2 = 20;
	int su3 = 30;
	static int su4 = 40;

	// 어떻게 쓰든 추상 메서드
	public abstract void sound();
    // abstract 생략 가능
	public void play();
	
	// 일반 메서드는 쓰면 안됨
    //public void hobby(){ };
    // static은 따로 만들어져서 사용은 가능하나 잘 안 씀 
	public static void like() {
	  System.out.println("놀기 좋아");
  }
}
