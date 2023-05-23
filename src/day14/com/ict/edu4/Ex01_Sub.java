package day14.com.ict.edu4;

public class Ex01_Sub extends Ex01_Super {

	String name = "홍반장";
	int age = 13;
	double weight = 78.4;

	// this() : 본인 생성자
	// 반드시 생성자의 첫번째 줄에 있어야 다른 생성자 호출
	// public Ex01_Sub() {
	// this("홍두깨", 14);
	// }

	// super() : 부모클래스 생성자
	// 자식 클래스 생성자 첫 줄에 부모클래스 생성자가 숨어있음
	// 생성자는 하나밖에 못 씀(super, this 중 하나만)
	public Ex01_Sub() {
		// super(); 얘가 숨어있음
		// super("서울 마포구");
		this("kkk", 14);
	}

	public Ex01_Sub(String name, int age) {
// 생성자 두 개 다 쓰고 싶으면 위에 this 쓰고 밑에 super 기본 생성자 써주면 됨
		super();
		this.name = name;
		this.age = age;
	}
}
