package day18.com.ict.edu;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;

public class Ex07_List {

	// List인터페이스 : 배열과 흡사한 구조
	// 삽입, 삭제, 추가가 자유로움
	// 크기 지정을 미리 안해도 됨
	// List인터페이를 구현한 클래스 : Stack, ArrayList, Vector;
	// ArrayList : 멀티스레드 동기화 지원 x
	// Vector : 멀티스레드 동기화 지원 o
	// ArrayList, Vector 사용법은 같음

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		Vector<String> vector = new Vector<>();

		list.add("손흥민");
		list.add("이강인");
		list.add("김민재");
		list.add("손흥민"); // 중복 가능

		vector.add("손흥민");
		vector.add("이강인");
		vector.add("김민재");
		vector.add("손흥민"); // 중복 가능

		list.add(1, "차범근"); // 삽입
		vector.add(1, "차범근"); // 삽입

		System.out.println(list);
		System.out.println();
		System.out.println(vector);

		System.out.println();

		// 검색 : search(), elementAt(), firstElement(), lastElement() => list는 다 없음
		// elementAt(), firstElement(), lastElement() => Vector는 있음(search()만 없음_
		// indexOf()만 가능
		if (list.contains("손흥민")) {
			System.out.println(list.indexOf("손흥민"));
			System.out.println(list.lastIndexOf("손흥민"));

			System.out.println();

			// 치환
			list.set(list.lastIndexOf("손흥민"), "박지성");
		}
		System.out.println(list);

		System.out.println();

		if (vector.contains("손흥민")) {
			System.out.println(vector.indexOf("손흥민"));
			System.out.println(vector.lastIndexOf("손흥민"));

			System.out.println();

			// 치환
			vector.set(vector.lastIndexOf("손흥민"), "차두리");
			System.out.println(vector.firstElement());
			System.out.println(vector.lastElement());
		}
		System.out.println(vector);

		System.out.println();

		// 삭제 : remove
		list.remove("박지성"); // 중복되는 경우 하나만 삭제(앞에 거가 삭제)
		vector.remove("차두리");
		System.out.println(list);
		System.out.println(vector);

		System.out.println();

		// 출력 : 개선된 for문, iterator
		for (String k : list) {
			System.out.println(k + " 골");
		}
		System.out.println();

		Iterator<String> it = vector.iterator();
		while (it.hasNext()) {
			String k = (String) it.next();
			System.out.println(k + " 선수");
		}
	}
}
