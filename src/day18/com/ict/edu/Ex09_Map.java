package day18.com.ict.edu;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class Ex09_Map {
	// Map 인터페이스 : Key와 Value가 1 : 1 매핑 구조
	// Key는 중복 x (기존 value가 삭제됨 => 덮어쓰기)
	// Value는 중복 가능
	// Key를 호출하면 Value가 나옴
	// Key를 별도로 관리 ( Set으로 관리) => KeySet()
	// add()로 추가 안 됨
	// put(Key, Value)로 추가할 수 있음
	// 관련 클래스 : HashMap

	public static void main(String[] args) {

		// 생성(Key가 숫자, Value는 문자열인 경우)
		HashMap<Integer, String> map1 = new HashMap<>();
		map1.put(0, "한국");
		map1.put(1, "미국");
		map1.put(2, "영국");
		map1.put(8, "태국");
		map1.put(10, "중국");
		map1.put(3, "남아프리카공화국");

		System.out.println(map1);

		System.out.println();

		map1.put(10, "대만");
		System.out.println(map1);

		System.out.println();

		// get(key) : 하나씩 출력
		System.out.println(map1.get(2));
		System.out.println(map1.get(5)); // null; <= 결과값

		System.out.println();

		// 삭제 : remove(key); : key, value 다 삭제
		map1.remove(3);
		System.out.println(map1);

		System.out.println();

		// key를 set에서 관리 => keySet();
		for (Integer k : map1.keySet()) {
			System.out.println(map1.get(k));
		}
		System.out.println();

		Iterator<Integer> it = map1.keySet().iterator();
		while (it.hasNext()) {
			Integer k = (Integer) it.next();
			System.out.println(k + " : " + map1.get(k));
		}

		System.out.println();

		// entrySet() 메서드 : key, value 값이 모두 필요할 경우 사용
		Set set1 = map1.entrySet();
		// System.out.println(set1);
		Iterator it2 = set1.iterator();
		while (it2.hasNext()) {
			Entry entry = (Entry) it2.next();
			Integer key = (Integer) entry.getKey();
			String value = (String) entry.getValue();
			System.out.println(key + " : " + value);
		}

	}
}
