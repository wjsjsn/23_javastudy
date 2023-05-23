package day14.com.ict.edu;

import java.util.Random;

// is a 관계
public class Ex05_extends extends Random {
	int su = nextInt();

	public void play() {
		System.out.println("Ex05 : " + su);
	}

	// static 메서드는 static만 사용 가능
	public static void main(String[] args) {

		// 자기 자신이라도 객체를 만듦(참조변수)
		Ex05_extends test = new Ex05_extends();
		test.play();

	}
}
