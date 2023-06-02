package day28.com.ict.edu;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

//VO(Value Object) : 순수 데이터만 가지고 있고, get/set으로 구성
//                            객체 정보를 담을 수 있는 멤버 변수로 구성돼야함
//                            객채 직렬화(보내기)=(writeObject) <-> 객체 역직렬화(풀기)=(readObject)

//객체 직렬화 하기
//1. Serializable 인터페이스를 구현하는 방법(추상메소드가 없다.)=(오버라이딩x) (오류가 안남)
//   멤버면수 모두가 객체 직렬화 대상
//   직렬화 대상에서 제외하고 싶은 멤버는 멤버 앞에 transient 예약어 사용

// 2. Externalizable 인터페이스를 구현하는 방법(추상메서드 있음)
//     : 직렬화 대상을 고를 수 있음

public class Ex04_VO implements Externalizable {

	private String name;
	private int age;
	private String addr;
	private boolean gender;
	private double height;
   
	// 기본생성자를 삭제하면 오류 발생
	public Ex04_VO() {}; 
	public Ex04_VO(String name, int age, String addr, boolean gender, double height) {
		super();
		this.name = name;
		this.age = age;
		this.addr = addr;
		this.gender = gender;
		this.height = height;
	}

	// 직렬
	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		// 제외하고 싶은 멤버는 추가하지 x
		out.writeObject(name);
	//	out.writeObject(age);
	//	out.writeObject(addr);
		out.writeObject(gender);
		out.writeObject(height);
	}

	// 역직렬
	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		// 순서와 생략도 직렬과 같게 함
		name = (String) in.readObject();
	//	age = (int) in.readObject();
	//	addr = (String) in.readObject();
		gender = (boolean) in.readObject();
		height = (double) in.readObject();
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

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public boolean isGender() {
		return gender;
	}

	public void setGender(boolean gender) {
		this.gender = gender;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
}