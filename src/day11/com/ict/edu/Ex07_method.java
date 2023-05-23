package day11.com.ict.edu;

public class Ex07_method {

	int sum = 0;
	double avg = 0.0;
	String hak = "";
	//총점 구하는 메서드
	public void getSum(int kor, int eng, int math) {
		sum = kor + eng + math;
	}
	//평균 구하는 메서드
	public void getAvg(int k1) {
		avg = (int)(k1/3.0)*10/10.0;
	}
	//학점 구하는 메서드
	public void getHak(double k1) {
		if(k1 >=90) {
			hak = "A";
		}else if(k1 >=80) {
			hak = "B";
		}else if(k1 >=70) {
			hak = "C";
		}else {
			hak = "F";
		}
	}	
		public void getHak() {
			if(avg >=90) {
				hak = "A";
			}else if(avg >=80) {
				hak = "B";
			}else if(avg >=70) {
				hak = "C";
			}else {
				hak = "F";
			}
	}
}
