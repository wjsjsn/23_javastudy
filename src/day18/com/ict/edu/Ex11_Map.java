package day18.com.ict.edu;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Ex11_Map {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 대한민국, 캐나다, 영국, 스위스의 수도를 각각 HashMap에 저장시키고
		// 원하는 나라가 key값이 되어 화면에서 나라를 물어보면 수도가 출력되는 프로그램 작성

		String name = "";
		String yn = "";

		HashMap<String, String> map = new HashMap<>();
		map.put("대한민국", "서울");
		map.put("캐나다", "오타와");
		map.put("영국", "런던");
		map.put("스위스", "베른");
		
		Set<String> keys = map.keySet();
	
		esc: while (true) {
			System.out.print("나라를 입력하세요. >>> ");
			name = scan.next();

			if (keys.contains(name)) {
				System.out.println(name + "의 수도는 " + map.get(name) + "입니다.");
			} else {
				System.out.println(name + "의 수도는 " + "데이터에 없습니다.");
			}

			while (true) {
				System.out.print("계속 하시겠습니까?(y / n) >>> ");
				yn = scan.next();
				if (yn.equalsIgnoreCase("y"))
					continue esc;
				if (yn.equalsIgnoreCase("n")) {
					break esc;
				} else {
					continue;
				}
			}
		}

	}

}
