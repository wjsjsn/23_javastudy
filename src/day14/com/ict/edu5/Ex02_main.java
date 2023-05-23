package day14.com.ict.edu5;

public class Ex02_main {
	public static void main(String[] args) {
        // 부모클래스로 선언했을 때는 부모클래스가 갖고 있는 것 사용
		// 자식클래스만 갖고 있는 내용 사용 x
		// 오버라이딩을 하면 자식클래스가 갖고 있는 것 사용
		Ex02_Dog dog = new Ex02_Dog();
		Ex02_Cat cat = new Ex02_Cat();

		dog.sound();
		dog.hobby();
		System.out.println(dog.eyes);
		System.out.println(dog.color);

		System.out.println();

		cat.sound();
		cat.hobby();
		System.out.println(cat.eyes);
		System.out.println(cat.color);

		System.out.println();

		// 객체 생성
		// 부모클래스 변수 = new 자식 클래스 생성자();
		Ex02_Animal animal = null;

		int su = 1;

		if (su == 1) { // 고양이
			animal = new Ex02_Cat();
		} else if (su == 2) { // 강아지
			animal = new Ex02_Dog();
		}
		// 오버라이딩
		animal.sound();
	    // 부모 것만 나옴
		System.out.println(animal.color);
		System.out.println(animal.eyes);
		
		// 자식 클래스만 갖고 있는 것은 사용 x
		// animal.play();
    
	}
}
