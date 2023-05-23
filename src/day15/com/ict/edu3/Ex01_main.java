package day15.com.ict.edu3;

public class Ex01_main {
	public static void main(String[] args) {

		System.out.println(Ex01_interface.su1);
		System.out.println(Ex01_interface.su2);
		System.out.println(Ex01_interface.su3);
		System.out.println(Ex01_interface.su4);

		Ex01_interface.like();
		
		System.out.println();
		
		Ex01_extends t1 = new Ex01_extends();
		t1.sound();
		t1.play();
		
		System.out.println();
		
		// 익명 내부 클래스( 추천 안 함)
		Ex01_extends2 t2 = new Ex01_extends2() {
			
			@Override
			public void sound() {
				System.out.println("뮤직 듣기");
				
			}
			
			@Override
			public void play() {
			System.out.println("오락실 게임 하기");
				
			}
		};
		System.out.println();
		
		System.out.println(t2.name);
		t2.tour();
		t2.sound();
		t2.play();
			
		System.out.println();
		
		Ex01_extends4 t3 = new Ex01_extends4();
		System.out.println(t3.name);
		t3.tour();
		t3.sound();
		t3.play();
		
		// 추천 안 함
		/*
		Ex01_extends3 t4 = new Ex01_extends3() {
			
			@Override
			public void sound() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void play() {
				// TODO Auto-generated method stub
				
			}
		};
		*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
