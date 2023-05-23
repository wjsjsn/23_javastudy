package day04.com.ict.edu;

public class Ex02_oper {
	public static void main(String[] args) {
		
		//int k1 = 90 이상이면 "A학점", 80 이상은 "B학점", 나머지는 "F학점"
		int k1 = 84;
		String str = (k1>=90)?"A학점":(k1>=80)?"B학점":"F학점";
		System.out.println(str);
	
		//char k2가 대문자인지, 소문자인지, 기타문자인지 판별
		char k2 = 'b';
		str = (k2>='A'&& k2<='Z')?"대문자":(k2>='a'&&k2<='z')?"소문자":"기타문자";
		System.out.println(str);
		
		//int k3이 1 또는 3이면 남자, 2 또는 4는 여자
		//        1 또는 2는 1900년대 태어남, 3 또는 4는 2000년대 태어남
		// 나머지는 외국인
			       
		int k3 = 4;
		str = (k3==1||k3==3)? (k3==1)?"1900년대 태어난 남자" : "2000년대 태어난 남자":
			(k3==2||k3==4)?(k3==2)?"1900년대 태어난 여자" : "2000년대 태어난 여자":"외국인";
		System.out.println("결과 : "+str);
	}

}
