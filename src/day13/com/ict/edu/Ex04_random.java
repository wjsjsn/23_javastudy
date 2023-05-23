package day13.com.ict.edu;

import java.util.Random;

public class Ex04_random {
	public static void main(String[] args) {

		// 난수(정해지지 않은 수)를 발생하는 법
		// Math.random(), Random 클래스

		// 1. Random 클래스
		Random ran = new Random();

		// 각종 기본자료형의 난수 발생 : 자료형 범위 안에서 난수 발생 (음수도 나옴)
		System.out.println("boolean형 : " + ran.nextBoolean());
		System.out.println("int형 : " + ran.nextInt());
		System.out.println("long형 : " + ran.nextLong());

		// double은 0.0 이상 1.0 미만에서 난수 발생
		System.out.println("double형 : " + ran.nextDouble());

		System.out.println();

		// 특정 범위 지정하는 법
		// 1. nextInt(범위) : 0 ~ 범위 전까지 난수 발생 (정수)
		System.out.println("int(범위) : " + ran.nextInt(5)); // 0부터 4까지 나옴

		System.out.println();

		// 2. (int)(nextDouble() * 범위 ) : 0 ~ 범위 전까지 난수 발생 (정수)
		// 얘가 int보다 겹칠 확률이 적어서 더 많이씀
		System.out.println("int(범위) : " + (int) (ran.nextDouble() * 5)); // 0부터 4까지 나옴

		System.out.println();

		// Math 클래스 : 전체 메서드가 static, 객체 생성 없이 호출 가능

		// 1) random()


		System.out.println();

		// 특정 범위 지정
		System.out.println("Math.random(0~4) : " + (int) (Math.random() * 5));

		System.out.println();

		// 올림, 버림, 반올림
		System.out.println("올림 : " + Math.ceil(3.45)); // 4.0
		System.out.println("올림 : " + Math.ceil(3.55)); // 4.0

		System.out.println("반올림 : " + Math.round(3.45)); // 3
		System.out.println("반올림 : " + Math.round(3.55)); // 4

		System.out.println("버림 : " + Math.floor(3.45)); // 3.0
		System.out.println("버림 : " + Math.floor(3.55)); // 3.0

	}
}
