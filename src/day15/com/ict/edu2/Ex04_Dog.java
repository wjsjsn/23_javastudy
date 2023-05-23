package day15.com.ict.edu2;

public class Ex04_Dog extends Ex04_abstract{

	// 반드시 해야함(안하면 오류 => 추상 메서드라서)
	@Override
public void sound() {
	System.out.println("멍멍");	
}
	// 해도 되고 안해도 됨
	@Override
	public void play() {
	System.out.println("바다에서 놀기");
	}
	String name = "개똥이";
	
	public String getName() {
		return name;
	}
}
