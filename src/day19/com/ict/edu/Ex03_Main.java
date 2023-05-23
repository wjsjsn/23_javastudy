package day19.com.ict.edu;

public class Ex03_Main {
	public static void main(String[] args) {
		
		System.out.println("main : " + Thread.currentThread().getName());
		Ex03_Cat cat = new Ex03_Cat();
		Ex03_Dog dog = new Ex03_Dog();
		
		//Runnable은 start()가 없음
        //  cat.start();
		
		Thread thread = new Thread(dog);
		thread.start();
		
		// Thread thread2 = new Thread(cat);
		// thread2.start();

		// 익명(재활용 x)   
		new Thread(cat).start();
		
		// 익명 : new 클래스(인터페이스 i);
		// 안드로이드에서의 이벤트 처리 방법
		new Thread(new Runnable() {
			
			@Override
			public void run() {
	while (true) {
		System.out.println("AAAAAAAAAAAAA" + Thread.currentThread().getName());
	}		
			}
		}).start();
		
		System.out.println("main : " + Thread.currentThread().getName());
	}
}
