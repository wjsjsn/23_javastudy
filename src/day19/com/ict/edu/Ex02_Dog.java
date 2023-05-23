package day19.com.ict.edu;

public class Ex02_Dog extends Thread {
// 여기에 start 만들면 안 됨(스레드 처리 안 됨)
	
	//public void start() {
		//for(int i = 0; i<20; i++) {
	//		System.out.println("멍멍" + Thread.currentThread().getName());
//	}
// 	}
	@Override
	public void run() {
		for(int i = 0; i<20; i++) {
			System.out.println("멍멍" + Thread.currentThread().getName());
		}
	}
}
