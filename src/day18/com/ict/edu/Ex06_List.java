package day18.com.ict.edu;

import java.util.Iterator;
import java.util.List;
import java.util.Stack;

public class Ex06_List {

	// List인터페이스 : 배열과 흡사한 구조
	// 삽입, 삭제, 추가가 자유로움
	// 크기 지정을 미리 안해도 됨
	// List인터페이스를 구현한 클래스 : Stack, ArrayList, Vector;
	// 1. Stack : LIFO(Last In First Out)
	// => 마지막에 들어온 데이터가 먼저 나가는 형태(후입선출)

	// add, push, addElement => 추가
	// add(index, E) => 삽입
	// pop : 맨 위에 존재하는 객체를 반환하고 삭제
	// peek : 맨 위(제일 뒤에 거)에 존재하는 객체를 반환(삭제 x)
	// search : 검색(오른쪽, 1부터) => 스택 관점
	// **indexOf : 검색(왼쪽, 0부터) => 배열 관점

	// elementAt(index) : 요소 반환
	// **get(index) : 요소반환
	// firstElement() : 맨 처음 요소 반환
	// lastElement() : 맨 마지막 요소 반환
	// setElement(Element, index) : 치환

	public static void main(String[] args) {
		Stack<String> stack = new Stack<>();
		stack.add("둘리");
		stack.push("공실이");
		stack.addElement("마이콜");

		stack.add(0, "고길동");
		stack.add(2, "희동이");

		// 마지막 객체 보기 : pop(삭제), peek(삭제 x)
		System.out.println(stack.peek());
		System.out.println(stack);
		System.out.println();

		System.out.println(stack.pop());
		System.out.println(stack);
		System.out.println();

		// 둘리를 가지고 있냐고 묻기
		if (stack.contains("둘리")) {
			// 둘리 위치 찾기
			System.out.println(stack.indexOf("둘리")); // 왼쪽, 0부터
			System.out.println(stack.search("둘리")); // 오른쪽, 1부터

			System.out.println();

			// 위치값을 이용해 객체 얻기
			System.out.println(stack.get(1));
			System.out.println(stack.elementAt(1));
			System.out.println(stack.get(stack.indexOf("둘리")));
		} else {
			System.out.println("존재하지 않음");
		}
		System.out.println();

		if (stack.contains("고길동")) {
			// 변경(치환)
			stack.setElementAt("도우너", stack.indexOf("고길동"));
		}
		System.out.println(stack);

		// 중복 가능
		stack.add("둘리");
		stack.add("고길동");
		System.out.println(stack);

		System.out.println();
		// 하나씩 꺼내기(배열, 왼쪽, 0)
		for (String k : stack) {
			System.out.println(k + "님");
		}
		System.out.println();

		Iterator<String> it = stack.iterator();
		while (it.hasNext()) {
			String k = (String) it.next();
			System.out.println(k + "짱");
		}
		System.out.println();

		// 스택방식으로(오른쪽)
		while (!stack.isEmpty()) {
			String k = stack.pop();
			System.out.println(k + ", 크기는 " + stack.size() + "이다.");
		}
		System.out.println(stack);

		System.out.println();

	}

}
