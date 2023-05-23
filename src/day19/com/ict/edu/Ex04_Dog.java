package day19.com.ict.edu;

public class Ex04_Dog implements  Runnable{

	@Override
	public void run() {
	while (true) {
	    // 3초 간 대기 상태(sleep은 1000이 1초)
		try {
			Thread.sleep(1000*3);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("멍멍");
	}
	}

}
