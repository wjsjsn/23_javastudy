package day14.com.ict.edu;

import java.util.StringTokenizer;

public class Ex02_StringBuffer {
	public static void main(String[] args) {

		// 문자열을 추가할 때 사용(메모리 주소가 변경되지 x)
		// 추가할 때 append() 메서드 사용
		// toString() => String 전환
		StringBuffer sb = new StringBuffer("ictedu");
		// 추가
		sb.append(" 대한민국");

		System.out.println(sb);
		System.out.println(sb.toString());

		System.out.println();

		// StringTokenizer : 구분자를 이용해 문자열 분리(split()과 비슷)
		// split과 차이점 : StringTokenizer는 배열의 크기를 못정함
		// 구분자가 없으면 띄어쓰기로 분리
		// nextToken()을 이용해 문자열 분리

		String str = "사과 바나나 망고 오렌지 수박";
		StringTokenizer st = new StringTokenizer(str);
		// hasMoreElements() : 다음 요소가 있는지 묻는 것( 있으면 true, 없으면 false)

		// 구분자 x (띄어쓰기 기준, 탭, 줄바꾸기)
		while (st.hasMoreElements()) {
			String res = st.nextToken();
			System.out.println(res);
		}
		System.out.println();

		// 구분자 o ( "," 기준) 크기 지정은 x
		str = "사과,바나나,망고,오렌지,수박";
		StringTokenizer st2 = new StringTokenizer(str, ",");
		while (st2.hasMoreElements()) {
			String res = st2.nextToken();
			System.out.println(res);
		}
		System.out.println();

		// 추천
		String[] arr = str.split(",");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println();

	}
}
