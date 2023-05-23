package day06.com.ict.edu2;

import java.util.Scanner;

public class Ex01_Scanner {
	public static void main(String[] args) {
		// 회사에서 제공하는 클래스를 사용하기 위해서 import를 해야됨
        //해당 클래스 커서를 뒤에 놓고 shift + f2 => 해당 클래스 API 설명서가 나타남
		Scanner scan = new Scanner(System.in);
		
		System.out.print("이름 : ");
		
		String name = scan.next();
		System.out.println("받은 내용 :"+ name);
		
		System.out.print("나이 : ");
		
		String age = scan.next();
		System.out.println("받은 내용 :"+ (age+1));
		
		System.out.print("나이 : ");
		
		int age2 = scan.nextInt();
		System.out.println("받은 내용 :"+ (age2+1));
		
		//숙제 : next와 nextline의 차이점 찾기

		System.out.print("키 : ");
		double ke = scan.nextDouble();
		System.out.println("받은 내용 :"+ ke);
		
		System.out.print("당신은 남성입니까?(true/false) : ");
		boolean gender = scan.nextBoolean();
		
		System.out.println("받은 내용 :"+ gender);
		if (gender) {
			System.out.println("당신은 남성입니다.");
		} else {
            System.out.println("당신은 여성입니다.");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
