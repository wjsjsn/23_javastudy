package day12.com.ict.edu;

public class Ex03_method {

	// 모두 반환형(int, double, String 등등)이 있음
	String name = "홍길동";
	int kor = 95;
	int eng = 85;
	int math = 75;
	
	int sum = 0;
	double avg = 0;
	String hak = "";	
	
	// 총점 구하는 메서드
	public int getSum() {
		sum = kor + eng + math;
		return sum ;
	}
	
	// 평균 구하는 메서드
	public double getAvg() {
		avg = sum/3.0;
		return avg;
	}
	// 학점 구하는 메서드
	public String getHak() {
		if (avg >= 90) {
			hak = "A";
		}else if (avg >= 80) {
			hak = "B";
		}else if (avg >= 70) {
			hak = "C";
		}else {
			hak = "F";
		}
	  return hak;
	}
}
