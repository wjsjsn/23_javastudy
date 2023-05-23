package day07.com.ict.edu2;

import java.util.Iterator;

public class Ex02_String {
	public static void main(String[] args) {

		// charAt
		// 위치정보 = index를 받아서 해당 위치에 존재하는 글자를 char형으로 변환
		String str = "한국 ICT 인재개발원 1강의장";
		char k1 = str.charAt(7);
		System.out.println(k1);

		System.out.println("==========================");

		// 모두 대문자로 만들기(소문자는 -32)
		str = "Hello World";

		for (int i = 0; i < str.length(); i++) {
			char k2 = str.charAt(i);
			if (k2 >= 'a' && k2 <= 'z') {
				System.out.print((char) (k2 - 32));
			} else {
				System.out.print(k2);
			}
		}
		System.out.println();

		System.out.println("==========================");

		// concat = 단어를 이어줌
		String s1 = "대한민국";
		String s2 = "KOREA";
		String s3 = s1.concat(s2);
		System.out.println(s3);
		System.out.println(s1 + s2);

		System.out.println("==========================");

		// contains
		// 현재 가지고 있는 문자열 중에 인자로 들어온 문자나 문자열을 가지고 있으면 true 없으면 false
		String s4 = "KOREA @ 대한민국";
		System.out.println(s4.contains("@"));
		System.out.println(s4.contains("REA"));
		System.out.println(s4.contains("rea"));

		System.out.println("==========================");

		// equals(Object anObject) : boolean
		// 입력된 문자열과 현재 문자열이 같으면 true, 다르면 false(대소문자 구별)

		// equalsIgnoreCase(String anotherString) : boolean
		// 입력된 문자열과 현재 문자열이 같으면 true, 다르면 false(대소문자 구별 x)
		String s5 = "Korea";
		String s6 = "KOREA";
		System.out.println(s5.equals(s6));
		System.out.println(s5.equalsIgnoreCase(s6));

		System.out.println("==========================");

		// format(String format, Object... args) : static String
		// 형식을 지정하고 형식에 맞춰 생성
		String s7 = "ICT 인재 개발원";

		 //s8 = String.format(s7);
		 // 문자열 => %s
	    String s8 = String.format("%s", s7);
		System.out.println(s8);

		// %30s : 30자리 차지하는 문자열(남은 자리는 비워둠)-> 오른쪽 정렬
		s8 = String.format("%30s", s7);
		System.out.println(s8);

		// %-30s : 30자리 차지하는 문자열(남은 자리는 비워둠)-> 왼쪽 정렬
		s8 = String.format("%-30s", s7);
		System.out.println(s8);

		// 자리가 모자라도 알아서 다 나옴
		s8 = String.format("%4s", s7);
		System.out.println(s8);

		// 입력 수만큼만 나옴
		s8 = String.format("%.6s", s7);
		System.out.println(s8);

		System.out.println("==========================");

		// %d : 정수 형식 지정
		int s9 = 2314;
		s8 = String.format("%d", s9);
		System.out.println(s8);

		System.out.println("==========================");
		// 오른쪽 정렬
		s8 = String.format("%5d", s9);
		System.out.println(s8);

		System.out.println("==========================");
		// 왼쪽 정렬
		s8 = String.format("%-5d", s9);
		System.out.println(s8);

		System.out.println("==========================");

		// 오른쪽 정렬(빈 공간을 0으로 채움)
		s8 = String.format("%05d", s9);
		System.out.println(s8);

		System.out.println("==========================");

		// 오른쪽 정렬(3자리마다 ','가 들어감)
		s8 = String.format("%,d", s9);
		System.out.println(s8);

		System.out.println("==========================");

		// %f => 실수형식
		double s10 = 1245.44567954;
		System.out.println(String.format("%f", s10));
		System.out.println(String.format("%-20f", s10));

		// 소수점 입력한 숫자만큼 구해줌(반올림)
		System.out.println(String.format("%20.3f", s10));

		// 3자리마다 ',' 넣어주고 소수점 입력한 숫자만큼 구해줌(반올림)
		System.out.println(String.format("%,.1f", s10));

		System.out.println("==========================");

        //getBytes() : byte[]  = 해당 문자열을 byte[]로 변환
        //보통 입출력할 때 사용 
        //( 대/소문자, 숫자, 일부 특수문자만 가능->아스키코드 사용해서 영어 제외 다른 문자 x)
		String a1 = "java";
		byte[] b1 = a1.getBytes();
		System.out.println(b1[0]); // j 숫자
		System.out.println(b1[1]); // a 숫자
		System.out.println(b1[2]); // v 숫자
		System.out.println(b1[3]); // a 숫자

		System.out.println("==========================");

		// for문 사용해서 b1[0, 1, 2, 3] 자동으로 반복
		for (int i = 0; i < 4; i++) {
			//System.out.println(b1[i]);
			System.out.println((char)(b1[i])); //char 사용해서 문자가 뜨게
             	}

		System.out.println("==========================");

		// hashCode() : int
		// 일반적인 hashCode : 객체의 주소값을 변환하여 생성한 객체의 고유한 정수값
		// String hashCode : 각 문자열을 정수값으로 변경
		String a2 = "홍길동";
		System.out.println(a2.hashCode());

		String a3 = "홍길동";
		System.out.println(a3.hashCode());

		// 문자열일때 ==는 주소가 같냐고 묻는 것
		System.out.println(a2 == a3);

		// 문자열일때 equals는 내용이 같냐고 묻는 것 => String일 때는 이거 사용(== 사용 x)
		System.out.println(a2.equals(a3));

		System.out.println("==========================");

		// indexOf(int ch), indexOf(String str) : int
		// 입력된 char, String을 해당 문자열에 char 나 String의 첫번째 위치값을 알려줌
		// 찾은 문자나 문자열이 없으면 -1로 반환
		// 보통 contains랑 같이 씀
		String a4 = "BufferedReader";

		// R 찾기
		System.out.println(a4.indexOf('R'));

		// r 찾기
		System.out.println(a4.indexOf('r')); // 중복되는 경우 맨 앞만 찾음

		// K 찾기
		System.out.println(a4.indexOf('K')); //-나온 건 찾지 x

		// er 찾기
		System.out.println(a4.indexOf("er")); // 문자열 찾는 경우 시작위치(맨 앞글자)를 알려줌

		System.out.println("==========================");

		// lastIndexOF(int ch), lastIndexOf(String str) : int
		// 입력된 char, String을 해당 문자열에 char 나 String의 마지막 위치값을 알려줌
		   a4 = "BufferedReader";
		// R 찾기
		System.out.println(a4.lastIndexOf('R'));

		// r 찾기
		System.out.println(a4.lastIndexOf('r'));

		// K 찾기
		System.out.println(a4.lastIndexOf('K'));

		// er 찾기
		System.out.println(a4.lastIndexOf("er"));

		System.out.println("==========================");

        // indexOf(int char, int fromIndex), indexOf(String str, int fromIndex) : int
        // 두번째, 세번째 문자나 문자열을 찾음
        // fromIndex => 시작위치값
		a4 = "BufferedReader";
		System.out.println(a4.indexOf('e', 0)); // = (a4.indexOf('e'))

		System.out.println("==========================");
		// 첫번째 'e'의 위치가 4로 나와서 5부터 시작
		System.out.println(a4.indexOf('e', 5));

		System.out.println("==========================");

		System.out.println(a4.indexOf('e', a4.indexOf('e', 0) + 1)); // a4.indexOf('e', 0)의 다음부터 시작하는 거라서 +1을하면
																		// a4.indexOf('e', 5)와 같은 결과가 나옴

		System.out.println("==========================");
         
		 //세번째 'e'의 위치 찾기
         //두번째 'e'의 위치는 6이 나와서 7부터 시작
		System.out.println(a4.indexOf('e', 7));

		System.out.println("==========================");

		System.out.println(a4.indexOf('e', a4.indexOf('e', a4.indexOf('e', 0) + 1) + 1));

		System.out.println("==========================");

		// length() : int = 문자열의 길이(개수) => 1부터 시작(개수라서)
		// 문자열의 위치(index) => 0부터 시작
		System.out.println(a4.length());

		System.out.println("==========================");

		// replace(char oldChar, char newChar) : String
		// replace(String oldStr, char newStr) : String
		// 새로운 문자나 문자열을 받아서 치환(바꾸기)함

		String a5 = "대한민국";
		String a6 = a5.replace('한', '韓');
		String a7 = a5.replace("한", "한♡");
		System.out.println(a5);
		System.out.println(a6); // a5가 바뀐 거 x
		System.out.println(a7);

		System.out.println("==========================");
        
		//이름 가운데 글자 *로 바꾸기
		String a8 = "홍길동";
		int a9 = a8.length();
		String res = "";
		for (int i = 0; i < a9; i++) {
			char a = a8.charAt(i);
			if (i == 0 || i == a9 - 1) { // 이름 길이 = 3, index값 = 2 => 그래서 -1을 하면 이름 끝글자가 됨
				res += a;
			} else {
				res += "*";
			}
		}
		System.out.println(res);

		System.out.println("==========================");

		// 전화번호 뒷자리 *표시
		a8 = "010-6523-8205";
		int t = a8.length();
		int t2 = a8.lastIndexOf("-");
		res = "";
		for (int i = 0; i < t; i++) {
			char a = a8.charAt(i);
			if (i >= 0 && i <= t2) {
				res += a;
			} else {
				res += "*";
			}
		}
		System.out.println(res);
		System.out.println("==========================");

		// 전화번호 가운데 자리 * 표시
		a8 = "010-6523-8205";
		int s = a8.length();
		int ss = a8.indexOf("-");
		int sss = a8.lastIndexOf("-");
		res = "";
		for (int i = 0; i < s; i++) {
			char a = a8.charAt(i);
			if (i > ss && i < sss) {
				res += "*";
			} else {
				res += a;
			}
		}
		System.out.println(res);
		System.out.println("==========================");
		// isEmpty() : boolean
		// 해당 문자열이 비어있으면 true, 내용이 있으면 false
		String t5 = "HelloWorld";
		System.out.println(t5.isEmpty());

		t5 = "";
		System.out.println(t5.isEmpty());

		// split(String regex) : String[]
		// split(String regex, int limit) : String[]
		// regex => 구분자(나눌 기준), limit => 배열의 크기(방의 개수)

		t5 = "사과,딸기,망고,오렌지,두리안,용과";
		String[] arr = t5.split(",");
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		System.out.println(arr[5]); // <-이렇게 하면 상황에 따라 오류남
		System.out.println("==========================");
		// "," 단위로 끊어서 방이 만들어짐(6개->0,1,2,3,4,5)

		// 알아서 반복해서 돌려줌
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("==========================");

		// limit가 붙으면 ","단위로 끊기다 마지막 방에는 나머지 전부 들어감(3개 -> 1,2,(3,4,5,6)
		String[] arr2 = t5.split(",", 3);

		for (int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]);
		}

		System.out.println("==========================");

		// subString(int beginIndex) : String
		// 입력된 시작위치부터 끝까지 문자열 추출
		String t6 = "010-9732-9110";
		String t7 = t6.substring(4);
		System.out.println(t7);

		t7 = t6.substring(t6.lastIndexOf("-") + 1);
		System.out.println(t7);

		System.out.println("==========================");

		// subString(int beginIndex,int endIndex) : String
		// beginIndex 위치부터 endIndex 위치까지 문자열 추출(endIndex 위치는 포함 x)
		t6 = "010-9732-9110";
		t7 = t6.substring(4, 8); // 포함하고 싶은 문자열 숫자+1 => 이렇게 해야 원하는 문자열을 추출할 수 있음
		System.out.println(t7);

		System.out.println("==========================");
		t7 = t6.substring(0, 1); // 뒤-앞 하면 뽑아내고 싶은 문자열 수가 나옴
		System.out.println(t7);

		System.out.println("==========================");

		// 번호 중간을 *로 나오게 하기
		String t8 = "010-9732-9110";
		String t9 = "****";
		String t10 = t8.replace(t8.substring(4, 8), t9);
		System.out.println(t10);

		System.out.println("==========================");

		t10 = t8.replace(t8.substring(t8.indexOf("-") + 1, t8.lastIndexOf("-")), t9); // 앞 뒤가 같은 번호면 전부 *이 나옴(단점)
		System.out.println(t10);

		System.out.println("==========================");

		// 번호 끝을 *로 나오게 하기
		t10 = t8.replace(t8.substring(t8.lastIndexOf("-") + 1), t9); // 앞 뒤가 같은 번호면 전부 *이 나옴(단점)
		System.out.println(t10);

		System.out.println("==========================");

		// 번호 각자 뽑아내기
		String[] arr3 = t8.split("-");
		System.out.println(arr3[0]);
		System.out.println(arr3[1]);
		System.out.println(arr3[2]);
		System.out.println("==========================");

		// 노가다로 번호 중간/뒤 * 나오게 하기
		System.out.println(arr3[0] + "-****-" + arr3[2]);
		System.out.println(arr3[0] + "-" + arr3[1] + "-****");

		System.out.println("==========================");

		// toLowerCase() : String
		// 해당 문자열을 모두 소문자로 변경
		// toUpperCase() : String
		// 해당 문자열을 모두 대문자로 변경
		String str1 = "javaLand03Exam";
		String str2 = "";
		for (int i = 0; i < str1.length(); i++) {
			char k2 = str1.charAt(i);
			// 전부 대문자 만들기
			// 소문자 => 대문자로 변경
			if (k2 >= 'a' && k2 <= 'z') {
				str2 = str2 + (char) (k2 - 32); // 소문자 대문자 차이가 32
			} else {
				str2 = str2 + k2;
			}
		}
		System.out.println(str2);

		System.out.println("==========================");

		// 간단하게 전부 대문자로 만들기
		System.out.println(str1.toUpperCase());

		System.out.println("==========================");

		// 전부 소문자로 만들기
		System.out.println(str1.toLowerCase());

		System.out.println("==========================");

		// toString : String
		// 객체(클래스)에서 toString은 모든 클래스(객체)에서 사용 가능한 메서드
		String u1 = "java 11 자바 11";
		String u2 = u1.toString();
		System.out.println(u1);
		System.out.println(u2);

		System.out.println("==========================");

		// trim() : String
		// 해당 문자열의 앞, 뒤 공백을 제거 / 글자 사이의 공백은 제거 x

		String u3 = "   java    자바    JAVA   ";
		System.out.println("길이 : " + u3.length());
		System.out.println(u3);

		System.out.println("==========================");

		// 공백 지우기
		String u4 = u3.trim();
		System.out.println("길이 : " + u4.length());
		System.out.println(u4);

		System.out.println("==========================");

		// startsWith(String prefix) : boolean
		// 주어진 문자로 시작하는지 검색

		// startsWith(String prefix, int toffset) : boolean
		// 주어진 문자로 시작하는지 검색, toffset => 시작위치

		// endsWith(String suffix) : boolean
		// 주어진 문자로 끝났는지 검사

		// 뭘로 시작하는지 검사
		String u5 = "java   자바   JAVA";
		System.out.println(u5.startsWith("JAVA")); // false
		System.out.println(u5.startsWith("java")); // true
		System.out.println(u5.startsWith("자바")); // false

		System.out.println("==========================");

		// 뭘로 끝나는지 검사
		System.out.println(u5.endsWith("JAVA")); // true
		System.out.println(u5.endsWith("java")); // false
		System.out.println(u5.endsWith("자바")); // false

		System.out.println("==========================");

		// valueOf(기본자료형)
		// 들어온 기본자료형을 String으로 변경
		boolean bo1 = true;
		char ch1 = 'a';
		int num1 = 34;
		long num2 = 37l;
		double num3 = 345.127;
		System.out.println(bo1);
		System.out.println(ch1); // a
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);

		System.out.println("==========================");

		// System.out.println(bo1+1);
		System.out.println(ch1 + 1); // 98
		System.out.println(num1 + 1);
		System.out.println(num2 + 1);
		System.out.println(num3 + 1);

		System.out.println("==========================");

		// 숫자를 문자화 시키기(숫자 안더해지고 뒤에 1이 붙음)
		System.out.println(String.valueOf(bo1) + 1);
		System.out.println(String.valueOf(ch1) + 1); // a1
		System.out.println(String.valueOf(num1) + 1);
		System.out.println(String.valueOf(num2) + 1);
		System.out.println(String.valueOf(num3) + 1);

		System.out.println("==========================");

		System.out.println(bo1 + "" + 1);
		System.out.println(ch1 + "" + 1); // a1
		System.out.println(num1 + "" + 1);
		System.out.println(num2 + "" + 1);
		System.out.println(num3 + "" + 1);
		// 바로 위랑 결과 같지만 메모리가 더 많이 만들어짐

		System.out.println("==========================");

		// Wrapper Class
		// 기본자료형의 형태를 가진 문자열을 해당 자료형으로 변경시키는 클래스
		// "true", "false" => true, false -> Boolean.parseBoolean()
		String msg = "false";
		boolean msg2 = Boolean.parseBoolean(msg);
		System.out.println(msg); // "true"
		System.out.println(msg2); // true
		if (msg2) {
			System.out.println("변경1");
		} else {
			System.out.println("변경2");
		}

		System.out.println("==========================");

		// "142", "25" => 142, 25 -> Integer.parseInt()
		msg = "142";
		int msg3 = Integer.parseInt(msg);
		System.out.println(msg + 10); // 14210
		System.out.println(msg3 + 10); // 152

		System.out.println("==========================");

		// "123213", "3423423" => 123213, 3423423 ->Long.parseLong()
		// "숫자" => 됨 "숫자L" => 에러
		msg = "1231231212312312";
		long msg4 = Long.parseLong(msg);
		System.out.println(msg + 9); // 뒤에 9가 더 붙음
		System.out.println(msg4 + 9); // 9가 더해짐

		System.out.println("==========================");

		// "347.457" => 347.457 ->Double.parseDouble()
		msg = "347.457";
		double msg5 = Double.parseDouble(msg);
		System.out.println(msg + 0.04);
		System.out.println(msg5 + 0.04);

		System.out.println("==========================");

		msg = "347.457f"; // 오류 안 남
		System.out.println(msg + 1.04);
		System.out.println(msg5 + 0.04);

		System.out.println("==========================");

		// Character.parseCharacter()는 존재 x
		// String의 charAt()을 이용하면 char을 가져올 수 있음
		msg = "p";
		char msg6 = msg.charAt(0);
		System.out.println(msg6);

		System.out.println("==========================");

		// String.getBytes() => byte[] (영문자 대/소문자, 숫자 및 일부 특수문자만 가능)
		msg = "java 자바 JAVA 大韓民國 2023 %*";
		byte[] result = msg.getBytes();
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i] + " : " + (char) (result[i])); // -표시된 숫자들은 한글,한자(변환 x)
		}

		System.out.println("==========================");

		// String.toCharArray()
		// char[] <= 모든 문자 처리 가능
		char[] result2 = msg.toCharArray();
		for (int i = 0; i < result2.length; i++) {
			System.out.println(result2[i]);
		}

	}
}
