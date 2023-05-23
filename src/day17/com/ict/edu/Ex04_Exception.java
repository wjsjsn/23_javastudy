package day17.com.ict.edu;

import java.util.Iterator;
import java.util.Scanner;

// throws(예외 전가 / 양도) : 예외가 발생하면 예외처리를 해야하지만
//                                       현재 메서드에서는 할 수 없어서 
//                                       자신을 호출한 곳으로 예외객체를 전달
//                                       나중에라도 예외처리(try ~ catch)를 하는 것이 좋음
//                                       클래스는 throw 못 씀
public class Ex04_Exception {

	public void setData(String str) {
		// str 길이가 0보다 크면(str에 정보가 있으면)
		if (str.length() >= 1) {
			// str의 첫번째 글자를 추출해라
			String res = str.substring(0, 1);
			try {
			prnData(res);
			}catch (Exception e){
				System.out.println("첫글자는 숫자만 입력하세요.");
			}
		}
	}

	public void prnData(String res) throws NumberFormatException{
     
		//try {
			int dan = Integer.parseInt(res);
			System.out.println(dan + "단");
			for (int i = 1; i < 10; i++) {
				System.out.println(dan + " * " + i + " = " + (dan * i));
			}			
	//}catch(NumberFormatException e) {
			//System.out.println("첫글자는 숫자만 입력하세요.");
		//}
	}

	public static void main(String[] args) {
  Ex04_Exception test = new Ex04_Exception();
  Scanner scan = new Scanner(System.in);
  
  System.out.println("정수 입력 : ");
  String msg = scan.next();
  test.setData(msg);
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
	}
}
