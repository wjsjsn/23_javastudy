package day20.com.ict.edu;

// wait() : 동기화 처리할 때 현재 실행 중인 스레드를 강제로 대기 상태로
//             변경시키는 메서드
//             한 번 wait()된 스레드를 풀어주지 않으면 그대로 대기상태로 끝남
// wait()된 스레드를 풀어주는 예약어 : notify(), notifyAll()
public class Ex03_noti_wait {
 public static void main(String[] args) {
	 
	 Ex03 test = new Ex03();
      new Thread(test,"dog").start();
      new Thread(test,"cat").start();
      new Thread(test,"tiger").start();
      new Thread(test,"lion").start();
     
}
}
