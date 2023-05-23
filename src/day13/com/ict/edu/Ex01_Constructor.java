package day13.com.ict.edu;

public class Ex01_Constructor {

	
	// this(본인) 와 this()(본인이 갖고 있는 생성자)
	// this : 객체 내부에서 객체 자신을 지칭하는 예약어
	//        지역 변수와 전역변수 이름이 같을 때 전역변수 앞에 this를 붙임
	// this() : 객체 내부에서 객체 자신의 생성자를 지칭하는 예약어

	
	private String name = "홍길동";
	private int age = 34;
	
	// 기본생성자
	public Ex01_Constructor() {
		// 생성자가 다른 생성자 호출(반드시 첫번째 줄에서)
		this("임꺽정");
		System.out.println("기본생성자 : "+this);
		//prn();
		//this.prn();
	}
  
	// 생성자 오버로딩 : 같은 이름의 생성자가 2개 이상 있음
	public Ex01_Constructor(String name) {
		this.name = name;  //setter과 같음(생성자는 한 번만 호출 가능, setter는 언제든지 호출 가능)
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
		
	public void prn() {
		
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
}
