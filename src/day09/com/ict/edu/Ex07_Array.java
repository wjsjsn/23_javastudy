package day09.com.ict.edu;

import java.util.Arrays;

public class Ex07_Array {
	public static void main(String[] args) {

		// 가장 큰 값과 작은 값 구하기
		int[] su = { 90, 80, -20, 120, 67, 23, 40, 53 };

		// 오름차순
    for (int i = 0; i < su.length; i++) {
    	for (int j = 0; j < su.length; j++) {
    		Arrays.sort(su);
			
		}
    	System.out.println(su[i]);
		
	}
		System.out.println("가장 작은 값 : " + su[0]);
		System.out.println("가장 큰 값 : " + su[su.length - 1]);

		System.out.println("=================");

	}
}
