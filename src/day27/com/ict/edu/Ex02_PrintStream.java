package day27.com.ict.edu;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintStream;

// PrintStream : 모든 데이터를 출력할 수 있음
// 기본생성자가 없어서 BufferedStream처럼 FileStream을 이용해야 함
public class Ex02_PrintStream {
	public static void main(String[] args) {
		String pathname = "D:/pcl/test04.txt";
		File file = new File(pathname);
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		PrintStream ps = null;
		try {
			// 체인방식(밑에서 위의 것 물고 물고 물고)
			fos = new FileOutputStream(file);
			bos = new BufferedOutputStream(fos);
			ps = new PrintStream(bos);
			
			ps.println('A');
			ps.println("안녕하세요");
			ps.println(97);
			ps.print(3.14);
			ps.print("Hello");
			
		} catch (Exception e) {
		}finally {
			try {
				ps.close();
				bos.close();
				fos.close();
			} catch (Exception e2) {
			}
		}

	}
}
