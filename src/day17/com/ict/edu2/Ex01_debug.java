package day17.com.ict.edu2;

// 디버깅 : 논리적인 오류를 잡기 위해 실행하는 행위
//             해당 변수값을 조사
//             알아서 수정하지 못 함
//             개발 단계 중에 발생하는 시스템의 논리적인 오류나 비정상적인 연산(버그)을 찾아내고
//             그 원인을 밝히고 수정하는 작업 과정을 말함

// breakpoint(중단점) : 디버깅 실행 시 자동으로 해당 위치에서 실행 중단
//                               변수값을 조사할 수 있는 특정 지점

// 이클립스 단축키 : F8, F5, F6
// F8 : 중단점에서 중단점으로 이동
// F5 : 한 문장씩 실행, 메서드를 만나면 안으로 진입
// F6 : 한 문장씩 실행, 메서드를 만나면 건너뜀
public class Ex01_debug {
	public static void main(String[] args) {
    int total = 0;
    for (int i = 1; i <11; i++) {
		total = total + i;
		System.out.println("1부터 " + i + "까지의 합은 " + total + "입니다.");				
	}
    System.out.println("합 : " + total);
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
	}
}
