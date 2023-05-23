package day12.com.ict.edu;

public class Ex09_method {
	//총점, 평균, 학점을 구하는 메서드가 있는 클래스를 만들고 
	//번호, 국어, 영어, 수학를 받아서 
	//총점, 평균, 학점, 순위를 구하고 
	//순위 기준으로 오름차순으로 정렬하여 
	//출력하는 main 메서드를 가지는 클래스를 만들어라 
	//단, 처리는 2차원배열을 이용해라
	double sum = 0;
	double avg = 0.0;
	char hak = 0;
	
	//총점 구하는 메서드
	public double getSum(double kor, double eng, double math) {
		sum = kor + eng + math;
		return sum;
	}
	//평균 구하는 메서드
	public double getAvg(double sum) {
		avg = (int)(sum/3.0*10)/10.0;
		return avg;
	}
	//학점 구하는 메서드
	public char getHak(double avg) {
		if (avg >=90) {
			hak = 'A';
		} else if(avg >=80){
			hak = 'B';
		}else if(avg >=70) {
			hak = 'C';
		}else {
			hak = 'F';
		}
		return hak;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
