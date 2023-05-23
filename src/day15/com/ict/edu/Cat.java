package day15.com.ict.edu;

public class Cat extends Animal {

	String color = "삼색이";

	public void play() {
		System.out.println("창 밖을 바라본다.");
	}

	@Override
	public void sound() {
		System.out.println("야옹");
	}
	
	// 부모클래스의 해당 메서드 final이 있어서 오류
	// @Override
	// public void sleep() {
	//	System.out.println("12시간 이상 잠을 잔다.");		
	// }
}
