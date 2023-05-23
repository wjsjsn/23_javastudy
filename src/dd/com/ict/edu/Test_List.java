package dd.com.ict.edu;

import java.util.ArrayList;

public class Test_List {
public static void main(String[] args) {
	
	// ArrayList 객체 생성
	ArrayList<String> name = new ArrayList<>();
	// ArrayList 객체에 손흥민, 이강인, 김민재, 차범근 추가
	name.add("손흥민");
	name.add("이강인");
	name.add("김민재");
	name.add("차범근");
	// "손흥민" 포함돼있으면
	if(name.contains("손흥민")) {
	//손흥민이 몇 번째 위치에 있는지 출력
		System.out.println(name.indexOf("손흥민"));
	}
	// 하나씩 출력
	for (String k : name) {
		System.out.println(k);
	}
}
}
