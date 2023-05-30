package day25.com.ict.edu;

import java.io.File;

// File 클래스 : 특정 위치(경로, path)에 존재하는 파일이나 디렉토리(폴더)를 처리하는 클래스
// 주요 생성자 : File(String 경로), File(String 상위경로, String 하위경로)
//                    File(File 상위경로, String 하위경로)
// 파일과 디렉토리의 차이점 : 크기가 존재하면 파일
// 주요 메서드 : createNewFile() : 파일 생성
//                    mkdir() : 디렉토리 생성
//                    delete() : 삭제
//                    isFile() : 파일이면 true
//                    isDirectory() : 디렉토리면 true
//                    list() : 특정 위치에 내용(파일, 디렉토리)을 배열에 저장
//                    exists() : 존재유무(contains와 같은 의미)
//                    getName() : 파일 이름 알아내기
//                    length() : 파일 크기를 byte로 변환해서 표시
//                    getAbsolutePath() : 절대 주소 표시(루트부터 시작해서 위치 표시)
//                    getPath() : 상대 주소 표시(현재 위치부터 시작해서 위치 표시)
public class Ex01_File {
public static void main(String[] args) {

	String pathname = "D:/pcl";
	File file = new File(pathname);
	String[] arr = file.list();
	for (String k : arr) {
	//	System.out.println(k);
		File file2 = new File(pathname, k);
	//	System.out.println(file2);
		if (file2.isDirectory()) {
			System.out.println("디렉토리 : " + k);
		}else {
			System.out.println("파일 : " + k);
		}
	}
}
}
