package day18.com.ict.edu;

public class Ex01_Collection {
	// 제네릭과 컬렉션(자료구조)
	// 제네릭 : 컬렉션이 어떤 객체들로 이루어졌는지 표시하는 객체(클래스) 타입
	// 컬렉션 : 객체들을 모아서 관리하는 인터페이스들
	// API : <T> => 객체 타입, <E> => 요소(Element) - 컬렉션 안에 존재하는 객체 하나
	// Map형식 : <K, V> => Key, Value - 1 : 1 대응, Key를 호출하면 Value가 나옴

	// 형식 ) 컬렉션<제네릭>

	// 최상위 컬렉션은 Collection<E>, Map<K, V>
	// Collection<E>을 상속받아서 실제로 사용하는 인터페이스 : Set<E>, List<E>, Queue<E>

	// Collection의 주요 메서드
	// 1. add(E e) : boolean => 해당 컬렉션에 객체 추가, 성공하면 true, 실패하면 false
	// 보통은 리턴을 받지 않음(set에서는 중복 검사시 받아야함)
	// 2. addAll(Collection< ? extends E> c) : boolean
	// => 특정 컬렉션에 있는 모든 요소들을 다른 컬렉션에 추가
	// 3. clear() : void => 모든 요소 삭제
	// 4. contains(Object o) :boolean => 인자로 들어온 객체가 포함되어 있으면 true 아니면 false
	// 5. isEmpty() : boolean => 해당 컬렉션이 비어 있으면 true, 아니면 false
	// ** 6. iterator() : Iterator<E> => 컬렉션 안에 존재하는 객체들을 순서대로 접근하기 위해
	// Iterator 객체를 반환
	// 요소들을 하나씩 꺼내서 작업할 때 사용(for문 사용 가능)
	// 7. remove(Object o) : boolean => 인자로 들어온 객체를 삭제, 성공하면 true, 아니면 false
	// 8. size() : int => 컬렉션 안에 존재하는 요소의 수(for문 사용 가능)
	// 9. toArray() : Object[] => 컬렉션을 배열로 만듦
	// 10. toArray() : Arrays.asList() => 배열을 컬렉션(ArrayList)으로 만듦

}