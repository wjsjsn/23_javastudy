package day12.com.ict.edu;

public class Ex05_AnimalTest {
	public static void main(String[] args) {
		// 객체 생성
		Ex05_Animal a1 = new Ex05_Animal();
		
		// 이름 큰뿔소
		a1.setName("큰뿔소");
		// 나이 3살
		a1.setAge(3);
		// 생존여부 살아있음
		a1.setLive(true);
		// 결과 출력
		String n1 = a1.getName();
		System.out.println(n1);
		
		int a2 = a1.getAge();
		System.out.println(a2+"살");
		
		boolean l1 = a1.getLive();
		if (l1==true) {
			System.out.println("살아있음");
		}else {
			System.out.println("죽었음");
		}
		
		System.out.println("===========");
		
		// 이름 펭귄, 나이 1살, 생존여부 살아있음 으로 변경
        a1.setName("펭귄");
        a1.setAge(1);
        a1.setLive(true);
		// 결과 출력
		System.out.println(a1.name);
		
		System.out.println(a1.age+"살");
		if (l1==true) {
			System.out.println("살아있음");
		}else {
			System.out.println("죽었음");
		}
		
		System.out.println("===========");
		
		a1.play(14, "엄지", false);
        a1.prn();	
		
    	System.out.println("===========");
        
    	a1.play("까치", 14, true);
		a1.prn();
		
		
		
		
		
		
		
		
		
		
		
	}
}
