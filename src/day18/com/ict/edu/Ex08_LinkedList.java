package day18.com.ict.edu;

import java.util.LinkedList;

public class Ex08_LinkedList {

	// Queue(큐) 인터페이스 : FIFO(First In First Out) 선입선출
	// Queue를 구현한 클래스 : LinkedList

	public static void main(String[] args) {
		LinkedList<String> linkedList = new LinkedList<>();

		// 추가, 삽입 : add, addFirst, addLast, offer, offerFirst, offerLast
		linkedList.add("고길동");
		linkedList.offer("도우너");
		linkedList.addFirst("둘리");
		linkedList.offerFirst("또치");
		linkedList.addLast("희동이");
		linkedList.offerLast("둘리"); // 중복 가능
		linkedList.add(3, "차두리");
		System.out.println(linkedList);

		System.out.println();

		if (linkedList.contains("둘리")) {
			System.out.println(linkedList.indexOf("둘리"));

			System.out.println();

			System.out.println(linkedList.getFirst());
			System.out.println(linkedList.getLast());

			System.out.println();

			// 치환
			linkedList.set(linkedList.lastIndexOf("둘리"), "공실이");
		}
		System.out.println(linkedList);

		System.out.println();

		// 삭제 : remove(Object c), removeFirst(), removeLast()
		linkedList.removeFirst();
		linkedList.removeLast();
		linkedList.remove("차두리");
		linkedList.remove(); // 아무것도 안 쓰면 맨 앞 객체가 삭제
		System.out.println(linkedList);

		System.out.println();

		// 출력

	}

}
