package day16.com.ict.edu;

// static 내부 클래스
public class Ex07_static {
	String name = "홍길동";
	private int age = 24;
	static boolean gender = true;

	public Ex07_static() {
		System.out.println("외부 생성자 : " + this);
	}

	public void play() {
		int money = 1000;
		System.out.println("외부 메서드 : " + name);
		System.out.println("외부 메서드 : " + money);
	}

	// 내부 클래스의 멤버 변수가 static이면 class를 static으로 만들어야함
	// 권장사항은 x(일반 클래스에서는 static 사용 x 오류남)
	public static class Inner01 {
		String addr = "서울 마포구";
		int roomNumber = 1;
        static int count = 30;
        
		public Inner01() {
			System.out.println("내부 생성자 : " + this);
		}

		public void prn() {
			System.out.println(addr);
			System.out.println(roomNumber);

			// 외부 클래스의 멤버 사용 x
			//System.out.println(name);
			//System.out.println(age);
			System.out.println(gender);
			
			// 외부 클래스의 메서드 
			//play();
		}

	}

}
