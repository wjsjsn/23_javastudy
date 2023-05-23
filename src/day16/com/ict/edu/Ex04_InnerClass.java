package day16.com.ict.edu;

public class Ex04_InnerClass {
 public static void main(String[] args) {
	
	 // 내부 클래스 : 클래스 안에 다른 클래스가 정의 되어있는 클래스
	 // 종류 : Member(멤버), Local(지역), static, Anonymous(익명)
	 
	 // 1. Member : 내부 클래스에서는 외부 클래스의 멤버들을 마음대로 사용 가능(상속과 비슷)
	 //                  단, 상속에서는 private 접근 안 됨, 내부 클래스에서는 private 접근 가능 
	 //                  외부 클래스를 통해서만 내부 클래스 생성 가능(내부 클래스만 별도로 생성 x)
	
	 //                  외부클래스{
	 //                          외부멤버필드
	 //                          생성자
	 //                          외부멤버메서드
	 //                          내부 클래스 {
	 //                          내부멤버필드
	 //                          생성자
	 //                          내부멤버메서드
	 //                            }
	 //                }
	
	 // 2. Local : 외부 클래스 메서드 안에 내부 클래스가 존재
	 //               외부 클래스가 지역변수처럼 사용 가능
	 //               외부 클래스의 메서드가 실행(호출)될 때 생성할 수 있음
	 //               지역변수처럼 외부 클래스의 해당 메서드가 종료되면 내부클래스도 지워짐
	
	 //                  외부클래스{
	 //                          외부멤버필드
	 //                          생성자
	 //                          외부멤버메서드{
	 //                          내부 클래스 {
	 //                          내부멤버필드
	 //                          생성자
	 //                          내부멤버메서드
	 //                            }
	 //                     }
	 //                }
	 
	 // 3. static 내부 클래스 : 구조는 Member 내부 클래스와 같음
	 //                                  내부 클래스의 멤버 변수는 static 사용 x
	 //                                  어쩔 수 없이 내부 클래스의 멤버 변수를 static으로 사용할 경우
	 //                                  내부 클래스를 static으로 만듦
	 // 접근 방법 : static 접근 방법 사용(클래스 이름.변수)
	 // 특징 : 내부 클래스를 별도로 생성할 수 있음
	 
	 //                  외부클래스{
	 //                          외부멤버필드
	 //                          생성자
	 //                          외부멤버메서드
	 //                          static 내부 클래스 {
	 //                          static 내부멤버필드
	 //                          생성자
	 //                          내부멤버메서드
	 //                            }
	 //                }
	 
	 // 4. Anonymous(익명) : 정의된 이름이 없는 클래스
	 //                                다시 호출할 수 없음(1회용으로 한 번 사용하고 재활용 x)
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
}
}
