package dd.com.ict.edu;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test_Exception {
public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	

	try {
		int su1 = 50;
		System.out.print("정수 입력 : ");
		int su2 = scan.nextInt();
		System.out.println("정답 : " + (su1 / su2));
	} catch (InputMismatchException e) {
		System.out.println("숫자만 입력하세요");
	
	} catch (ArithmeticException e) {
		System.out.println("0으로는 나눌 수 없습니다.");
	
	} finally {

		scan.close(); 
	}
	System.out.println("수고하셨습니다.");

}
}
