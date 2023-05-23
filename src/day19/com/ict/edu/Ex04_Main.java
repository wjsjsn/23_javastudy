package day19.com.ict.edu;

public class Ex04_Main {
public static void main(String[] args) {
	Ex04_Dog dog = new Ex04_Dog();
	Thread t_dog = new Thread(dog);
	
	Ex04_Cat cat = new Ex04_Cat();
	Thread t_cat = new Thread(cat);

	t_cat.setDaemon(true);
	t_cat.start();
	// 데몬 스레드 : 일반 스레드의 작업을 돕는 보조적인 역할을 수행하는 스레드
	//                    일반 스레드가 종료되면 데몬 스레드는 강제로 종료됨 
	t_dog.setDaemon(true);
	t_dog.start();
	
	for (int i = 0; i < 15; i++) {
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println(i);
	}
	System.out.println("종료");
}
}
